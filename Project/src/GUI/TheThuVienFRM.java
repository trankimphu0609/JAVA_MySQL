/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import BUS.TheThuVienBUS;
import DTO.TheThuVienDTO;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TheThuVienFRM extends javax.swing.JFrame {
    DefaultTableModel model;
    private int choose=-1;
    int DG=-1;
    int The=-1;
    public TheThuVienFRM(int Ma) throws Exception {
        initComponents();
        txtMaDG.setText( Integer.toString(Ma));
        txtMaDG.setEnabled(false);
        DG=Ma;
        tblThe.getTableHeader().setOpaque(false);
        tblThe.getTableHeader().setBackground(Color.blue);
        tblThe.getTableHeader().setForeground(new Color(255,255,255));
        
        tblThe.setRowHeight(28);
        btnReload.setIcon(new ImageIcon("Image/reload.png"));
        btnReload.setText("");
        TheThuVienBUS bus= new TheThuVienBUS();
        if(TheThuVienBUS.dsthe==null){
            bus.DocDSThe();
        }
        Vector header= new Vector();
        header.add("MÃ THẺ");
        header.add("MÃ ĐỘC GIẢ");
        header.add("NGÀY LÀM THẺ");
        header.add("NGÀY HẾT HẠN");
        
        model= new DefaultTableModel(header,0);
        for(int i=0; i<TheThuVienBUS.dsthe.size();i++){
                Object[] objs= {TheThuVienBUS.dsthe.get(i).getMatheTV(),TheThuVienBUS.dsthe.get(i).getMaDocGia(),TheThuVienBUS.dsthe.get(i).getNgayLamThe(),TheThuVienBUS.dsthe.get(i).getNgayHetHan()};
                model.addRow(objs);
                The=TheThuVienBUS.dsthe.get(i).getMatheTV();
            }
        tblThe.setModel(model);
        The=The+1;
        txtMaThe.setText(Integer.toString(The));
        txtMaThe.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMaThe = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMaDG = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnThem = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtNgLam = new javax.swing.JFormattedTextField();
        txtNgHan = new javax.swing.JFormattedTextField();
        btnXoa = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnSua = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnReload = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThe = new javax.swing.JTable();
        ComboSearch = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mã thẻ:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã ĐG:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ngày làm thẻ:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ngày hết hạn:");

        btnThem.setBackground(new java.awt.Color(255, 255, 51));
        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Thêm");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnThemLayout = new javax.swing.GroupLayout(btnThem);
        btnThem.setLayout(btnThemLayout);
        btnThemLayout.setHorizontalGroup(
            btnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnThemLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel5)
                .addGap(54, 54, 54))
        );
        btnThemLayout.setVerticalGroup(
            btnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(11, 11, 11))
        );

        btnThoat.setBackground(new java.awt.Color(255, 51, 51));
        btnThoat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThoatMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Thoát");

        javax.swing.GroupLayout btnThoatLayout = new javax.swing.GroupLayout(btnThoat);
        btnThoat.setLayout(btnThoatLayout);
        btnThoatLayout.setHorizontalGroup(
            btnThoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnThoatLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel6)
                .addGap(55, 55, 55))
        );
        btnThoatLayout.setVerticalGroup(
            btnThoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThoatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(11, 11, 11))
        );

        txtNgLam.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("y-MM-dd"))));

        txtNgHan.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("y-MM-dd"))));

        btnXoa.setBackground(new java.awt.Color(204, 204, 204));
        btnXoa.setToolTipText("");
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
                .addGap(63, 63, 63)
                .addComponent(jLabel7)
                .addGap(62, 62, 62))
        );
        btnXoaLayout.setVerticalGroup(
            btnXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(11, 11, 11))
        );

        btnSua.setBackground(new java.awt.Color(204, 204, 204));
        btnSua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sửa");

        javax.swing.GroupLayout btnSuaLayout = new javax.swing.GroupLayout(btnSua);
        btnSua.setLayout(btnSuaLayout);
        btnSuaLayout.setHorizontalGroup(
            btnSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSuaLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel8)
                .addGap(61, 61, 61))
        );
        btnSuaLayout.setVerticalGroup(
            btnSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSuaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap())
        );

        btnReload.setForeground(new java.awt.Color(255, 255, 255));
        btnReload.setText("RETURN");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(10, 10, 10)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaThe)
                            .addComponent(txtMaDG)
                            .addComponent(txtNgLam, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(txtNgHan))
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReload)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMaThe, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txtMaDG, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNgLam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNgHan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnReload)
                                .addGap(8, 8, 8)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        tblThe.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblThe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã thẻ", "Mã ĐG", "Ngày làm thẻ", "Ngày hết hạn"
            }
        ));
        tblThe.setRowHeight(28);
        tblThe.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tblThe.setShowVerticalLines(false);
        tblThe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTheMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblThe);

        ComboSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã Thẻ", "Mã ĐG" }));

        txtSearch.setForeground(new java.awt.Color(102, 102, 102));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(ComboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        // TODO add your handling code here:
        TheThuVienDTO the= new TheThuVienDTO();
        txtMaThe.setEnabled(true);
        txtMaDG.setEnabled(true);
        the.setMatheTV(parseInt(txtMaThe.getText()));
        the.setMaDocGia(parseInt(txtMaDG.getText()));
        the.setNgayLamThe(txtNgLam.getText());
        the.setNgayHetHan(txtNgHan.getText());
        txtMaThe.setEnabled(false);
        txtMaDG.setEnabled(false);
        
        TheThuVienBUS bus= new TheThuVienBUS();
        try {
            bus.Them(the);
        } catch (Exception ex) {
            Logger.getLogger(TheThuVienFRM.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Vector row= new Vector();
        row.add(the.getMatheTV());
        row.add(the.getMaDocGia());
        row.add(the.getNgayLamThe());
        row.add(the.getNgayHetHan());
        
        model.addRow(row);
        tblThe.setModel(model);
        
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseClicked
        
        close();
    }//GEN-LAST:event_btnThoatMouseClicked

    private void tblTheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTheMouseClicked
        // TODO add your handling code here:
        int i=tblThe.getSelectedRow();
        choose=parseInt(txtMaThe.getText());
        btnSua.setBackground(new java.awt.Color(0, 51, 204));
        btnThem.setBackground(new java.awt.Color(204,204,204));
        btnXoa.setBackground(new java.awt.Color(255,51,102));
        
        txtMaThe.setEnabled(true);
        txtMaThe.setText(tblThe.getModel().getValueAt(i,0).toString());
        txtMaThe.setEnabled(false);
        txtMaDG.setEnabled(true);
        txtMaDG.setText(tblThe.getModel().getValueAt(i,1).toString());
        txtMaDG.setEnabled(false);
        txtNgLam.setText(tblThe.getModel().getValueAt(i,2).toString());
        txtNgHan.setText(tblThe.getModel().getValueAt(i,3).toString());
 
    }//GEN-LAST:event_tblTheMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        // TODO add your handling code here:
        if(choose!=-1){
        int i=tblThe.getSelectedRow();
        if(i>=0){      
            model.removeRow(i);
            tblThe.setModel(model);       
        }
        
        int ma=parseInt(txtMaThe.getText());
        
        
        TheThuVienBUS bus= new TheThuVienBUS();
            try {
                bus.Xoa(ma);
            } catch (Exception ex) {
                Logger.getLogger(TheThuVienFRM.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        // TODO add your handling code here:
        if(choose!=-1){
        int i=tblThe.getSelectedRow();
        txtMaThe.setEnabled(true);
        txtMaDG.setEnabled(true);
        
        if(i>=0){
            model.setValueAt(txtMaThe.getText(),i,0);
            model.setValueAt(txtMaDG.getText(),i,1);
            model.setValueAt(txtNgLam.getText(),i,2);
            model.setValueAt(txtNgHan.getText(),i,3);
            
            tblThe.setModel(model);
        }
        TheThuVienDTO the= new TheThuVienDTO();
        the.setMatheTV(parseInt(txtMaThe.getText()));
        the.setMaDocGia(parseInt(txtMaDG.getText()));
        the.setNgayLamThe(txtNgLam.getText());
        the.setNgayHetHan(txtNgHan.getText());
        
        txtMaThe.setEnabled(false);
        txtMaDG.setEnabled(false);
        
        TheThuVienBUS bus= new TheThuVienBUS();
            try {
                bus.Sua(the);
            } catch (Exception ex) {
                Logger.getLogger(TheThuVienFRM.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnReloadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReloadMouseClicked
        // TODO add your handling code here:
        choose=-1;
        btnSua.setBackground(new java.awt.Color(204, 204, 204));
        btnThem.setBackground(new java.awt.Color(255,255,51));
        btnXoa.setBackground(new java.awt.Color(204, 204, 204));
        
        
        txtMaThe.setEnabled(true);
        txtMaThe.setText(Integer.toString(The));
        txtMaThe.setEnabled(false);
        txtMaDG.setEnabled(true);
        txtMaDG.setText(Integer.toString(DG));
        txtMaDG.setEnabled(false);
        txtNgLam.setText("");
        txtNgHan.setText("");

    }//GEN-LAST:event_btnReloadMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
        if(ComboSearch.getSelectedIndex()==0){
        TheThuVienBUS bus= new TheThuVienBUS();
        ArrayList <TheThuVienDTO> kq= new ArrayList <TheThuVienDTO>();
        int maThe=parseInt(txtSearch.getText());
        kq=bus.TimkiemMaThe(maThe);

        if(kq!=null){
            model=null;
            Vector header= new Vector();
            header.add("MÃ THẺ");
            header.add("MÃ ĐỘC GIẢ");
            header.add("NGÀY LÀM THẺ");
            header.add("NGÀY HẾT HẠN");
            model= new DefaultTableModel(header,0);
            for(int i=0; i<kq.size();i++){
                Object[] objs= {kq.get(i).getMatheTV(),kq.get(i).getMaDocGia(),kq.get(i).getNgayLamThe(),kq.get(i).getNgayHetHan()};
                model.addRow(objs);
            }
            tblThe.setModel(model);
        }
        else{
            JOptionPane.showMessageDialog(null, "Kết quả tìm kiếm không tồn tại!!");
        }
        }
        if(ComboSearch.getSelectedIndex()==1){
        TheThuVienBUS bus= new TheThuVienBUS();
        ArrayList <TheThuVienDTO> kq= new ArrayList <TheThuVienDTO>();
        int maDG=parseInt(txtSearch.getText());
        kq=bus.TimkiemMaDG(maDG);

        if(kq!=null){
            model=null;
            Vector header= new Vector();
            header.add("MÃ THẺ");
            header.add("MÃ ĐỘC GIẢ");
            header.add("NGÀY LÀM THẺ");
            header.add("NGÀY HẾT HẠN");
            model= new DefaultTableModel(header,0);
            for(int i=0; i<kq.size();i++){
                Object[] objs= {kq.get(i).getMatheTV(),kq.get(i).getMaDocGia(),kq.get(i).getNgayLamThe(),kq.get(i).getNgayHetHan()};
                model.addRow(objs);
            }
            tblThe.setModel(model);
        }
        else{
            JOptionPane.showMessageDialog(null, "Kết quả tìm kiếm không tồn tại!!");
        }
        }
    }//GEN-LAST:event_txtSearchActionPerformed
    
    public void close(){
        WindowEvent closeWindow= new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
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
            java.util.logging.Logger.getLogger(TheThuVienFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TheThuVienFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TheThuVienFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TheThuVienFRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TheThuVienFRM(-2).setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(TheThuVienFRM.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboSearch;
    private javax.swing.JLabel btnReload;
    private javax.swing.JPanel btnSua;
    private javax.swing.JPanel btnThem;
    private javax.swing.JPanel btnThoat;
    private javax.swing.JPanel btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblThe;
    private javax.swing.JTextField txtMaDG;
    private javax.swing.JTextField txtMaThe;
    private javax.swing.JFormattedTextField txtNgHan;
    private javax.swing.JFormattedTextField txtNgLam;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
