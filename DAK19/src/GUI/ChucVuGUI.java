
package GUI;

import BUS.DocGiaBUS;
import DTO.DocGiaDTO;
import static GUI.TacGiaPanel.pattern2;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import static java.lang.Integer.parseInt;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ChucVuGUI extends javax.swing.JPanel{
    DefaultTableModel model;
    private int choose=-1;
    int max=0;
    public static Pattern pattern2;
    public static Pattern pattern1;
        public static final String SDT_PATTERN="^[0-9]{10}$";
        public static final String NAME_PATTERN="^[a-zA-Z_ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶ\" +\n" +
"            \"ẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợ\" +\n" +
"            \"ụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\\\s]+$";
    public ChucVuGUI() throws Exception {
        initComponents();
        
        
        tblDG.getTableHeader().setOpaque(false);
        tblDG.getTableHeader().setBackground(Color.blue);
        tblDG.getTableHeader().setForeground(new Color(255,255,255));
        tblDG.setRowHeight(28);
        pattern2 = Pattern.compile(SDT_PATTERN);
        pattern1 = Pattern.compile(NAME_PATTERN);
        DocGiaBUS bus= new DocGiaBUS();
        if(DocGiaBUS.dsdg==null){
            bus.DocDSDG();
        }
        Vector header= new Vector();
        header.add("MADG");
        header.add("HỌ");
        header.add("TÊN");
        header.add("NG/SINH");
        header.add("ĐỊA CHỈ");
        header.add("SĐT");
        header.add("TRÌNH ĐỘ");
        header.add("NƠI CÔNG TÁC");
        model= new DefaultTableModel(header,0);
        for(int i=0; i<DocGiaBUS.dsdg.size();i++){
                Object[] objs= {DocGiaBUS.dsdg.get(i).getMaDG(),DocGiaBUS.dsdg.get(i).getHoDG(),DocGiaBUS.dsdg.get(i).getTenDG(),DocGiaBUS.dsdg.get(i).getNgaySinh(),DocGiaBUS.dsdg.get(i).getAddress(),DocGiaBUS.dsdg.get(i).getSoDT(),DocGiaBUS.dsdg.get(i).getTrinhDo(),DocGiaBUS.dsdg.get(i).getNoicongtac()};
                model.addRow(objs);
                max=DocGiaBUS.dsdg.get(i).getMaDG();
            }
        if(max==0){
            max=1;
        }
        else{
            max=max+1;
        }
        txtMaDG.setText(Integer.toString(max));
        txtMaDG.setEnabled(false);
        tblDG.setModel(model);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMaDG = new javax.swing.JFormattedTextField();
        txtMaDG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jLabel2 = new javax.swing.JLabel();
        txtHo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDiachi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        
        jLabel7 = new javax.swing.JLabel();
        txtTrinhdo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNoiCT = new javax.swing.JTextField();
        txtNS = new javax.swing.JFormattedTextField();
        txtNS.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        reloadForm = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnThem = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnSua = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        bthLamthe = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDG = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204,204,204));

        jPanel2.setBackground(new java.awt.Color(44,62,80));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mã ĐG:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Họ:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tên:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ngày sinh:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Địa chỉ:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SĐT:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Trình độ:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nơi công tác:");

        txtNS.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("y-MM-dd"))));

        reloadForm.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        reloadForm.setForeground(new java.awt.Color(255, 255, 255));
        reloadForm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reloadForm.setIcon(new javax.swing.ImageIcon("Image/reload.png")); // NOI18N
        reloadForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reloadFormMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaDG, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtHo))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTen)
                                    .addComponent(txtNS))))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiachi)
                            .addComponent(txtSDT)
                            .addComponent(txtTrinhdo)
                            .addComponent(txtNoiCT, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(reloadForm)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtMaDG, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel5))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)))
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTrinhdo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(txtNoiCT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNS, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reloadForm)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(44,62,80));

        btnThem.setBackground(new java.awt.Color(255, 255, 51));
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Thêm");

        javax.swing.GroupLayout btnThemLayout = new javax.swing.GroupLayout(btnThem);
        btnThem.setLayout(btnThemLayout);
        btnThemLayout.setHorizontalGroup(
            btnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThemLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnThemLayout.setVerticalGroup(
            btnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThemLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel9)
                .addGap(11, 11, 11))
        );

        btnXoa.setBackground(new java.awt.Color(204, 204, 204));
        btnXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Xóa");

        javax.swing.GroupLayout btnXoaLayout = new javax.swing.GroupLayout(btnXoa);
        btnXoa.setLayout(btnXoaLayout);
        btnXoaLayout.setHorizontalGroup(
            btnXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXoaLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel10)
                .addGap(70, 70, 70))
        );
        btnXoaLayout.setVerticalGroup(
            btnXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXoaLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel10)
                .addGap(11, 11, 11))
        );

        btnSua.setBackground(new java.awt.Color(204, 204, 204));
        btnSua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Sửa");

        javax.swing.GroupLayout btnSuaLayout = new javax.swing.GroupLayout(btnSua);
        btnSua.setLayout(btnSuaLayout);
        btnSuaLayout.setHorizontalGroup(
            btnSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSuaLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel11)
                .addGap(69, 69, 69))
        );
        btnSuaLayout.setVerticalGroup(
            btnSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSuaLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel11)
                .addGap(11, 11, 11))
        );

        bthLamthe.setBackground(new java.awt.Color(204, 204, 204));
        bthLamthe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bthLamthe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    bthLamtheMouseClicked(evt);
                } catch (Exception ex) {
                    Logger.getLogger(ChucVuGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        txtSDT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSDTFocusLost(evt);
            }
        });
        jLabel12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Làm thẻ");

        javax.swing.GroupLayout bthLamtheLayout = new javax.swing.GroupLayout(bthLamthe);
        bthLamthe.setLayout(bthLamtheLayout);
        bthLamtheLayout.setHorizontalGroup(
            bthLamtheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bthLamtheLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel12)
                .addGap(62, 62, 62))
        );
        bthLamtheLayout.setVerticalGroup(
            bthLamtheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bthLamtheLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel12)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bthLamthe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bthLamthe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(204,204,204));

        tblDG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã ĐG", "Họ", "Tên", "Ngày sinh", "Địa chỉ", "SĐT", "Trình độ", "Nơi công tác"
            }
        ));
        tblDG.setShowVerticalLines(false);
        tblDG.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tblDG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDGMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDG);
        if (tblDG.getColumnModel().getColumnCount() > 0) {
            tblDG.getColumnModel().getColumn(0).setMaxWidth(60);
            tblDG.getColumnModel().getColumn(1).setMaxWidth(75);
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        if(choose==-1){
            if(txtHo.getText().equals("") || txtTen.getText().equals("") || txtNS.getText().equals("") || txtDiachi.getText().equals("") || txtSDT.getText().equals("") || txtTrinhdo.getText().equals("") || txtNoiCT.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!!");
            }
            else{
                int check=0;
                if(!ktraSDT(txtSDT.getText())){
                JOptionPane.showMessageDialog(null, "SĐT gồm 10 số!!");
                txtSDT.setText("");
                check=1;
                }
                if(!ktraTen(txtHo.getText())){
                JOptionPane.showMessageDialog(null, "Họ không hợp lệ!!");
                txtHo.setText("");
                check=1;
                }
                if(!ktraTen(txtTen.getText())){
                JOptionPane.showMessageDialog(null, "Tên không hợp lệ!!");
                txtTen.setText("");
                check=1;
                }
                if(check==0){
                    DocGiaDTO dg= new DocGiaDTO();
                    txtMaDG.setEnabled(true);
                    dg.setMaDG(parseInt(txtMaDG.getText()));
                    dg.setHoDG(txtHo.getText());
                    dg.setTenDG(txtTen.getText());
                    dg.setNgaySinh(txtNS.getText());
                    dg.setAddress(txtDiachi.getText());
                    dg.setSoDT(parseInt(txtSDT.getText()));
                    dg.setTrinhDo(txtTrinhdo.getText());
                    dg.setNoicongtac(txtNoiCT.getText());

                    DocGiaBUS bus= new DocGiaBUS();
                    try {
                        bus.Them(dg);
                    } catch (Exception ex) {

                    }
                    Vector row= new Vector();
                    row.add(dg.getMaDG());
                    row.add(dg.getHoDG());
                    row.add(dg.getTenDG());
                    row.add(dg.getNgaySinh());
                    row.add(dg.getAddress());
                    row.add(dg.getSoDT());
                    row.add(dg.getTrinhDo());
                    row.add(dg.getNoicongtac());
                    model.addRow(row);
                    tblDG.setModel(model);
                    max=max+1;
                }
            }
        }
        txtMaDG.setEnabled(false); 
    }                                    

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        if(choose!=-1){
            txtMaDG.setEnabled(true);
        int i=tblDG.getSelectedRow();
        if(i>=0){      
            model.removeRow(i);
            tblDG.setModel(model);       
        }
        
        int ma=parseInt(txtMaDG.getText());
        
        
        DocGiaBUS bus= new DocGiaBUS();
        try {
            bus.Xoa(ma);
        } catch (Exception ex) {
            
        }
        
        }
        txtMaDG.setEnabled(false);
    }                                   

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        if(choose!=-1){
            if(txtHo.getText().equals("") || txtTen.getText().equals("") || txtNS.getText().equals("") || txtDiachi.getText().equals("") || txtSDT.getText().equals("") || txtTrinhdo.getText().equals("") || txtNoiCT.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!!");
            }
            else{
                int check=0;
                if(!ktraSDT(txtSDT.getText())){
                JOptionPane.showMessageDialog(null, "SĐT gồm 10 số!!");
                txtSDT.setText("");
                check=1;
                }
                if(!ktraTen(txtHo.getText())){
                JOptionPane.showMessageDialog(null, "Họ không hợp lệ!!");
                txtHo.setText("");
                check=1;
                }
                if(!ktraTen(txtTen.getText())){
                JOptionPane.showMessageDialog(null, "Tên không hợp lệ!!");
                txtTen.setText("");
                check=1;
                }
                if(check==0){
                    txtMaDG.setEnabled(true);
                int i=tblDG.getSelectedRow();

                if(i>=0){
                    model.setValueAt(txtMaDG.getText(),i,0);
                    model.setValueAt(txtHo.getText(),i,1);
                    model.setValueAt(txtTen.getText(),i,2);
                    model.setValueAt(txtNS.getText(),i,3);
                    model.setValueAt(txtDiachi.getText(),i,4);
                    model.setValueAt(txtSDT.getText(),i,5);
                    model.setValueAt(txtTrinhdo.getText(),i,6);
                    model.setValueAt(txtNoiCT.getText(),i,7);
                    tblDG.setModel(model);
                }
                DocGiaDTO dg= new DocGiaDTO();
                dg.setMaDG(parseInt(txtMaDG.getText()));
                dg.setHoDG(txtHo.getText());
                dg.setTenDG(txtTen.getText());
                dg.setNgaySinh(txtNS.getText());
                dg.setAddress(txtDiachi.getText());
                dg.setSoDT(parseInt(txtSDT.getText()));
                dg.setTrinhDo(txtTrinhdo.getText());
                dg.setNoicongtac(txtNoiCT.getText());

                txtMaDG.setEnabled(false);
                DocGiaBUS bus= new DocGiaBUS();
                try {
                    bus.Sua(dg);
                } catch (Exception ex) {

                }
                }}
                }
    }                                   

    private void tblDGMouseClicked(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
        int i=tblDG.getSelectedRow();
        choose=parseInt(tblDG.getModel().getValueAt(i,0).toString());
        btnSua.setBackground(new java.awt.Color(0, 51, 204));
        btnThem.setBackground(new java.awt.Color(204,204,204));
        btnXoa.setBackground(new java.awt.Color(255, 51, 51));
        bthLamthe.setBackground(new java.awt.Color(51, 255, 51));
        
        txtMaDG.setEnabled(true);
        txtMaDG.setText(tblDG.getModel().getValueAt(i,0).toString());
        txtMaDG.setEnabled(false);
        txtHo.setText(tblDG.getModel().getValueAt(i,1).toString());
        txtTen.setText(tblDG.getModel().getValueAt(i,2).toString());
        txtNS.setText(tblDG.getModel().getValueAt(i,3).toString());
        txtDiachi.setText(tblDG.getModel().getValueAt(i,4).toString());
        txtSDT.setText(tblDG.getModel().getValueAt(i,5).toString());
        txtTrinhdo.setText(tblDG.getModel().getValueAt(i,6).toString());
        txtNoiCT.setText(tblDG.getModel().getValueAt(i,7).toString());
    }                                  

    private void bthLamtheMouseClicked(java.awt.event.MouseEvent evt) throws Exception {                                       
        if(choose!=-1){
            TheThuVienFRM the=null;
            if(the==null){
                the= new TheThuVienFRM(parseInt(txtMaDG.getText()));
                the.setVisible(true);
            }
        }
    }                
    private void txtSDTFocusLost(java.awt.event.FocusEvent evt) {                                
        // TODO add your handling code here:
        if(!ktraSDT(txtSDT.getText())){
            JOptionPane.showMessageDialog(null, "SĐT gồm 10 số!!");
            txtSDT.setText("");
        }
    }
    public static boolean ktraSDT(final String hex) {

            Matcher matcher = pattern2.matcher(hex);
            return matcher.matches();
    }
    public static boolean ktraTen(final String hex) {

            Matcher matcher = pattern1.matcher(hex);
            return matcher.matches();
    }
    
    
    private void reloadFormMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        choose=-1;
        btnSua.setBackground(new java.awt.Color(204, 204, 204));
        btnThem.setBackground(new java.awt.Color(255,255,51));
        btnXoa.setBackground(new java.awt.Color(204, 204, 204));
        bthLamthe.setBackground(new java.awt.Color(204, 204, 204));
        
        txtMaDG.setEnabled(true);
        txtMaDG.setText(Integer.toString(max));
        txtMaDG.setEnabled(false);
        txtHo.setText("");
        txtTen.setText("");
        txtNS.setText("");
        txtDiachi.setText("");
        txtSDT.setText("");
        txtTrinhdo.setText("");
        txtNoiCT.setText("");
        
    }                                       


    // Variables declaration - do not modify                     
    private javax.swing.JPanel btnSua;
    private javax.swing.JPanel bthLamthe;
    private javax.swing.JPanel btnThem;
    private javax.swing.JPanel btnXoa;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel reloadForm;
    private javax.swing.JTable tblDG;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtHo;
    private javax.swing.JFormattedTextField txtMaDG;
    private javax.swing.JFormattedTextField txtNS;
    private javax.swing.JTextField txtNoiCT;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTrinhdo;
}
