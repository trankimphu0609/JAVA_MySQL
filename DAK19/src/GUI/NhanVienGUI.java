
package GUI;

// thư viện xuất pdf
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import BUS.ChucVuBUS;
import DATA.ChucVuDAO;
import DTO.ChucVuDTO;
import java.awt.Color;
import java.awt.Image;
import java.util.regex.Matcher;
import java.awt.event.ActionEvent;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import DTO.NhanVienDTO;
import DATA.NhanVienDAO;
import BUS.NhanVienBUS;
import static GUI.TacGiaPanel.pattern2;
//import com.mysql.cj.result.Row;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.util.regex.Pattern;
//import javafx.scene.control.Cell;

// thư viện xuất excel
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class NhanVienGUI extends JPanel{
    DefaultTableModel model;
    private static int choose=-1;
    int max=0;
    public static Pattern pattern1;
    public static Pattern pattern2;
        
        public static final String SDT_PATTERN="^[0-9]{10}$";
        public static final String NAME_PATTERN="^[a-zA-Z_ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶ\" +\n" +
"            \"ẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợ\" +\n" +
"            \"ụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\\\s]+$";
    public NhanVienGUI() throws SQLException, Exception{
        initComponents();
        LoadChucVu();
        tblNV.getTableHeader().setOpaque(false);
        tblNV.getTableHeader().setBackground(Color.blue);
        tblNV.getTableHeader().setForeground(new Color(255,255,255));
        pattern2 = Pattern.compile(SDT_PATTERN);
        pattern1 = Pattern.compile(NAME_PATTERN);
        tblNV.setRowHeight(28);
        NhanVienBUS bus= new NhanVienBUS();
        if(NhanVienBUS.dsnv==null){
            bus.DocDSNV();
        }
        Vector header= new Vector();
        header.add("MANV");
        header.add("HỌ");
        header.add("TÊN");
        header.add("NG/SINH");
        header.add("ĐỊA CHỈ");
        header.add("SĐT");
        header.add("CHỨC VỤ");
        header.add("LƯƠNG");
        model= new DefaultTableModel(header,0);
        
        for(int i=0; i<NhanVienBUS.dsnv.size();i++){
                Object[] objs= {NhanVienBUS.dsnv.get(i).getMaNV(),NhanVienBUS.dsnv.get(i).getHo(),NhanVienBUS.dsnv.get(i).getTen(),NhanVienBUS.dsnv.get(i).getNgaysinh(),NhanVienBUS.dsnv.get(i).getAddress(),NhanVienBUS.dsnv.get(i).getSoDT(),NhanVienBUS.dsnv.get(i).getTenCV(),NhanVienBUS.dsnv.get(i).getLuong()};
                model.addRow(objs);
                
                    max=NhanVienBUS.dsnv.get(i).getMaNV();
                
            }
        if(max==0){
            max=1;
        }
        else{
            max=max+1;
        }
        txtMaNV.setText(Integer.toString(max));
        txtMaNV.setEnabled(false);
        tblNV.setModel(model);
    }

    private void exportToExcel(DefaultTableModel model) {
        FileOutputStream excelFOU = null;
        BufferedOutputStream excelBOU = null;
        Workbook excelExporter = null;
        JFileChooser excelFileChoose = new JFileChooser("C:\\");
        excelFileChoose.setDialogTitle("Save as");
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("Excel File", "xls", "xlsx", "csv");
        excelFileChoose.setFileFilter(fnef);
        int excelChooser = excelFileChoose.showSaveDialog(null);
        if (excelChooser == JFileChooser.APPROVE_OPTION) {
            try {
                excelExporter = new XSSFWorkbook();
                Sheet excelSheet = (Sheet) excelExporter.createSheet("Bảng sách");
                System.out.println(model.getRowCount());
                
                for (int i = 0; i < model.getRowCount(); i++) {
                    Row excelRow = excelSheet.createRow(i);
                    for (int j = 0; j < model.getColumnCount(); j++) {
                        Cell excelCell = excelRow.createCell(j);
                        excelCell.setCellValue(model.getValueAt(i, j).toString());    
                    }
                }
                System.out.println(excelFileChoose.getSelectedFile());
                excelFOU = new FileOutputStream(excelFileChoose.getSelectedFile()+ ".xlsx");
                excelExporter.write(excelFOU);
                JOptionPane.showMessageDialog(null, "xuất thành công");
            } catch (FileNotFoundException ex) {
                
            } catch (IOException ex) {
                
            } finally {
                try {
                    if (excelFOU != null) {
                        excelFOU.close();
                    }
                    if (excelBOU != null) {
                        excelBOU.close();
                    }
                    if (excelExporter != null) {
                        excelExporter.close();
                    }
                } catch (IOException ex) {
                    
                }
            }
        }        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlTxt = new javax.swing.JPanel();
        lblMaNV = new javax.swing.JLabel();
        lblHo = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtHo = new javax.swing.JTextField();
        lblTen = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        lblNS = new javax.swing.JLabel();
        txtNS = new javax.swing.JFormattedTextField();
        txtNS.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        lblDiachi = new javax.swing.JLabel();
        lblSDT = new javax.swing.JLabel();
        lblChucVu = new javax.swing.JLabel();
        lblLuong = new javax.swing.JLabel();
        txtDiachi = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtLuong = new javax.swing.JFormattedTextField();
        txtLuong.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtChucVu = new javax.swing.JComboBox<>();
        HinhAnh = new javax.swing.JLabel();
        btnReload = new javax.swing.JLabel();
        pnlBtn = new javax.swing.JPanel();
        btnThem = new RoundedPanel(100);
        jLabel1 = new javax.swing.JLabel();
        btnXoa = new RoundedPanel(100);
        jLabel2 = new javax.swing.JLabel();
        btnSua = new RoundedPanel(100);
        jLabel3 = new javax.swing.JLabel();
        pnlTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNV = new javax.swing.JTable();
        btnXuat = new RoundedPanel(100);
        jLabel4 = new javax.swing.JLabel();
        
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        pnlTxt.setBackground(new java.awt.Color(44, 62, 80));

        lblMaNV.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMaNV.setForeground(new java.awt.Color(255, 255, 255));
        lblMaNV.setText("MãNV:");
        txtMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNVActionPerformed(evt);
            }
        });

        lblHo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblHo.setForeground(new java.awt.Color(255, 255, 255));
        lblHo.setText("Họ:");

        txtHo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoActionPerformed(evt);
            }
        });

        lblTen.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTen.setForeground(new java.awt.Color(255, 255, 255));
        lblTen.setText("Tên:");

        lblNS.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNS.setForeground(new java.awt.Color(255, 255, 255));
        lblNS.setText("Ng/sinh:");

        lblDiachi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDiachi.setForeground(new java.awt.Color(255, 255, 255));
        lblDiachi.setText("Địa chỉ:");

        lblSDT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSDT.setForeground(new java.awt.Color(255, 255, 255));
        lblSDT.setText("SĐT:");

        lblChucVu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblChucVu.setForeground(new java.awt.Color(255, 255, 255));
        lblChucVu.setText("Chức vụ:");

        lblLuong.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblLuong.setForeground(new java.awt.Color(255, 255, 255));
        lblLuong.setText("Lương:");

        

        txtChucVu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        
        txtChucVu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        

        HinhAnh.setBackground(new java.awt.Color(255, 255, 255));
        HinhAnh.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        HinhAnh.setForeground(new java.awt.Color(255, 255, 255));
        HinhAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HinhAnh.setText("Image");
        HinhAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        HinhAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HinhAnhMouseClicked(evt);
            }
        });
        
        btnReload.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReload.setIcon(new javax.swing.ImageIcon("image/reload.png")); // NOI18N
        btnReload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReloadMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlTxtLayout = new javax.swing.GroupLayout(pnlTxt);
        pnlTxt.setLayout(pnlTxtLayout);
        pnlTxtLayout.setHorizontalGroup(
            pnlTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTxtLayout.createSequentialGroup()
                .addGroup(pnlTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlTxtLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReload))
                    .addGroup(pnlTxtLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(HinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(pnlTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlTxtLayout.createSequentialGroup()
                                .addComponent(lblHo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlTxtLayout.createSequentialGroup()
                                .addComponent(lblTen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlTxtLayout.createSequentialGroup()
                                .addComponent(lblNS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNS, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlTxtLayout.createSequentialGroup()
                                .addComponent(lblMaNV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(pnlTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlTxtLayout.createSequentialGroup()
                                .addComponent(lblSDT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlTxtLayout.createSequentialGroup()
                                .addComponent(lblDiachi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlTxtLayout.createSequentialGroup()
                                .addComponent(lblChucVu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlTxtLayout.createSequentialGroup()
                                .addComponent(lblLuong)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(19, 19, 19))
        );
        pnlTxtLayout.setVerticalGroup(
            pnlTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTxtLayout.createSequentialGroup()
                .addGroup(pnlTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTxtLayout.createSequentialGroup()
                        .addGroup(pnlTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTxtLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(lblMaNV))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTxtLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDiachi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDiachi, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtMaNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(pnlTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHo)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSDT)
                            .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTen)
                            .addComponent(lblChucVu)
                            .addComponent(txtChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTxtLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnlTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNS, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLuong)))
                            .addGroup(pnlTxtLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lblNS))))
                    .addGroup(pnlTxtLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(HinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnReload)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pnlBtn.setBackground(new java.awt.Color(44, 62, 80));

        btnThem.setBackground(new java.awt.Color(16, 160, 51));
        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    btnThemMouseClicked(evt);
                } catch (ParseException ex) {
                    Logger.getLogger(NhanVienGUI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(NhanVienGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thêm");

        javax.swing.GroupLayout btnThemLayout = new javax.swing.GroupLayout(btnThem);
        btnThem.setLayout(btnThemLayout);
        btnThemLayout.setHorizontalGroup(
            btnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThemLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(47, 47, 47))
        );
        btnThemLayout.setVerticalGroup(
            btnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnThemLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(14, 14, 14))
        );

        btnXoa.setBackground(new java.awt.Color(204, 204, 204));
        btnXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    btnXoaMouseClicked(evt);
                } catch (ParseException ex) {
                    Logger.getLogger(NhanVienGUI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(NhanVienGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Xóa");

        javax.swing.GroupLayout btnXoaLayout = new javax.swing.GroupLayout(btnXoa);
        btnXoa.setLayout(btnXoaLayout);
        btnXoaLayout.setHorizontalGroup(
            btnXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXoaLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addGap(54, 54, 54))
        );
        btnXoaLayout.setVerticalGroup(
            btnXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnXoaLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(14, 14, 14))
        );
        
        
        btnXuat.setBackground(new java.awt.Color(200, 130, 60));
        btnXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    btnXuatMouseClicked(evt);
                } catch (ParseException ex) {
                    Logger.getLogger(NhanVienGUI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(NhanVienGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        jLabel4.setBackground(new java.awt.Color(163, 156, 233));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Xuất");
        
        javax.swing.GroupLayout btnXuatLayout = new javax.swing.GroupLayout(btnXuat);
        btnXuat.setLayout(btnXuatLayout);
        btnXuatLayout.setHorizontalGroup(
            btnXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXuatLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel4)
                .addGap(60, 60, 60))
        );
        btnXuatLayout.setVerticalGroup(
            btnXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnXuatLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(14, 14, 14))
        );

        btnSua.setBackground(new java.awt.Color(189, 60, 180));
        btnSua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    btnSuaMouseClicked(evt);
                } catch (ParseException ex) {
                    Logger.getLogger(NhanVienGUI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(NhanVienGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sửa");

        javax.swing.GroupLayout btnSuaLayout = new javax.swing.GroupLayout(btnSua);
        btnSua.setLayout(btnSuaLayout);
        btnSuaLayout.setHorizontalGroup(
            btnSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSuaLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel3)
                .addGap(54, 54, 54))
        );
        btnSuaLayout.setVerticalGroup(
            btnSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSuaLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout pnlBtnLayout = new javax.swing.GroupLayout(pnlBtn);
        pnlBtn.setLayout(pnlBtnLayout);
        pnlBtnLayout.setHorizontalGroup(
            pnlBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlBtnLayout.setVerticalGroup(
            pnlBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTable.setBackground(new java.awt.Color(204, 204, 204));

        tblNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MÃNV", "HỌ", "TÊN", "NG/SINH", "ĐỊA CHỈ", "SĐT", "CHỨC VỤ", "LƯƠNG"
            }
        ));
        tblNV.setRequestFocusEnabled(false);
        tblNV.setRowHeight(32);
        tblNV.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tblNV.setShowVerticalLines(false);
        tblNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNVMouseClicked(evt);
            }
        });
        
        jScrollPane1.setViewportView(tblNV);
        if (tblNV.getColumnModel().getColumnCount() > 0) {
            tblNV.getColumnModel().getColumn(0).setPreferredWidth(40);
        }
        
        javax.swing.GroupLayout pnlTableLayout = new javax.swing.GroupLayout(pnlTable);
        pnlTable.setLayout(pnlTableLayout);
        pnlTableLayout.setHorizontalGroup(
            pnlTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnlTableLayout.setVerticalGroup(
            pnlTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>            
    
    public void LoadChucVu() throws Exception{
        ChucVuBUS load= new ChucVuBUS();
        if(ChucVuBUS.dscv==null){
            load.DocDSCV();
        }
        for(int i=0; i<ChucVuBUS.dscv.size();i++){
            this.txtChucVu.addItem(ChucVuBUS.dscv.get(i).getTenCV());
        }
    }                   
    private void txtMaNVActionPerformed(java.awt.event.ActionEvent evt) { 
        NhanVienBUS bus= new NhanVienBUS();
        txtMaNV.requestFocusInWindow();
        NhanVienDTO kq= new NhanVienDTO();
        String ma=txtMaNV.getText();
        kq=bus.timkiem(parseInt(ma));
        
        if(kq!=null){
            model=null;
            Vector header= new Vector();
            header.add("MASV");
            header.add("HỌ");
            header.add("TÊN");
            header.add("NG/SINH");
            header.add("ĐỊA CHỈ");
            header.add("SĐT");
            header.add("CHỨC VỤ");
            header.add("LƯƠNG");
            model= new DefaultTableModel(header,0);
            Object[] objs= {kq.getMaNV(),kq.getHo(),kq.getTen(),kq.getNgaysinh(),kq.getAddress(),kq.getSoDT(),kq.getTenCV(),kq.getLuong()};
            model.addRow(objs);
            
            tblNV.setModel(model);
        }
    }

    private void txtHoActionPerformed(java.awt.event.ActionEvent evt) {                                      
        NhanVienBUS bus= new NhanVienBUS();
        txtHo.requestFocusInWindow();
        ArrayList <NhanVienDTO> kq= new ArrayList <NhanVienDTO>();
        String ho=txtHo.getText();
        kq=bus.timkiemtheoHo(ho);
        
        if(kq!=null){
            model=null;
            Vector header= new Vector();
            header.add("MASV");
            header.add("HỌ");
            header.add("TÊN");
            header.add("NG/SINH");
            header.add("ĐỊA CHỈ");
            header.add("SĐT");
            header.add("CHỨC VỤ");
            header.add("LƯƠNG");
            model= new DefaultTableModel(header,0);
            for(int i=0; i<kq.size();i++){
                Object[] objs= {kq.get(i).getMaNV(),kq.get(i).getHo(),kq.get(i).getTen(),kq.get(i).getNgaysinh(),kq.get(i).getAddress(),kq.get(i).getSoDT(),kq.get(i).getTenCV(),kq.get(i).getLuong()};
                model.addRow(objs);
            }
            tblNV.setModel(model);
        }
            
    }                                     

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) throws ParseException, Exception {
        /// bỏ mấy cái check lỗi vô đây
        
            
        
        if(choose==-1){
        if(txtHo.getText().equals("") || txtTen.getText().equals("") || txtNS.getText().equals("") || txtDiachi.getText().equals("") || txtSDT.getText().equals("") || txtLuong.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!!");
        }
        else{
            int check=0;
            if(!ktraSDT(txtSDT.getText())){
            JOptionPane.showMessageDialog(null, "SĐT gồm 10 số!!");
            txtSDT.setText("");
            check=1;
            }
            if(!ktraTen(txtHo.getText())){
            JOptionPane.showMessageDialog(null, "Họ không hợp lệ!!");
            txtHo.setText("");
            check=1;
            }
            if(!ktraTen(txtTen.getText())){
            JOptionPane.showMessageDialog(null, "Tên không hợp lệ!!");
            txtTen.setText("");
            check=1;
            }
            if(check==0){
                txtMaNV.setEnabled(true);
        NhanVienDTO nv= new NhanVienDTO();
        int index= txtChucVu.getSelectedIndex();
        nv.maNV=parseInt(txtMaNV.getText());
        nv.ho=txtHo.getText();
        nv.ten=txtTen.getText();
        nv.ngaysinh=txtNS.getText();
        nv.address=txtDiachi.getText();
        nv.soDT=parseInt(txtSDT.getText());
        nv.maCV=index;
        nv.tenCV=txtChucVu.getItemAt(index);
        nv.luong=parseInt(txtLuong.getText());
        
        NhanVienBUS bus= new NhanVienBUS();
        bus.Them(nv);
        
        Vector row= new Vector();
        row.add(nv.maNV);
        row.add(nv.ho);
        row.add(nv.ten);
        row.add(nv.ngaysinh);
        row.add(nv.address);
        row.add(nv.soDT);
        row.add(nv.tenCV);
        row.add(nv.luong);
        model.addRow(row);
        tblNV.setModel(model);
        max=max+1;
        
            }
        }    
    }
        
            
        txtMaNV.setEnabled(false);
    }                                    
    private void btnXuatMouseClicked(java.awt.event.MouseEvent evt) throws ParseException, Exception {                                     
        exportToExcel(model);
    }  
    
    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) throws ParseException, Exception {                                    
        // TODO add your handling code here:
        if(choose!=-1){
            txtMaNV.setEnabled(true);
        int i=tblNV.getSelectedRow();
        if(i>=0){      
            model.removeRow(i);
            tblNV.setModel(model);       
        }
        
        int ma=parseInt(txtMaNV.getText());
        
        
        NhanVienBUS bus= new NhanVienBUS();
        bus.Xoa(ma);
        }
        txtMaNV.setEnabled(false);
    }                                   

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) throws ParseException, Exception {                                    
        // TODO add your handling code here:
        if(choose!=-1){
            if(txtHo.getText().equals("") || txtTen.getText().equals("") || txtNS.getText().equals("") || txtDiachi.getText().equals("") || txtSDT.getText().equals("") || txtLuong.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!!");
        }
        else{
            int check=0;
            if(!ktraSDT(txtSDT.getText())){
            JOptionPane.showMessageDialog(null, "SĐT gồm 10 số!!");
            txtSDT.setText("");
            check=1;
            }
            if(!ktraTen(txtHo.getText())){
            JOptionPane.showMessageDialog(null, "Họ không hợp lệ!!");
            txtHo.setText("");
            check=1;
            }
            if(!ktraTen(txtTen.getText())){
            JOptionPane.showMessageDialog(null, "Tên không hợp lệ!!");
            txtTen.setText("");
            check=1;
            }
            if(check==0){
                    txtMaNV.setEnabled(true);
                int i=tblNV.getSelectedRow();
                int index= txtChucVu.getSelectedIndex();
                if(i>=0){
                    model.setValueAt(txtMaNV.getText(),i,0);
                    model.setValueAt(txtHo.getText(),i,1);
                    model.setValueAt(txtTen.getText(),i,2);
                    model.setValueAt(txtNS.getText(),i,3);
                    model.setValueAt(txtDiachi.getText(),i,4);
                    model.setValueAt(txtSDT.getText(),i,5);
                    model.setValueAt(txtChucVu.getItemAt(index),i,6);
                    model.setValueAt(txtLuong.getText(),i,7);
                    tblNV.setModel(model);
                }
                NhanVienDTO nv= new NhanVienDTO();
                nv.maNV=parseInt(txtMaNV.getText());
                nv.ho=txtHo.getText();
                nv.ten=txtTen.getText();
                nv.ngaysinh=txtNS.getText();
                nv.address=txtDiachi.getText();
                nv.soDT=parseInt(txtSDT.getText());
                nv.maCV=index;
                nv.tenCV=txtChucVu.getItemAt(index);
                nv.luong=parseInt(txtLuong.getText());

                NhanVienBUS bus= new NhanVienBUS();
                bus.Sua(nv);
        }}
        }
        txtMaNV.setEnabled(false);
    }                                   

    private void tblNVMouseClicked(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
        
        int i=tblNV.getSelectedRow();
        choose=1;
        txtMaNV.setEnabled(true);
        btnSua.setBackground(new java.awt.Color(0, 51, 204));
        btnThem.setBackground(new java.awt.Color(204,204,204));
        btnXoa.setBackground(new java.awt.Color(255, 51, 51));
        
        
        txtMaNV.setText(tblNV.getModel().getValueAt(i,0).toString());
        txtMaNV.setEnabled(false);
        txtHo.setText(tblNV.getModel().getValueAt(i,1).toString());
        txtTen.setText(tblNV.getModel().getValueAt(i,2).toString());
        txtNS.setText(tblNV.getModel().getValueAt(i,3).toString());
        txtDiachi.setText(tblNV.getModel().getValueAt(i,4).toString());
        txtSDT.setText(tblNV.getModel().getValueAt(i,5).toString());
       // txtChucVu.setSelectedIndex(0);
        
        
        for(int k=0; k<ChucVuBUS.dscv.size();k++){   
            if(tblNV.getModel().getValueAt(i,6).toString().equals(ChucVuBUS.dscv.get(k).getTenCV()))
            {    txtChucVu.setSelectedIndex(k);

            }
    }
        
        txtLuong.setText(tblNV.getModel().getValueAt(i,7).toString());
        
    }                                  
    private void HinhAnhMouseClicked(java.awt.event.MouseEvent evt){
        JFileChooser choose= new JFileChooser();
        choose.showOpenDialog(null);
        File f=choose.getSelectedFile();
        String filename= f.getAbsolutePath();
        Image getAbsolutePath= null;
        ImageIcon icon= new ImageIcon(filename);
        Image image= icon.getImage().getScaledInstance(HinhAnh.getWidth(),HinhAnh.getHeight() , Image.SCALE_SMOOTH);
        HinhAnh.setIcon(icon);
    }
    private void btnReloadMouseClicked(java.awt.event.MouseEvent evt){                                    
        // TODO add your handling code here:
        choose=-1;
        btnSua.setBackground(new java.awt.Color(204, 204, 204));
        btnThem.setBackground(new java.awt.Color(255,255,51));
        btnXoa.setBackground(new java.awt.Color(204, 204, 204));
        
        
        txtMaNV.setEnabled(true);
        txtMaNV.setText(Integer.toString(max));
        txtMaNV.setEnabled(false);
        txtHo.setText("");
        txtTen.setText("");
        txtNS.setText("");
        txtDiachi.setText("");
        txtSDT.setText("");
        txtChucVu.setSelectedIndex(0);
        txtLuong.setText("");
        
    }  
    
     
     
    public static boolean ktraSDT(final String hex) {

            Matcher matcher = pattern2.matcher(hex);
            return matcher.matches();
    }
    public static boolean ktraTen(final String hex) {

            Matcher matcher = pattern1.matcher(hex);
            return matcher.matches();
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
                try {
                    new NhanVienGUI().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(NhanVienGUI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(NhanVienGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                
                
                
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JPanel btnSua;
    private javax.swing.JPanel btnXuat;
    private javax.swing.JPanel btnThem;
    private javax.swing.JPanel btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel HinhAnh;
    private javax.swing.JLabel btnReload;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChucVu;
    private javax.swing.JLabel lblDiachi;
    private javax.swing.JLabel lblHo;
    private javax.swing.JLabel lblLuong;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblNS;
    private javax.swing.JLabel lblSDT;
    private javax.swing.JLabel lblTen;
    private javax.swing.JPanel pnlBtn;
    private javax.swing.JPanel pnlTable;
    private javax.swing.JPanel pnlTxt;
    private javax.swing.JTable tblNV;
    private javax.swing.JComboBox<String> txtChucVu;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtHo;
    private javax.swing.JFormattedTextField txtLuong;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JFormattedTextField txtNS;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTen;
}

