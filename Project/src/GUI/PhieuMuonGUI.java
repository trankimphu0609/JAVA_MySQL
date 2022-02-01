
package GUI;

import BUS.PhieuMuonBUS;
import BUS.ChiTietSachMuonBUS;
import BUS.ChiTietPhieuMuonBUS;
import BUS.SachConBUS;
import DTO.PhieuMuonDTO;
import DTO.ChiTietPhieuMuonDTO;
import DTO.ChiTietSachMuonDTO;
import DTO.SachConDTO;
import java.awt.Color;
import static java.lang.Integer.parseInt;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

// thư viện xuất pdf
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.text.ParseException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class PhieuMuonGUI extends javax.swing.JPanel {
    public static DefaultTableModel model;
    DefaultTableModel model1;
    DefaultTableModel model2;
    private static int choose=2;
    private static int max=-1; 
    
    public PhieuMuonGUI() throws Exception {
        initComponents();
        tblPM.getTableHeader().setOpaque(false);
        tblPM.getTableHeader().setBackground(Color.blue);
        tblPM.getTableHeader().setForeground(new Color(255,255,255));
        
        tblPM.setRowHeight(28);
        btnreload.setIcon(new ImageIcon("Image/reload.png"));
        btnreload.setText("");
        
        PhieuMuonBUS bus= new PhieuMuonBUS();
        if(PhieuMuonBUS.dspm==null){
            bus.DocPM();
        }
        Vector header= new Vector();
        header.add("Mã PM");
        header.add("Mã Thẻ");
        header.add("Ngày Mượn");
        header.add("Ngày Hẹn Trả");
        header.add("Mã NV");
        model= new DefaultTableModel(header,0);
        for(int i=0; i<PhieuMuonBUS.dspm.size();i++){
                Object[] objs= {PhieuMuonBUS.dspm.get(i).getMaPM(),PhieuMuonBUS.dspm.get(i).getMatheTV(),PhieuMuonBUS.dspm.get(i).getNgaymuon(),PhieuMuonBUS.dspm.get(i).getNgayhentra(),PhieuMuonBUS.dspm.get(i).getMaNV()};
                model.addRow(objs);
                max=PhieuMuonBUS.dspm.get(i).getMaPM();
            }
        max=max+1;
        tblPM.setModel(model);
        btnSua.setBackground(new java.awt.Color(204, 204, 204));
        btnThem.setBackground(new java.awt.Color(255,255,51));
        btnXoa.setBackground(new java.awt.Color(204, 204, 204));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaPM = new javax.swing.JTextField();
        txtMaThe = new javax.swing.JTextField();
        txtNgMuon = new javax.swing.JFormattedTextField();
        txtNgHen = new javax.swing.JFormattedTextField();
        btnSua = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnThem = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        btnReload = new javax.swing.JLabel();
        btnreload = new javax.swing.JLabel();
        btnInPDF = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        TitileMuon = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPM = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCTPM = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCTSM = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mã PM:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã Thẻ:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ngày Mượn:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ngày Hẹn Trả:");

        txtNgMuon.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("y-MM-dd"))));

        txtNgHen.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("y-MM-dd"))));

        btnSua.setBackground(new java.awt.Color(0, 204, 0));
        btnSua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cập nhật");

        javax.swing.GroupLayout btnSuaLayout = new javax.swing.GroupLayout(btnSua);
        btnSua.setLayout(btnSuaLayout);
        btnSuaLayout.setHorizontalGroup(
            btnSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSuaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(10, 10, 10))
        );
        btnSuaLayout.setVerticalGroup(
            btnSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSuaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap())
        );

        btnXoa.setBackground(new java.awt.Color(255, 51, 51));
        btnXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Xóa");

        javax.swing.GroupLayout btnXoaLayout = new javax.swing.GroupLayout(btnXoa);
        btnXoa.setLayout(btnXoaLayout);
        btnXoaLayout.setHorizontalGroup(
            btnXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnXoaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel7)
                .addGap(32, 32, 32))
        );
        btnXoaLayout.setVerticalGroup(
            btnXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap())
        );

        btnThem.setBackground(new java.awt.Color(255, 255, 0));
        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Thêm");

        javax.swing.GroupLayout btnThemLayout = new javax.swing.GroupLayout(btnThem);
        btnThem.setLayout(btnThemLayout);
        btnThemLayout.setHorizontalGroup(
            btnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThemLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addGap(23, 23, 23))
        );
        btnThemLayout.setVerticalGroup(
            btnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnThemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap())
        );

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Mã NV:");

        btnReload.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        btnreload.setForeground(new java.awt.Color(255, 255, 255));
        btnreload.setText("111");
        btnreload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnreloadMouseClicked(evt);
            }
        });

        btnInPDF.setBackground(new java.awt.Color(0, 153, 153));
        btnInPDF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInPDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInPDFMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("In");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnInPDFLayout = new javax.swing.GroupLayout(btnInPDF);
        btnInPDF.setLayout(btnInPDFLayout);
        btnInPDFLayout.setHorizontalGroup(
            btnInPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnInPDFLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        btnInPDFLayout.setVerticalGroup(
            btnInPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInPDFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaPM, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(txtMaThe)
                    .addComponent(txtNgMuon)
                    .addComponent(txtNgHen)
                    .addComponent(txtMaNV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReload)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnreload)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInPDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(60, 60, 60))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(txtMaPM, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaThe, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNgMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4))
                    .addComponent(txtNgHen, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReload)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnreload)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TitileMuon.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TitileMuon.setForeground(new java.awt.Color(51, 51, 51));
        TitileMuon.setText("Thông Tin Phiếu Mượn");

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        tblPM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã PM", "Mã Thẻ", "Ngày Mượn", "Ngày Hẹn Trả", "Mã NV"
            }
        ));
        tblPM.setRowHeight(28);
        tblPM.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tblPM.setShowVerticalLines(false);
        tblPM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPMMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPM);
        if (tblPM.getColumnModel().getColumnCount() > 0) {
            tblPM.getColumnModel().getColumn(0).setMinWidth(60);
            tblPM.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblPM.getColumnModel().getColumn(1).setMinWidth(60);
            tblPM.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblPM.getColumnModel().getColumn(4).setMinWidth(60);
            tblPM.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(51, 51, 255));

        tblCTPM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã PM", "Mã Sách", "Tên Sách", "Số Lượng"
            }
        ));
        tblCTPM.setRowHeight(28);
        tblCTPM.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tblCTPM.setShowVerticalLines(false);
        tblCTPM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCTPMMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCTPM);
        if (tblCTPM.getColumnModel().getColumnCount() > 0) {
            tblCTPM.getColumnModel().getColumn(0).setMinWidth(50);
            tblCTPM.getColumnModel().getColumn(0).setMaxWidth(70);
            tblCTPM.getColumnModel().getColumn(1).setMinWidth(50);
            tblCTPM.getColumnModel().getColumn(1).setMaxWidth(70);
        }

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Chi Tiết Phiếu Mượn");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(51, 51, 255));

        tblCTSM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã PM", "Mã Sách", "Mã Sách con", "Tình trạng"
            }
        ));
        tblCTSM.setRowHeight(28);
        tblCTSM.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tblCTSM.setShowVerticalLines(false);
        jScrollPane3.setViewportView(tblCTSM);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setText("Chi Tiết Sách Mượn");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TitileMuon)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(TitileMuon)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblPMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPMMouseClicked
        int i=tblPM.getSelectedRow();
        choose=1;
        txtMaPM.setEnabled(true);
        txtMaThe.setEnabled(true);
        txtNgMuon.setEnabled(true);
        txtNgHen.setEnabled(true);
        txtMaNV.setEnabled(true);
        
        btnSua.setBackground(new java.awt.Color(0,204,0));
        btnThem.setBackground(new java.awt.Color(204,204,204));
        btnXoa.setBackground(new java.awt.Color(255, 51, 51));
        
        txtMaPM.setText(tblPM.getModel().getValueAt(i,0).toString());
        txtMaPM.setEnabled(false);
        txtMaThe.setText(tblPM.getModel().getValueAt(i,1).toString());
        txtMaThe.setEnabled(false);
        
        txtNgMuon.setText(tblPM.getModel().getValueAt(i,2).toString());
        txtNgMuon.setEnabled(false);
        txtNgHen.setText(tblPM.getModel().getValueAt(i,3).toString());
        txtMaNV.setText(tblPM.getModel().getValueAt(i,4).toString());
        txtMaNV.setEnabled(false);
       
        ChiTietPhieuMuonBUS bus= new ChiTietPhieuMuonBUS();
        
            try {
                bus.DocDSCTPM(tblPM.getModel().getValueAt(i,0).toString());
            } catch (Exception ex) {
                Logger.getLogger(PhieuMuonGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        Vector header= new Vector();
        header.add("Mã PM");
        header.add("Mã Sách");
        header.add("Tên Sách");
        header.add("Số lượng");
        
        model1= new DefaultTableModel(header,0);
        for(int j=0; j<ChiTietPhieuMuonBUS.dsphieumuon.size();j++){
                Object[] objs= {ChiTietPhieuMuonBUS.dsphieumuon.get(j).getMaPM(),ChiTietPhieuMuonBUS.dsphieumuon.get(j).getMaDS(),ChiTietPhieuMuonBUS.dsphieumuon.get(j).getTensach(),ChiTietPhieuMuonBUS.dsphieumuon.get(j).getSoluong()};
                model1.addRow(objs);
            }
        tblCTPM.setModel(model1);
    }//GEN-LAST:event_tblPMMouseClicked

    private void tblCTPMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCTPMMouseClicked
        // TODO add your handling code here:
        int i=tblCTPM.getSelectedRow();
        ChiTietSachMuonBUS bus= new ChiTietSachMuonBUS();
            try {
                bus.DocDSCTSM(tblCTPM.getModel().getValueAt(i,0).toString(), tblCTPM.getModel().getValueAt(i,1).toString());
            } catch (Exception ex) {
                Logger.getLogger(PhieuMuonGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        Vector header= new Vector();
        header.add("Mã PM");
        header.add("Mã Sách");
        header.add("Mã Sách Con");
        header.add("Tình Trạng");
        
        model2= new DefaultTableModel(header,0);
        for(int j=0; j<ChiTietSachMuonBUS.dssachmuon.size();j++){
                Object[] objs= {ChiTietSachMuonBUS.dssachmuon.get(j).getMaPM(),ChiTietSachMuonBUS.dssachmuon.get(j).getMaDS(),ChiTietSachMuonBUS.dssachmuon.get(j).getMaSachCon(),ChiTietSachMuonBUS.dssachmuon.get(j).getMaTinhtrang()};
                model2.addRow(objs);
            }
        tblCTSM.setModel(model2);
    }//GEN-LAST:event_tblCTPMMouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        // TODO add your handling code here:
        if(choose==1){
        int i=tblPM.getSelectedRow();
        
        if(i>=0){
            model.setValueAt(txtMaPM.getText(),i,0);
            model.setValueAt(txtMaThe.getText(),i,1);
            model.setValueAt(txtNgMuon.getText(),i,2);
            model.setValueAt(txtNgHen.getText(),i,3);
            model.setValueAt(txtMaNV.getText(),i,4);
            tblPM.setModel(model);
        }
        PhieuMuonDTO pm= new PhieuMuonDTO();
        txtMaPM.setEnabled(true);
        txtMaThe.setEnabled(true);
        txtNgMuon.setEnabled(true);
        txtMaNV.setEnabled(true);
        
        pm.setMaPM(parseInt(txtMaPM.getText()));
        pm.setMatheTV(parseInt(txtMaThe.getText()));
        pm.setNgaymuon(txtNgMuon.getText());
        pm.setNgayhentra(txtNgHen.getText());
        pm.setMaNV(parseInt(txtMaNV.getText()));
        
        txtMaPM.setEnabled(false);
        txtMaThe.setEnabled(false);
        txtNgMuon.setEnabled(false);
        txtMaNV.setEnabled(false);
        PhieuMuonBUS bus= new PhieuMuonBUS();
            try {
                bus.Sua(pm);
            } catch (Exception ex) {
                Logger.getLogger(PhieuMuonGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        // TODO add your handling code here:
        if(choose==1){
        int i=tblPM.getSelectedRow();
        if(i>=0){      
            model.removeRow(i);
            tblPM.setModel(model); 
        }
        if(model1!=null){
        for(int j=0;j<model1.getRowCount();j++){
        model1.removeRow(j);
        }
        tblCTPM.setModel(model1);
        }
        
        if(model2!=null){
        for(int j=0;j<model2.getRowCount();j++){
        model2.removeRow(j);
        }
        tblCTPM.setModel(model2);
        }
        
        int ma=parseInt(txtMaPM.getText());
        
        
        PhieuMuonBUS bus= new PhieuMuonBUS();
            try {
                bus.Xoa(ma);
            } catch (Exception ex) {
                Logger.getLogger(PhieuMuonGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        // TODO add your handling code here:
        if(choose==2){
        ThemPMFRM them= new ThemPMFRM(Integer.toString(max));
        them.setVisible(true);
        
        }
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnreloadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnreloadMouseClicked
        // TODO add your handling code here:
        choose=2;
        btnSua.setBackground(new java.awt.Color(204, 204, 204));
        btnThem.setBackground(new java.awt.Color(255,255,51));
        btnXoa.setBackground(new java.awt.Color(204, 204, 204));
        
        
        txtMaPM.setEnabled(false);
        txtMaThe.setEnabled(false);
        txtNgMuon.setEnabled(false);
        txtNgHen.setEnabled(false);
        txtMaNV.setEnabled(false);
    }//GEN-LAST:event_btnreloadMouseClicked
    
    public void enterInPDF(Document d, int index) throws DocumentException {
        for (int i = 0; i < index; i++) {
            d.add(new Paragraph(" "));
        }
    }
    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        int select = tblPM.getSelectedRow();
        if(select<0){
            JOptionPane.showMessageDialog(null, "Hãy chọn phiếu mượn cần in");
            return;
        }

        try {
            // xử lí tìm thông tin
            String idMaPM =  tblPM.getValueAt(select, 0).toString();
            String idMaThe =  tblPM.getValueAt(select, 1).toString();

            String ngayMuon =  tblPM.getValueAt(select, 2).toString();
            String ngayHenTra = tblPM.getValueAt(select, 3).toString();
            String maNV = tblPM.getValueAt(select, 4).toString();

            BaseFont bf = BaseFont.createFont("/Font/times.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);

            // tạo khung chọn đường dẫn
            JFileChooser pdfFileChoose = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            String url = "";
            int returnValue = pdfFileChoose.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = pdfFileChoose.getSelectedFile();// lấy đường dẫn đã chọn

                url = selectedFile.getAbsolutePath();// ép kiểu string
            }
            url +=".pdf";
            System.out.println(url);
            //            String file_dict = "C:\\Users\\ASUS\\Desktop\\HoaDon.pdf";
            Document doc = new Document();
            PdfWriter.getInstance(doc, new FileOutputStream(url)); // tạo file pdf từ url da chọn
            doc.open();
            Paragraph title = new Paragraph("THÔNG TIN PHIẾU MƯỢN", new Font(bf, 22));
            title.setAlignment(1);
            doc.add(title);
            enterInPDF(doc, 2);

            //xuất mã phiếu mượn, mã thẻ , ngày, id nhân viên
            Paragraph idPM = new Paragraph("Mã phiếu mượn: " + idMaPM, new Font(bf, 18));
            Paragraph idThe = new Paragraph("Mã thẻ: " + idMaThe, new Font(bf, 18));
            Paragraph date1 = new Paragraph("Ngày mượn: " + ngayMuon, new Font(bf, 18));
            Paragraph date2 = new Paragraph("Ngày hẹn trả: " +ngayHenTra , new Font(bf, 18));
            Paragraph idNV = new Paragraph("Mã nhân viên: " +maNV , new Font(bf, 18));

            // add vào file pdf
            doc.add(idPM);
            enterInPDF(doc, 1); //<---- khoảng cách giữa các dòng = 1
            doc.add(idThe);
            enterInPDF(doc, 1);
            doc.add(date1);
            enterInPDF(doc, 1);
            doc.add(date2);
            enterInPDF(doc, 1);
            doc.add(idNV);
            enterInPDF(doc, 2);
            //xuất dữ liệu
            PdfPTable table = new PdfPTable(4);

            // tạo header cho phần chi tiết PM
            String content[]={
                "STT", "Mã sách", "Tên sách","Số lượng"};
            for (String name : content) {
                PdfPCell cHeader = new PdfPCell(new Paragraph(name, new Font(bf, 18)));
                cHeader.setHorizontalAlignment(1);
                table.addCell(cHeader);
            }

            //quá trình thêm data vào table
            // tạo mảng data chứa dữ liệu từ tblCTPM
            String[] data = new String[tblCTPM.getRowCount()*4];
            int index = 0, stt=1;
            int tongSL=0;
            for(int i =0;i<tblCTPM.getRowCount();i++ ){
                data[index++] = Integer.toString(stt++);
                data[index++] = tblCTPM.getValueAt(i, 1).toString(); //mã sách
                data[index++] = tblCTPM.getValueAt(i, 2).toString(); // tên sách
                data[index++] = tblCTPM.getValueAt(i, 3).toString(); // số lượng
                tongSL+= Integer.parseInt(tblCTPM.getValueAt(i, 3).toString());// tổng số lượng
            }

            // thêm dữ liệu từ mảng data vào table trong pdf
            for (String cellData : data) {
                System.out.println(cellData);
                PdfPCell cell = new PdfPCell(new Paragraph(cellData, new Font(bf, 18)));
                table.addCell(cell);
            }
            doc.add(table);

            Paragraph total = new Paragraph("Tổng số lượng: " +tongSL , new Font(bf, 18));
            doc.add(total);
            //đóng file

            doc.close();
            JOptionPane.showMessageDialog(null, "Xuất file pdf thành công");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi in file pdf");
            Logger.getLogger(PhieuMuonGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi in file pdf");
            Logger.getLogger(PhieuMuonGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi in file pdf");
            Logger.getLogger(PhieuMuonGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void btnInPDFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInPDFMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInPDFMouseClicked
    
    public static void ThemPMTable(Object[] dataRow){
        model.addRow(dataRow);
        tblPM.setModel(model);
        
    }
    
    public static void ThemPM(PhieuMuonDTO pm){
        
        PhieuMuonBUS bus= new PhieuMuonBUS();
        try {
            bus.Them(pm);
        } catch (Exception ex) {
            
        }
        max=max+1;
    }
    
    public static void ThemCTPM(ChiTietPhieuMuonDTO pm){
        System.out.println(pm.toString());
        ChiTietPhieuMuonBUS bus= new ChiTietPhieuMuonBUS();
        try {
            bus.Them(pm);
        } catch (Exception ex) {
            
        }
        
    }
    
    public static void ThemCTSM(ChiTietSachMuonDTO ctsm, SachConDTO sm){
        System.out.println(ctsm.toString());
        System.out.println(sm.toString());
        ChiTietSachMuonBUS bus= new ChiTietSachMuonBUS();
        try {
            bus.Them(ctsm);
        } catch (Exception ex) {
            
        }
        
        SachConBUS bus2= new SachConBUS();
        try {
            bus2.SuaHienTrang(sm);
        } catch (Exception ex) {
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitileMuon;
    private javax.swing.JPanel btnInPDF;
    private javax.swing.JLabel btnReload;
    private javax.swing.JPanel btnSua;
    private javax.swing.JPanel btnThem;
    private javax.swing.JPanel btnXoa;
    private javax.swing.JLabel btnreload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblCTPM;
    private javax.swing.JTable tblCTSM;
    private static javax.swing.JTable tblPM;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMaPM;
    private javax.swing.JTextField txtMaThe;
    private javax.swing.JFormattedTextField txtNgHen;
    private javax.swing.JFormattedTextField txtNgMuon;
    // End of variables declaration//GEN-END:variables
}
