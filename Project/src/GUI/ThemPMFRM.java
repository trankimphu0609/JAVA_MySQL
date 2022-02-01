/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.TheThuVienBUS;
import static javax.swing.JOptionPane.showMessageDialog;
import DTO.ChiTietPhieuMuonDTO;
import DTO.ChiTietSachMuonDTO;
import DTO.PhieuMuonDTO;
import DTO.SachConDTO;
import static java.lang.Integer.parseInt;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
public class ThemPMFRM extends javax.swing.JFrame {
    public static int[] dausach= new int [100];
    public static int[] sachcon= new int [100];
    public static int length=1;
    public static DefaultTableModel model;
    
    public ThemPMFRM(String ma) {
        initComponents();
        dausach[0]=0;
        sachcon[0]=0;
        txtMaPM.setText(ma);
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateFormat = formatter.format(Calendar.getInstance().getTime());
        txtNgMuon.setText(dateFormat);
        txtMaPM.setEnabled(false);
        txtMaNV.setEnabled(false);
        txtMaThe.setEnabled(false);
        txtNgMuon.setEnabled(false);
        
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
        txtMaPM = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMaThe = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNgMuon = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNgHen = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JFormattedTextField();
        btnMaThe = new javax.swing.JButton();
        btnMaNV = new javax.swing.JButton();
        btnMaSach = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSach = new javax.swing.JTable();
        btnThem = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnXoachon = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnBochon = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

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
        lblTitle.setText("Tạo Phiếu Mượn");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mã Phiếu Mượn:");

        txtMaPM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã Thẻ TV:");

        txtMaThe.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ngày Mượn:");

        txtNgMuon.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ngày Hẹn Trả:");

        txtNgHen.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        txtNgHen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNgHenMouseClicked(evt);
            }
        });

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
        jLabel6.setText("Chọn Sách Cần Mượn");

        javax.swing.GroupLayout btnMaSachLayout = new javax.swing.GroupLayout(btnMaSach);
        btnMaSach.setLayout(btnMaSachLayout);
        btnMaSachLayout.setHorizontalGroup(
            btnMaSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMaSachLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnMaSachLayout.setVerticalGroup(
            btnMaSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMaSachLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        tblSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sách", "Tên Sách", "Mã Sách Con", "Mã Tình Trạng"
            }
        ));
        tblSach.setRowHeight(26);
        tblSach.setSelectionBackground(new java.awt.Color(255, 51, 51));
        tblSach.setShowVerticalLines(false);
        tblSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSachMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSach);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(258, 258, 258))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaPM, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                                    .addComponent(txtMaThe)
                                    .addComponent(txtNgMuon)
                                    .addComponent(txtNgHen)
                                    .addComponent(txtMaNV))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnMaThe, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2)
                                    .addComponent(btnMaSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnXoachon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnBochon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtMaPM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaThe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMaThe))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNgMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNgHen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMaNV))
                    .addComponent(jLabel5))
                .addGap(16, 16, 16)
                .addComponent(btnMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnXoachon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnBochon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        MaSachChooseFRM ma = null;
        try {
            ma = new MaSachChooseFRM();
        } catch (Exception ex) {
            Logger.getLogger(ThemPMFRM.class.getName()).log(Level.SEVERE, null, ex);
        }
        ma.setVisible(true);
        ma.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnMaSachMouseClicked

    private void tblSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSachMouseClicked
        // TODO add your handling code here:
        btnXoachon.setVisible(true);
        btnBochon.setVisible(true);
        btnThem.setBackground(new java.awt.Color(204,204,204));
        
    }//GEN-LAST:event_tblSachMouseClicked

    private void btnBochonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBochonMouseClicked
        // TODO add your handling code here:
        btnThem.setBackground(new java.awt.Color(255,255,0));
        btnXoachon.setVisible(false);
        btnBochon.setVisible(false);
        
        txtMaPM.setEnabled(true);
        txtMaNV.setEnabled(true);
        txtMaThe.setEnabled(true);
        txtNgMuon.setEnabled(true);
        
        
        txtMaPM.setEnabled(false);
        txtMaNV.setEnabled(false);
        txtMaThe.setEnabled(false);
        txtNgMuon.setEnabled(false);
    }//GEN-LAST:event_btnBochonMouseClicked

    private void btnXoachonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoachonMouseClicked
        // TODO add your handling code here:
        int i=tblSach.getSelectedRow();
        if(i>=0){      
            model.removeRow(i);
            tblSach.setModel(model);       
        }
    }//GEN-LAST:event_btnXoachonMouseClicked

    private void btnMaNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaNVMouseClicked
        // TODO add your handling code here:
        TheThuVienBUS bus= new TheThuVienBUS();
        int check=0;
        txtMaThe.setEnabled(true);
        if(!txtMaThe.getText().equals("")){
        if(TheThuVienBUS.dsthe==null){
                    try {
                        bus.DocDSThe();
                    } catch (Exception ex) {
                        Logger.getLogger(ChucVu_DSTinhTrangGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                
                for(int j=0;j<TheThuVienBUS.dsthe.size();j++){
                    if(TheThuVienBUS.dsthe.get(j).getMatheTV()==parseInt(txtMaThe.getText())){
                        Date HetHan= null;
                        Date Hientai= null;
                        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                        String dateFormat = formatter.format(Calendar.getInstance().getTime());
                        System.out.println(TheThuVienBUS.dsthe.get(j).getNgayHetHan());
                        System.out.println(dateFormat);
                        try {
                            HetHan=new SimpleDateFormat("yyyy-MM-dd").parse(TheThuVienBUS.dsthe.get(j).getNgayHetHan());
                        } catch (ParseException ex) {
                            Logger.getLogger(ThemPMFRM.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            Hientai=new SimpleDateFormat("yyyy-MM-dd").parse(dateFormat);
                        } catch (ParseException ex) {
                            Logger.getLogger(ThemPMFRM.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        if(HetHan.compareTo(Hientai)<0 || HetHan.compareTo(Hientai)==0){
                            check=1;
                        }
                    }
                }
        }
        if(check==1){
            JOptionPane.showMessageDialog(null, "Thẻ của bạn đã hết hạn !!");
            txtMaThe.setText("");
            txtMaThe.setEnabled(false);
        }
        else{
            MaSuggest ma = null;
            try {
                ma = new MaSuggest("panelMaNV1");
            } catch (Exception ex) {
                Logger.getLogger(ThemPMFRM.class.getName()).log(Level.SEVERE, null, ex);
            }
            ma.setVisible(true);
            ma.setLocationRelativeTo(null);
        }
        txtMaThe.setEnabled(false);
    }//GEN-LAST:event_btnMaNVMouseClicked

    
    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        // TODO add your handling code here:
        TheThuVienBUS bus= new TheThuVienBUS();
        txtMaThe.setEnabled(true);
        if(!txtMaThe.getText().equals("")){
        if(TheThuVienBUS.dsthe==null){
                    try {
                        bus.DocDSThe();
                    } catch (Exception ex) {
                        Logger.getLogger(ChucVu_DSTinhTrangGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                int check=0;
                
                for(int j=0;j<TheThuVienBUS.dsthe.size();j++){
                    if(TheThuVienBUS.dsthe.get(j).getMatheTV()==parseInt(txtMaThe.getText())){
                        Date HetHan= null;
                        Date Hientai= null;
                        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                        String dateFormat = formatter.format(Calendar.getInstance().getTime());
                        System.out.println(TheThuVienBUS.dsthe.get(j).getNgayHetHan());
                        System.out.println(dateFormat);
                        try {
                            HetHan=new SimpleDateFormat("yyyy-MM-dd").parse(TheThuVienBUS.dsthe.get(j).getNgayHetHan());
                        } catch (ParseException ex) {
                            Logger.getLogger(ThemPMFRM.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            Hientai=new SimpleDateFormat("yyyy-MM-dd").parse(dateFormat);
                        } catch (ParseException ex) {
                            Logger.getLogger(ThemPMFRM.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        if(HetHan.compareTo(Hientai)<0 || HetHan.compareTo(Hientai)==0){
                            check=1;
                        }
                    }
                }
                
        if(check==1){
            JOptionPane.showMessageDialog(null, "Th? c?a b?n ð? h?t h?n");
            txtMaThe.setText("");
            txtMaThe.setEnabled(false);
        }
    }
        txtMaThe.setEnabled(false);
        txtMaPM.setEnabled(true);
        txtMaNV.setEnabled(true);
        txtMaThe.setEnabled(true);
        txtNgMuon.setEnabled(true);
        
        if(txtMaPM.getText().equals("") || txtMaThe.getText().equals("") || txtNgMuon.getText().equals("") || txtNgHen.getText().equals("") || txtMaNV.getText().equals("") || tblSach.getRowCount()==0){
            showMessageDialog(null,"Vui lòng nhập đầy đủ thông tin!!");
        
        }    
        else{
            Date NgMuon=null;
            Date NgHen=null;
            try {
                NgMuon = new SimpleDateFormat("yyyy-MM-dd").parse(txtNgMuon.getText());
            } catch (ParseException ex) {
                Logger.getLogger(ThemPMFRM.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                NgHen = new SimpleDateFormat("yyyy-MM-dd").parse(txtNgHen.getText());
            } catch (ParseException ex) {
                Logger.getLogger(ThemPMFRM.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(NgMuon.compareTo(NgHen) > 0){
                JOptionPane.showMessageDialog(null, "Ngày hẹn trả phải sau ngày mượn!!");
                txtMaPM.setEnabled(false);
                txtMaNV.setEnabled(false);
                txtMaThe.setEnabled(false);
                txtNgMuon.setEnabled(false);
            }
            else{
         
        PhieuMuonGUI.ThemPMTable(new Object[]{
                        txtMaPM.getText(),
                        txtMaThe.getText(),
                        txtNgMuon.getText(),
                        txtNgHen.getText(),
                        txtMaNV.getText(),
                        
                    });
        
        PhieuMuonDTO pm= new PhieuMuonDTO();
        pm.setMaPM(parseInt(txtMaPM.getText()));
        pm.setMatheTV(parseInt(txtMaThe.getText()));
        pm.setNgaymuon(txtNgMuon.getText());
        pm.setNgayhentra(txtNgHen.getText());
        pm.setMaNV(parseInt(txtMaNV.getText()));
        
        PhieuMuonGUI.ThemPM(pm);
        
        ChiTietPhieuMuonDTO ctpm= new ChiTietPhieuMuonDTO();
        
        for(int j=0;j<model.getRowCount();j++){
            ctpm.setMaPM(parseInt(txtMaPM.getText()));
            ctpm.setMaDS(parseInt(tblSach.getModel().getValueAt(j,0).toString()));
            int soluong=0;
            int mads= parseInt(tblSach.getModel().getValueAt(j,0).toString());
            int mas= parseInt(tblSach.getModel().getValueAt(j,0).toString());
            while(mads==mas && j<model.getRowCount()){
                soluong++;
                j++;
                if(j<model.getRowCount()){
                mas= parseInt(tblSach.getModel().getValueAt(j,0).toString());
                }
            }
            ctpm.setSoluong(soluong);
            
            PhieuMuonGUI.ThemCTPM(ctpm);
            j--;
        }
                
        ChiTietSachMuonDTO ctsm= new ChiTietSachMuonDTO();
        SachConDTO sm= new SachConDTO();

        for(int index=0;index<model.getRowCount();index++){
            ctsm.setMaPM(parseInt(txtMaPM.getText()));
            ctsm.setMaDS(parseInt(tblSach.getModel().getValueAt(index,0).toString()));
            ctsm.setMaSachCon(parseInt(tblSach.getModel().getValueAt(index,2).toString()));
            ctsm.setMaTinhtrang(tblSach.getModel().getValueAt(index,3).toString());
            
            sm.setMaDS(parseInt(tblSach.getModel().getValueAt(index,0).toString()));
            sm.setMaSachCon(parseInt(tblSach.getModel().getValueAt(index,2).toString()));
            sm.setMaTinhTrang(tblSach.getModel().getValueAt(index,3).toString());
            sm.setHientrang(0);
            PhieuMuonGUI.ThemCTSM(ctsm,sm);
        }
        
        txtMaPM.setEnabled(false);
        txtMaNV.setEnabled(false);
        txtMaThe.setEnabled(false);
        txtNgMuon.setEnabled(false);
        dispose();
        }
            
        }
        txtMaPM.setEnabled(false);
        txtMaNV.setEnabled(false);
        txtMaThe.setEnabled(false);
        txtNgMuon.setEnabled(false);
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnMaTheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaTheMouseClicked
        // TODO add your handling code here:
        MaSuggest ma = null;
        try {
            ma = new MaSuggest("panelMaThe");
        } catch (Exception ex) {
            Logger.getLogger(ThemPMFRM.class.getName()).log(Level.SEVERE, null, ex);
        }
        ma.setVisible(true);
        ma.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnMaTheMouseClicked

    private void txtNgHenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNgHenMouseClicked
        // TODO add your handling code here:
        TheThuVienBUS bus= new TheThuVienBUS();
        txtMaThe.setEnabled(true);
        if(!txtMaThe.getText().equals("")){
        if(TheThuVienBUS.dsthe==null){
                    try {
                        bus.DocDSThe();
                    } catch (Exception ex) {
                        Logger.getLogger(ChucVu_DSTinhTrangGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                int check=0;
                
                for(int j=0;j<TheThuVienBUS.dsthe.size();j++){
                    if(TheThuVienBUS.dsthe.get(j).getMatheTV()==parseInt(txtMaThe.getText())){
                        Date HetHan= null;
                        Date Hientai= null;
                        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                        String dateFormat = formatter.format(Calendar.getInstance().getTime());
                        try {
                            HetHan=new SimpleDateFormat("yyyy-MM-dd").parse(TheThuVienBUS.dsthe.get(j).getNgayHetHan());
                        } catch (ParseException ex) {
                            Logger.getLogger(ThemPMFRM.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            Hientai=new SimpleDateFormat("yyyy-MM-dd").parse(dateFormat);
                        } catch (ParseException ex) {
                            Logger.getLogger(ThemPMFRM.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        if(HetHan.compareTo(Hientai)<0 || HetHan.compareTo(Hientai)==0){
                            check=1;
                        }
                    }
                }
                
        if(check==1){
            JOptionPane.showMessageDialog(null, "Thẻ của bạn đã hết hạn");
            txtMaThe.setText("");
        }
        }
        txtMaThe.setEnabled(false);
    }//GEN-LAST:event_txtNgHenMouseClicked
    public static void ThemMaSach(Object[] dataRow){
        model= (DefaultTableModel)tblSach.getModel();
        model.addRow(dataRow);
    }
    public static void setMaNV(String maNV){
        txtMaNV.setEnabled(true);
        txtMaNV.setText(maNV);
        txtMaNV.setEnabled(false);
    }
    
    public static void setMaThe(String maThe){
        txtMaThe.setEnabled(true);
        txtMaThe.setText(maThe);
        txtMaThe.setEnabled(false);
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
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblTitle;
    private static javax.swing.JTable tblSach;
    private static javax.swing.JFormattedTextField txtMaNV;
    private javax.swing.JFormattedTextField txtMaPM;
    private static javax.swing.JFormattedTextField txtMaThe;
    private javax.swing.JFormattedTextField txtNgHen;
    private javax.swing.JFormattedTextField txtNgMuon;
    // End of variables declaration//GEN-END:variables
}
