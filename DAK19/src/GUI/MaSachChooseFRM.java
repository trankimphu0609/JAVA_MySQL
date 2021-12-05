package GUI;

import BUS.DauSachBUS;
import DTO.ChooseSachDTO;
import java.awt.Color;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class MaSachChooseFRM extends javax.swing.JFrame{
    DefaultTableModel model;
    int i=-1;
    
    
    public MaSachChooseFRM() throws Exception {
        
        initComponents();
        
        tblChoose.getTableHeader().setOpaque(false);
        tblChoose.getTableHeader().setBackground(Color.blue);
        tblChoose.getTableHeader().setForeground(new Color(255,255,255));
        
        tblChoose.setRowHeight(28);
        btnReturn.setIcon(new ImageIcon("Image/reload.png"));
        btnReturn.setText("");
        DauSachBUS bus= new DauSachBUS();
        
            bus.DocDSChoose();
        
        Vector header= new Vector();
        header.add("MÃ ĐẦU SÁCH");
        header.add("TÊN SÁCH");
        header.add("MÃ SÁCH CON");
        header.add("MÃ TÌNH TRẠNG");
        
        model= new DefaultTableModel(header,0);
        for(int i=0; i<DauSachBUS.dschoose.size();i++){
                Object[] objs= {DauSachBUS.dschoose.get(i).getMaDS(),DauSachBUS.dschoose.get(i).getTensach(),DauSachBUS.dschoose.get(i).getMasachcon(),DauSachBUS.dschoose.get(i).getMaTT()};
                model.addRow(objs);
            }
        tblChoose.setModel(model);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblChoose = new javax.swing.JTable();
        btnXacnhan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTim = new javax.swing.JFormattedTextField();
        btnTim = new javax.swing.JButton();
        btnReturn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        tblChoose.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Đầu Sách", "Tên Sách", "Mã Sách Con", "Mã Tình Trạng"
            }
        ));
        tblChoose.setRowHeight(28);
        tblChoose.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tblChoose.setShowVerticalLines(false);
        tblChoose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChooseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblChoose);
        if (tblChoose.getColumnModel().getColumnCount() > 0) {
            tblChoose.getColumnModel().getColumn(0).setMinWidth(50);
            tblChoose.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        btnXacnhan.setBackground(new java.awt.Color(204, 204, 204));
        btnXacnhan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXacnhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXacnhanMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Xác Nhận");

        javax.swing.GroupLayout btnXacnhanLayout = new javax.swing.GroupLayout(btnXacnhan);
        btnXacnhan.setLayout(btnXacnhanLayout);
        btnXacnhanLayout.setHorizontalGroup(
            btnXacnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXacnhanLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(33, 33, 33))
        );
        btnXacnhanLayout.setVerticalGroup(
            btnXacnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnXacnhanLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(16, 16, 16))
        );

        btnThoat.setBackground(new java.awt.Color(255, 0, 0));
        btnThoat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThoatMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Thoát");

        javax.swing.GroupLayout btnThoatLayout = new javax.swing.GroupLayout(btnThoat);
        btnThoat.setLayout(btnThoatLayout);
        btnThoatLayout.setHorizontalGroup(
            btnThoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThoatLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(33, 33, 33))
        );
        btnThoatLayout.setVerticalGroup(
            btnThoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnThoatLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Chọn Sách Mượn");

        txtTim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtTim.setText("Nhập tên sách cần tìm");
        txtTim.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTimFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimFocusLost(evt);
            }
        });
        txtTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimActionPerformed(evt);
            }
        });

        btnTim.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnTim.setText("Tìm");
        btnTim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimMouseClicked(evt);
            }
        });

        btnReturn.setForeground(new java.awt.Color(255, 255, 255));
        btnReturn.setText("Return");
        btnReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTim)
                        .addGap(18, 18, 18)
                        .addComponent(btnReturn)))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnXacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTim)
                    .addComponent(btnReturn))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
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

    private void tblChooseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChooseMouseClicked
        
        i=tblChoose.getSelectedRow();
        btnXacnhan.setBackground(new java.awt.Color(255,255,0));
    }//GEN-LAST:event_tblChooseMouseClicked

    private void btnXacnhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXacnhanMouseClicked
        if(i!=-1){
            int check=0;
            for(int j=0; j<ThemPMFRM.length;j++){
                if(ThemPMFRM.sachcon[j]==parseInt(tblChoose.getModel().getValueAt(i,2).toString()) && ThemPMFRM.dausach[j]==parseInt(tblChoose.getModel().getValueAt(i,0).toString())){
                    check=1;
                }
            }
            if(check==0){
                ThemPMFRM.ThemMaSach(new Object[]{
                           tblChoose.getModel().getValueAt(i,0).toString(),
                           tblChoose.getModel().getValueAt(i,1).toString(),
                           tblChoose.getModel().getValueAt(i,2).toString(),
                           tblChoose.getModel().getValueAt(i,3).toString()
                    });
                ThemPMFRM.sachcon[ThemPMFRM.length]=parseInt(tblChoose.getModel().getValueAt(i,2).toString());
                ThemPMFRM.dausach[ThemPMFRM.length]=parseInt(tblChoose.getModel().getValueAt(i,0).toString());
                ThemPMFRM.length++;
            }
        }
    }//GEN-LAST:event_btnXacnhanMouseClicked

    private void btnThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnThoatMouseClicked

    private void txtTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimActionPerformed
        // TODO add your handling code here:
        DauSachBUS bus= new DauSachBUS();
        ArrayList <ChooseSachDTO> kq= new ArrayList <ChooseSachDTO>();
        String ten=txtTim.getText();
        kq=bus.TimkiemDSChoose(ten);

        if(kq!=null){
            model=null;
            Vector header= new Vector();
            header.add("MÃ ĐẦU SÁCH");
            header.add("TÊN SÁCH");
            header.add("MÃ SÁCH CON");
            header.add("MÃ TÌNH TRẠNG");
        
            model= new DefaultTableModel(header,0);
            for(int i=0; i<kq.size();i++){
                    Object[] objs= {kq.get(i).getMaDS(),kq.get(i).getTensach(),kq.get(i).getMasachcon(),kq.get(i).getMaTT()};
                    model.addRow(objs);
                }
            tblChoose.setModel(model);
        }
        else{
            JOptionPane.showMessageDialog(null, "Kết quả tìm kiếm không tồn tại!!");
        }
    }//GEN-LAST:event_txtTimActionPerformed

    private void btnTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimMouseClicked
        // TODO add your handling code here:
        DauSachBUS bus= new DauSachBUS();
        ArrayList <ChooseSachDTO> kq= new ArrayList <ChooseSachDTO>();
        String ten=txtTim.getText();
        kq=bus.TimkiemDSChoose(ten);

        if(kq!=null){
            model=null;
            Vector header= new Vector();
            header.add("MÃ ĐẦU SÁCH");
            header.add("TÊN SÁCH");
            header.add("MÃ SÁCH CON");
            header.add("MÃ TÌNH TRẠNG");
        
            model= new DefaultTableModel(header,0);
            for(int i=0; i<kq.size();i++){
                    Object[] objs= {kq.get(i).getMaDS(),kq.get(i).getTensach(),kq.get(i).getMasachcon(),kq.get(i).getMaTT()};
                    model.addRow(objs);
                }
            tblChoose.setModel(model);
        }
        else{
            JOptionPane.showMessageDialog(null, "Kết quả tìm kiếm không tồn tại!!");
        }
    }//GEN-LAST:event_btnTimMouseClicked

    private void txtTimFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimFocusGained
        // TODO add your handling code here:
        if(txtTim.getText().equals("Nhập tên sách cần tìm")){
            txtTim.setText("");
        }
    }//GEN-LAST:event_txtTimFocusGained

    private void txtTimFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimFocusLost
        // TODO add your handling code here:
        if(txtTim.getText().equals("")){
            txtTim.setText("Nhập tên sách cần tìm");
        }
    }//GEN-LAST:event_txtTimFocusLost

    private void btnReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseClicked
        // TODO add your handling code here:
        DauSachBUS bus= new DauSachBUS();
        
        try {
            bus.DocDSChoose();
        } catch (Exception ex) {
            Logger.getLogger(MaSachChooseFRM.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Vector header= new Vector();
        header.add("MÃ ĐẦU SÁCH");
        header.add("TÊN SÁCH");
        header.add("MÃ SÁCH CON");
        header.add("MÃ TÌNH TRẠNG");
        
        model= new DefaultTableModel(header,0);
        for(int i=0; i<DauSachBUS.dschoose.size();i++){
                Object[] objs= {DauSachBUS.dschoose.get(i).getMaDS(),DauSachBUS.dschoose.get(i).getTensach(),DauSachBUS.dschoose.get(i).getMasachcon(),DauSachBUS.dschoose.get(i).getMaTT()};
                model.addRow(objs);
            }
        tblChoose.setModel(model);
    }//GEN-LAST:event_btnReturnMouseClicked
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MaSachChooseFRM().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(MaSachChooseFRM.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnReturn;
    private javax.swing.JPanel btnThoat;
    private javax.swing.JButton btnTim;
    private javax.swing.JPanel btnXacnhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblChoose;
    private javax.swing.JFormattedTextField txtTim;
    // End of variables declaration//GEN-END:variables

    

}
