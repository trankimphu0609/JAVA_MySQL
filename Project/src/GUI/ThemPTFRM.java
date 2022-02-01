
package GUI;

import BUS.DSTinhTrangBUS;
import BUS.DauSachBUS;
import BUS.PhieuMuonBUS;
import BUS.TheThuVienBUS;
import DTO.ChiTietPhieuTraDTO;
import DTO.ChiTietSachTraDTO;
import static javax.swing.JOptionPane.showMessageDialog;
import DTO.PhieuMuonDTO;
import DTO.PhieuTraDTO;
import DTO.SachConDTO;
import DTO.TheThuVienDTO;
import static java.lang.Integer.parseInt;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ThemPTFRM extends javax.swing.JFrame {
    DefaultTableModel model;
    DefaultTableModel model1;
    DefaultTableModel model2;
    int choose=-1;
    String maSach,tenSach,Masachcon,MaTT;
    
    public ThemPTFRM(String ma) throws Exception {
        initComponents();
        LoadTinhTrang();
        
        txtMaPT.setText(ma);
        txtMaPM.setEnabled(false);
        txtMaPT.setEnabled(false);
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateFormat = formatter.format(Calendar.getInstance().getTime());
        txtNgTra.setText(dateFormat);
        txtNgTra.setEnabled(false);
        txtMaNV.setEnabled(false);
        
        btnXoachon.setVisible(false);
        btnBochon.setVisible(false);
        
        btnReload.setIcon(new ImageIcon("Image/reload.png"));
        btnReload.setText("");
        
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
            }
        tblPM.setModel(model);
        Vector header1= new Vector();
        header1.add("Mã Sách");
        header1.add("Tên Sách");
        header1.add("Mã Sách Con");
        header1.add("Tình Trạng Mới");
        
        model2= new DefaultTableModel(header1,0);
    }
    public void LoadTinhTrang() throws Exception{
        DSTinhTrangBUS load= new DSTinhTrangBUS();
        if(DSTinhTrangBUS.dsTinhTrang==null){
            load.list();
        }
        for(int i=0; i<DSTinhTrangBUS.dsTinhTrang.size();i++){
            this.ComboTT.addItem(DSTinhTrangBUS.dsTinhTrang.get(i).getTinhTrang());
        }
    } 
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtMaPM = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNgTra = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMaPT = new javax.swing.JFormattedTextField();
        btnMaNV = new javax.swing.JButton();
        btnXacnhan = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSachChoose = new javax.swing.JTable();
        btnThem = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnXoachon = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnBochon = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPM = new javax.swing.JTable();
        ComboSearch = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JFormattedTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblSach = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ComboTT = new javax.swing.JComboBox<>();
        btnReload = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        lblTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Tạo Phiếu Trả");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mã Phiếu Trả:");

        txtMaPM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã Phiếu Mượn:");

        txtNgTra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ngày trả:");

        txtMaNV.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mã Nhân Viên:");

        txtMaPT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        btnMaNV.setBackground(new java.awt.Color(255, 255, 255));
        btnMaNV.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnMaNV.setText("...");
        btnMaNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMaNVMouseClicked(evt);
            }
        });

        btnXacnhan.setBackground(new java.awt.Color(0, 204, 0));
        btnXacnhan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXacnhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXacnhanMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Xác Nhận Tạo");

        javax.swing.GroupLayout btnXacnhanLayout = new javax.swing.GroupLayout(btnXacnhan);
        btnXacnhan.setLayout(btnXacnhanLayout);
        btnXacnhanLayout.setHorizontalGroup(
            btnXacnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXacnhanLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addGap(24, 24, 24))
        );
        btnXacnhanLayout.setVerticalGroup(
            btnXacnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnXacnhanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap())
        );

        tblSachChoose.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sách", "Tên Sách", "Mã Sách Con", "Mã Tình Trạng"
            }
        ));
        tblSachChoose.setRowHeight(26);
        tblSachChoose.setSelectionBackground(new java.awt.Color(255, 51, 51));
        tblSachChoose.setShowVerticalLines(false);
        tblSachChoose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSachChooseMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSachChoose);
        if (tblSachChoose.getColumnModel().getColumnCount() > 0) {
            tblSachChoose.getColumnModel().getColumn(0).setMinWidth(50);
            tblSachChoose.getColumnModel().getColumn(0).setMaxWidth(70);
            tblSachChoose.getColumnModel().getColumn(2).setMinWidth(50);
            tblSachChoose.getColumnModel().getColumn(2).setMaxWidth(75);
            tblSachChoose.getColumnModel().getColumn(3).setMinWidth(80);
            tblSachChoose.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        btnThem.setBackground(new java.awt.Color(255, 255, 0));
        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Thêm");

        javax.swing.GroupLayout btnThemLayout = new javax.swing.GroupLayout(btnThem);
        btnThem.setLayout(btnThemLayout);
        btnThemLayout.setHorizontalGroup(
            btnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThemLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel7)
                .addGap(34, 34, 34))
        );
        btnThemLayout.setVerticalGroup(
            btnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnThemLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        btnXoachon.setBackground(new java.awt.Color(255, 0, 51));
        btnXoachon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoachon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoachonMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Xóa Chọn");

        javax.swing.GroupLayout btnXoachonLayout = new javax.swing.GroupLayout(btnXoachon);
        btnXoachon.setLayout(btnXoachonLayout);
        btnXoachonLayout.setHorizontalGroup(
            btnXoachonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXoachonLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addGap(21, 21, 21))
        );
        btnXoachonLayout.setVerticalGroup(
            btnXoachonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnXoachonLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        btnBochon.setBackground(new java.awt.Color(0, 0, 255));
        btnBochon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBochon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBochonMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Bỏ Chọn");

        javax.swing.GroupLayout btnBochonLayout = new javax.swing.GroupLayout(btnBochon);
        btnBochon.setLayout(btnBochonLayout);
        btnBochonLayout.setHorizontalGroup(
            btnBochonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBochonLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel9)
                .addGap(21, 21, 21))
        );
        btnBochonLayout.setVerticalGroup(
            btnBochonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBochonLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        tblPM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã PM", "Mã Thẻ", "Ngày Mượn", "Ngày Hẹn Trả", "Mã NV"
            }
        ));
        tblPM.setRowHeight(28);
        tblPM.setSelectionBackground(new java.awt.Color(255, 51, 51));
        tblPM.setShowVerticalLines(false);
        tblPM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPMMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblPM);

        ComboSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã PM", "Mã Thẻ" }));

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        tblSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sách", "Tên Sách", "Mã Sách Con", "Mã Tình Trạng Mới"
            }
        ));
        tblSach.setRowHeight(28);
        tblSach.setSelectionBackground(new java.awt.Color(255, 51, 51));
        tblSach.setShowVerticalLines(false);
        tblSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSachMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblSach);
        if (tblSach.getColumnModel().getColumnCount() > 0) {
            tblSach.getColumnModel().getColumn(0).setMinWidth(50);
            tblSach.getColumnModel().getColumn(0).setMaxWidth(70);
            tblSach.getColumnModel().getColumn(2).setMinWidth(50);
            tblSach.getColumnModel().getColumn(2).setMaxWidth(75);
            tblSach.getColumnModel().getColumn(3).setMinWidth(110);
            tblSach.getColumnModel().getColumn(3).setMaxWidth(120);
        }

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Chọn Sách Trả");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Thông Tin Sách Trả");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Phiếu Mượn Cần Trả");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tình Trạng Trả:");

        btnReload.setForeground(new java.awt.Color(255, 255, 255));
        btnReload.setText("return");
        btnReload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReloadMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaPM, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgTra, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaPT, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnXacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ComboTT, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(ComboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReload))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnXoachon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBochon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(426, 426, 426))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(txtMaPT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMaPM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgTra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMaNV)))
                        .addGap(32, 32, 32)
                        .addComponent(btnXacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ComboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11)
                            .addComponent(btnReload))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoachon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBochon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(ComboTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXacnhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXacnhanMouseClicked
        // TODO add your handling code here:
        txtMaPT.setEnabled(true);
        txtMaPM.setEnabled(true);
        txtNgTra.setEnabled(true);
        txtMaNV.setEnabled(true);
        
        
        if(txtMaPM.getText().equals("") || txtMaNV.getText().equals("") || tblSach.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "Thông tin không đầy đủ!!");
        }
        else{
            PhieuTraGUI.ThemPTTable(new Object[]{
                        txtMaPT.getText(),
                        txtMaPM.getText(),
                        txtNgTra.getText(),
                        txtMaNV.getText()    
                    });
        
            PhieuTraDTO pt= new PhieuTraDTO();
            pt.setMaPT(parseInt(txtMaPT.getText()));
            pt.setMaPM(parseInt(txtMaPM.getText()));
            pt.setNgayTra(txtNgTra.getText());
            pt.setMaNV(parseInt(txtMaNV.getText()));

            PhieuTraGUI.ThemPT(pt);
            
            ChiTietPhieuTraDTO ctpt= new ChiTietPhieuTraDTO();
        
            for(int j=0;j<model2.getRowCount();j++){
                ctpt.setMaPT(parseInt(txtMaPT.getText()));
                ctpt.setMaDS(parseInt(tblSach.getModel().getValueAt(j,0).toString()));
                int soluong=0;
                int mads= parseInt(tblSach.getModel().getValueAt(j,0).toString());
                int mas= parseInt(tblSach.getModel().getValueAt(j,0).toString());
                while(mads==mas && j<model2.getRowCount()){
                    soluong++;
                    j++;
                    if(j<model2.getRowCount()){
                    mas= parseInt(tblSach.getModel().getValueAt(j,0).toString());
                    }
                }
                ctpt.setSoluongtra(soluong);

                PhieuTraGUI.ThemCTPT(ctpt);
                j--;
            }
            ChiTietSachTraDTO ctst= new ChiTietSachTraDTO();
        SachConDTO st= new SachConDTO();

        for(int index=0;index<model2.getRowCount();index++){
            ctst.setMaPT(parseInt(txtMaPT.getText()));
            ctst.setMaDS(parseInt(tblSach.getModel().getValueAt(index,0).toString()));
            ctst.setMaSachcon(parseInt(tblSach.getModel().getValueAt(index,2).toString()));
            ctst.setMaTT(tblSach.getModel().getValueAt(index,3).toString());
            
            st.setMaDS(parseInt(tblSach.getModel().getValueAt(index,0).toString()));
            st.setMaSachCon(parseInt(tblSach.getModel().getValueAt(index,2).toString()));
            st.setMaTinhTrang(tblSach.getModel().getValueAt(index,3).toString());
            st.setHientrang(1);
            PhieuTraGUI.ThemCTST(ctst,st);
        }
        
        txtMaPT.setEnabled(false);
        txtMaPM.setEnabled(false);
        txtNgTra.setEnabled(false);
        txtMaNV.setEnabled(false);
        }
        
        txtMaPT.setEnabled(false);
        txtMaPM.setEnabled(false);
        txtNgTra.setEnabled(false);
        txtMaNV.setEnabled(false);
        
    }//GEN-LAST:event_btnXacnhanMouseClicked

    private void tblSachChooseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSachChooseMouseClicked
        // TODO add your handling code here:
        choose=tblSachChoose.getSelectedRow();
        maSach=tblSachChoose.getModel().getValueAt(choose,0).toString();
        tenSach=tblSachChoose.getModel().getValueAt(choose,1).toString();
        Masachcon=tblSachChoose.getModel().getValueAt(choose,2).toString();
        MaTT=tblSachChoose.getModel().getValueAt(choose,3).toString();
        ComboTT.setSelectedIndex(parseInt(MaTT)-1);
        
    }//GEN-LAST:event_tblSachChooseMouseClicked

    private void btnBochonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBochonMouseClicked
        // TODO add your handling code here:
        btnThem.setBackground(new java.awt.Color(255,255,0));
        btnXoachon.setVisible(false);
        btnBochon.setVisible(false);
        
    }//GEN-LAST:event_btnBochonMouseClicked

    private void btnXoachonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoachonMouseClicked
        // TODO add your handling code here:
        int i=tblSach.getSelectedRow();
        if(i>=0){      
            model2.removeRow(i);
            tblSach.setModel(model2);       
        }
    }//GEN-LAST:event_btnXoachonMouseClicked

    private void btnMaNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaNVMouseClicked
        // TODO add your handling code here:
        MaSuggest ma = null;
        try {
            ma = new MaSuggest("panelMaNV2");
        } catch (Exception ex) {
            Logger.getLogger(ThemPMFRM.class.getName()).log(Level.SEVERE, null, ex);
        }
        ma.setVisible(true);
        ma.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnMaNVMouseClicked

    
    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        // TODO add your handling code here:
        if(choose!=-1){
        int select=ComboTT.getSelectedIndex()+1;
        
        Object[] obj= {maSach,tenSach,Masachcon,select};
        model2.addRow(obj);
        this.tblSach.setModel(model2);
        }
        else{
            showMessageDialog(null,"Chưa chọn sách cần trả!!");
        }
    }//GEN-LAST:event_btnThemMouseClicked

    private void tblPMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPMMouseClicked
        // TODO add your handling code here:
        int i=tblPM.getSelectedRow();
        txtMaPM.setEnabled(true);
        txtMaPM.setText(tblPM.getModel().getValueAt(i,0).toString());
        
        DauSachBUS bus= new DauSachBUS();
        
        try {
            bus.DocDSChoose(tblPM.getModel().getValueAt(i,0).toString());
        } catch (Exception ex) {
            Logger.getLogger(ThemPTFRM.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Vector header= new Vector();
        header.add("MÃ ĐẦU SÁCH");
        header.add("TÊN SÁCH");
        header.add("MÃ SÁCH CON");
        header.add("MÃ TÌNH TRẠNG");
        
        model1= new DefaultTableModel(header,0);
        for(int j=0; j<DauSachBUS.dschooseMuon.size();j++){
                Object[] objs= {DauSachBUS.dschooseMuon.get(j).getMaDS(),DauSachBUS.dschooseMuon.get(j).getTensach(),DauSachBUS.dschooseMuon.get(j).getMasachcon(),DauSachBUS.dschooseMuon.get(j).getMaTT()};
                model1.addRow(objs);
            }
        tblSachChoose.setModel(model1);
        txtMaPM.setEnabled(false);
    }//GEN-LAST:event_tblPMMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
        if(txtSearch.getText().equals("")){
            PhieuMuonBUS bus= new PhieuMuonBUS();
            if(PhieuMuonBUS.dspm==null){
                try {
                    bus.DocPM();
                } catch (Exception ex) {
                    Logger.getLogger(ThemPTFRM.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            model=null;
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
            }
        tblPM.setModel(model);
        }
        if(ComboSearch.getSelectedIndex()==0){
            PhieuMuonBUS bus= new PhieuMuonBUS();
            ArrayList <PhieuMuonDTO> kq= new ArrayList <PhieuMuonDTO>();
            int maPM=parseInt(txtSearch.getText());
            kq=bus.timkiemtheoMaPM(maPM);
            
            if(kq!=null){
                model=null;
                Vector header= new Vector();
                header.add("Mã PM");
                header.add("Mã Thẻ TV");
                header.add("Ngày Mượn");
                header.add("Ngày Hẹn Trả");
                header.add("Mã NV");
                model= new DefaultTableModel(header,0);
                for(int i=0; i< kq.size(); i++){
                    Object[] objs={kq.get(i).getMaPM(),kq.get(i).getMatheTV(),kq.get(i).getNgaymuon(),kq.get(i).getNgayhentra(),kq.get(i).getMaNV()};
                    model.addRow(objs);
                }
                tblPM.setModel(model);
            }
            else{
                JOptionPane.showMessageDialog(null, "Kết quả tìm kiếm không tồn tại!!");
            }
        }
        if(ComboSearch.getSelectedIndex()==1){
            PhieuMuonBUS bus= new PhieuMuonBUS();
            ArrayList <PhieuMuonDTO> kq= new ArrayList <PhieuMuonDTO>();
            int maThe=parseInt(txtSearch.getText());
            kq=bus.timkiemtheoMaTheTV(maThe);
            
            if(kq!=null){
                model=null;
                Vector header= new Vector();
                header.add("Mã PM");
                header.add("Mã Thẻ TV");
                header.add("Ngày Mượn");
                header.add("Ngày Hẹn Trả");
                header.add("Mã NV");
                model= new DefaultTableModel(header,0);
                for(int i=0; i< kq.size(); i++){
                    Object[] objs={kq.get(i).getMaPM(),kq.get(i).getMatheTV(),kq.get(i).getNgaymuon(),kq.get(i).getNgayhentra(),kq.get(i).getMaNV()};
                    model.addRow(objs);
                }
                tblPM.setModel(model);
            }
            else{
                JOptionPane.showMessageDialog(null, "Kết quả tìm kiếm không tồn tại!!");
            }
        }
        
    }//GEN-LAST:event_txtSearchActionPerformed

    private void tblSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSachMouseClicked
        // TODO add your handling code here:
        btnXoachon.setVisible(true);
        btnBochon.setVisible(true);
    }//GEN-LAST:event_tblSachMouseClicked

    private void btnReloadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReloadMouseClicked
        // TODO add your handling code here:
        PhieuMuonBUS bus= new PhieuMuonBUS();
        if(PhieuMuonBUS.dspm==null){
            try {
                bus.DocPM();
            } catch (Exception ex) {
                Logger.getLogger(ThemPTFRM.class.getName()).log(Level.SEVERE, null, ex);
            }
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
            }
        tblPM.setModel(model);
    }//GEN-LAST:event_btnReloadMouseClicked
    
    public static void setMaNV(String maNV){
        txtMaNV.setEnabled(true);
        txtMaNV.setText(maNV);
        txtMaNV.setEnabled(false);
    }
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThemPMFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemPMFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemPMFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemPMFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemPMFRM("not").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboSearch;
    private javax.swing.JComboBox<String> ComboTT;
    private javax.swing.JPanel btnBochon;
    private javax.swing.JButton btnMaNV;
    private javax.swing.JLabel btnReload;
    private javax.swing.JPanel btnThem;
    private javax.swing.JPanel btnXacnhan;
    private javax.swing.JPanel btnXoachon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblPM;
    private javax.swing.JTable tblSach;
    private javax.swing.JTable tblSachChoose;
    private static javax.swing.JFormattedTextField txtMaNV;
    private javax.swing.JFormattedTextField txtMaPM;
    private static javax.swing.JFormattedTextField txtMaPT;
    private javax.swing.JFormattedTextField txtNgTra;
    private javax.swing.JFormattedTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
