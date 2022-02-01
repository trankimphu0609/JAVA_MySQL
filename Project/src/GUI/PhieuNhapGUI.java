
package GUI;

import BUS.ChiTietPhieuNhapBUS;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import BUS.PhieuNhapSachBUS;
import DTO.ChiTietPhieuNhapDTO;
import DTO.PhieuNhapSachDTO;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.lang.Integer.parseInt;
import java.util.Vector;

public class PhieuNhapGUI extends javax.swing.JPanel {
    public static DefaultTableModel model;
    DefaultTableModel model1;
    
    private static int choose=2;
    private static int max=-1; 
    
    public PhieuNhapGUI() throws Exception {
        initComponents();
        tblPN.getTableHeader().setOpaque(false);
        tblPN.getTableHeader().setBackground(Color.blue);
        tblPN.getTableHeader().setForeground(new Color(255,255,255));
    
        tblPN.setRowHeight(28);
        PhieuNhapSachBUS bus= new PhieuNhapSachBUS();
        if(PhieuNhapSachBUS.dsPNS == null){
            bus.list();
        }
        Vector header= new Vector();
        header.add("ID PN");
        header.add("Mã NCC");
        header.add("MÃ NV ");
        header.add("NGÀY NHẬP");
        header.add("TỔNG TIỀN");
        model= new DefaultTableModel(header,0);
        for(int i=0; i<PhieuNhapSachBUS.dsPNS.size();i++){
                Object[] objs= {PhieuNhapSachBUS.dsPNS.get(i).getIDPhieuNhap(),PhieuNhapSachBUS.dsPNS.get(i).getMaNCC(),PhieuNhapSachBUS.dsPNS.get(i).getMaNV(),PhieuNhapSachBUS.dsPNS.get(i).getNgayNhap(),PhieuNhapSachBUS.dsPNS.get(i).getTongTien()};
                model.addRow(objs);
                max=PhieuNhapSachBUS.dsPNS.get(i).getIDPhieuNhap();
            }
        max=max+1;
        tblPN.setModel(model);
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIDPN = new javax.swing.JTextField();
        txtMaNCC = new javax.swing.JTextField();
        txtMaNV = new javax.swing.JFormattedTextField();
        txtNgNhap = new javax.swing.JFormattedTextField();
        btnXoa = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnThem = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        btnReload = new javax.swing.JLabel();
        btnreload = new javax.swing.JLabel();
        TitileNhap = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPN = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCTPN = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Phiếu Nhập:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã Nhà Cung Cấp:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mã Nhân Viên:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ngày Nhập:");

        txtMaNV.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("y-MM-dd"))));

        txtNgNhap.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("y-MM-dd"))));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnThemLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel8)
                .addGap(32, 32, 32))
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
        jLabel11.setText("Tổng Tiền:");

        btnReload.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        btnreload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnreloadMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtIDPN, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                        .addComponent(txtMaNCC)
                        .addComponent(txtMaNV)
                        .addComponent(txtNgNhap)
                        .addComponent(txtTongTien))
                    .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReload)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnreload)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(txtIDPN, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNgNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnReload)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnreload)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))))
        );

        TitileNhap.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TitileNhap.setForeground(new java.awt.Color(51, 51, 51));
        TitileNhap.setText("Thông Tin Phiếu Nhập");

        tblPN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Phiếu Nhập", "Mã NCC", "Mã NV", "Ngày nhập", "Tổng tiền"
            }
        ));
        tblPN.setRowHeight(28);
        tblPN.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tblPN.setShowVerticalLines(false);
        tblPN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPNMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPN);

        jPanel6.setBackground(new java.awt.Color(51, 51, 255));

        tblCTPN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Phiếu Nhập", "Mã Đầu Sách", "Tên sách", "Số lượng", "Đơn giá"
            }
        ));
        tblCTPN.setRowHeight(28);
        tblCTPN.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tblCTPN.setShowVerticalLines(false);
        jScrollPane2.setViewportView(tblCTPN);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Chi Tiết Phiếu Nhập");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TitileNhap))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TitileNhap)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        // TODO add your handling code here:
        if(choose==1){
            int i=tblPN.getSelectedRow();
            if(i>=0){
                model.removeRow(i);
                tblPN.setModel(model);
            }
            if(model1!=null){
                for(int j=0;j<model1.getRowCount();j++){
                    model1.removeRow(j);
                }
                tblCTPN.setModel(model1);
            }

            
            txtIDPN.setEnabled(true);
            int ma=parseInt(txtIDPN.getText());
            txtIDPN.setEnabled(false);
            PhieuNhapSachBUS bus= new PhieuNhapSachBUS();
            try {
                bus.delete(ma);
            } catch (Exception ex) {
                Logger.getLogger(PhieuNhapGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        // TODO add your handling code here:
        if(choose==2){
        ThemPNFRM them= new ThemPNFRM(Integer.toString(max));
        them.setVisible(true);
        
        
        }
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnreloadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnreloadMouseClicked
        // TODO add your handling code here:
        choose=2;
        
        btnThem.setBackground(new java.awt.Color(255,255,51));
        btnXoa.setBackground(new java.awt.Color(204, 204, 204));

        txtIDPN.setEnabled(false);
        txtMaNCC.setEnabled(false);
        txtMaNV.setEnabled(false);
        txtNgNhap.setEnabled(false);
        txtTongTien.setEnabled(false);
    }//GEN-LAST:event_btnreloadMouseClicked
    
    public static void ThemPNTable(Object[] dataRow){
        model.addRow(dataRow);
        tblPN.setModel(model);
        
    }
    
    
    private void tblPNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPNMouseClicked
        int i=tblPN.getSelectedRow();
        choose=1;
        txtIDPN.setEnabled(true);
        txtMaNCC.setEnabled(true);
        txtMaNV.setEnabled(true);
        txtNgNhap.setEnabled(true);
        txtTongTien.setEnabled(true);
        
        
        btnThem.setBackground(new java.awt.Color(204,204,204));
        btnXoa.setBackground(new java.awt.Color(255, 51, 51));
        
        txtIDPN.setText(tblPN.getModel().getValueAt(i,0).toString());
        txtIDPN.setEnabled(false);
        txtMaNCC.setText(tblPN.getModel().getValueAt(i,1).toString());
        txtMaNCC.setEnabled(false);
        
        txtMaNV.setText(tblPN.getModel().getValueAt(i,2).toString());
        txtMaNV.setEnabled(false);
        txtNgNhap.setText(tblPN.getModel().getValueAt(i,3).toString());
        txtNgNhap.setEnabled(false);
        txtTongTien.setText(tblPN.getModel().getValueAt(i,4).toString());
        txtTongTien.setEnabled(false);
       
        ChiTietPhieuNhapBUS bus= new ChiTietPhieuNhapBUS();
        
            try {
                bus.list(parseInt(tblPN.getModel().getValueAt(i,0).toString()));
            } catch (Exception ex) {
                Logger.getLogger(PhieuNhapGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        Vector header= new Vector();
        header.add("ID PN");
        header.add("Mã Đầu Sách");
        header.add("Tên Sách");
        header.add("Số lượng");
        header.add("Đơn giá");
        
        model1= new DefaultTableModel(header,0);
        for(int j=0; j<ChiTietPhieuNhapBUS.dsctpn.size();j++){
                Object[] objs= {ChiTietPhieuNhapBUS.dsctpn.get(j).getIDPhieuNhap(),ChiTietPhieuNhapBUS.dsctpn.get(j).getMaSach(),ChiTietPhieuNhapBUS.dsctpn.get(j).getTenSach(),ChiTietPhieuNhapBUS.dsctpn.get(j).getSoLuong(),ChiTietPhieuNhapBUS.dsctpn.get(j).getDonGia()};
                model1.addRow(objs);
            }
        tblCTPN.setModel(model1);
    }//GEN-LAST:event_tblPNMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitileNhap;
    private javax.swing.JLabel btnReload;
    private javax.swing.JPanel btnThem;
    private javax.swing.JPanel btnXoa;
    private javax.swing.JLabel btnreload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCTPN;
    private static javax.swing.JTable tblPN;
    private javax.swing.JTextField txtIDPN;
    private javax.swing.JTextField txtMaNCC;
    private javax.swing.JFormattedTextField txtMaNV;
    private javax.swing.JFormattedTextField txtNgNhap;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
