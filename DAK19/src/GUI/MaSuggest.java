
package GUI;


import BUS.NhaCungCapBUS;
import BUS.NhanVienBUS;
import BUS.TheThuVienBUS;
import DTO.NhaCungCapDTO;
import DTO.NhanVienDTO;
import DTO.TheThuVienDTO;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MaSuggest extends javax.swing.JFrame {
    DefaultTableModel model;
    int i=-1;
    String flag;
    
    public MaSuggest(String p) throws Exception {
        initComponents();
        if(p.equals("panelMaNV1") || p.equals("panelMaNV2") || p.equals("panelMaNV3")){
            PanelMaNV.setVisible(true);
            PanelMaThe.setVisible(false);
            PanelMaNCC.setVisible(false);
            PanelMaThe.setSize(0, 0);
            PanelMaNCC.setSize(0, 0);
            this.flag=p;
            
            this.setSize(548, 469);
            
            NhanVienBUS bus= new NhanVienBUS();
            if(NhanVienBUS.dsnv==null){
                bus.DocDSNV();
            }
            Vector header= new Vector();
            header.add("Mã NV");
            header.add("Họ NV");
            header.add("Tên NV");

            model= new DefaultTableModel(header,0);
            for(int i=0; i<NhanVienBUS.dsnv.size();i++){
                    Object[] objs= {NhanVienBUS.dsnv.get(i).getMaNV(),NhanVienBUS.dsnv.get(i).getHo(),NhanVienBUS.dsnv.get(i).getTen()};
                    model.addRow(objs);
                }
            tblNV.setModel(model);
        }
        if(p.equals("panelMaThe")){
            PanelMaNV.setVisible(false);
            PanelMaNCC.setVisible(false);
            PanelMaThe.setVisible(true);
            PanelMaNV.setSize(0, 0);
            PanelMaNCC.setSize(0, 0);
            this.setSize(550, 469);
            
            PanelMaThe.setBounds(0, 0, 549, 433);
            
            
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
                }
            tblThe.setModel(model);
        }
        if(p.equals("panelMaNCC")){
            PanelMaNV.setVisible(false);
            PanelMaThe.setVisible(false);
            PanelMaNCC.setVisible(true);
            PanelMaNV.setSize(0, 0);
            PanelMaThe.setSize(0, 0);
            this.setSize(550, 469);
            
            PanelMaNCC.setBounds(0, 0, 550, 467);
            
            NhaCungCapBUS bus= new NhaCungCapBUS();
            if(NhaCungCapBUS.arrayncc==null){
                bus.Doc();
            }
            Vector header= new Vector();
            header.add("Mã NCC");
            header.add("Tên NCC");
            header.add("Địa chỉ");
            header.add("Email");
            header.add("SĐT");

            model= new DefaultTableModel(header,0);
            for(int i=0; i<NhaCungCapBUS.arrayncc.size();i++){
                    Object[] objs= {NhaCungCapBUS.arrayncc.get(i).getMaNCC(),NhaCungCapBUS.arrayncc.get(i).getTenNCC(),NhaCungCapBUS.arrayncc.get(i).getDiaChiNCC(),NhaCungCapBUS.arrayncc.get(i).getEmailNCC(),NhaCungCapBUS.arrayncc.get(i).getSoDTNCC()};
                    model.addRow(objs);
                }
            tblNCC.setModel(model);
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMaThe = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSearchThe = new javax.swing.JTextField();
        ComboSearch = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblThe = new javax.swing.JTable();
        btnXacnhanThe = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnQuaylaiThe = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        PanelMaNV = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNV = new javax.swing.JTable();
        btnXacnhan = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnQuaylai = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        PanelMaNCC = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblNCC = new javax.swing.JTable();
        txtSearchNCC = new javax.swing.JTextField();
        ComboSearch2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnXacnhanNCC = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnQuaylaiNCC = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        jLabel2.setText("Chọn Thẻ Thư Viện");

        txtSearchThe.setForeground(new java.awt.Color(102, 102, 102));
        txtSearchThe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchTheActionPerformed(evt);
            }
        });

        ComboSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã Thẻ", "Mã Độc Giả" }));

        tblThe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Thẻ", "Mã Độc Giả", "Ngày Làm Thẻ", "Ngày Hết Hạn"
            }
        ));
        tblThe.setRowHeight(28);
        tblThe.setSelectionBackground(new java.awt.Color(255, 51, 51));
        tblThe.setShowVerticalLines(false);
        jScrollPane2.setViewportView(tblThe);

        btnXacnhanThe.setBackground(new java.awt.Color(255, 255, 0));
        btnXacnhanThe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXacnhanThe.setDoubleBuffered(false);
        btnXacnhanThe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXacnhanTheMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Xác Nhận");

        javax.swing.GroupLayout btnXacnhanTheLayout = new javax.swing.GroupLayout(btnXacnhanThe);
        btnXacnhanThe.setLayout(btnXacnhanTheLayout);
        btnXacnhanTheLayout.setHorizontalGroup(
            btnXacnhanTheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXacnhanTheLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(22, 22, 22))
        );
        btnXacnhanTheLayout.setVerticalGroup(
            btnXacnhanTheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnXacnhanTheLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        btnQuaylaiThe.setBackground(new java.awt.Color(0, 153, 153));
        btnQuaylaiThe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuaylaiThe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuaylaiTheMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quay lại");

        javax.swing.GroupLayout btnQuaylaiTheLayout = new javax.swing.GroupLayout(btnQuaylaiThe);
        btnQuaylaiThe.setLayout(btnQuaylaiTheLayout);
        btnQuaylaiTheLayout.setHorizontalGroup(
            btnQuaylaiTheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnQuaylaiTheLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addGap(27, 27, 27))
        );
        btnQuaylaiTheLayout.setVerticalGroup(
            btnQuaylaiTheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnQuaylaiTheLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelMaTheLayout = new javax.swing.GroupLayout(PanelMaThe);
        PanelMaThe.setLayout(PanelMaTheLayout);
        PanelMaTheLayout.setHorizontalGroup(
            PanelMaTheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMaTheLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(PanelMaTheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelMaTheLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(ComboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchThe, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(PanelMaTheLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btnXacnhanThe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnQuaylaiThe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMaTheLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(176, 176, 176))
        );
        PanelMaTheLayout.setVerticalGroup(
            PanelMaTheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMaTheLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(PanelMaTheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchThe, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelMaTheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnQuaylaiThe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXacnhanThe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        jLabel1.setText("Chọn Nhân Viên");

        txtSearch.setForeground(new java.awt.Color(102, 102, 102));
        txtSearch.setText("Tên Nhân Viên");
        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtSearchMouseExited(evt);
            }
        });
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        tblNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Họ NV", "Tên NV"
            }
        ));
        tblNV.setRowHeight(28);
        tblNV.setSelectionBackground(new java.awt.Color(255, 51, 51));
        tblNV.setShowVerticalLines(false);
        tblNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNV);

        btnXacnhan.setBackground(new java.awt.Color(255, 255, 0));
        btnXacnhan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXacnhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXacnhanMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Xác Nhận");

        javax.swing.GroupLayout btnXacnhanLayout = new javax.swing.GroupLayout(btnXacnhan);
        btnXacnhan.setLayout(btnXacnhanLayout);
        btnXacnhanLayout.setHorizontalGroup(
            btnXacnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnXacnhanLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(20, 20, 20))
        );
        btnXacnhanLayout.setVerticalGroup(
            btnXacnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnXacnhanLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        btnQuaylai.setBackground(new java.awt.Color(0, 153, 153));
        btnQuaylai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuaylai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuaylaiMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quay Lại");

        javax.swing.GroupLayout btnQuaylaiLayout = new javax.swing.GroupLayout(btnQuaylai);
        btnQuaylai.setLayout(btnQuaylaiLayout);
        btnQuaylaiLayout.setHorizontalGroup(
            btnQuaylaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnQuaylaiLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addGap(21, 21, 21))
        );
        btnQuaylaiLayout.setVerticalGroup(
            btnQuaylaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnQuaylaiLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelMaNVLayout = new javax.swing.GroupLayout(PanelMaNV);
        PanelMaNV.setLayout(PanelMaNVLayout);
        PanelMaNVLayout.setHorizontalGroup(
            PanelMaNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMaNVLayout.createSequentialGroup()
                .addGroup(PanelMaNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMaNVLayout.createSequentialGroup()
                        .addContainerGap(40, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelMaNVLayout.createSequentialGroup()
                        .addGroup(PanelMaNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelMaNVLayout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(btnXacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(btnQuaylai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelMaNVLayout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(jLabel1))
                            .addGroup(PanelMaNVLayout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        PanelMaNVLayout.setVerticalGroup(
            PanelMaNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMaNVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(PanelMaNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuaylai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        tblNCC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã NCC", "Tên NCC", "Địa chỉ", "Email", "SĐT"
            }
        ));
        tblNCC.setRowHeight(28);
        tblNCC.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tblNCC.setShowVerticalLines(false);
        jScrollPane3.setViewportView(tblNCC);

        txtSearchNCC.setForeground(new java.awt.Color(102, 102, 102));
        txtSearchNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchNCCActionPerformed(evt);
            }
        });

        ComboSearch2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã NCC", "Tên NCC" }));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        jLabel7.setText("Chọn Nhà Cung Cấp");

        btnXacnhanNCC.setBackground(new java.awt.Color(255, 255, 0));
        btnXacnhanNCC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXacnhanNCC.setDoubleBuffered(false);
        btnXacnhanNCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXacnhanNCCMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Xác Nhận");

        javax.swing.GroupLayout btnXacnhanNCCLayout = new javax.swing.GroupLayout(btnXacnhanNCC);
        btnXacnhanNCC.setLayout(btnXacnhanNCCLayout);
        btnXacnhanNCCLayout.setHorizontalGroup(
            btnXacnhanNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXacnhanNCCLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addGap(22, 22, 22))
        );
        btnXacnhanNCCLayout.setVerticalGroup(
            btnXacnhanNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnXacnhanNCCLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        btnQuaylaiNCC.setBackground(new java.awt.Color(0, 153, 153));
        btnQuaylaiNCC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuaylaiNCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuaylaiNCCMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Quay lại");

        javax.swing.GroupLayout btnQuaylaiNCCLayout = new javax.swing.GroupLayout(btnQuaylaiNCC);
        btnQuaylaiNCC.setLayout(btnQuaylaiNCCLayout);
        btnQuaylaiNCCLayout.setHorizontalGroup(
            btnQuaylaiNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnQuaylaiNCCLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel9)
                .addGap(27, 27, 27))
        );
        btnQuaylaiNCCLayout.setVerticalGroup(
            btnQuaylaiNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnQuaylaiNCCLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelMaNCCLayout = new javax.swing.GroupLayout(PanelMaNCC);
        PanelMaNCC.setLayout(PanelMaNCCLayout);
        PanelMaNCCLayout.setHorizontalGroup(
            PanelMaNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMaNCCLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(PanelMaNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMaNCCLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMaNCCLayout.createSequentialGroup()
                        .addComponent(ComboSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelMaNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtSearchNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97))))
            .addGroup(PanelMaNCCLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(btnXacnhanNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnQuaylaiNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        PanelMaNCCLayout.setVerticalGroup(
            PanelMaNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMaNCCLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(PanelMaNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(PanelMaNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXacnhanNCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQuaylaiNCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelMaThe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelMaNCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMaThe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelMaNCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuaylaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuaylaiMouseClicked
        // TODO add your handling code here:
        NhanVienBUS bus= new NhanVienBUS();
        if(NhanVienBUS.dsnv==null){
            try {
                bus.DocDSNV();
            } catch (Exception ex) {
                Logger.getLogger(MaSuggest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Vector header= new Vector();
        header.add("Mã NV");
        header.add("Họ NV");
        header.add("Tên NV");

        model= new DefaultTableModel(header,0);
        for(int i=0; i<NhanVienBUS.dsnv.size();i++){
            Object[] objs= {NhanVienBUS.dsnv.get(i).getMaNV(),NhanVienBUS.dsnv.get(i).getHo(),NhanVienBUS.dsnv.get(i).getTen()};
            model.addRow(objs);
        }
        tblNV.setModel(model);
    }//GEN-LAST:event_btnQuaylaiMouseClicked

    private void btnXacnhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXacnhanMouseClicked
        // TODO add your handling code here:
        if(flag.equals("panelMaNV1")){
        ThemPMFRM.setMaNV(tblNV.getModel().getValueAt(i,0).toString());
        dispose();
        }
        if(flag.equals("panelMaNV2")){
        ThemPTFRM.setMaNV(tblNV.getModel().getValueAt(i,0).toString());
        dispose();
        }
        if(flag.equals("panelMaNV3")){
        ThemPNFRM.setMaNV(tblNV.getModel().getValueAt(i,0).toString());
        dispose();
        }
    }//GEN-LAST:event_btnXacnhanMouseClicked

    private void tblNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNVMouseClicked
        // TODO add your handling code here:
        i=tblNV.getSelectedRow();
        btnXacnhan.setBackground(new java.awt.Color(255,255,0));
    }//GEN-LAST:event_tblNVMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
        NhanVienBUS bus= new NhanVienBUS();
        ArrayList <NhanVienDTO> kq= new ArrayList <NhanVienDTO>();
        String ten=txtSearch.getText();
        kq=bus.timkiemtheoTen(ten);

        if(kq!=null){
            model=null;
            Vector header= new Vector();
            header.add("Mã NV");
            header.add("Họ NV");
            header.add("Tên NV");
            model= new DefaultTableModel(header,0);
            for(int i=0; i<kq.size();i++){
                Object[] objs= {kq.get(i).getMaNV(),kq.get(i).getHo(),kq.get(i).getTen()};
                model.addRow(objs);
            }
            tblNV.setModel(model);
        }
        else{
            JOptionPane.showMessageDialog(null, "Kết quả tìm kiếm không tồn tại!!");
        }
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseExited
        // TODO add your handling code here:
        if(txtSearch.equals("")){
            txtSearch.setText("Tên Nhân Viên");
        }
    }//GEN-LAST:event_txtSearchMouseExited

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked
        // TODO add your handling code here:
        txtSearch.setText("");
    }//GEN-LAST:event_txtSearchMouseClicked

    private void btnXacnhanTheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXacnhanTheMouseClicked
        // TODO add your handling code here:
        int j=tblThe.getSelectedRow();
        if(j>=0){
        ThemPMFRM.setMaThe(tblThe.getModel().getValueAt(j,0).toString());
        dispose();
        }
    }//GEN-LAST:event_btnXacnhanTheMouseClicked

    private void btnQuaylaiTheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuaylaiTheMouseClicked
        // TODO add your handling code here:
        TheThuVienBUS bus= new TheThuVienBUS();
            if(TheThuVienBUS.dsthe==null){
            try {
                bus.DocDSThe();
            } catch (Exception ex) {
                Logger.getLogger(MaSuggest.class.getName()).log(Level.SEVERE, null, ex);
            }
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
                }
            tblThe.setModel(model);
    }//GEN-LAST:event_btnQuaylaiTheMouseClicked

    private void txtSearchTheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchTheActionPerformed
        if(ComboSearch.getSelectedIndex()==0){
            TheThuVienBUS bus= new TheThuVienBUS();
            ArrayList <TheThuVienDTO> kq= new ArrayList <TheThuVienDTO>();
            int maThe=parseInt(txtSearchThe.getText());
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
            int maDG=parseInt(txtSearchThe.getText());
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
    }//GEN-LAST:event_txtSearchTheActionPerformed

    private void txtSearchNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchNCCActionPerformed
        // TODO add your handling code here:
        
        if(ComboSearch2.getSelectedIndex()==0){
            NhaCungCapBUS bus= new NhaCungCapBUS();
            ArrayList <NhaCungCapDTO> kq= new ArrayList <NhaCungCapDTO>();
            int ma=parseInt(txtSearchNCC.getText());
            kq=bus.Timkiemma(ma);

            if(kq!=null){
                model=null;
                Vector header= new Vector();
                header.add("Mã NCC");
                header.add("Tên NCC");
                header.add("Địa chỉ");
                header.add("Email");
                header.add("SĐT");
                model= new DefaultTableModel(header,0);
                for(int i=0; i<kq.size();i++){
                    Object[] objs= {kq.get(i).getMaNCC(),kq.get(i).getTenNCC(),kq.get(i).getDiaChiNCC(),kq.get(i).getEmailNCC(),kq.get(i).getSoDTNCC()};
                    model.addRow(objs);
                }
            tblNCC.setModel(model);
        }
        else{
            JOptionPane.showMessageDialog(null, "Kết quả tìm kiếm không tồn tại!!");
        }
        }
        if(ComboSearch2.getSelectedIndex()==1){
            NhaCungCapBUS bus= new NhaCungCapBUS();
            ArrayList <NhaCungCapDTO> kq= new ArrayList <NhaCungCapDTO>();
            String ten=txtSearchNCC.getText();
            kq=bus.Timkiemten(ten);

            if(kq!=null){
                model=null;
                Vector header= new Vector();
                header.add("Mã NCC");
                header.add("Tên NCC");
                header.add("Địa chỉ");
                header.add("Email");
                header.add("SĐT");
                model= new DefaultTableModel(header,0);
                for(int i=0; i<kq.size();i++){
                    Object[] objs= {kq.get(i).getMaNCC(),kq.get(i).getTenNCC(),kq.get(i).getDiaChiNCC(),kq.get(i).getEmailNCC(),kq.get(i).getSoDTNCC()};
                    model.addRow(objs);
                }
            tblNCC.setModel(model);
        }
        else{
            JOptionPane.showMessageDialog(null, "Kết quả tìm kiếm không tồn tại!!");
        }
        }
    }//GEN-LAST:event_txtSearchNCCActionPerformed

    private void btnXacnhanNCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXacnhanNCCMouseClicked
        // TODO add your handling code here:
        int j=tblNCC.getSelectedRow();
        if(j>=0){
        ThemPNFRM.setMaNCC(tblNCC.getModel().getValueAt(j,0).toString());
        dispose();
        }
    }//GEN-LAST:event_btnXacnhanNCCMouseClicked

    private void btnQuaylaiNCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuaylaiNCCMouseClicked
        // TODO add your handling code here:
        NhaCungCapBUS bus= new NhaCungCapBUS();
            if(NhaCungCapBUS.arrayncc==null){
            try {
                bus.Doc();
            } catch (Exception ex) {
                Logger.getLogger(MaSuggest.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            Vector header= new Vector();
            header.add("Mã NCC");
            header.add("Tên NCC");
            header.add("Địa chỉ");
            header.add("Email");
            header.add("SĐT");

            model= new DefaultTableModel(header,0);
            for(int i=0; i<NhaCungCapBUS.arrayncc.size();i++){
                    Object[] objs= {NhaCungCapBUS.arrayncc.get(i).getMaNCC(),NhaCungCapBUS.arrayncc.get(i).getTenNCC(),NhaCungCapBUS.arrayncc.get(i).getDiaChiNCC(),NhaCungCapBUS.arrayncc.get(i).getEmailNCC(),NhaCungCapBUS.arrayncc.get(i).getSoDTNCC()};
                    model.addRow(objs);
                }
            tblNCC.setModel(model);
    }//GEN-LAST:event_btnQuaylaiNCCMouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MaSuggest("not").setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(MaSuggest.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboSearch;
    private javax.swing.JComboBox<String> ComboSearch2;
    private javax.swing.JPanel PanelMaNCC;
    private javax.swing.JPanel PanelMaNV;
    private javax.swing.JPanel PanelMaThe;
    private javax.swing.JPanel btnQuaylai;
    private javax.swing.JPanel btnQuaylaiNCC;
    private javax.swing.JPanel btnQuaylaiThe;
    private javax.swing.JPanel btnXacnhan;
    private javax.swing.JPanel btnXacnhanNCC;
    private javax.swing.JPanel btnXacnhanThe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblNCC;
    private javax.swing.JTable tblNV;
    private javax.swing.JTable tblThe;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSearchNCC;
    private javax.swing.JTextField txtSearchThe;
    // End of variables declaration//GEN-END:variables
}
