
package GUI;

import BUS.DSTinhTrangBUS;
import BUS.DauSachBUS;
import BUS.SachConBUS;
import DTO.DSTinhTrangDTO;
import DTO.DauSachDTO;
import DTO.SachConDTO;
import java.awt.Color;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;


public class SachPanel extends javax.swing.JPanel {
        DefaultTableModel model =new DefaultTableModel();
        DefaultTableModel modelsc =new DefaultTableModel();
    
    public SachPanel() throws Exception {
        initComponents();
        tbSach.getTableHeader().setOpaque(false);
        tbSach.getTableHeader().setBackground(Color.blue);
        tbSach.getTableHeader().setForeground(new Color(255,255,255));
        
        tbSach.setRowHeight(28);
        
        DauSachBUS bus= new DauSachBUS();
            bus.DocDS();
 
        Vector header= new Vector();
        header.add("Mã sách");
        header.add("Tên sách");
        header.add("Số lượng");
        header.add("Mã tác giả");
        model= new DefaultTableModel(header,0);
        for(int i=0; i<DauSachBUS.dsds.size();i++){
                Object[] objs= {DauSachBUS.dsds.get(i).getMaDS(),DauSachBUS.dsds.get(i).getTenSach(),DauSachBUS.dsds.get(i).getSoluong(),DauSachBUS.dsds.get(i).getMaTG()};
                model.addRow(objs);
            }
        
        tbSach.setModel(model);
        txHientrang.setEnabled(false);
        txDausach.setEnabled(false);
        txMasachcon.setEnabled(false);
        
        txMasach.setEnabled(false);
        txSoluong.setEnabled(false);
        txMatacgia.setEnabled(false);
        
        DSTinhTrangBUS tt= new DSTinhTrangBUS();
        tt.list();
        for(int i=0; i < DSTinhTrangBUS.dsTinhTrang.size();i++)
        {
            cbMatinhtrang.addItem(DSTinhTrangBUS.dsTinhTrang.get(i).getTinhTrang());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lbMasach = new javax.swing.JLabel();
        lbMatacgia = new javax.swing.JLabel();
        lbTensach = new javax.swing.JLabel();
        lbSoluong = new javax.swing.JLabel();
        txTensach = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        Tailai1 = new javax.swing.JButton();
        txSoluong = new javax.swing.JFormattedTextField();
        txMatacgia = new javax.swing.JFormattedTextField();
        txMasach = new javax.swing.JFormattedTextField();
        jPanel6 = new javax.swing.JPanel();
        btTimkiem = new javax.swing.JButton();
        txTimkiemTentacgia = new javax.swing.JTextField();
        txTimkiemTensach = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSach = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSachcon = new javax.swing.JTable();
        lbDausach = new javax.swing.JLabel();
        txDausach = new javax.swing.JTextField();
        lbMasachcon = new javax.swing.JLabel();
        txMasachcon = new javax.swing.JTextField();
        lbMatinhtrang = new javax.swing.JLabel();
        cbMatinhtrang = new javax.swing.JComboBox<>();
        lbHientrang = new javax.swing.JLabel();
        txHientrang = new javax.swing.JTextField();
        btSua1 = new javax.swing.JButton();
        btXoa1 = new javax.swing.JButton();
        btThem1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Tailai2 = new javax.swing.JButton();

        lbMasach.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbMasach.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMasach.setText("Mã sách");

        lbMatacgia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbMatacgia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMatacgia.setText("Mã tác gỉả");

        lbTensach.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbTensach.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTensach.setText("Tên sách");

        lbSoluong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbSoluong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSoluong.setText("Số lượng");

        txTensach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTensachActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Thông Tin Đầu Sách");

        btThem.setBackground(new java.awt.Color(0, 255, 0));
        btThem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btSua.setBackground(new java.awt.Color(255, 255, 0));
        btSua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSua.setText("Sửa");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btXoa.setBackground(new java.awt.Color(255, 0, 0));
        btXoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        Tailai1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Tailai1.setText("Tải lại");
        Tailai1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tailai1MouseClicked(evt);
            }
        });

        txSoluong.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txMatacgia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txMasach.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btThem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(lbMatacgia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(2, 2, 2))
                            .addComponent(txMatacgia)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(lbSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(txSoluong))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(lbMasach, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(txMasach))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(lbTensach, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(txTensach, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Tailai1))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tailai1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMasach, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMasach, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txTensach, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTensach, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMatacgia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMatacgia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btTimkiem.setBackground(new java.awt.Color(0, 255, 255));
        btTimkiem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btTimkiem.setText("Tìm kiếm");
        btTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimkiemActionPerformed(evt);
            }
        });

        txTimkiemTentacgia.setText("Nhập tên tác giả cần tìm sách");
        txTimkiemTentacgia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txTimkiemTentacgiaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txTimkiemTentacgiaFocusLost(evt);
            }
        });
        txTimkiemTentacgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTimkiemTentacgiaActionPerformed(evt);
            }
        });

        txTimkiemTensach.setText("Nhập tên sách cần tìm");
        txTimkiemTensach.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txTimkiemTensachFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txTimkiemTensachFocusLost(evt);
            }
        });
        txTimkiemTensach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTimkiemTensachActionPerformed(evt);
            }
        });

        tbSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Số lượng", "Mã tác giả"
            }
        ));
        tbSach.setRowHeight(26);
        tbSach.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tbSach.setShowVerticalLines(false);
        tbSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSach);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txTimkiemTensach, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txTimkiemTentacgia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txTimkiemTentacgia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txTimkiemTensach, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tbSachcon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã ĐS", "Mã Sách Con", "Mã Tình trạng", "Hiện trạng"
            }
        ));
        tbSachcon.setRowHeight(26);
        tbSachcon.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tbSachcon.setShowVerticalLines(false);
        tbSachcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSachconMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbSachcon);

        lbDausach.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbDausach.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDausach.setText("Đầu sách");

        lbMasachcon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbMasachcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMasachcon.setText("Mã sách con");

        lbMatinhtrang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbMatinhtrang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMatinhtrang.setText("Tình trạng");

        lbHientrang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbHientrang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHientrang.setText("Hiện trạng");

        txHientrang.setText("1");

        btSua1.setBackground(new java.awt.Color(255, 255, 0));
        btSua1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btSua1.setText("Sửa");
        btSua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSua1ActionPerformed(evt);
            }
        });

        btXoa1.setBackground(new java.awt.Color(255, 0, 0));
        btXoa1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btXoa1.setText("Xóa");
        btXoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoa1ActionPerformed(evt);
            }
        });

        btThem1.setBackground(new java.awt.Color(0, 255, 0));
        btThem1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btThem1.setText("Thêm");
        btThem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThem1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setText("Thông Tin Sách Con");

        Tailai2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Tailai2.setText("Tải lại");
        Tailai2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tailai2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tailai2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMasachcon, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbMatinhtrang, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbMatinhtrang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbHientrang, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txHientrang, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btSua1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btXoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txMasachcon, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbDausach, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txDausach, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Tailai2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDausach, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txDausach, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMasachcon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txMasachcon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMatinhtrang, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMatinhtrang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txHientrang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbHientrang, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSua1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btXoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txTensachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTensachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTensachActionPerformed

    private void btTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimkiemActionPerformed
        // TODO add your handling code here:
        if((txTimkiemTensach.getText().equals("") || txTimkiemTensach.getText().equals("Nhập tên sách cần tìm")) && (txTimkiemTentacgia.getText().equals("") || txTimkiemTentacgia.getText().equals("Nhập tên tác giả cần tìm sách"))){
            showMessageDialog(null,"Chưa nhập thông tin tìm kiếm");
        }
        else{
            if((txTimkiemTensach.getText().equals("") || txTimkiemTensach.getText().equals("Nhập tên sách cần tìm")) && (!txTimkiemTentacgia.getText().equals(""))){
                if(txTimkiemTentacgia.getText().equals("") || txTimkiemTentacgia.getText().equals("Nhập tên tác giả cần tìm sách")){
                    JOptionPane.showMessageDialog(null, "Kết quả tìm kiếm không tồn tại!!");
                }
                else{
                ArrayList<DauSachDTO> kq= new ArrayList<DauSachDTO>();
                DauSachBUS bus=new DauSachBUS();
                    try {
                        kq=bus.timkiemtheoTenTG(txTimkiemTentacgia.getText());
                    } catch (Exception ex) {
                        Logger.getLogger(SachPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                if(kq!=null){
                    Vector header= new Vector();
                    header.add("Mã sách");
                    header.add("Tên sách");
                    header.add("Số lượng");
                    header.add("Mã tác giả");
                model= new DefaultTableModel(header,0);
                for(int i=0; i<kq.size();i++){
                        Object[] objs= {kq.get(i).getMaDS(),kq.get(i).getTenSach(),kq.get(i).getSoluong(),kq.get(i).getMaTG()};
                        model.addRow(objs);
                    }

                tbSach.setModel(model);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Kết quả tìm kiếm không tồn tại!!");
                }
                }
            }
            else{
                if((txTimkiemTentacgia.getText().equals("") || txTimkiemTentacgia.getText().equals("Nhập tên tác giả cần tìm sách")) && (!txTimkiemTensach.getText().equals(""))){
                    if(txTimkiemTensach.getText().equals("") || txTimkiemTensach.getText().equals("Nhập tên sách cần tìm")){
                        JOptionPane.showMessageDialog(null, "Kết quả tìm kiếm không tồn tại!!");
                    }
                    else{
                    ArrayList<DauSachDTO> kq= new ArrayList<DauSachDTO>();
                    DauSachBUS bus=new DauSachBUS();
                    kq=bus.Timkiem(txTimkiemTensach.getText());
                    if(kq!=null){
                        Vector header= new Vector();
                        header.add("Mã sách");
                        header.add("Tên sách");
                        header.add("Số lượng");
                        header.add("Mã tác giả");
                    model= new DefaultTableModel(header,0);
                    for(int i=0; i<kq.size();i++){
                            Object[] objs= {kq.get(i).getMaDS(),kq.get(i).getTenSach(),kq.get(i).getSoluong(),kq.get(i).getMaTG()};
                            model.addRow(objs);
                        }

                    tbSach.setModel(model);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Kết quả tìm kiếm không tồn tại!!");
                    }
                    }
                }
                else{
                    ArrayList<DauSachDTO> kq= new ArrayList<DauSachDTO>();
                    DauSachBUS bus=new DauSachBUS();
                    try {
                        kq=bus.timkiemTong(txTimkiemTentacgia.getText(),txTimkiemTensach.getText());
                    } catch (Exception ex) {
                        Logger.getLogger(SachPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if(kq!=null){
                        Vector header= new Vector();
                        header.add("Mã sách");
                        header.add("Tên sách");
                        header.add("Số lượng");
                        header.add("Mã tác giả");
                    model= new DefaultTableModel(header,0);
                    for(int i=0; i<kq.size();i++){
                            Object[] objs= {kq.get(i).getMaDS(),kq.get(i).getTenSach(),kq.get(i).getSoluong(),kq.get(i).getMaTG()};
                            model.addRow(objs);
                        }

                    tbSach.setModel(model);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Kết quả tìm kiếm không tồn tại!!");
                    }
                }
            }
        }
    }//GEN-LAST:event_btTimkiemActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        DauSachDTO sach = new DauSachDTO();
        sach.setMaDS(parseInt(txMasach.getText()));
        sach.setTenSach(txTensach.getText());
        sach.setSoluong(parseInt(txSoluong.getText()));

        sach.setMaTG(parseInt(txMatacgia.getText()));
        
        DauSachBUS bus= new DauSachBUS();
            try {
                bus.Them(sach);
            } catch (Exception ex) {
                Logger.getLogger(SachPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        Vector row=new Vector();
        row.add(sach.getMaDS());
        row.add(sach.getTenSach());
        row.add(sach.getSoluong());

        row.add(sach.getMaTG());
        
        model.addRow(row);
        tbSach.setModel(model);
    }//GEN-LAST:event_btThemActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        // TODO add your handling code here:
        int i= tbSach.getSelectedRow();
        if(i>=0)
        {
            txMasach.setEnabled(true);
            txSoluong.setEnabled(true);
            txMatacgia.setEnabled(true);
            DauSachDTO sach = new DauSachDTO();
            sach.setMaDS(parseInt(txMasach.getText()));
            sach.setTenSach(txTensach.getText());
            sach.setSoluong(parseInt(txSoluong.getText()));

            sach.setMaTG(parseInt(txMatacgia.getText()));
            
            DauSachBUS bus= new DauSachBUS();
            try {
                bus.Sua(sach,i);
            } catch (Exception ex) {
                Logger.getLogger(SachPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            model.setValueAt(sach.getMaDS(), i, 0);
            model.setValueAt(sach.getTenSach(), i, 1);
            model.setValueAt(sach.getSoluong(), i, 2);
            model.setValueAt(sach.getMaTG(), i, 3);
            
            tbSach.setModel(model);
            txMasach.setEnabled(false);
        txSoluong.setEnabled(false);
        txMatacgia.setEnabled(false);
        }
        
    }//GEN-LAST:event_btSuaActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
        int i= tbSach.getSelectedRow();
        if(i>=0)
        {
            txMasach.setEnabled(true);
            DauSachBUS bus= new DauSachBUS();
            try {
                bus.Xoa(parseInt(txMasach.getText()));
            } catch (Exception ex) {
                Logger.getLogger(SachPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            model.removeRow(i);
            tbSach.setModel(model);
            txMasach.setEnabled(false);
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void tbSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSachMouseClicked
        // TODO add your handling code here:
        ArrayList<SachConDTO> kq=new ArrayList<SachConDTO>();
        
        int  i=tbSach.getSelectedRow();
        //JOptionPane.showMessageDialog(null, "row:"+i);
        txMasach.setEnabled(true);
        txSoluong.setEnabled(true);
        txMatacgia.setEnabled(true);
        txMasach.setText(tbSach.getModel().getValueAt(i, 0).toString());
        txTensach.setText(tbSach.getModel().getValueAt(i, 1).toString());
        txSoluong.setText(tbSach.getModel().getValueAt(i, 2).toString());
        txMatacgia.setText(tbSach.getModel().getValueAt(i, 3).toString());
        txMasach.setEnabled(false);
        txSoluong.setEnabled(false);
        txMatacgia.setEnabled(false);
        
        SachConBUS bus= new SachConBUS();
            try {
                kq= bus.DocDS(parseInt(txMasach.getText()));
            } catch (Exception ex) {
                Logger.getLogger(SachPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        Vector header= new Vector();
        header.add("Đầu sách");
        header.add("Mã sách con");
        header.add("Mã tình trạng");
        header.add("Hiện trạng");
        modelsc= new DefaultTableModel(header,0);
        if(kq!=null){
            for(int j=0; j<kq.size();j++)
            {
                Object[] objs= {kq.get(j).getMaDS(),kq.get(j).getMaSachCon(),kq.get(j).getMaTinhTrang(),kq.get(j).getHientrang()};
                modelsc.addRow(objs);
            }
            tbSachcon.setModel(modelsc);
        }
            try {
                bus.combobox();
            } catch (Exception ex) {
                Logger.getLogger(SachPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_tbSachMouseClicked

    private void txTimkiemTentacgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTimkiemTentacgiaActionPerformed
        // TODO add your handling code here:
        if(txTimkiemTentacgia.getText().equals("") || txTimkiemTentacgia.getText().equals("Nhập tên tác giả cần tìm sách")){
            JOptionPane.showMessageDialog(null, "Kết quả tìm kiếm không tồn tại!!");
        }
        else{
        ArrayList<DauSachDTO> kq= new ArrayList<DauSachDTO>();
        DauSachBUS bus=new DauSachBUS();
            try {
                kq=bus.timkiemtheoTenTG(txTimkiemTentacgia.getText());
            } catch (Exception ex) {
                Logger.getLogger(SachPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        if(kq!=null){
            Vector header= new Vector();
            header.add("Mã sách");
            header.add("Tên sách");
            header.add("Số lượng");
            header.add("Mã tác giả");
        model= new DefaultTableModel(header,0);
        for(int i=0; i<kq.size();i++){
                Object[] objs= {kq.get(i).getMaDS(),kq.get(i).getTenSach(),kq.get(i).getSoluong(),kq.get(i).getMaTG()};
                model.addRow(objs);
            }
        
        tbSach.setModel(model);
        }
        }
    }//GEN-LAST:event_txTimkiemTentacgiaActionPerformed

    private void btThem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThem1ActionPerformed
        // TODO add your handling code here:
        SachConDTO sachcon = new SachConDTO();
        sachcon.setMaDS(parseInt(txDausach.getText()));
        sachcon.setMaSachCon(parseInt(txMasachcon.getText()));
        sachcon.setMaTinhTrang(cbMatinhtrang.getItemAt(cbMatinhtrang.getSelectedIndex()));
        sachcon.setHientrang(parseInt(txHientrang.getText()));
        SachConBUS bus= new SachConBUS();
        boolean check = true;
        for(SachConDTO sc : SachConBUS.dssc)
        {
            if(sc.getMaSachCon()==sachcon.getMaSachCon() && sc.getMaDS()==sachcon.getMaDS()) check=false;
        }
        if(check){
            try {
                bus.Them(sachcon);
            } catch (Exception ex) {
                
            }
            Vector row=new Vector();
            row.add(sachcon.getMaDS());
            row.add(sachcon.getMaSachCon());
            row.add(sachcon.getMaTinhTrang());
            row.add(sachcon.getHientrang());
            model.addRow(row);
            tbSachcon.setModel(model);
            
        }
        else {
            showMessageDialog(null, "Mã sách con bị trùng. Vui lòng thử lại");
            txMasachcon.requestFocus();
        }
    }//GEN-LAST:event_btThem1ActionPerformed

    private void btXoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoa1ActionPerformed
        // TODO add your handling code here:
        txDausach.setEnabled(true);
        txMasachcon.setEnabled(true);
        int i= tbSachcon.getSelectedRow();
        if(i>=0)
        {
            SachConBUS bus= new SachConBUS();
            try {
                bus.Xoa(parseInt(txDausach.getText()),parseInt(txMasachcon.getText()));
            } catch (Exception ex) {
                
            }
            modelsc.removeRow(i);
            tbSachcon.setModel(modelsc);
        }
        txDausach.setEnabled(false);
        txMasachcon.setEnabled(false);
    }//GEN-LAST:event_btXoa1ActionPerformed

    private void btSua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSua1ActionPerformed
        txDausach.setEnabled(true);
        txMasachcon.setEnabled(true);
        txHientrang.setEnabled(true);
        int i= tbSachcon.getSelectedRow();
        if(i>=0)
        {
            SachConDTO sachcon = new SachConDTO();
            sachcon.setMaDS(parseInt(txDausach.getText()));
            sachcon.setMaSachCon(parseInt(txMasachcon.getText()));
            sachcon.setMaTinhTrang(Integer.toString(cbMatinhtrang.getSelectedIndex()+1));
            sachcon.setHientrang(parseInt(txHientrang.getText()));
            SachConBUS bus= new SachConBUS();
            try {
                bus.Sua(sachcon,i);
            } catch (Exception ex) {
                
            }
            modelsc.setValueAt(sachcon.getMaDS(), i, 0);
            modelsc.setValueAt(sachcon.getMaSachCon(), i, 1);
            modelsc.setValueAt(sachcon.getMaTinhTrang(), i, 2);
            modelsc.setValueAt(sachcon.getHientrang(), i, 3);
            tbSachcon.setModel(modelsc);
        }
        txDausach.setEnabled(false);
        txMasachcon.setEnabled(false);
        txHientrang.setEnabled(false);
    }//GEN-LAST:event_btSua1ActionPerformed

    private void tbSachconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSachconMouseClicked
        // TODO add your handling code here:
        int  i=tbSachcon.getSelectedRow();
        txHientrang.setEnabled(true);
        txDausach.setEnabled(true);
        txMasachcon.setEnabled(true);
        
        txDausach.setText(tbSachcon.getModel().getValueAt(i, 0).toString());
        txMasachcon.setText(tbSachcon.getModel().getValueAt(i, 1).toString());
        cbMatinhtrang.setSelectedIndex(parseInt(tbSachcon.getModel().getValueAt(i, 2).toString())-1);
        txHientrang.setText(tbSachcon.getModel().getValueAt(i, 3).toString());
        txHientrang.setEnabled(false);
        txDausach.setEnabled(false);
        txMasachcon.setEnabled(false);
        btXoa.setEnabled(true);
    }//GEN-LAST:event_tbSachconMouseClicked

    private void txTimkiemTensachFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txTimkiemTensachFocusLost
        // TODO add your handling code here:
        if(txTimkiemTensach.getText().equals("")){
            txTimkiemTensach.setText("Nhập tên sách cần tìm");
        }
    }//GEN-LAST:event_txTimkiemTensachFocusLost

    private void txTimkiemTentacgiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txTimkiemTentacgiaFocusLost
        // TODO add your handling code here:
        if(txTimkiemTentacgia.getText().equals("")){
            txTimkiemTentacgia.setText("Nhập tên tác giả cần tìm sách");
        }
        
    }//GEN-LAST:event_txTimkiemTentacgiaFocusLost

    private void txTimkiemTensachFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txTimkiemTensachFocusGained
        // TODO add your handling code here:
        if(txTimkiemTensach.getText().equals("Nhập tên sách cần tìm")){
            txTimkiemTensach.setText("");
        }
    }//GEN-LAST:event_txTimkiemTensachFocusGained

    private void txTimkiemTentacgiaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txTimkiemTentacgiaFocusGained
        // TODO add your handling code here:
        if(txTimkiemTentacgia.getText().equals("Nhập tên tác giả cần tìm sách")){
            txTimkiemTentacgia.setText("");
        }
    }//GEN-LAST:event_txTimkiemTentacgiaFocusGained

    private void Tailai1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tailai1MouseClicked
        // TODO add your handling code here:
        txMasach.setEnabled(true);
        txSoluong.setEnabled(true);
        txMatacgia.setEnabled(true);
        txMasach.setText("");
        txTensach.setText("");
        txSoluong.setText("");
        txMatacgia.setText("");   
        DauSachBUS bus= new DauSachBUS();
            try {
                bus.DocDS();
            } catch (Exception ex) {
                Logger.getLogger(SachPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
 
        Vector header= new Vector();
        header.add("Mã sách");
        header.add("Tên sách");
        header.add("Số lượng");
        header.add("Mã tác giả");
        model= new DefaultTableModel(header,0);
        for(int i=0; i<DauSachBUS.dsds.size();i++){
                Object[] objs= {DauSachBUS.dsds.get(i).getMaDS(),DauSachBUS.dsds.get(i).getTenSach(),DauSachBUS.dsds.get(i).getSoluong(),DauSachBUS.dsds.get(i).getMaTG()};
                model.addRow(objs);
            }
        
        tbSach.setModel(model);
    }//GEN-LAST:event_Tailai1MouseClicked

    private void Tailai2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tailai2MouseClicked
        // TODO add your handling code here:
        txDausach.setEnabled(true);
        txMasachcon.setEnabled(true);
        cbMatinhtrang.setEnabled(true);
        txHientrang.setEnabled(true);
        
        txDausach.setText("");
        txMasachcon.setText("");
        cbMatinhtrang.setSelectedIndex(0);
        txHientrang.setText("1");
        txHientrang.setEnabled(false);
        
    }//GEN-LAST:event_Tailai2MouseClicked

    private void txTimkiemTensachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTimkiemTensachActionPerformed
        // TODO add your handling code here:
        if(txTimkiemTensach.getText().equals("") || txTimkiemTensach.getText().equals("Nhập tên sách cần tìm")){
            JOptionPane.showMessageDialog(null, "Kết quả tìm kiếm không tồn tại!!");
        }
        else{
        ArrayList<DauSachDTO> kq= new ArrayList<DauSachDTO>();
        DauSachBUS bus=new DauSachBUS();
        kq=bus.Timkiem(txTimkiemTensach.getText());
        if(kq!=null){
            Vector header= new Vector();
            header.add("Mã sách");
            header.add("Tên sách");
            header.add("Số lượng");
            header.add("Mã tác giả");
        model= new DefaultTableModel(header,0);
        for(int i=0; i<kq.size();i++){
                Object[] objs= {kq.get(i).getMaDS(),kq.get(i).getTenSach(),kq.get(i).getSoluong(),kq.get(i).getMaTG()};
                model.addRow(objs);
            }
        
        tbSach.setModel(model);
        }
        }
    }//GEN-LAST:event_txTimkiemTensachActionPerformed
    
        public void SetTextBlank(){
        txMasach.setEnabled(true);
        txSoluong.setEnabled(true);
        txMasach.setText("");
        txTensach.setText("");
        txSoluong.setText("0");
        txMatacgia.setText("");
        txDausach.setText("");
        txMasachcon.setText("");
        cbMatinhtrang.setSelectedIndex(0);
        txHientrang.setText("1");
    }
    private ArrayList<DauSachDTO> arraysach;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Tailai1;
    private javax.swing.JButton Tailai2;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btSua1;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btThem1;
    private javax.swing.JButton btTimkiem;
    private javax.swing.JButton btXoa;
    private javax.swing.JButton btXoa1;
    private javax.swing.JComboBox<String> cbMatinhtrang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbDausach;
    private javax.swing.JLabel lbHientrang;
    private javax.swing.JLabel lbMasach;
    private javax.swing.JLabel lbMasachcon;
    private javax.swing.JLabel lbMatacgia;
    private javax.swing.JLabel lbMatinhtrang;
    private javax.swing.JLabel lbSoluong;
    private javax.swing.JLabel lbTensach;
    private javax.swing.JTable tbSach;
    private javax.swing.JTable tbSachcon;
    private javax.swing.JTextField txDausach;
    private javax.swing.JTextField txHientrang;
    private javax.swing.JFormattedTextField txMasach;
    private javax.swing.JTextField txMasachcon;
    private javax.swing.JFormattedTextField txMatacgia;
    private javax.swing.JFormattedTextField txSoluong;
    private javax.swing.JTextField txTensach;
    private javax.swing.JTextField txTimkiemTensach;
    private javax.swing.JTextField txTimkiemTentacgia;
    // End of variables declaration//GEN-END:variables
}
