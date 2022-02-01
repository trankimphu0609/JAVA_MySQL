
package GUI;

import BUS.ChiTietPhieuTraBUS;
import BUS.ChiTietSachMuonBUS;
import BUS.ChiTietSachTraBUS;
import BUS.PhieuTraBUS;
import BUS.SachConBUS;
import DTO.ChiTietPhieuTraDTO;
import DTO.ChiTietSachTraDTO;
import DTO.PhieuTraDTO;
import DTO.SachConDTO;
import java.awt.Color;
import static java.lang.Integer.parseInt;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


public class PhieuTraGUI extends javax.swing.JPanel {
    public static DefaultTableModel model;
    DefaultTableModel model1;
    DefaultTableModel model2;
    private int choose=2;
    private static int max=-1; 
    
    public PhieuTraGUI() throws Exception {
        initComponents();
        btnReload.setIcon(new ImageIcon("Image/reload.png"));
        btnReload.setText("");
        PhieuTraBUS bus= new PhieuTraBUS();
        if(PhieuTraBUS.dspt==null){
            bus.DocDSPT();
        }
        Vector header= new Vector();
        header.add("Mã PT");
        header.add("Mã PM");
        header.add("Ngày Trả");
        header.add("Mã NV");
        
        model= new DefaultTableModel(header,0);
        for(int i=0; i<PhieuTraBUS.dspt.size();i++){
                Object[] objs= {PhieuTraBUS.dspt.get(i).getMaPT(),PhieuTraBUS.dspt.get(i).getMaPM(),PhieuTraBUS.dspt.get(i).getNgayTra(),PhieuTraBUS.dspt.get(i).getMaNV()};
                model.addRow(objs);
                max=PhieuTraBUS.dspt.get(i).getMaPT();
            }
        max=max+1;
        tblPT.setModel(model);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaPT = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMaPM = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNgTra = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JFormattedTextField();
        btnThem = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnReload = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPT = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCTPT = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCTST = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã Phiếu Trả:");

        txtMaPT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mã Phiếu Mượn:");

        txtMaPM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ngày Trả:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mã Nhân Viên:");

        txtMaNV.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        btnThem.setBackground(new java.awt.Color(255, 255, 51));
        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("THÊM");

        javax.swing.GroupLayout btnThemLayout = new javax.swing.GroupLayout(btnThem);
        btnThem.setLayout(btnThemLayout);
        btnThemLayout.setHorizontalGroup(
            btnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThemLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addGap(33, 33, 33))
        );
        btnThemLayout.setVerticalGroup(
            btnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnThemLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        btnXoa.setBackground(new java.awt.Color(204, 204, 204));
        btnXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("XÓA");

        javax.swing.GroupLayout btnXoaLayout = new javax.swing.GroupLayout(btnXoa);
        btnXoa.setLayout(btnXoaLayout);
        btnXoaLayout.setHorizontalGroup(
            btnXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnXoaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel9)
                .addGap(32, 32, 32))
        );
        btnXoaLayout.setVerticalGroup(
            btnXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnXoaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel9)
                .addContainerGap())
        );

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
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtMaPT, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                        .addComponent(txtMaPM)
                        .addComponent(txtNgTra)
                        .addComponent(txtMaNV))
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReload)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaPT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaPM, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNgTra, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReload)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Thông Tin Phiếu Trả");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        tblPT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã PT", "Mã PM", "Ngày Trả", "Mã NV"
            }
        ));
        tblPT.setRowHeight(28);
        tblPT.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tblPT.setShowVerticalLines(false);
        tblPT.setSurrendersFocusOnKeystroke(true);
        tblPT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        tblCTPT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã PT", "Mã ĐS", "Tên Sách", "Số Lượng Trả"
            }
        ));
        tblCTPT.setRowHeight(28);
        tblCTPT.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tblCTPT.setShowVerticalLines(false);
        tblCTPT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCTPTMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCTPT);
        if (tblCTPT.getColumnModel().getColumnCount() > 0) {
            tblCTPT.getColumnModel().getColumn(0).setMinWidth(50);
            tblCTPT.getColumnModel().getColumn(0).setMaxWidth(70);
            tblCTPT.getColumnModel().getColumn(1).setMinWidth(50);
            tblCTPT.getColumnModel().getColumn(1).setMaxWidth(70);
        }

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setText("Chi Tiết Phiếu Trả");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        tblCTST.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã PT", "Mã Đầu Sách", "Mã Sách Con", "Mã TT"
            }
        ));
        tblCTST.setRowHeight(28);
        tblCTST.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tblCTST.setShowVerticalLines(false);
        jScrollPane3.setViewportView(tblCTST);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setText("Chi Tiết Sách Trả");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblPTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPTMouseClicked
        // TODO add your handling code here:
        int i=tblPT.getSelectedRow();
        choose=1;
        
        txtMaPT.setEnabled(true);
        txtMaPM.setEnabled(true);
        txtNgTra.setEnabled(true);
        txtMaNV.setEnabled(true);
        
        
        btnThem.setBackground(new java.awt.Color(204,204,204));
        btnXoa.setBackground(new java.awt.Color(255,80,80));
        
        txtMaPT.setText(tblPT.getModel().getValueAt(i,0).toString());
        txtMaPT.setEnabled(false);
        txtMaPM.setText(tblPT.getModel().getValueAt(i,1).toString());
        txtMaPM.setEnabled(false);
        
        txtNgTra.setText(tblPT.getModel().getValueAt(i,2).toString());
        txtNgTra.setEnabled(false);
        txtMaNV.setText(tblPT.getModel().getValueAt(i,3).toString());
        txtMaNV.setEnabled(false);

       
        ChiTietPhieuTraBUS bus= new ChiTietPhieuTraBUS();
        
            try {
                bus.DocDSCTPT(tblPT.getModel().getValueAt(i,0).toString());
            } catch (Exception ex) {
                Logger.getLogger(PhieuMuonGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        Vector header= new Vector();
        header.add("Mã PT");
        header.add("Mã Sách");
        header.add("Tên Sách");
        header.add("Số lượng");
        
        
        model1= new DefaultTableModel(header,0);
        for(int j=0; j<ChiTietPhieuTraBUS.dsphieutra.size();j++){
                Object[] objs= {ChiTietPhieuTraBUS.dsphieutra.get(j).getMaPT(),ChiTietPhieuTraBUS.dsphieutra.get(j).getMaDS(),ChiTietPhieuTraBUS.dsphieutra.get(j).getTensach(),ChiTietPhieuTraBUS.dsphieutra.get(j).getSoluongtra()};
                model1.addRow(objs);
            }
        tblCTPT.setModel(model1);
    }//GEN-LAST:event_tblPTMouseClicked

    private void tblCTPTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCTPTMouseClicked
        // TODO add your handling code here:
        int i=tblCTPT.getSelectedRow();
        ChiTietSachTraBUS bus= new ChiTietSachTraBUS();
            try {
                bus.DocDSCTST(tblCTPT.getModel().getValueAt(i,0).toString(), tblCTPT.getModel().getValueAt(i,1).toString());
            } catch (Exception ex) {
                Logger.getLogger(PhieuMuonGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        Vector header= new Vector();
        header.add("Mã PT");
        header.add("Mã ĐS");
        header.add("Mã SC");
        header.add("Mã TT");
        
        
        model2= new DefaultTableModel(header,0);
        for(int j=0; j<ChiTietSachTraBUS.dssachtra.size();j++){
                Object[] objs= {ChiTietSachTraBUS.dssachtra.get(j).getMaPT(),ChiTietSachTraBUS.dssachtra.get(j).getMaDS(),ChiTietSachTraBUS.dssachtra.get(j).getMaSachcon(),ChiTietSachTraBUS.dssachtra.get(j).getMaTT()};
                model2.addRow(objs);
            }
        tblCTST.setModel(model2);
    }//GEN-LAST:event_tblCTPTMouseClicked

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        // TODO add your handling code here:
        if(choose==2){
        ThemPTFRM them = null;
            try {
                them = new ThemPTFRM(Integer.toString(max));
            } catch (Exception ex) {
                Logger.getLogger(PhieuTraGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        them.setVisible(true);
        }
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        // TODO add your handling code here:
        if(choose==1){
        int i=tblPT.getSelectedRow();
        if(i>=0){      
            model.removeRow(i);
            tblPT.setModel(model); 
        }
        if(model1!=null){
        for(int j=0;j<model1.getRowCount();j++){
        model1.removeRow(j);
        }
        tblCTPT.setModel(model1);
        }
        
        if(model2!=null){
        for(int j=0;j<model2.getRowCount();j++){
        model2.removeRow(j);
        }
        tblCTST.setModel(model2);
        }
        
        int ma=parseInt(txtMaPM.getText());
        
        
        PhieuTraBUS bus= new PhieuTraBUS();
            try {
                bus.Xoa(ma);
            } catch (Exception ex) {
                Logger.getLogger(PhieuMuonGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnReloadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReloadMouseClicked
        // TODO add your handling code here:
        choose=2;
        btnThem.setBackground(new Color(255,255,51));
        btnXoa.setBackground(new Color(204,204,204));
        PhieuTraBUS bus= new PhieuTraBUS();
        if(PhieuTraBUS.dspt==null){
            try {
                bus.DocDSPT();
            } catch (Exception ex) {
                Logger.getLogger(PhieuTraGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Vector header= new Vector();
        header.add("Mã PT");
        header.add("Mã PM");
        header.add("Ngày Trả");
        header.add("Mã NV");
        
        model= new DefaultTableModel(header,0);
        for(int i=0; i<PhieuTraBUS.dspt.size();i++){
                Object[] objs= {PhieuTraBUS.dspt.get(i).getMaPT(),PhieuTraBUS.dspt.get(i).getMaPM(),PhieuTraBUS.dspt.get(i).getNgayTra(),PhieuTraBUS.dspt.get(i).getMaNV()};
                model.addRow(objs);
            }
        tblPT.setModel(model);
        txtMaPT.setEnabled(true);
        txtMaPM.setEnabled(true);
        txtNgTra.setEnabled(true);
        txtMaNV.setEnabled(true);
        
        txtMaPT.setText("");
        txtMaPM.setText("");
        txtNgTra.setText("");
        txtMaNV.setText("");
        
        txtMaPT.setEnabled(false);
        txtMaPM.setEnabled(false);
        txtNgTra.setEnabled(false);
        txtMaNV.setEnabled(false);
    }//GEN-LAST:event_btnReloadMouseClicked
    
    public static void ThemPTTable(Object[] dataRow){
        model.addRow(dataRow);
        tblPT.setModel(model);
        
    }
    public static void ThemPT(PhieuTraDTO pt){
        
        PhieuTraBUS bus= new PhieuTraBUS();
        try {
            bus.Them(pt);
        } catch (Exception ex) {
            
        }
        max=max+1;
    }
    
    public static void ThemCTPT(ChiTietPhieuTraDTO pt){
        System.out.println(pt.toString());
        ChiTietPhieuTraBUS bus= new ChiTietPhieuTraBUS();
        try {
            bus.Them(pt);
        } catch (Exception ex) {
            
        }
        
    }
    
    public static void ThemCTST(ChiTietSachTraDTO ctst, SachConDTO st){
        System.out.println(ctst.toString());
        System.out.println(st.toString());
        ChiTietSachTraBUS bus= new ChiTietSachTraBUS();
        try {
            bus.Them(ctst);
        } catch (Exception ex) {
            
        }
        
        SachConBUS bus2= new SachConBUS();
        try {
            bus2.SuaHienTrang(st);
        } catch (Exception ex) {
            
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnReload;
    private javax.swing.JPanel btnThem;
    private javax.swing.JPanel btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblCTPT;
    private javax.swing.JTable tblCTST;
    private static javax.swing.JTable tblPT;
    private javax.swing.JFormattedTextField txtMaNV;
    private javax.swing.JFormattedTextField txtMaPM;
    private javax.swing.JFormattedTextField txtMaPT;
    private javax.swing.JFormattedTextField txtNgTra;
    // End of variables declaration//GEN-END:variables
}
