
package GUI; //Chuyển package sang GUI
                                                                    // Tacgia sang thành TacGia
import BUS.DauSachBUS;
import BUS.NhaCungCapBUS;
import static BUS.NhaCungCapBUS.arrayncc;
import BUS.PhieuNhapSachBUS;
import BUS.TacGiaBUS;
import DTO.NhaCungCapDTO;
import DTO.TacGiaDTO;
import java.awt.Color;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;


public class TacGiaPanel extends javax.swing.JPanel {
        DefaultTableModel model =  new DefaultTableModel();
        DefaultTableModel modelncc =  new DefaultTableModel();
        int max1=0,max2=0;
        public static Pattern pattern1;
        public static Pattern pattern2;
        public static Pattern pattern3;
        public static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        public static final String SDT_PATTERN="^[0-9]{10}$";
        public static final String NAME_PATTERN="^[a-zA-Z_ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶ\" +\n" +
"            \"ẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợ\" +\n" +
"            \"ụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\\\s]+$";
    
    public TacGiaPanel() throws Exception {
        initComponents();
        btReset.setIcon(new ImageIcon("Image/reload.png"));
        btReset1.setIcon(new ImageIcon("Image/reload.png"));
        pattern1 = Pattern.compile(EMAIL_PATTERN);
        pattern2 = Pattern.compile(SDT_PATTERN);
        pattern3 = Pattern.compile(NAME_PATTERN);
        TacGiaBUS bus= new TacGiaBUS();
        if(dstg == null) bus.DocTG();
        Vector header= new Vector();
        header.add("Mã Tác giả");
        header.add("Họ");
        header.add("Tên");
        header.add("Số điện thoại");
        header.add("Địa chỉ");
        model= new DefaultTableModel(header,0);
        for(int i=0; i<TacGiaBUS.dstg.size();i++){
                Object[] objs= {TacGiaBUS.dstg.get(i).getMaTG(),TacGiaBUS.dstg.get(i).getHoTG(),TacGiaBUS.dstg.get(i).getTenTG(),TacGiaBUS.dstg.get(i).getsDT(),TacGiaBUS.dstg.get(i).getAddress()};
                model.addRow(objs);
                max1=TacGiaBUS.dstg.get(i).getMaTG();
            }
        if(max1==0){
            max1=1;
        }
        else{
            max1=max1+1;
        }
        txMa.setText(Integer.toString(max1));
        txMa.setEnabled(false);
            tbTacgia.setModel(model);
        NhaCungCapBUS nccbus= new NhaCungCapBUS();
        if(arrayncc == null) nccbus.Doc();
        Vector headerncc= new Vector();
        headerncc.add("Mã Nhà cung cấp");
        headerncc.add("Tên");
        headerncc.add("Địa chỉ");
        headerncc.add("Email");
        headerncc.add("Số điện thoại");
        modelncc= new DefaultTableModel(headerncc,0);
        for(int i=0; i<NhaCungCapBUS.arrayncc.size();i++){
                Object[] objs= {NhaCungCapBUS.arrayncc.get(i).getMaNCC(),NhaCungCapBUS.arrayncc.get(i).getTenNCC(),NhaCungCapBUS.arrayncc.get(i).getDiaChiNCC(),NhaCungCapBUS.arrayncc.get(i).getEmailNCC(),NhaCungCapBUS.arrayncc.get(i).getSoDTNCC()};
                modelncc.addRow(objs);
                max2=parseInt(NhaCungCapBUS.arrayncc.get(i).getMaNCC());
            }
        if(max2==0){
            max2=1;
        }
        else{
            max2=max2+1;
        }
        txMa1.setText(Integer.toString(max2));
        txMa1.setEnabled(false);
            tbNhaCungCap.setModel(modelncc);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btThem1 = new javax.swing.JButton();
        btSua1 = new javax.swing.JButton();
        btXoa1 = new javax.swing.JButton();
        btTimkiem1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txTen1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txDiachi1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btReset1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txMa1 = new javax.swing.JFormattedTextField();
        txSdt1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbNhaCungCap = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txHo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txTen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txDiachi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txMa = new javax.swing.JFormattedTextField();
        txSdt = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btTimkiem = new javax.swing.JButton();
        btReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTacgia = new javax.swing.JTable();

        btThem1.setBackground(new java.awt.Color(0, 255, 0));
        btThem1.setText("Thêm");
        btThem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThem1ActionPerformed(evt);
            }
        });

        btSua1.setBackground(new java.awt.Color(255, 255, 0));
        btSua1.setText("Sửa");
        btSua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSua1ActionPerformed(evt);
            }
        });

        btXoa1.setBackground(new java.awt.Color(255, 0, 0));
        btXoa1.setText("Xóa");
        btXoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoa1ActionPerformed(evt);
            }
        });

        btTimkiem1.setBackground(new java.awt.Color(0, 255, 204));
        btTimkiem1.setText("Tím kiếm");
        btTimkiem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimkiem1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btSua1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btTimkiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btXoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSua1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btXoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btTimkiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mã nhà cung cấp");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Tên nhà cung cấp*");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Địa chỉ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Email");

        txEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txEmailFocusLost(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Số điện thoại");

        btReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReset1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Nhà cung cấp");

        txMa1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txSdt1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txSdt1FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txDiachi1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txSdt1))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txMa1))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txTen1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btReset1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btReset1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMa1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txDiachi1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txSdt1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txTen1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tbNhaCungCap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tbNhaCungCap.setRowHeight(28);
        tbNhaCungCap.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tbNhaCungCap.setShowVerticalLines(false);
        tbNhaCungCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNhaCungCapMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbNhaCungCap);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mã tác giả");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Họ*");

        txHo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tên*");

        txTen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Số diện thoại");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Địa chỉ");

        txDiachi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Tác giả");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
        });

        txMa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txSdt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txSdtFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txTen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txHo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txDiachi)
                            .addComponent(txMa)
                            .addComponent(txSdt))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txMa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txHo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txTen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btThem.setBackground(new java.awt.Color(0, 255, 0));
        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btSua.setBackground(new java.awt.Color(255, 255, 0));
        btSua.setText("Sửa");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btXoa.setBackground(new java.awt.Color(255, 0, 0));
        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btTimkiem.setBackground(new java.awt.Color(153, 255, 255));
        btTimkiem.setText("Tìm kiếm theo tên");
        btTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimkiemActionPerformed(evt);
            }
        });

        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btTimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btReset, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btReset, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tbTacgia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tbTacgia.setRowHeight(28);
        tbTacgia.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tbTacgia.setShowVerticalLines(false);
        tbTacgia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTacgiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTacgia);
        if (tbTacgia.getColumnModel().getColumnCount() > 0) {
            tbTacgia.getColumnModel().getColumn(0).setMinWidth(70);
            tbTacgia.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1003, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        if(txHo.getText().equals("") || txTen.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ họ và tên tác giả!!");
        }
        else{
            int flag=0;
            if(!ktraTen(txHo.getText())){
                JOptionPane.showMessageDialog(null, "Họ không hợp lệ!!");
                flag=1;
            }
            if(!ktraTen(txTen.getText())){
                JOptionPane.showMessageDialog(null, "Tên không hợp lệ!!");
                flag=1;
            }
            if(!ktraSDT(txSdt.getText())){
                flag=1;
            }
            if(flag==0){
                TacGiaDTO tacgia= new TacGiaDTO();
                txMa.setEnabled(true);
                tacgia.setMaTG(Integer.parseInt(txMa.getText()));
                tacgia.setHoTG(txHo.getText());
                tacgia.setTenTG(txTen.getText());
                tacgia.setsDT(Integer.parseInt(txSdt.getText()));
                tacgia.setAddress(txDiachi.getText());
                TacGiaBUS bus = new TacGiaBUS();
                boolean check = true;
                for(TacGiaDTO tg : TacGiaBUS.dstg)
                {
                    if(tg.getMaTG()==tacgia.getMaTG()) check=false;
                }
                if(check){
                    try {
                        bus.Them(tacgia);
                    } catch (Exception ex) {
                        Logger.getLogger(TacGiaPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Vector row=new Vector();
                    row.add(tacgia.getMaTG());
                    row.add(tacgia.getHoTG());
                    row.add(tacgia.getTenTG());
                    row.add(tacgia.getsDT());
                    row.add(tacgia.getAddress());
                    model.addRow(row);
                    tbTacgia.setModel(model);
                    SetTextBlank();
                    max1=max1+1;
                }
                else {
                    showMessageDialog(null, "Mã tác giả bị trùng. Vui lòng thử lại");
                    txMa.requestFocus();
                }
            }
        }
        txMa.setEnabled(false);
    }//GEN-LAST:event_btThemActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        // TODO add your handling code here:
        if(txHo.getText().equals("") || txTen.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ họ và tên tác giả!!");
        }
        else{
            int flag=0;
            if(!ktraTen(txHo.getText())){
                JOptionPane.showMessageDialog(null, "Họ không hợp lệ!!");
                flag=1;
            }
            if(!ktraTen(txTen.getText())){
                JOptionPane.showMessageDialog(null, "Tên không hợp lệ!!");
                flag=1;
            }
            if(!ktraSDT(txSdt.getText()) && !txSdt.getText().equals("0")){
                flag=1;
            }
            if(flag==0){
                int i= tbTacgia.getSelectedRow();
                if(i>=0){
                    txMa.setEnabled(true);
                    TacGiaDTO tacgia= new TacGiaDTO();
                    tacgia.setMaTG(Integer.parseInt(txMa.getText()));
                    tacgia.setHoTG(txHo.getText());
                    tacgia.setTenTG(txTen.getText());
                    tacgia.setsDT(Integer.parseInt(txSdt.getText()));
                    tacgia.setAddress(txDiachi.getText());
                    TacGiaBUS bus = new TacGiaBUS();
                    boolean check = false;
                    for(TacGiaDTO tg : TacGiaBUS.dstg)
                    {
                        if(tg.getMaTG()==tacgia.getMaTG()) check=true;
                    }
                    if(check){
                        try {
                            bus.Sua(tacgia,i);
                        } catch (Exception ex) {
                            Logger.getLogger(TacGiaPanel.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        model.setValueAt(tacgia.getMaTG(), i, 0);
                        model.setValueAt(tacgia.getHoTG(), i, 1);
                        model.setValueAt(tacgia.getTenTG(), i, 2);
                        model.setValueAt(tacgia.getsDT(), i, 3);
                        model.setValueAt(tacgia.getAddress(), i, 4);
                        SetTextBlank();
                    }
                    else {
                        showMessageDialog(null, "Thiếu Mã tác giả. Vui lòng thử lại");
                        txMa.requestFocus();
                    }
                }
    }}
        txMa.setEnabled(false);
    }//GEN-LAST:event_btSuaActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
        DauSachBUS sc= new DauSachBUS();
                if(DauSachBUS.dsds==null){
                    try {
                        sc.DocDS();
                    } catch (Exception ex) {
                        Logger.getLogger(ChucVu_DSTinhTrangGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                int check=0;
                for(int j=0;j<DauSachBUS.dsds.size();j++){
                    if(DauSachBUS.dsds.get(j).getMaTG()==parseInt(txMa.getText())){
                        check=1;
                    }
                }
        if(check==0){
            int i= tbTacgia.getSelectedRow();
            txMa.setEnabled(true);
            if(i>=0){
                TacGiaDTO tacgia= new TacGiaDTO();
                tacgia.setMaTG(Integer.parseInt(txMa.getText()));
                tacgia.setHoTG(txHo.getText());
                tacgia.setTenTG(txTen.getText());
                tacgia.setsDT(Integer.parseInt(txSdt.getText()));
                tacgia.setAddress(txDiachi.getText());
                TacGiaBUS bus = new TacGiaBUS();
                try {
                    bus.Xoa(tacgia.getMaTG());
                } catch (Exception ex) {
                    Logger.getLogger(TacGiaPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                model.removeRow(i);
                tbTacgia.setModel(model);
            }
            SetTextBlank();
        }
        else{
            JOptionPane.showMessageDialog(null, "Không thể xóa tác giả này");
        }
        txMa.setEnabled(false);
    }//GEN-LAST:event_btXoaActionPerformed

    private void btTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimkiemActionPerformed
        // TODO add your handling code here:
        DefaultTableModel m =new DefaultTableModel();
        ArrayList<TacGiaDTO> kq = new ArrayList<TacGiaDTO>();
        String ten= txTen.getText();
        TacGiaBUS bus = new TacGiaBUS();
        kq = bus.Timkiem(ten);
        Vector header= new Vector();
        header.add("Mã Tác giả");
        header.add("Họ");
        header.add("Tên");
        header.add("Số điện thoại");
        header.add("Địa chỉ");
        m= new DefaultTableModel(header,0);
        for(TacGiaDTO tacgia : kq)
        {
            Vector row=new Vector();
            row.add(tacgia.getMaTG());
            row.add(tacgia.getHoTG());
            row.add(tacgia.getTenTG());
            row.add(tacgia.getsDT());
            row.add(tacgia.getAddress());
            m.addRow(row);
        }
        tbTacgia.setModel(m);
    }//GEN-LAST:event_btTimkiemActionPerformed

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        // TODO add your handling code here:
        Vector header= new Vector();
        header.add("Mã Tác giả");
        header.add("Họ");
        header.add("Tên");
        header.add("Số điện thoại");
        header.add("Địa chỉ");
        model= new DefaultTableModel(header,0);
        for(TacGiaDTO tacgia : TacGiaBUS.dstg)
        {
            Vector row=new Vector();
            row.add(tacgia.getMaTG());
            row.add(tacgia.getHoTG());
            row.add(tacgia.getTenTG());
            row.add(tacgia.getsDT());
            row.add(tacgia.getAddress());
            model.addRow(row);
        }
        tbTacgia.setModel(model);
        SetTextBlank();
    }//GEN-LAST:event_btResetActionPerformed

    private void tbTacgiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTacgiaMouseClicked
        // TODO add your handling code here:
        txMa.setEnabled(true);
        int  i=tbTacgia.getSelectedRow();
        //JOptionPane.showMessageDialog(null, "row:"+i);
        txMa.setText(tbTacgia.getModel().getValueAt(i, 0).toString());
        txHo.setText(tbTacgia.getModel().getValueAt(i, 1).toString());
        txTen.setText(tbTacgia.getModel().getValueAt(i, 2).toString());
        txSdt.setText(tbTacgia.getModel().getValueAt(i, 3).toString());
        txDiachi.setText(tbTacgia.getModel().getValueAt(i, 4).toString());
        txMa.setEnabled(false);
    }//GEN-LAST:event_tbTacgiaMouseClicked

    private void btThem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThem1ActionPerformed
        // TODO add your handling code here:
        if(txTen1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập tên nhà cung cấp!!");
        }
        else{
            int flag=0;
            if(!ktraTen(txTen1.getText())){
                JOptionPane.showMessageDialog(null, "Tên không hợp lệ!!");
                txTen1.setText("");
                flag=1;
            }
            
            if(flag==0){
                NhaCungCapDTO ncc= new NhaCungCapDTO();
                txMa1.setEnabled(true);
                ncc.setMaNCC(txMa1.getText());
                ncc.setEmailNCC(txEmail.getText());
                ncc.setTenNCC(txTen1.getText());
                ncc.setSoDTNCC(Integer.parseInt(txSdt1.getText()));
                ncc.setDiaChiNCC(txDiachi1.getText());
                NhaCungCapBUS bus = new NhaCungCapBUS();
                boolean check = true;
                for(NhaCungCapDTO nc : NhaCungCapBUS.arrayncc)
                {
                    if(nc.getMaNCC()== ncc.getMaNCC()) check=false;
                }
                if(check){
                    try {
                        bus.Them(ncc);
                    } catch (Exception ex) {
                        Logger.getLogger(TacGiaPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Vector row=new Vector();
                    row.add(ncc.getMaNCC());
                    row.add(ncc.getTenNCC());
                    row.add(ncc.getDiaChiNCC());
                    row.add(ncc.getEmailNCC());
                    row.add(ncc.getSoDTNCC());
                    modelncc.addRow(row);
                    tbNhaCungCap.setModel(modelncc);
                    SetTextBlank();
                    max2=max2+1;
                }
                else {
                    showMessageDialog(null, "Mã nhà cung cấp bị trùng. Vui lòng thử lại");
                    txMa1.requestFocus();
                }
            }
        }
        txMa1.setEnabled(false);
    }//GEN-LAST:event_btThem1ActionPerformed

    private void btSua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSua1ActionPerformed
        // TODO add your handling code here:
        if(txTen1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập tên nhà cung cấp!!");
        }
        else{
            int flag=0;
            if(!ktraTen(txTen1.getText())){
                JOptionPane.showMessageDialog(null, "Tên không hợp lệ!!");
                txTen1.setText("");
                flag=1;
            }
            if(!ktraSDT(txSdt1.getText()) && !txSdt1.getText().equals("0")){
                flag=1;
            }
            if(flag==0){
                int i= tbNhaCungCap.getSelectedRow();
                txMa1.setEnabled(true);
                if(i>=0){
                    NhaCungCapDTO ncc= new NhaCungCapDTO();
                    ncc.setMaNCC(txMa.getText());
                    ncc.setEmailNCC(txEmail.getText());
                    ncc.setTenNCC(txTen.getText());
                    ncc.setSoDTNCC(Integer.parseInt(txSdt.getText()));
                    ncc.setDiaChiNCC(txDiachi.getText());
                    NhaCungCapBUS bus = new NhaCungCapBUS();
                    boolean check = false;
                    for(NhaCungCapDTO tg : NhaCungCapBUS.arrayncc)
                    {
                    if(tg.getMaNCC()== ncc.getMaNCC()) check=true;
                    }
                    if(check){
                        try {
                            bus.Sua(ncc, i);
                        } catch (Exception ex) {
                            Logger.getLogger(TacGiaPanel.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        model.setValueAt(ncc.getMaNCC(), i, 0);
                        model.setValueAt(ncc.getEmailNCC(), i, 1);
                        model.setValueAt(ncc.getTenNCC(), i, 2);
                        model.setValueAt(ncc.getSoDTNCC(), i, 3);
                        model.setValueAt(ncc.getDiaChiNCC(), i, 4);
                        SetTextBlank();
                    }
                    else {
                        showMessageDialog(null, "Thiếu Mã nhà cung cấp. Vui lòng thử lại");
                        txMa.requestFocus();
                    }
                }
        }}
        txMa1.setEnabled(false);
    }//GEN-LAST:event_btSua1ActionPerformed

    private void btXoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoa1ActionPerformed
        // TODO add your handling code here:
        int i= tbNhaCungCap.getSelectedRow();
        txMa1.setEnabled(true);
        PhieuNhapSachBUS sc= new PhieuNhapSachBUS();
                if(PhieuNhapSachBUS.dsPNS==null){
                    try {
                        sc.list();
                    } catch (Exception ex) {
                        Logger.getLogger(ChucVu_DSTinhTrangGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                int check=0;
                for(int j=0;j<PhieuNhapSachBUS.dsPNS.size();j++){
                    if(PhieuNhapSachBUS.dsPNS.get(j).getMaNCC().equals(txMa1.getText())){
                        check=1;
                    }
                }
        if(check==1){
            JOptionPane.showMessageDialog(null, "Không thể xóa Nhà cung cấp này");
        }
        else{
            if(i>=0){
                NhaCungCapDTO ncc= new NhaCungCapDTO();
                ncc.setMaNCC(txMa1.getText());
                ncc.setEmailNCC(txEmail.getText());
                ncc.setTenNCC(txTen1.getText());
                ncc.setSoDTNCC(Integer.parseInt(txSdt1.getText()));
                ncc.setDiaChiNCC(txDiachi1.getText());
                NhaCungCapBUS bus = new NhaCungCapBUS();
                try {
                    bus.Xoa(ncc);
                } catch (Exception ex) {
                    Logger.getLogger(TacGiaPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                modelncc.removeRow(i);
                tbNhaCungCap.setModel(modelncc);
            }
            SetTextBlank();
        }
        txMa1.setEnabled(false);
    }//GEN-LAST:event_btXoa1ActionPerformed

    private void btTimkiem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimkiem1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel m =new DefaultTableModel();
        ArrayList<NhaCungCapDTO> kq = new ArrayList<NhaCungCapDTO>();
        String ten= txTen1.getText();
        NhaCungCapBUS bus = new NhaCungCapBUS();
        kq = bus.Timkiemten(ten);
        Vector header= new Vector();
        header.add("Mã Nhà cung cấp");
        header.add("Tên");
        header.add("Địa chỉ");
        header.add("Email");
        header.add("Số điện thoại");
        m= new DefaultTableModel(header,0);
        for(NhaCungCapDTO ncc : kq)
        {
            Vector row=new Vector();
            row.add(ncc.getMaNCC());
            row.add(ncc.getTenNCC());
            row.add(ncc.getDiaChiNCC());
            row.add(ncc.getEmailNCC());
            row.add(ncc.getSoDTNCC());
            m.addRow(row);
        }
        tbNhaCungCap.setModel(m);
    }//GEN-LAST:event_btTimkiem1ActionPerformed

    private void btReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReset1ActionPerformed
        // TODO add your handling code here:
        Vector header= new Vector();
        header.add("Mã Nhà cung cấp");
        header.add("Tên");
        header.add("Địa chỉ");
        header.add("Email");
        header.add("Số điện thoại");
        model= new DefaultTableModel(header,0);
        for(NhaCungCapDTO ncc : NhaCungCapBUS.arrayncc)
        {
            Vector row=new Vector();
            row.add(ncc.getMaNCC());
            row.add(ncc.getTenNCC());
            row.add(ncc.getDiaChiNCC());
            row.add(ncc.getEmailNCC());
            row.add(ncc.getSoDTNCC());
            model.addRow(row);
        }
        tbNhaCungCap.setModel(model);
        SetTextBlank();
    }//GEN-LAST:event_btReset1ActionPerformed

    private void tbNhaCungCapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNhaCungCapMouseClicked
        // TODO add your handling code here:
        txMa1.setEnabled(true);
        int  i=tbNhaCungCap.getSelectedRow();
        //JOptionPane.showMessageDialog(null, "row:"+i);
        txMa1.setText(tbNhaCungCap.getModel().getValueAt(i, 0).toString());
        txTen1.setText(tbNhaCungCap.getModel().getValueAt(i, 1).toString());
        txDiachi1.setText(tbNhaCungCap.getModel().getValueAt(i, 2).toString());
        txEmail.setText(tbNhaCungCap.getModel().getValueAt(i, 3).toString());
        txSdt1.setText(tbNhaCungCap.getModel().getValueAt(i, 4).toString());
        txMa1.setEnabled(false);
    }//GEN-LAST:event_tbNhaCungCapMouseClicked

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        // TODO add your handling code here:
        while(true){
            try {
                jLabel2.setForeground(Color.red);
                Thread.sleep(200);
                jLabel2.setForeground(Color.green);
            } catch (InterruptedException ex) {
                Logger.getLogger(TacGiaPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jLabel12MouseEntered

    private void txEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txEmailFocusLost
        // TODO add your handling code here:
        if(!ktraEmail(txEmail.getText())){
            JOptionPane.showMessageDialog(null, "Email không hợp lệ!!");
            txEmail.setText("");
        }
    }//GEN-LAST:event_txEmailFocusLost

    private void txSdtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txSdtFocusLost
        // TODO add your handling code here:
        if(!ktraSDT(txSdt.getText())){
            JOptionPane.showMessageDialog(null, "SĐT gồm 10 số!!");
            txSdt.setText("");
        }
    }//GEN-LAST:event_txSdtFocusLost

    private void txSdt1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txSdt1FocusLost
        // TODO add your handling code here:
        if(!ktraSDT(txSdt1.getText())){
            JOptionPane.showMessageDialog(null, "SĐT gồm 10 số!!");
            txSdt1.setText("");
        }
    }//GEN-LAST:event_txSdt1FocusLost
    
    public void SetTextBlank(){
        txMa.setEnabled(true);
        txMa1.setEnabled(true);
        txMa.setText(Integer.toString(max1));
        txHo.setText("");
        txTen.setText("");
        txSdt.setText("");
        txDiachi.setText("");
                txMa1.setText(Integer.toString(max2));
        txTen1.setText("");
        txDiachi1.setText("");
        txEmail.setText("");
        txSdt1.setText("");
        txMa.setEnabled(false);
        txMa1.setEnabled(false);
    }
    public static boolean ktraEmail(final String hex) {

            Matcher matcher = pattern1.matcher(hex);
            return matcher.matches();
    }
    public static boolean ktraSDT(final String hex) {

            Matcher matcher = pattern2.matcher(hex);
            return matcher.matches();
    }
    public static boolean ktraTen(final String hex) {

            Matcher matcher = pattern3.matcher(hex);
            return matcher.matches();
    }
        private ArrayList<TacGiaDTO> dstg;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btReset;
    private javax.swing.JButton btReset1;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btSua1;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btThem1;
    private javax.swing.JButton btTimkiem;
    private javax.swing.JButton btTimkiem1;
    private javax.swing.JButton btXoa;
    private javax.swing.JButton btXoa1;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbNhaCungCap;
    private javax.swing.JTable tbTacgia;
    private javax.swing.JTextField txDiachi;
    private javax.swing.JTextField txDiachi1;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextField txHo;
    private javax.swing.JFormattedTextField txMa;
    private javax.swing.JFormattedTextField txMa1;
    private javax.swing.JTextField txSdt;
    private javax.swing.JTextField txSdt1;
    private javax.swing.JTextField txTen;
    private javax.swing.JTextField txTen1;
    // End of variables declaration//GEN-END:variables
}
