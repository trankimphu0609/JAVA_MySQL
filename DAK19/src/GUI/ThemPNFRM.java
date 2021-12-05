
package GUI;

import BUS.ChiTietPhieuNhapBUS;
import BUS.DauSachBUS;
import BUS.PhieuNhapSachBUS;
import BUS.SachConBUS;
import BUS.TacGiaBUS;
import static javax.swing.JOptionPane.showMessageDialog;
import DTO.ChiTietPhieuMuonDTO;
import DTO.ChiTietPhieuNhapDTO;
import DTO.ChiTietSachMuonDTO;
import DTO.DauSachDTO;
import DTO.PhieuMuonDTO;
import DTO.PhieuNhapSachDTO;
import DTO.SachConDTO;
import DTO.TacGiaDTO;
import static java.lang.Integer.parseInt;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Hoang
 */
public class ThemPNFRM extends javax.swing.JFrame {
    public static int[] dausach1= new int [100];
    public static ArrayList<DauSachDTO> array= new  ArrayList<DauSachDTO>();
    public static ArrayList<TacGiaDTO> arraytg= new  ArrayList<TacGiaDTO>();
    public static ArrayList<TacGiaDTO> tgthem= new  ArrayList<TacGiaDTO>();
    public static int length1=1;
    
    int Moi,Cu;
    public static DefaultTableModel modelMoi;
    public static DefaultTableModel modelCu;
    public ThemPNFRM(String ma) {
        initComponents();
        
        for(int k=0; k<length1;k++){
            dausach1[k]=-1;
        }
        length1=1;
        DauSachBUS bus= new DauSachBUS();
            
            try {
                bus.DocDS();
            } catch (Exception ex) {
                Logger.getLogger(MaSachNhapFRM.class.getName()).log(Level.SEVERE, null, ex);
            }
            array=DauSachBUS.dsds;
        
        TacGiaBUS bus1= new TacGiaBUS();
            
            try {
                bus1.DocTG();
            } catch (Exception ex) {
                Logger.getLogger(MaSachNhapFRM.class.getName()).log(Level.SEVERE, null, ex);
            }
            arraytg=TacGiaBUS.dstg;
        for(int h=0;h<arraytg.size();h++){
            System.out.println(arraytg.get(h).getHoTG()+" "+arraytg.get(h).getTenTG());
        }
        
        txtMaPN.setText(ma);
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateFormat = formatter.format(Calendar.getInstance().getTime());
        txtNgNhap.setText(dateFormat);
        txtMaPN.setEnabled(false);
        txtMaNV.setEnabled(false);
        txtMaNCC.setEnabled(false);
        txtNgNhap.setEnabled(false);
        txtTongtien.setEnabled(false);
        
        btnXoachon.setVisible(false);
        btnBochon.setVisible(false);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtMaPN = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMaNCC = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNgNhap = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTongtien = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JFormattedTextField();
        btnMaThe = new javax.swing.JButton();
        btnMaNV = new javax.swing.JButton();
        btnMaSach = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSachCu = new javax.swing.JTable();
        btnThem = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnXoachon = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnBochon = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSachMoi = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

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
        lblTitle.setText("Tạo Phiếu Nhập");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mã Phiếu Nhập:");

        txtMaPN.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã NCC:");

        txtMaNCC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ngày Nhập:");

        txtNgNhap.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tổng tiền:");

        txtTongtien.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtTongtien.setText("0");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mã Nhân Viên:");

        txtMaNV.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        btnMaThe.setBackground(new java.awt.Color(255, 255, 255));
        btnMaThe.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnMaThe.setText("...");
        btnMaThe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMaThe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMaTheMouseClicked(evt);
            }
        });

        btnMaNV.setBackground(new java.awt.Color(255, 255, 255));
        btnMaNV.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnMaNV.setText("...");
        btnMaNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMaNVMouseClicked(evt);
            }
        });

        btnMaSach.setBackground(new java.awt.Color(0, 0, 153));
        btnMaSach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMaSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMaSachMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Chọn Sách Cần Nhập");

        javax.swing.GroupLayout btnMaSachLayout = new javax.swing.GroupLayout(btnMaSach);
        btnMaSach.setLayout(btnMaSachLayout);
        btnMaSachLayout.setHorizontalGroup(
            btnMaSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMaSachLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel6)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        btnMaSachLayout.setVerticalGroup(
            btnMaSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMaSachLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        tblSachCu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sách", "Tên Sách", "Số lượng", "Đơn giá"
            }
        ));
        tblSachCu.setRowHeight(26);
        tblSachCu.setSelectionBackground(new java.awt.Color(255, 51, 51));
        tblSachCu.setShowVerticalLines(false);
        tblSachCu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSachCuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSachCu);

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

        tblSachMoi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sách", "Tên Sách", "Họ TG", "Tên TG", "Số lượng", "Đơn giá"
            }
        ));
        tblSachMoi.setRowHeight(26);
        tblSachMoi.setSelectionBackground(new java.awt.Color(255, 51, 51));
        tblSachMoi.setShowVerticalLines(false);
        tblSachMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSachMoiMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblSachMoi);
        if (tblSachMoi.getColumnModel().getColumnCount() > 0) {
            tblSachMoi.getColumnModel().getColumn(0).setMinWidth(50);
            tblSachMoi.getColumnModel().getColumn(0).setMaxWidth(60);
            tblSachMoi.getColumnModel().getColumn(4).setMinWidth(50);
            tblSachMoi.getColumnModel().getColumn(4).setMaxWidth(60);
        }

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sách Nhập Thêm");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Sách Nhập Mới");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(262, 262, 262)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(252, 252, 252)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMaPN, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNgNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMaThe, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnXoachon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnBochon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(lblTitle)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(120, 120, 120)
                        .addComponent(btnMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtMaPN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMaThe)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNgNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMaNV))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBochon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoachon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMaSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaSachMouseClicked
        // TODO add your handling code here:
        MaSachNhapFRM ma = null;
        try {
            ma = new MaSachNhapFRM();
        } catch (Exception ex) {
            Logger.getLogger(ThemPMFRM.class.getName()).log(Level.SEVERE, null, ex);
        }
        ma.setVisible(true);
        ma.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnMaSachMouseClicked

    private void tblSachCuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSachCuMouseClicked
        // TODO add your handling code here:
        Cu=tblSachCu.getSelectedRow();
        Moi=-1;
        btnXoachon.setVisible(true);
        btnBochon.setVisible(true);
        btnThem.setBackground(new java.awt.Color(204,204,204));
        
    }//GEN-LAST:event_tblSachCuMouseClicked

    private void btnBochonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBochonMouseClicked
        // TODO add your handling code here:
        btnThem.setBackground(new java.awt.Color(255,255,0));
        btnXoachon.setVisible(false);
        btnBochon.setVisible(false);
        
        txtMaPN.setEnabled(true);
        txtMaNV.setEnabled(true);
        txtMaNCC.setEnabled(true);
        txtNgNhap.setEnabled(true);
        
        Moi=-1;
        Cu=-1;
        
        txtMaPN.setEnabled(false);
        txtMaNV.setEnabled(false);
        txtMaNCC.setEnabled(false);
        txtNgNhap.setEnabled(false);
    }//GEN-LAST:event_btnBochonMouseClicked

    private void btnXoachonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoachonMouseClicked
        // TODO add your handling code here:
        if(Moi!=-1&&Cu==-1){
            for(int i=0;i<array.size();i++){
                if(array.get(i).getTenSach().equals(modelMoi.getValueAt(Moi, 1).toString())){
                    array.remove(i);
                }
            }
            for(int i=0;i<arraytg.size();i++){
                if(arraytg.get(i).getHoTG().equals(modelMoi.getValueAt(Moi, 2).toString()) && arraytg.get(i).getTenTG().equals(modelMoi.getValueAt(Moi, 3).toString())){
                    arraytg.remove(i);
                }
            }
            for(int i=0;i<tgthem.size();i++){
                if(tgthem.get(i).getHoTG().equals(modelMoi.getValueAt(Moi, 2).toString()) && tgthem.get(i).getTenTG().equals(modelMoi.getValueAt(Moi, 3).toString())){
                    tgthem.remove(i);
                }
            }
            modelMoi.removeRow(Moi);
            tblSachMoi.setModel(modelMoi);    
        }
        if(Moi==-1&&Cu!=-1){      
            modelCu.removeRow(Cu);
            tblSachCu.setModel(modelCu);    
            dausach1[Cu]=-1;
            for(int i=Cu;i<length1-1;i++){
                dausach1[i]=dausach1[i+1];
            }
            length1=length1-1;
        }
        btnXoachon.setVisible(false);
        btnBochon.setVisible(false);
    }//GEN-LAST:event_btnXoachonMouseClicked

    private void btnMaNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaNVMouseClicked
        // TODO add your handling code here:
        MaSuggest ma = null;
        try {
            ma = new MaSuggest("panelMaNV3");
        } catch (Exception ex) {
            Logger.getLogger(ThemPMFRM.class.getName()).log(Level.SEVERE, null, ex);
        }
        ma.setVisible(true);
        ma.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnMaNVMouseClicked

    
    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        // TODO add your handling code here:
        txtMaPN.setEnabled(true);
        txtMaNV.setEnabled(true);
        txtMaNCC.setEnabled(true);
        txtNgNhap.setEnabled(true);
        txtTongtien.setEnabled(true);
        
        if(txtMaNCC.getText().equals("") || txtTongtien.getText().equals("") || txtMaNV.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!!");
        }
        else{
            PhieuNhapSachBUS bus=new PhieuNhapSachBUS();
            PhieuNhapSachDTO pn=new PhieuNhapSachDTO(parseInt(txtMaPN.getText()), txtMaNCC.getText(),parseInt(txtMaNV.getText()), txtNgNhap.getText(), parseInt(txtTongtien.getText()));
            
            try {
                bus.add(pn);
            } catch (Exception ex) {
                Logger.getLogger(ThemPNFRM.class.getName()).log(Level.SEVERE, null, ex);
            }
            ChiTietPhieuNhapBUS bus1= new ChiTietPhieuNhapBUS();
            if(tblSachCu.getRowCount()!=0){
                
                SachConBUS sc= new SachConBUS();
                try {
                    sc.DocDS();
                } catch (Exception ex) {
                    Logger.getLogger(ThemPNFRM.class.getName()).log(Level.SEVERE, null, ex);
                }
                for(int k=0;k<tblSachCu.getRowCount();k++){
                    String mads=tblSachCu.getValueAt(k, 0).toString();
                    int soluong=parseInt(tblSachCu.getValueAt(k, 2).toString());
                    int count=0;
                    for(int i=0;i<SachConBUS.dssc.size();i++){
                        if(SachConBUS.dssc.get(i).getMaDS()==parseInt(mads)){
                            count=SachConBUS.dssc.get(i).getMaSachCon();
                        }
                    }
                    if(count!=0){
                        while(soluong!=0){
                            count =count+1;
                            SachConDTO moi=new SachConDTO(parseInt(mads),count,"4",1);
                            try {
                                sc.Them(moi);
                            } catch (Exception ex) {
                                Logger.getLogger(ThemPNFRM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            soluong--;
                        }
                    }
                    ChiTietPhieuNhapDTO ctpn= new ChiTietPhieuNhapDTO(parseInt(txtMaPN.getText()),parseInt(tblSachCu.getValueAt(k, 0).toString()), tblSachCu.getValueAt(k, 1).toString(),parseInt(tblSachCu.getValueAt(k, 2).toString()),parseInt(tblSachCu.getValueAt(k, 3).toString()));
                    try {
                        bus1.add(ctpn);
                    } catch (Exception ex) {
                        Logger.getLogger(ThemPNFRM.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
            }
            if(tblSachMoi.getRowCount()!=0){
                TacGiaBUS bustg= new TacGiaBUS();
                for(int i=0;i<tgthem.size();i++){
                    TacGiaDTO tg= new TacGiaDTO(tgthem.get(i).getHoTG(),tgthem.get(i).getTenTG());
                    try {
                        bustg.Them(tg);
                    } catch (Exception ex) {
                        Logger.getLogger(ThemPNFRM.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                try {
                    bustg.DocTG();
                } catch (Exception ex) {
                    Logger.getLogger(ThemPNFRM.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(TacGiaBUS.dstg==null){
                    System.out.println();
                }
                else{
                    
                    System.out.println("not null "+TacGiaBUS.dstg.size());
                }
                
                for(int k=0;k<tblSachMoi.getRowCount();k++){
                    int matg=-1;
                    for(int j=0;j<TacGiaBUS.dstg.size();j++){
                        if(TacGiaBUS.dstg.get(j).getHoTG().equals(tblSachMoi.getValueAt(k, 2).toString()) && TacGiaBUS.dstg.get(j).getTenTG().equals(tblSachMoi.getValueAt(k, 3).toString())){
                            matg=TacGiaBUS.dstg.get(j).getMaTG();
                        }
                    }
                    if(matg!=-1){
                        DauSachBUS busds= new DauSachBUS();
                        DauSachDTO ds= new DauSachDTO(parseInt(tblSachMoi.getValueAt(k, 0).toString()), tblSachMoi.getValueAt(k, 1).toString(),parseInt(tblSachMoi.getValueAt(k, 4).toString()),matg);
                        try {
                            busds.Them(ds);
                        } catch (Exception ex) {
                            Logger.getLogger(ThemPNFRM.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        int stt=1;
                        for(int j=0;j<parseInt(tblSachMoi.getValueAt(k, 4).toString());j++){
                            SachConBUS bussc= new SachConBUS();
                            SachConDTO sc= new SachConDTO(parseInt(tblSachMoi.getValueAt(k, 0).toString()),stt,"4",1);
                            try {
                                bussc.Them(sc);
                            } catch (Exception ex) {
                                Logger.getLogger(ThemPNFRM.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            stt++;
                        }
                    }
                    ChiTietPhieuNhapDTO ctpn= new ChiTietPhieuNhapDTO(parseInt(txtMaPN.getText()),parseInt(tblSachMoi.getValueAt(k, 0).toString()), tblSachMoi.getValueAt(k, 1).toString(),parseInt(tblSachMoi.getValueAt(k, 4).toString()),parseInt(tblSachMoi.getValueAt(k, 5).toString()));
                    try {
                        bus1.add(ctpn);
                    } catch (Exception ex) {
                        Logger.getLogger(ThemPNFRM.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            PhieuNhapGUI.ThemPNTable(new Object[]{
                           txtMaPN.getText(),
                           txtMaNCC.getText(),
                           txtMaNV.getText(),
                           txtNgNhap.getText(),
                           txtTongtien.getText()
                    });
            dispose();
        }
        
        txtMaPN.setEnabled(false);
        txtMaNV.setEnabled(false);
        txtMaNCC.setEnabled(false);
        txtNgNhap.setEnabled(false);
        txtTongtien.setEnabled(false);
        
    }//GEN-LAST:event_btnThemMouseClicked
    
    private void btnMaTheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaTheMouseClicked
        // TODO add your handling code here:
        MaSuggest ma = null;
        try {
            ma = new MaSuggest("panelMaNCC");
        } catch (Exception ex) {
            Logger.getLogger(ThemPMFRM.class.getName()).log(Level.SEVERE, null, ex);
        }
        ma.setVisible(true);
        ma.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnMaTheMouseClicked

    private void tblSachMoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSachMoiMouseClicked
        // TODO add your handling code here:
        Moi=tblSachMoi.getSelectedRow();
        Cu=-1;
        btnXoachon.setVisible(true);
        btnBochon.setVisible(true);
        btnThem.setBackground(new java.awt.Color(204,204,204));
    }//GEN-LAST:event_tblSachMoiMouseClicked
    public static void ThemMaSach1(Object[] dataRow){
        modelCu= (DefaultTableModel)tblSachCu.getModel();
        modelCu.addRow(dataRow);
        int Dongia=parseInt(modelCu.getValueAt(modelCu.getRowCount()-1, modelCu.getColumnCount()-1).toString());
        int Soluong=parseInt(modelCu.getValueAt(modelCu.getRowCount()-1, modelCu.getColumnCount()-2).toString());
        int Thanhtien=Dongia*Soluong;
        txtTongtien.setEnabled(true);
        txtTongtien.setText(Integer.toString(parseInt(txtTongtien.getText())+Thanhtien));
        txtTongtien.setEnabled(false);
    }
    public static void ThemMaSach2(Object[] dataRow){
        modelMoi= (DefaultTableModel)tblSachMoi.getModel();
        modelMoi.addRow(dataRow);
        int Dongia=parseInt(modelMoi.getValueAt(modelMoi.getRowCount()-1, modelMoi.getColumnCount()-1).toString());
        int Soluong=parseInt(modelMoi.getValueAt(modelMoi.getRowCount()-1, modelMoi.getColumnCount()-2).toString());
        int Thanhtien=Dongia*Soluong;
        txtTongtien.setEnabled(true);
        txtTongtien.setText(Integer.toString(parseInt(txtTongtien.getText())+Thanhtien));
        txtTongtien.setEnabled(false);
    }
    public static void setMaNV(String maNV){
        txtMaNV.setEnabled(true);
        txtMaNV.setText(maNV);
        txtMaNV.setEnabled(false);
    }
    
    public static void setMaNCC(String maNCC){
        txtMaNCC.setEnabled(true);
        txtMaNCC.setText(maNCC);
        txtMaNCC.setEnabled(false);
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
    private javax.swing.JPanel btnBochon;
    private javax.swing.JButton btnMaNV;
    private javax.swing.JPanel btnMaSach;
    private javax.swing.JButton btnMaThe;
    private javax.swing.JPanel btnThem;
    private javax.swing.JPanel btnXoachon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblTitle;
    private static javax.swing.JTable tblSachCu;
    private static javax.swing.JTable tblSachMoi;
    private static javax.swing.JFormattedTextField txtMaNCC;
    private static javax.swing.JFormattedTextField txtMaNV;
    private javax.swing.JFormattedTextField txtMaPN;
    private javax.swing.JFormattedTextField txtNgNhap;
    private static javax.swing.JFormattedTextField txtTongtien;
    // End of variables declaration//GEN-END:variables
}
