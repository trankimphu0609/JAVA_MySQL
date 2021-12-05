package GUI;

import BUS.DauSachBUS;
import DTO.DauSachDTO;
import DTO.TacGiaDTO;
import java.awt.Color;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class MaSachNhapFRM extends javax.swing.JFrame{
    DefaultTableModel model;
    int i=-1;
    
    
    public MaSachNhapFRM() throws Exception {
        
        initComponents();
        ThemPNFRM.dausach1[0]=0;
        tblChoose.getTableHeader().setOpaque(false);
        tblChoose.getTableHeader().setBackground(Color.blue);
        tblChoose.getTableHeader().setForeground(new Color(255,255,255));
        
        tblChoose.setRowHeight(28);
        txtMaDS.setEnabled(false);
        txtTensach1.setEnabled(false);
        txtSoluong1.setEnabled(false);
        txtDongia1.setEnabled(false);
        btnQuaylai.setVisible(false);
        DauSachBUS bus= new DauSachBUS();
        
            bus.DocDS();
        
        Vector header= new Vector();
        header.add("Mã Đầu Sách");
        header.add("Tên Sách");
        header.add("Mã Tác Giả");
        
        model= new DefaultTableModel(header,0);
        for(int i=0; i<DauSachBUS.dsds.size();i++){
                Object[] objs= {DauSachBUS.dsds.get(i).getMaDS(),DauSachBUS.dsds.get(i).getTenSach(),DauSachBUS.dsds.get(i).getMaTG()};
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
        btnXacnhan1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTim = new javax.swing.JFormattedTextField();
        btnTim = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaDS = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSoluong1 = new javax.swing.JFormattedTextField();
        txtDongia1 = new javax.swing.JFormattedTextField();
        btnChon = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtSoluong2 = new javax.swing.JFormattedTextField();
        txtDongia2 = new javax.swing.JFormattedTextField();
        btnXacnhan2 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTensach1 = new javax.swing.JTextField();
        txtTensach2 = new javax.swing.JTextField();
        txtTenTG = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtHoTG = new javax.swing.JTextField();
        btnQuaylai = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        tblChoose.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Đầu Sách", "Tên Sách", "Mã Tác Giả"
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
            tblChoose.getColumnModel().getColumn(2).setMinWidth(70);
            tblChoose.getColumnModel().getColumn(2).setMaxWidth(80);
        }

        btnXacnhan1.setBackground(new java.awt.Color(204, 204, 204));
        btnXacnhan1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXacnhan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXacnhan1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Xác Nhận");

        javax.swing.GroupLayout btnXacnhan1Layout = new javax.swing.GroupLayout(btnXacnhan1);
        btnXacnhan1.setLayout(btnXacnhan1Layout);
        btnXacnhan1Layout.setHorizontalGroup(
            btnXacnhan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXacnhan1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(33, 33, 33))
        );
        btnXacnhan1Layout.setVerticalGroup(
            btnXacnhan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnXacnhan1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        btnThoat.setBackground(new java.awt.Color(255, 0, 0));
        btnThoat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThoatMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");

        javax.swing.GroupLayout btnThoatLayout = new javax.swing.GroupLayout(btnThoat);
        btnThoat.setLayout(btnThoatLayout);
        btnThoatLayout.setHorizontalGroup(
            btnThoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThoatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnThoatLayout.setVerticalGroup(
            btnThoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Chọn Sách Nhập");

        txtTim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
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

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sách Nhập Thêm");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mã Đầu Sách:");

        txtMaDS.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Số lượng:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Đơn giá:");

        txtSoluong1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txtDongia1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        btnChon.setBackground(new java.awt.Color(204, 204, 204));
        btnChon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChonMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Chọn");

        javax.swing.GroupLayout btnChonLayout = new javax.swing.GroupLayout(btnChon);
        btnChon.setLayout(btnChonLayout);
        btnChonLayout.setHorizontalGroup(
            btnChonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnChonLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel8)
                .addGap(30, 30, 30))
        );
        btnChonLayout.setVerticalGroup(
            btnChonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnChonLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel8)
                .addGap(5, 5, 5))
        );

        jLabel9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sách Nhập Mới");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Tên Sách:");

        jLabel20.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Tên tác giả:");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Số lượng:");

        jLabel22.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Đơn giá:");

        txtSoluong2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txtDongia2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        btnXacnhan2.setBackground(new java.awt.Color(255, 255, 0));
        btnXacnhan2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXacnhan2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXacnhan2MouseClicked(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Xác Nhận");

        javax.swing.GroupLayout btnXacnhan2Layout = new javax.swing.GroupLayout(btnXacnhan2);
        btnXacnhan2.setLayout(btnXacnhan2Layout);
        btnXacnhan2Layout.setHorizontalGroup(
            btnXacnhan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXacnhan2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel23)
                .addGap(33, 33, 33))
        );
        btnXacnhan2Layout.setVerticalGroup(
            btnXacnhan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnXacnhan2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel23)
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tên sách:");

        jLabel24.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Họ tác giả:");

        btnQuaylai.setBackground(new java.awt.Color(0, 153, 153));
        btnQuaylai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuaylai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuaylaiMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Quay lại");

        javax.swing.GroupLayout btnQuaylaiLayout = new javax.swing.GroupLayout(btnQuaylai);
        btnQuaylai.setLayout(btnQuaylaiLayout);
        btnQuaylaiLayout.setHorizontalGroup(
            btnQuaylaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnQuaylaiLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel11)
                .addGap(27, 27, 27))
        );
        btnQuaylaiLayout.setVerticalGroup(
            btnQuaylaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnQuaylaiLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(121, 121, 121))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(330, 330, 330)))
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTim)
                                .addGap(18, 18, 18)
                                .addComponent(btnChon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnXacnhan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDongia2)
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnXacnhan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnQuaylai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaDS, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                            .addComponent(txtSoluong1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                            .addComponent(txtDongia1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                            .addComponent(txtTensach1))))
                .addGap(119, 119, 119)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSoluong2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                    .addComponent(txtTensach2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTenTG, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtHoTG, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtMaDS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTensach2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel10)
                    .addComponent(txtTensach1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoTG, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSoluong1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTenTG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDongia1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSoluong2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnTim))
                            .addComponent(btnChon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXacnhan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnQuaylai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(72, 72, 72))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDongia2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addComponent(btnXacnhan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblChooseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChooseMouseClicked
  
        i=tblChoose.getSelectedRow();
        
        btnChon.setBackground(new java.awt.Color(51,255,0));
    }//GEN-LAST:event_tblChooseMouseClicked

    private void btnXacnhan1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXacnhan1MouseClicked
        if(txtMaDS.getText().equals("") || txtTensach1.getText().equals("") || txtSoluong1.getText().equals("") || txtDongia1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!!");
        }
        else{
            txtMaDS.setEnabled(true);
            txtTensach1.setEnabled(true);
            
            int check=0;
            System.out.println(ThemPNFRM.dausach1[0]);
            for(int j=0; j<ThemPNFRM.length1;j++){
                if(ThemPNFRM.dausach1[j]==parseInt(txtMaDS.getText())){
                    check=1;
                }
            }
            if(check==0){
                ThemPNFRM.ThemMaSach1(new Object[]{
                           txtMaDS.getText(),
                           txtTensach1.getText(),
                           txtSoluong1.getText(),
                           txtDongia1.getText()
                    });
                
                ThemPNFRM.dausach1[ThemPNFRM.length1]=parseInt(txtMaDS.getText());
                ThemPNFRM.length1++;
            }
            else{
                JOptionPane.showMessageDialog(null, "Sách bạn chọn đã được thêm trước đó!!");
            }
            txtMaDS.setEnabled(false);
            txtTensach1.setEnabled(false);
        }
    }//GEN-LAST:event_btnXacnhan1MouseClicked

    private void btnThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnThoatMouseClicked

    private void btnChonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChonMouseClicked
        // TODO add your handling code here:
        btnXacnhan1.setBackground(new java.awt.Color(255,255,0));
        if(i>=0){
        txtMaDS.setEnabled(true);
        txtMaDS.setText(tblChoose.getModel().getValueAt(i, 0).toString());
        txtMaDS.setEnabled(false);
        txtTensach1.setEnabled(true);
        txtTensach1.setText(tblChoose.getModel().getValueAt(i, 1).toString());
        txtTensach1.setEnabled(false);
        txtSoluong1.setEnabled(true);
            txtDongia1.setEnabled(true);
        }
    }//GEN-LAST:event_btnChonMouseClicked

    private void btnXacnhan2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXacnhan2MouseClicked
        // TODO add your handling code here:
        if(txtTensach2.getText().equals("") || txtTenTG.getText().equals("") || txtSoluong2.getText().equals("") || txtDongia2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!!");
        }
        else{
            
            
            int check=0;
            
            for(int j=0; j<ThemPNFRM.array.size();j++){
                if(ThemPNFRM.array.get(j).getTenSach().equals(txtTensach2.getText())){
                    check=1;
                }
            }
            if(check==0){
                ThemPNFRM.ThemMaSach2(new Object[]{
                           ThemPNFRM.array.get(ThemPNFRM.array.size()-1).getMaDS()+1,
                           txtTensach2.getText(),
                           txtHoTG.getText(),
                           txtTenTG.getText(),
                           txtSoluong2.getText(),
                           txtDongia2.getText()
                    });
                DauSachDTO ds= new DauSachDTO(ThemPNFRM.array.get(ThemPNFRM.array.size()-1).getMaDS()+1,txtTensach2.getText());
                ThemPNFRM.array.add(ds);
                int checktg=0;
                for(int j=0; j<ThemPNFRM.arraytg.size();j++){
                    if(ThemPNFRM.arraytg.get(j).getHoTG().equals(txtHoTG.getText()) && ThemPNFRM.arraytg.get(j).getTenTG().equals(txtTenTG.getText())){
                        checktg=1;
                    }
                }
                if(checktg==0 && ThemPNFRM.tgthem.size()!=0){
                    for(int j=0; j<ThemPNFRM.tgthem.size();j++){
                        if(ThemPNFRM.tgthem.get(j).getHoTG().equals(txtHoTG.getText()) && ThemPNFRM.tgthem.get(j).getTenTG().equals(txtTenTG.getText())){
                            checktg=1;
                        }
                    }
                    if(checktg==0){
                        TacGiaDTO tg= new TacGiaDTO(ThemPNFRM.tgthem.get(ThemPNFRM.tgthem.size()-1).getMaTG()+1, txtHoTG.getText(), txtTenTG.getText());
                        ThemPNFRM.tgthem.add(tg);
                    }
                }
                if(checktg==0 && ThemPNFRM.tgthem.size()==0){
                    TacGiaDTO tg= new TacGiaDTO(ThemPNFRM.arraytg.get(ThemPNFRM.arraytg.size()-1).getMaTG()+1, txtHoTG.getText(), txtTenTG.getText());
                    ThemPNFRM.tgthem.add(tg);
                } 
                txtHoTG.setText("");
                txtTenTG.setText("");
                txtTensach2.setText("");
                txtSoluong2.setText("");
                txtDongia2.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null,"Sách đã tồn tại!!");
            }
        }
    }//GEN-LAST:event_btnXacnhan2MouseClicked

    private void btnTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimMouseClicked
        // TODO add your handling code here:
        if(txtTim.getText().equals("")){
            showMessageDialog(null,"Chưa nhập tên sách cần tìm");
        }
        else{
            DauSachBUS bus= new DauSachBUS();
            ArrayList<DauSachDTO> kq= new ArrayList<DauSachDTO>();
            kq=bus.Timkiem(txtTim.getText());
            if(kq!=null){
                Vector header= new Vector();
                header.add("Mã Đầu Sách");
                header.add("Tên Sách");
                header.add("Mã Tác Giả");

                model= new DefaultTableModel(header,0);
                for(int i=0; i<kq.size();i++){
                        Object[] objs= {kq.get(i).getMaDS(),kq.get(i).getTenSach(),kq.get(i).getMaTG()};
                        model.addRow(objs);
                    }
                tblChoose.setModel(model);
                btnQuaylai.setVisible(true);
            }
            else{
                showMessageDialog(null,"Sách cần tìm không tồn tại");
            }
        }
        
    }//GEN-LAST:event_btnTimMouseClicked

    private void txtTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimActionPerformed
        // TODO add your handling code here:
        if(txtTim.getText().equals("")){
            showMessageDialog(null,"Chưa nhập tên sách cần tìm");
        }
        else{
            DauSachBUS bus= new DauSachBUS();
            ArrayList<DauSachDTO> kq= new ArrayList<DauSachDTO>();
            kq=bus.Timkiem(txtTim.getText());
            if(kq!=null){
                Vector header= new Vector();
                header.add("Mã Đầu Sách");
                header.add("Tên Sách");
                header.add("Mã Tác Giả");

                model= new DefaultTableModel(header,0);
                for(int i=0; i<kq.size();i++){
                        Object[] objs= {kq.get(i).getMaDS(),kq.get(i).getTenSach(),kq.get(i).getMaTG()};
                        model.addRow(objs);
                    }
                tblChoose.setModel(model);
                btnQuaylai.setVisible(true);
            }
            else{
                showMessageDialog(null,"Sách cần tìm không tồn tại");
            }
        }
    }//GEN-LAST:event_txtTimActionPerformed

    private void btnQuaylaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuaylaiMouseClicked
        // TODO add your handling code here:
        DauSachBUS bus= new DauSachBUS();
        if(DauSachBUS.dsds==null){
            try {
                bus.DocDS();
            } catch (Exception ex) {
                Logger.getLogger(MaSuggest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Vector header= new Vector();
        header.add("Mã Đầu Sách");
        header.add("Tên Sách");
        header.add("Mã Tác Giả");
        
        model= new DefaultTableModel(header,0);
        for(int i=0; i<DauSachBUS.dsds.size();i++){
                Object[] objs= {DauSachBUS.dsds.get(i).getMaDS(),DauSachBUS.dsds.get(i).getTenSach(),DauSachBUS.dsds.get(i).getMaTG()};
                model.addRow(objs);
            }
        tblChoose.setModel(model);
        btnQuaylai.setVisible(false);
    }//GEN-LAST:event_btnQuaylaiMouseClicked
    
    
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
    private javax.swing.JPanel btnChon;
    private javax.swing.JPanel btnQuaylai;
    private javax.swing.JPanel btnThoat;
    private javax.swing.JButton btnTim;
    private javax.swing.JPanel btnXacnhan1;
    private javax.swing.JPanel btnXacnhan2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblChoose;
    private javax.swing.JFormattedTextField txtDongia1;
    private javax.swing.JFormattedTextField txtDongia2;
    private javax.swing.JTextField txtHoTG;
    private javax.swing.JFormattedTextField txtMaDS;
    private javax.swing.JFormattedTextField txtSoluong1;
    private javax.swing.JFormattedTextField txtSoluong2;
    private javax.swing.JTextField txtTenTG;
    private javax.swing.JTextField txtTensach1;
    private javax.swing.JTextField txtTensach2;
    private javax.swing.JFormattedTextField txtTim;
    // End of variables declaration//GEN-END:variables

    

}
