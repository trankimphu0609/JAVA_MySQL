package GUI;

import BUS.ChiTietSachMuonBUS;
import BUS.ChiTietSachTraBUS;
import java.sql.SQLException;
import BUS.ChucVuBUS;
import BUS.DSTinhTrangBUS;
import BUS.NhanVienBUS;
import BUS.SachConBUS;
import DTO.ChucVuDTO;
import DTO.DSTinhTrangDTO;
import java.awt.Color;
import static java.lang.Integer.parseInt;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ChucVu_DSTinhTrangGUI extends javax.swing.JPanel {
    DefaultTableModel model1;
    DefaultTableModel model2;
    private int choose=-1;
    private int choose2=-2;
    int max1=0,max2=0;
    
    public ChucVu_DSTinhTrangGUI() throws Exception {
        initComponents();
        
        
        btnReturnCV.setIcon(new ImageIcon("Image/reload.png"));
        btnReturnCV.setText("");
        btnReturnTT.setIcon(new ImageIcon("Image/reload.png"));
        btnReturnTT.setText("");
        
        ChucVuBUS bus1 = new ChucVuBUS();
        if(ChucVuBUS.dscv==null){
            bus1.DocDSCV();
        }
        Vector header1 = new Vector();
        header1.add("MÃ CHỨC VỤ");
        header1.add("TÊN CHỨC VỤ");
        model1= new DefaultTableModel(header1,0);
        for(int i=0; i<ChucVuBUS.dscv.size();i++){
                Object[] objs= {ChucVuBUS.dscv.get(i).getMaCV(),ChucVuBUS.dscv.get(i).getTenCV()};
                model1.addRow(objs);
                max1=ChucVuBUS.dscv.get(i).getMaCV();
            }
        if(max1==0){
            max1=1;
        }
        else{
            max1=max1+1;
        }
        txtMaCV.setText(Integer.toString(max1));
        txtMaCV.setEnabled(false);
        tblCV.setModel(model1);
        
        
        
        DSTinhTrangBUS bus2 = new DSTinhTrangBUS();
        if(DSTinhTrangBUS.dsTinhTrang==null){
            bus2.list();
        }
        Vector header2 = new Vector();
        header2.add("MÃ TÌNH TRẠNG");
        header2.add("TÊN TÌNH TRẠNG");
        model2= new DefaultTableModel(header2,0);
        for(int i=0; i<DSTinhTrangBUS.dsTinhTrang.size();i++){
                Object[] objs= {DSTinhTrangBUS.dsTinhTrang.get(i).getMaTinhTrang(),DSTinhTrangBUS.dsTinhTrang.get(i).getTinhTrang()};
                model2.addRow(objs);
                max2=parseInt(DSTinhTrangBUS.dsTinhTrang.get(i).getMaTinhTrang());
            }
        if(max2==0){
            max2=1;
        }
        else{
            max2=max2+1;
        }
        txtMaTT.setText(Integer.toString(max2));
        txtMaTT.setEnabled(false);
        tblTT.setModel(model2);
        ReturnCV();
        ReturnTT();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnChucVu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMaCV = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenCV = new javax.swing.JTextField();
        btnThemCV = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnXoaCV = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnCapNhatCV = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnReload1 = new javax.swing.JLabel();
        btnReturnCV = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCV = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTT = new javax.swing.JTable();
        pnTinhtrang = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtMaTT = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTenTT = new javax.swing.JTextField();
        btnThemTT = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnXoaTT = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnCapNhatTT = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnReturnTT = new javax.swing.JLabel();

        pnChucVu.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mã Chức Vụ:");

        txtMaCV.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tên Chức Vụ:");

        btnThemCV.setBackground(new java.awt.Color(255, 255, 51));
        btnThemCV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemCV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemCVMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("THÊM");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnThemCVLayout = new javax.swing.GroupLayout(btnThemCV);
        btnThemCV.setLayout(btnThemCVLayout);
        btnThemCVLayout.setHorizontalGroup(
            btnThemCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThemCVLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addGap(33, 33, 33))
        );
        btnThemCVLayout.setVerticalGroup(
            btnThemCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThemCVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap())
        );

        btnXoaCV.setBackground(new java.awt.Color(255, 51, 51));
        btnXoaCV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaCV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaCVMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("XÓA");

        javax.swing.GroupLayout btnXoaCVLayout = new javax.swing.GroupLayout(btnXoaCV);
        btnXoaCV.setLayout(btnXoaCVLayout);
        btnXoaCVLayout.setHorizontalGroup(
            btnXoaCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXoaCVLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addGap(42, 42, 42))
        );
        btnXoaCVLayout.setVerticalGroup(
            btnXoaCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnXoaCVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap())
        );

        btnCapNhatCV.setBackground(new java.awt.Color(0, 204, 0));
        btnCapNhatCV.setToolTipText("");
        btnCapNhatCV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCapNhatCV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCapNhatCVMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CẬP NHẬT");

        javax.swing.GroupLayout btnCapNhatCVLayout = new javax.swing.GroupLayout(btnCapNhatCV);
        btnCapNhatCV.setLayout(btnCapNhatCVLayout);
        btnCapNhatCVLayout.setHorizontalGroup(
            btnCapNhatCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCapNhatCVLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(19, 19, 19))
        );
        btnCapNhatCVLayout.setVerticalGroup(
            btnCapNhatCVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCapNhatCVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap())
        );

        btnReload1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReload1MouseClicked(evt);
            }
        });

        btnReturnCV.setForeground(new java.awt.Color(255, 255, 255));
        btnReturnCV.setText("RETURN");
        btnReturnCV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReturnCV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnCVMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnChucVuLayout = new javax.swing.GroupLayout(pnChucVu);
        pnChucVu.setLayout(pnChucVuLayout);
        pnChucVuLayout.setHorizontalGroup(
            pnChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChucVuLayout.createSequentialGroup()
                .addGroup(pnChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnChucVuLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(pnChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)))
                    .addGroup(pnChucVuLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnThemCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnChucVuLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnXoaCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnCapNhatCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnChucVuLayout.createSequentialGroup()
                        .addGroup(pnChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaCV)
                            .addComponent(txtTenCV, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                        .addGap(76, 76, 76)
                        .addComponent(btnReload1)))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnChucVuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReturnCV)
                .addContainerGap())
        );
        pnChucVuLayout.setVerticalGroup(
            pnChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChucVuLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnReturnCV)
                .addGap(9, 9, 9)
                .addGroup(pnChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaCV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(pnChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnChucVuLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(pnChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtTenCV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(pnChucVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnXoaCV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCapNhatCV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThemCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnChucVuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReload1)
                        .addGap(110, 110, 110))))
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Thông Tin Chức Vụ");

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        tblCV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã Chức Vụ", "Tên Chức Vụ"
            }
        ));
        tblCV.setRowHeight(28);
        tblCV.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tblCV.setShowVerticalLines(false);
        tblCV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCV);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Danh Sách Tình Trạng");

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        tblTT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã Tình Trạng", "Tên Tình Trạng"
            }
        ));
        tblTT.setRowHeight(28);
        tblTT.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tblTT.setShowVerticalLines(false);
        tblTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTTMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTT);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnTinhtrang.setBackground(new java.awt.Color(44, 62, 80));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mã Tình Trạng:");

        txtMaTT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tên Tình Trạng:");

        btnThemTT.setBackground(new java.awt.Color(255, 255, 51));
        btnThemTT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemTTMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("THÊM");

        javax.swing.GroupLayout btnThemTTLayout = new javax.swing.GroupLayout(btnThemTT);
        btnThemTT.setLayout(btnThemTTLayout);
        btnThemTTLayout.setHorizontalGroup(
            btnThemTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThemTTLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel10)
                .addGap(33, 33, 33))
        );
        btnThemTTLayout.setVerticalGroup(
            btnThemTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThemTTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap())
        );

        btnXoaTT.setBackground(new java.awt.Color(255, 51, 51));
        btnXoaTT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaTTMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("XÓA");

        javax.swing.GroupLayout btnXoaTTLayout = new javax.swing.GroupLayout(btnXoaTT);
        btnXoaTT.setLayout(btnXoaTTLayout);
        btnXoaTTLayout.setHorizontalGroup(
            btnXoaTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXoaTTLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel11)
                .addGap(42, 42, 42))
        );
        btnXoaTTLayout.setVerticalGroup(
            btnXoaTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnXoaTTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap())
        );

        btnCapNhatTT.setBackground(new java.awt.Color(0, 204, 0));
        btnCapNhatTT.setToolTipText("");
        btnCapNhatTT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCapNhatTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCapNhatTTMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CẬP NHẬT");

        javax.swing.GroupLayout btnCapNhatTTLayout = new javax.swing.GroupLayout(btnCapNhatTT);
        btnCapNhatTT.setLayout(btnCapNhatTTLayout);
        btnCapNhatTTLayout.setHorizontalGroup(
            btnCapNhatTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCapNhatTTLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel12)
                .addGap(19, 19, 19))
        );
        btnCapNhatTTLayout.setVerticalGroup(
            btnCapNhatTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCapNhatTTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap())
        );

        btnReturnTT.setForeground(new java.awt.Color(255, 255, 255));
        btnReturnTT.setText("RETURN");
        btnReturnTT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReturnTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnTTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnTinhtrangLayout = new javax.swing.GroupLayout(pnTinhtrang);
        pnTinhtrang.setLayout(pnTinhtrangLayout);
        pnTinhtrangLayout.setHorizontalGroup(
            pnTinhtrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTinhtrangLayout.createSequentialGroup()
                .addGroup(pnTinhtrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTinhtrangLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(pnTinhtrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnTinhtrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaTT)
                            .addComponent(txtTenTT, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)))
                    .addGroup(pnTinhtrangLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnThemTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(btnCapNhatTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTinhtrangLayout.createSequentialGroup()
                .addComponent(btnReturnTT)
                .addContainerGap())
        );
        pnTinhtrangLayout.setVerticalGroup(
            pnTinhtrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTinhtrangLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnReturnTT)
                .addGap(22, 22, 22)
                .addGroup(pnTinhtrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaTT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(36, 36, 36)
                .addGroup(pnTinhtrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(txtTenTT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(pnTinhtrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThemTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoaTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCapNhatTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnTinhtrang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnTinhtrang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReload1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReload1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnReload1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void btnThemCVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemCVMouseClicked
        // TODO add your handling code here:
        System.out.println(choose);
        if(choose==-1) {
            txtMaCV.setEnabled(true);
            ChucVuDTO cv = new ChucVuDTO();
            cv.setMaCV(parseInt(txtMaCV.getText()));
            cv.setTenCV(txtTenCV.getText());
            System.out.println("themCV");
            ChucVuBUS bus1 = new ChucVuBUS();
            try {
                bus1.Them(cv);
            }
            catch(Exception ex) {
                
            }
            Vector row = new Vector();
            row.add(cv.getMaCV());
            row.add(cv.getTenCV());
            
            model1.addRow(row);
            tblCV.setModel(model1);
            max1=max1+1;
            ReturnCV();
        }
        txtMaCV.setEnabled(false);
    }//GEN-LAST:event_btnThemCVMouseClicked

    private void btnXoaCVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaCVMouseClicked
        // TODO add your handling code here:
        int i = tblCV.getSelectedRow();
        if(choose==1) {
                txtMaCV.setEnabled(true);
                NhanVienBUS sc= new NhanVienBUS();
                if(NhanVienBUS.dsnv==null){
                    try {
                        sc.DocDSNV();
                    } catch (Exception ex) {
                        Logger.getLogger(ChucVu_DSTinhTrangGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                int check=0;
                for(int j=0;j<NhanVienBUS.dsnv.size();j++){
                    if(NhanVienBUS.dsnv.get(j).getMaCV()==parseInt(tblCV.getValueAt(i, 0).toString())){
                        check=1;
                    }
                }
                if(check==1){
                    JOptionPane.showMessageDialog(null, "Không thể xóa chức vụ này!!");
                }
                else{
                    if(i>=0) {
                        model1.removeRow(i);
                        tblCV.setModel(model1);
                    }
                    int ma=parseInt(txtMaCV.getText());

                    ChucVuBUS bus1 = new ChucVuBUS();
                    try {
                        bus1.Xoa(ma);
                    }
                    catch(Exception ex) {

                    }
                    ReturnCV();
                }
                
        }
        txtMaCV.setEnabled(false);
    }//GEN-LAST:event_btnXoaCVMouseClicked

    private void btnCapNhatCVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapNhatCVMouseClicked
        // TODO add your handling code here:
        if(choose==1) {
            txtMaCV.setEnabled(true);
            int i = tblCV.getSelectedRow();
            if(i>=0) {
                model1.setValueAt(txtMaCV.getText(), i, 0);
                model1.setValueAt(txtTenCV.getText(), i, 1);
                tblCV.setModel(model1);
            }
            ChucVuDTO cv = new ChucVuDTO();
            cv.setMaCV(parseInt(txtMaCV.getText()));
            cv.setTenCV(txtTenCV.getText());
            
            ChucVuBUS bus1 = new ChucVuBUS();
            try {
                bus1.Sua(cv);
            }
            catch(Exception ex) {
                
            }
        }
        txtMaCV.setEnabled(false);
    }//GEN-LAST:event_btnCapNhatCVMouseClicked

    private void btnThemTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemTTMouseClicked
        // TODO add your handling code here: 
        System.out.println(choose2);
        if(choose2==-2) {
            txtMaTT.setEditable(true);
            System.out.println("themTT");
            DSTinhTrangDTO tt = new DSTinhTrangDTO();
            tt.setMaTinhTrang(txtMaTT.getText());
            tt.setTinhTrang(txtTenTT.getText());
            
            DSTinhTrangBUS bus2 = new DSTinhTrangBUS();
            try {
                bus2.add(tt);
            }
            catch(Exception ex) {
                
            }
            Vector row2 = new Vector();
            row2.add(tt.getMaTinhTrang());
            row2.add(tt.getTinhTrang());
            
            model2.addRow(row2);
            tblTT.setModel(model2);
            ReturnTT();
            max2=max2+1;
            
        }
        txtMaTT.setEditable(false);
    }//GEN-LAST:event_btnThemTTMouseClicked

    private void btnXoaTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaTTMouseClicked
        // TODO add your handling code here:
        System.out.println(choose2);
        if(choose2==2) {
            txtMaTT.setEditable(true);
            int i = tblTT.getSelectedRow();
            SachConBUS sc= new SachConBUS();
                if(SachConBUS.dssc==null){
                    try {
                        sc.DocDS();
                    } catch (Exception ex) {
                        Logger.getLogger(ChucVu_DSTinhTrangGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                int check=0;
                for(int j=0;j<SachConBUS.dssc.size();j++){
                    if(SachConBUS.dssc.get(j).getMaTinhTrang().equals(txtMaTT.getText())){
                        check=1;
                    }
                }
                if(check==0){
                    ChiTietSachMuonBUS sm= new ChiTietSachMuonBUS();
                    if(ChiTietSachMuonBUS.dsktra==null){
                        try {
                            sm.DocDSCTSM();
                        } catch (Exception ex) {
                            Logger.getLogger(ChucVu_DSTinhTrangGUI.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                    for(int k=0;k<ChiTietSachMuonBUS.dsktra.size();k++){
                        if(ChiTietSachMuonBUS.dsktra.get(k).getMaTinhtrang().equals(txtMaTT.getText())){
                            check=1;
                        }
                    }
                }
                if(check==0){
                    ChiTietSachTraBUS st= new ChiTietSachTraBUS();
                    if(ChiTietSachTraBUS.dsktratra==null){
                        try {
                            st.DocDSCTST();
                        } catch (Exception ex) {
                            Logger.getLogger(ChucVu_DSTinhTrangGUI.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                    for(int j=0;j<ChiTietSachTraBUS.dsktratra.size();j++){
                        if(ChiTietSachTraBUS.dsktratra.get(i).getMaTT().equals(txtMaTT.getText())){
                            check=1;
                        }
                    }
                }
                if(check==1){
                    JOptionPane.showMessageDialog(null, "Không thể xóa tình trạng này!!");
                }
                else{
                    if(i>=0) {
                        model2.removeRow(i);
                        tblTT.setModel(model2);
                    }
                    String ma = txtMaTT.getText();

                    DSTinhTrangBUS bus2 = new DSTinhTrangBUS();
                    try {
                        bus2.delete(ma);
                    }
                    catch(Exception ex) {

                    }
                    ReturnTT(); 
                }
        }  
        txtMaTT.setEditable(false);
    }//GEN-LAST:event_btnXoaTTMouseClicked

    private void btnCapNhatTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapNhatTTMouseClicked
        // TODO add your handling code here:
        System.out.println(choose2);
        if(choose2==2) {
            
            txtMaTT.setEditable(true);
            int i=tblTT.getSelectedRow();
            System.out.println("CapnhatTT "+txtMaTT.getText()+" "+txtTenTT.getText());
            DSTinhTrangDTO tt = new DSTinhTrangDTO();
            tt.setMaTinhTrang(txtMaTT.getText());
            tt.setTinhTrang(txtTenTT.getText());
            
            DSTinhTrangBUS bus2 = new DSTinhTrangBUS();
            try {
                bus2.set(tt);
            }
            catch(Exception ex) {
                
            }
            System.out.println("Chọn: "+i);
                model2.setValueAt(txtMaTT.getText(), i, 0);
                model2.setValueAt(txtTenTT.getText(), i, 1);
                tblTT.setModel(model2);
            
            
            
        }
        txtMaTT.setEditable(false);
    }//GEN-LAST:event_btnCapNhatTTMouseClicked

    private void btnReturnCVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnCVMouseClicked
        // TODO add your handling code here:
        ReturnCV();
    }//GEN-LAST:event_btnReturnCVMouseClicked

    private void btnReturnTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnTTMouseClicked
        // TODO add your handling code here:
        ReturnTT();
    }//GEN-LAST:event_btnReturnTTMouseClicked

    private void tblCVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCVMouseClicked
        // TODO add your handling code here:
        txtMaCV.setEnabled(true);
        int i=tblCV.getSelectedRow();
        choose=1;
        btnCapNhatCV.setBackground(new java.awt.Color(0,204,0));
        btnThemCV.setBackground(new java.awt.Color(204,204,204));
        btnXoaCV.setBackground(new java.awt.Color(255, 51, 51));
        
        txtMaCV.setText(tblCV.getModel().getValueAt(i, 0).toString());
        txtMaCV.setEnabled(false);
        txtTenCV.setText(tblCV.getModel().getValueAt(i ,1).toString());
        
    }//GEN-LAST:event_tblCVMouseClicked

    private void tblTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTTMouseClicked
        // TODO add your handling code here:
        txtMaTT.setEnabled(true);
        int i=tblTT.getSelectedRow();
        choose2=2;
        System.out.println("ClickTT "+choose2);
        txtTenTT.setEnabled(true);

        btnCapNhatTT.setBackground(new java.awt.Color(0,204,0));
        btnThemTT.setBackground(new java.awt.Color(204,204,204));
        btnXoaTT.setBackground(new java.awt.Color(255, 51, 51));

        txtMaTT.setText(tblTT.getModel().getValueAt(i, 0).toString());
        txtMaTT.setEnabled(false);
        txtTenTT.setText(tblTT.getModel().getValueAt(i ,1).toString());

        //        ChucVuBUS bus1 = new ChucVuBUS();
        //
        //        try {
            //            bus1.DocDSCV(tblCV.getModel().getValueAt(i, 0).toString());
            //        }
        //
        
        
    }//GEN-LAST:event_tblTTMouseClicked
    private void ReturnCV(){
        choose=-1;
        btnThemCV.setBackground(new java.awt.Color(255,255,51));
        txtMaCV.setEnabled(true);
        txtMaCV.setText(Integer.toString(max1));
        txtMaCV.setEditable(false);
        txtTenCV.setEnabled(true);
        txtTenCV.setText("");
        int ma=1;
        for(int i=0;i<ChucVuBUS.dscv.size();i++){
            ma=ChucVuBUS.dscv.get(i).getMaCV();
        }
        if(ma==1){
            txtMaCV.setText(Integer.toString(1));
        }
        else{
            txtMaCV.setText(Integer.toString(ma+1));
        }
        txtMaCV.setEnabled(false);
    }
    private void ReturnTT(){
        choose2=-2;
        btnThemTT.setBackground(new java.awt.Color(255,255,51));
        txtMaTT.setEnabled(true);
        txtMaTT.setText(Integer.toString(max2));
        txtMaTT.setEditable(false);
        txtTenTT.setEnabled(true);
        txtTenTT.setText("");
        String ma="1";
        for(int i=0;i<DSTinhTrangBUS.dsTinhTrang.size();i++){
            ma=DSTinhTrangBUS.dsTinhTrang.get(i).getMaTinhTrang();
        }
        if(ma.equals("1")){
            txtMaTT.setText("1");
        }
        else{
            txtMaTT.setText(Integer.toString(parseInt(ma)+1));
        }
        txtMaTT.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCapNhatCV;
    private javax.swing.JPanel btnCapNhatTT;
    private javax.swing.JLabel btnReload1;
    private javax.swing.JLabel btnReturnCV;
    private javax.swing.JLabel btnReturnTT;
    private javax.swing.JPanel btnThemCV;
    private javax.swing.JPanel btnThemTT;
    private javax.swing.JPanel btnXoaCV;
    private javax.swing.JPanel btnXoaTT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnChucVu;
    private javax.swing.JPanel pnTinhtrang;
    private javax.swing.JTable tblCV;
    private javax.swing.JTable tblTT;
    private javax.swing.JFormattedTextField txtMaCV;
    private javax.swing.JFormattedTextField txtMaTT;
    private javax.swing.JTextField txtTenCV;
    private javax.swing.JTextField txtTenTT;
    // End of variables declaration//GEN-END:variables
}
