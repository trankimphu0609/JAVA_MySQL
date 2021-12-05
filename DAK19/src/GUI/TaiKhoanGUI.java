package GUI;

import BUS.QuyenBUS;
import BUS.TaiKhoanBUS;
import DTO.TaiKhoanDTO;
import java.awt.Color;
import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

public class TaiKhoanGUI extends javax.swing.JPanel {
    DefaultTableModel model;
    private static int choose=-1;
    
    public TaiKhoanGUI() throws Exception {
        initComponents();
        
        tblTK.getTableHeader().setOpaque(false);
        tblTK.getTableHeader().setBackground(Color.BLUE);
        tblTK.getTableHeader().setForeground(new Color(255, 255, 255));
        
        tblTK.setRowHeight(28);
        btnReload.setIcon(new ImageIcon("Image/reload.png"));
        btnReload.setText("");
        TaiKhoanBUS bus = new TaiKhoanBUS();
        
            bus.DocTK();
        LoadQuyen();
        
        Vector header= new Vector();
        header.add("MÃ NHÂN VIÊN");
        header.add("TÊN TÀI KHOẢN");
        header.add("MẬT KHẨU");
        header.add("MÃ QUYỀN");
        
        model = new DefaultTableModel(header, 0);
        for(int i = 0; i < TaiKhoanBUS.dstk.size(); i++) {
            Object[] objs = {TaiKhoanBUS.dstk.get(i).getMatk(),TaiKhoanBUS.dstk.get(i).getUsername(), TaiKhoanBUS.dstk.get(i).getMatkhau(),TaiKhoanBUS.dstk.get(i).getMaquyen()};
            model.addRow(objs);
        }
        tblTK.setModel(model);
    }
    public void LoadQuyen() throws Exception{
        QuyenBUS load= new QuyenBUS();
        if(QuyenBUS.dsq==null){
            load.DocQ();
        }
        for(int i=0; i<QuyenBUS.dsq.size();i++){
            this.txtMaQ.addItem(QuyenBUS.dsq.get(i).getTenquyen());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaTK = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPass1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnReload = new javax.swing.JLabel();
        txtMaQ = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTK = new javax.swing.JTable();
        ComboSearch = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        btnTailai = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnThem = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnSua = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnImport = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TÀI KHOẢN NHÂN VIÊN");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã Nhân Viên:");

        txtMaTK.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tên Tài Khoản:");

        txtUser.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mật Khẩu:");

        jPass1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mã Quyền:");

        btnReload.setForeground(new java.awt.Color(255, 255, 255));
        btnReload.setText("RETURN");
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
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaTK, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                    .addComponent(txtUser)
                    .addComponent(jPass1)
                    .addComponent(txtMaQ, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(btnReload)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtMaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jPass1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtMaQ, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReload)
                        .addGap(20, 20, 20))))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        tblTK.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        tblTK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Nhân Viên", "Tên Tài Khoản", "Mật Khẩu", "Mã Quyền"
            }
        ));
        tblTK.setRowHeight(28);
        tblTK.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tblTK.setShowVerticalLines(false);
        tblTK.setVerifyInputWhenFocusTarget(false);
        tblTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTKMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTK);

        ComboSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã Tài Khoản", "Tên Tài Khoản" }));

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnTailai.setBackground(new java.awt.Color(0, 153, 153));
        btnTailai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTailai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTailaiMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("TẢI LẠI");

        javax.swing.GroupLayout btnTailaiLayout = new javax.swing.GroupLayout(btnTailai);
        btnTailai.setLayout(btnTailaiLayout);
        btnTailaiLayout.setHorizontalGroup(
            btnTailaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnTailaiLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel10)
                .addGap(40, 40, 40))
        );
        btnTailaiLayout.setVerticalGroup(
            btnTailaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnTailaiLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(ComboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTailai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ComboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnTailai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(44, 62, 80));

        btnThem.setBackground(new java.awt.Color(255, 255, 51));
        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TẠO MỚI");

        javax.swing.GroupLayout btnThemLayout = new javax.swing.GroupLayout(btnThem);
        btnThem.setLayout(btnThemLayout);
        btnThemLayout.setHorizontalGroup(
            btnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThemLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addGap(39, 39, 39))
        );
        btnThemLayout.setVerticalGroup(
            btnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnThemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap())
        );

        btnSua.setBackground(new java.awt.Color(0, 204, 0));
        btnSua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CẬP NHẬT");

        javax.swing.GroupLayout btnSuaLayout = new javax.swing.GroupLayout(btnSua);
        btnSua.setLayout(btnSuaLayout);
        btnSuaLayout.setHorizontalGroup(
            btnSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSuaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel7)
                .addGap(32, 32, 32))
        );
        btnSuaLayout.setVerticalGroup(
            btnSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSuaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(11, 11, 11))
        );

        btnXoa.setBackground(new java.awt.Color(255, 80, 80));
        btnXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("XÓA");

        javax.swing.GroupLayout btnXoaLayout = new javax.swing.GroupLayout(btnXoa);
        btnXoa.setLayout(btnXoaLayout);
        btnXoaLayout.setHorizontalGroup(
            btnXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXoaLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel8)
                .addGap(57, 57, 57))
        );
        btnXoaLayout.setVerticalGroup(
            btnXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnXoaLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        btnImport.setBackground(new java.awt.Color(0, 153, 153));
        btnImport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImportMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("IMPORT");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnImportLayout = new javax.swing.GroupLayout(btnImport);
        btnImport.setLayout(btnImportLayout);
        btnImportLayout.setHorizontalGroup(
            btnImportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnImportLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnImportLayout.setVerticalGroup(
            btnImportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnImportLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTKMouseClicked
        // TODO add your handling code here:
        int i = tblTK.getSelectedRow();
        choose = 1;
        btnSua.setBackground(new java.awt.Color(0, 51, 204));
        btnThem.setBackground(new java.awt.Color(204,204,204));
        btnXoa.setBackground(new java.awt.Color(255, 51, 51));
        
        txtMaTK.setText(tblTK.getModel().getValueAt(i,0).toString());
        txtMaTK.setEnabled(false);
        
        txtUser.setText(tblTK.getModel().getValueAt(i, 1).toString());
        txtUser.setEnabled(false);
        
        jPass1.setText(tblTK.getModel().getValueAt(i ,2).toString());
        
        
        txtMaQ.setSelectedIndex(parseInt(tblTK.getModel().getValueAt(i, 3).toString())-1);
        
    }//GEN-LAST:event_tblTKMouseClicked

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        // TODO add your handling code here:
        txtMaTK.setEnabled(true);
        TaiKhoanBUS bus= new TaiKhoanBUS();
        if(choose==-1){
            try {
                if(bus.CheckMaTK(parseInt(txtMaTK.getText()))==1){
                    TaiKhoanDTO tk= new TaiKhoanDTO();
                    tk.setMatk(parseInt(txtMaTK.getText()));
                    tk.setUsername(txtUser.getText());
                    tk.setMatkhau(jPass1.getText());
                    tk.setMaquyen(txtMaQ.getSelectedIndex()+1);
                    
                    
                    try {
                        bus.Them(tk);
                    } catch (Exception ex) {
                        Logger.getLogger(TaiKhoanGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Vector row= new Vector();
                    row.add(tk.getMatk());
                    row.add(tk.getUsername());
                    row.add(tk.getMatkhau());
                    row.add(tk.getMaquyen());
                    model.addRow(row);
                    tblTK.setModel(model);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Mã nhân viên cần tạo tài khoản không tồn tại!!");
                }
            } catch (Exception ex) {
                Logger.getLogger(TaiKhoanGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        // TODO add your handling code here:
        if(choose!=-1){
        int i=tblTK.getSelectedRow();
        if(i>=0){      
            model.removeRow(i);
            tblTK.setModel(model);       
        }
        
        int ma=parseInt(txtMaTK.getText());
        
        
        TaiKhoanBUS bus= new TaiKhoanBUS();
            try {
                bus.Xoa(ma);
            } catch (Exception ex) {
                Logger.getLogger(TaiKhoanGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        // TODO add your handling code here:
        if(choose!=-1){
        int i=tblTK.getSelectedRow();
        if(i>=0){
            model.setValueAt(txtMaTK.getText(),i,0);
            model.setValueAt(txtUser.getText(),i,1);
            model.setValueAt(jPass1.getText(),i,2);
            model.setValueAt(txtMaQ.getSelectedIndex()+1,i,3);
            tblTK.setModel(model);
        }
        
        TaiKhoanDTO tk= new TaiKhoanDTO();
        tk.setMatk(parseInt(txtMaTK.getText()));
        tk.setUsername(txtUser.getText());
        tk.setMatkhau(jPass1.getText());
        tk.setMaquyen(txtMaQ.getSelectedIndex()+1);
        
        
        
        
        TaiKhoanBUS bus= new TaiKhoanBUS();
            try {
                bus.Sua(tk);
            } catch (Exception ex) {
                Logger.getLogger(TaiKhoanGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSuaMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
        if(ComboSearch.getSelectedIndex()==0){
            TaiKhoanBUS bus= new TaiKhoanBUS();
            txtMaTK.requestFocusInWindow();
            TaiKhoanDTO kq= new TaiKhoanDTO();
            String ma=txtSearch.getText();
            kq=bus.timkiem(parseInt(ma));
        
            if(kq!=null){
                model=null;
                Vector header= new Vector();
                header.add("MÃ NHÂN VIÊN");
                header.add("TÊN TÀI KHOẢN");
                header.add("MẬT KHẨU");
                header.add("MÃ QUYỀN");
                model= new DefaultTableModel(header,0);
                Object[] objs= {kq.getMatk(),kq.getUsername(),kq.getMatkhau(),kq.getMaquyen()};
                model.addRow(objs);

                tblTK.setModel(model);
            }
            if(kq==null){
                showMessageDialog(null,"Thông tin cần tìm không tồn tại!!");
            }
        }
        else{
            TaiKhoanBUS bus= new TaiKhoanBUS();
            txtMaTK.requestFocusInWindow();
            TaiKhoanDTO kq= new TaiKhoanDTO();
            String ten=txtSearch.getText();
            kq=bus.timkiemTen(ten);
        
            if(kq!=null){
                model=null;
                Vector header= new Vector();
                header.add("MÃ NHÂN VIÊN");
                header.add("TÊN TÀI KHOẢN");
                header.add("MẬT KHẨU");
                header.add("MÃ QUYỀN");
                model= new DefaultTableModel(header,0);
                Object[] objs= {kq.getMatk(),kq.getUsername(),kq.getMatkhau(),kq.getMaquyen()};
                model.addRow(objs);

                tblTK.setModel(model);
            }
            if(kq==null){
                showMessageDialog(null,"Thông tin cần tìm không tồn tại!!");
            }
        }
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnTailaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTailaiMouseClicked
        // TODO add your handling code here:
        TaiKhoanBUS bus = new TaiKhoanBUS();
            try {
                bus.DocTK();
            } catch (Exception ex) {
                Logger.getLogger(TaiKhoanGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        Vector header= new Vector();
        header.add("MÃ NHÂN VIÊN");
        header.add("TÊN TÀI KHOẢN");
        header.add("MẬT KHẨU");
        header.add("MÃ QUYỀN");
        
        model = new DefaultTableModel(header, 0);
        for(int i = 0; i < TaiKhoanBUS.dstk.size(); i++) {
            Object[] objs = {TaiKhoanBUS.dstk.get(i).getMatk(),TaiKhoanBUS.dstk.get(i).getUsername(), TaiKhoanBUS.dstk.get(i).getMatkhau(),TaiKhoanBUS.dstk.get(i).getMaquyen()};
            model.addRow(objs);
        }
        tblTK.setModel(model);
    }//GEN-LAST:event_btnTailaiMouseClicked

    private void btnReloadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReloadMouseClicked
        // TODO add your handling code here:
        choose=-1;
        btnThem.setBackground(new Color(255,255,51));
        txtMaTK.setEnabled(true);
        txtUser.setEnabled(true);
        
        
        txtMaTK.setText("");
        txtUser.setText("");
        jPass1.setText("");
        txtMaQ.setSelectedIndex(0);
        
        
       
    }//GEN-LAST:event_btnReloadMouseClicked

    private void btnImportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImportMouseClicked
        Controller ctrler = new Controller();
        TaiKhoanExcel tkexcel = new TaiKhoanExcel();
        try {
            tkexcel.ReadExcel();
            DefaultTableModel model = (DefaultTableModel) tblTK.getModel();
            ctrler.cleartable(model);
            ctrler.readdata(model,"taikhoan");
        } catch (SQLException ex) {
            Logger.getLogger(TaiKhoanGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(TaiKhoanGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnImportMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboSearch;
    private javax.swing.JPanel btnImport;
    private javax.swing.JLabel btnReload;
    private javax.swing.JPanel btnSua;
    private javax.swing.JPanel btnTailai;
    private javax.swing.JPanel btnThem;
    private javax.swing.JPanel btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jPass1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTK;
    private javax.swing.JComboBox<String> txtMaQ;
    private javax.swing.JFormattedTextField txtMaTK;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
