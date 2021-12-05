
package GUI;

import BUS.ThongKeBUS;
import DTO.ThongKeDTO;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ThongKePanel extends javax.swing.JPanel {
    DefaultTableModel modeldausach = new DefaultTableModel();
        DefaultTableModel modeldocgia = new DefaultTableModel();
        DefaultTableModel modeldocgia2 = new DefaultTableModel();
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    
    public ThongKePanel() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btThongKe = new javax.swing.JButton();
        txNgaymuon = new javax.swing.JFormattedTextField(df);
        txNgaymuon2 = new javax.swing.JFormattedTextField(df);
        jScrollPane1 = new javax.swing.JScrollPane();
        tbThongKeDauSach = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbThongKeDocGia = new javax.swing.JTable();
        lbSachmuon = new javax.swing.JLabel();
        lbDocgia = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDocGia2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txNgayBD = new javax.swing.JFormattedTextField(df);
        jLabel7 = new javax.swing.JLabel();
        txNgayKT = new javax.swing.JFormattedTextField(df);
        btThongKe1 = new javax.swing.JButton();
        lbDocgia2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("THỐNG KÊ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ngày mượn:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Đến");

        btThongKe.setBackground(new java.awt.Color(0, 255, 0));
        btThongKe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btThongKe.setText("Thống kê");
        btThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThongKeActionPerformed(evt);
            }
        });

        txNgaymuon.setText("2021-5-1");
        txNgaymuon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txNgaymuon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txNgaymuonKeyReleased(evt);
            }
        });

        txNgaymuon2.setText("2021-6-1");
        txNgaymuon2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txNgaymuon, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txNgaymuon2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txNgaymuon)
                        .addComponent(txNgaymuon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        tbThongKeDauSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Đầu sách", "Tổng số sách được mượn"
            }
        ));
        tbThongKeDauSach.setRowHeight(25);
        tbThongKeDauSach.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tbThongKeDauSach.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tbThongKeDauSach);

        tbThongKeDocGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã thẻ thư viện", "Mã độc giả", "Họ", "Tên", "Tổng số sách đã mượn"
            }
        ));
        tbThongKeDocGia.setRowHeight(25);
        tbThongKeDocGia.setSelectionBackground(new java.awt.Color(255, 102, 102));
        jScrollPane3.setViewportView(tbThongKeDocGia);

        lbSachmuon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbSachmuon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSachmuon.setText("Số sách được mượn nhiều nhất");

        lbDocgia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbDocgia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDocgia.setText("Độc giả mượn sách nhiều nhất");

        tblDocGia2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã ĐG", "Họ ĐG", "Tên ĐG", "Ngày Sinh", "Địa chỉ", "SĐT", "Trình Độ", "Nơi công tác"
            }
        ));
        tblDocGia2.setRowHeight(25);
        tblDocGia2.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tblDocGia2.setShowVerticalLines(false);
        jScrollPane2.setViewportView(tblDocGia2);
        if (tblDocGia2.getColumnModel().getColumnCount() > 0) {
            tblDocGia2.getColumnModel().getColumn(0).setMinWidth(60);
            tblDocGia2.getColumnModel().getColumn(0).setMaxWidth(70);
        }

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Từ ngày:");

        txNgayBD.setText("2021-5-1");
        txNgayBD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txNgayBD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txNgayBDKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Đến");

        txNgayKT.setText("2021-6-1");
        txNgayKT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btThongKe1.setBackground(new java.awt.Color(0, 255, 0));
        btThongKe1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btThongKe1.setText("Thống kê");
        btThongKe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThongKe1ActionPerformed(evt);
            }
        });

        lbDocgia2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbDocgia2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDocgia2.setText("Độc giả làm thẻ thư viện trong khoảng thời gian trên");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbDocgia2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                            .addComponent(lbSachmuon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDocgia, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btThongKe1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbSachmuon, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(lbDocgia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNgayBD)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addComponent(btThongKe1))
                .addComponent(lbDocgia2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThongKeActionPerformed
        // TODO add your handling code here:
        lbSachmuon.setText("Số sách được mượn nhiều nhất từ ngày "+txNgaymuon.getText()+" dến ngày "+txNgaymuon2.getText());
        lbDocgia.setText("Độc giả mượn sách nhiều nhất từ ngày "+txNgaymuon.getText()+" dến ngày "+txNgaymuon2.getText());
        ThongKeBUS bus = new ThongKeBUS();
        
        bus.Doc(txNgaymuon.getText(),txNgaymuon2.getText());
        Vector header = new Vector();
            header.add("Mã Đầu Sách");
            header.add("Tổng");
            modeldausach = new DefaultTableModel(header,0);
        if(ThongKeBUS.dsds!=null){
            
            for(ThongKeDTO tk : ThongKeBUS.dsds)
            {
                Vector row = new Vector();
                row.add(tk.getMaDS());
                row.add(tk.getTong());
                modeldausach.addRow(row);
            }
            tbThongKeDauSach.setModel(modeldausach);
        }
        else{
            JOptionPane.showMessageDialog(null, "Không có cuốn sách nào được mượn trong khoảng thời gian trên");
        }
        
        bus.Docgia(txNgaymuon.getText(), txNgaymuon2.getText());
        Vector headerdocgia = new Vector();
            headerdocgia.add("Mã thẻ thư viện");
            headerdocgia.add("Mã độc giả");
            headerdocgia.add("Họ");
            headerdocgia.add("Tên");
            headerdocgia.add("Tổng số sách mượn");
            modeldocgia= new DefaultTableModel(headerdocgia,0);
        if(ThongKeBUS.dsds!=null){
            
            for(ThongKeDTO tkdg : ThongKeBUS.dsdg){
                Vector rowdg = new Vector();
                rowdg.add(tkdg.getMatheTV());
                rowdg.add(tkdg.getMaDG());
                rowdg.add(tkdg.getHo());
                rowdg.add(tkdg.getTen());
                rowdg.add(tkdg.getTong());
                modeldocgia.addRow(rowdg);
            }
            tbThongKeDocGia.setModel(modeldocgia);
        }
        else{
            JOptionPane.showMessageDialog(null, "Không có độc giả nào mượn sách trong khoảng thời gian trên");
        }
    }//GEN-LAST:event_btThongKeActionPerformed

    private void txNgaymuonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNgaymuonKeyReleased
        // TODO add your handling code here:
        txNgaymuon2.setText(txNgaymuon.getText());
    }//GEN-LAST:event_txNgaymuonKeyReleased

    private void txNgayBDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNgayBDKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txNgayBDKeyReleased

    private void btThongKe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThongKe1ActionPerformed
        // TODO add your handling code here:
        lbDocgia2.setText("Độc giả làm thẻ thư viện từ ngày "+txNgayBD.getText()+" dến ngày "+txNgayKT.getText());
        ThongKeBUS bus = new ThongKeBUS();
        System.out.println(txNgayBD.getText());
        System.out.println(txNgayKT.getText());
        try {
            bus.Docgia2(txNgayBD.getText(),txNgayKT.getText());
        } catch (SQLException ex) {
            Logger.getLogger(ThongKePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        Vector header = new Vector();
            header.add("Mã ĐG");
            header.add("Họ ĐG");
            header.add("Tên ĐG");
            header.add("Ngày Sinh");
            header.add("Địa chỉ");
            header.add("SĐT");
            header.add("Trình Độ");
            header.add("Nơi Công Tác");
            
            modeldocgia2 = new DefaultTableModel(header,0);
        if(ThongKeBUS.dsdg2!=null){
            
            for(int i=0;i<ThongKeBUS.dsdg2.size();i++){
                Object[] obj={ThongKeBUS.dsdg2.get(i).getMadg(),ThongKeBUS.dsdg2.get(i).getHoDG(),ThongKeBUS.dsdg2.get(i).getTenDG(),ThongKeBUS.dsdg2.get(i).getNgaySinh(),ThongKeBUS.dsdg2.get(i).getAddress(),ThongKeBUS.dsdg2.get(i).getSoDT(),ThongKeBUS.dsdg2.get(i).getTrinhDo(),ThongKeBUS.dsdg2.get(i).getNoicongtac()};
                modeldocgia2.addRow(obj);
            }
            tblDocGia2.setModel(modeldocgia2);
        }
        else{
            JOptionPane.showMessageDialog(null, "Không có độc giả nào làm thẻ trong khoảng thời gian trên");
        }
    }//GEN-LAST:event_btThongKe1ActionPerformed
    ArrayList<ThongKeDTO> arraytk = new ArrayList<ThongKeDTO>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btThongKe;
    private javax.swing.JButton btThongKe1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbDocgia;
    private javax.swing.JLabel lbDocgia2;
    private javax.swing.JLabel lbSachmuon;
    private javax.swing.JTable tbThongKeDauSach;
    private javax.swing.JTable tbThongKeDocGia;
    private javax.swing.JTable tblDocGia2;
    private javax.swing.JFormattedTextField txNgayBD;
    private javax.swing.JFormattedTextField txNgayKT;
    private javax.swing.JFormattedTextField txNgaymuon;
    private javax.swing.JFormattedTextField txNgaymuon2;
    // End of variables declaration//GEN-END:variables
}
