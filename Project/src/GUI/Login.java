/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.TaiKhoanBUS;
import DTO.TaiKhoanDTO;
import BUS.NhanVienBUS;
import DTO.NhanVienDTO;
import GUI.model.header;
import GUI.model.loading;
import Main.Main;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.UIManager;
import keeptoo.KButton;
import keeptoo.KGradientPanel;

/**
 *
 * @author Trần Kim Phú
 */
public class Login extends JFrame implements KeyListener{
    
    Main frMain ;
    loading load;
    private TaiKhoanBUS tkbus = new TaiKhoanBUS();
    private NhanVienBUS nvbus = new NhanVienBUS();
    private JTextField user;
    private JPasswordField pass;
    private int DEFAULT_HEIGHT = 600 ,DEFAULT_WIDTH = 400;
    private KButton btnLogin;
    public Login() {
        init();
          
    }
    public void init() {
        setLayout(null);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        header hd = new header(400,60);
        hd.setBackground(new Color(0,0,0,0));
        hd.setBounds(50, 80, 300, 60);
        
        Font font = new Font("Segoe UI",Font.PLAIN,14);
        Font font1 = new Font("Segoe UI",Font.BOLD,15);
        
        KGradientPanel background = new KGradientPanel();
        background.setLayout(null);
        background.setkStartColor(new Color(31, 45, 68));
        background.setkEndColor(new Color(92,133,148));
        background.setkGradientFocus(1200);
        background.setBounds(0,0,DEFAULT_WIDTH,DEFAULT_HEIGHT);
        
        btnLogin = new KButton();
        btnLogin.setBorder(null);
        btnLogin.setOpaque(false);
        btnLogin.setText("Đăng nhập");
        btnLogin.setFont(font1);
        btnLogin.setkStartColor(new Color(90,204,193));
        btnLogin.setkEndColor(new Color(11,191,214));
        btnLogin.setkHoverForeGround(Color.WHITE);
        btnLogin.setkHoverStartColor(new Color(11,191,214));
        btnLogin.setkHoverEndColor(new Color(90,204,193));
        btnLogin.setkBorderRadius(20); 
        btnLogin.setkSelectedColor(null);
        btnLogin.setkAllowTab(false);
        btnLogin.setBounds(100, 400, 200, 40);
        
        JLabel exit = new JLabel(new ImageIcon("./src/image/exit_25px.png"),JLabel.CENTER);
        exit.setBounds(DEFAULT_WIDTH - 40, 10, 30, 30);
        exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        JLabel lbUser = new JLabel(new ImageIcon("./src/image/user_30px.png"),JLabel.CENTER);
        lbUser.setBounds(80, 197, 30, 30);
        JLabel lbPass = new JLabel(new ImageIcon("./src/image/pwd_30px.png"),JLabel.CENTER);
        lbPass.setBounds(80, 277, 30, 30);
        
        user = new JTextField("Username");
        user.setFont(font);
        user.setForeground(Color.WHITE);
        user.setCaretColor(Color.WHITE);
        user.setBounds(120,200,180,30);
        user.setBorder(null);
        user.setOpaque(false);
        
        pass = new JPasswordField("Password");
        pass.setFont(font);
        pass.setForeground(Color.WHITE);
        pass.setCaretColor(Color.WHITE);
        pass.setBorder(null);
        pass.setBounds(120,280,150,30);
        pass.setOpaque(false);    
        
        JSeparator sp1 = new JSeparator();
        sp1.setBounds(80,230,220,10);       
        JSeparator sp2 = new JSeparator();
        sp2.setBounds(80,310,220,10);
        
        setUndecorated(true);
        background.add(exit);
        background.add(hd);
        background.add(lbUser);
        background.add(user);
        background.add(sp1);
        background.add(lbPass);
        background.add(pass);
        background.add(sp2);
        background.add(btnLogin);
        add(background);
        
        btnLogin.requestFocus();
        
        setSize(DEFAULT_WIDTH ,DEFAULT_HEIGHT);
        setLocationRelativeTo(null);
        setVisible(true);
        
        exit.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e)
            {
                System.exit(0);
            }
        });
        user.addMouseListener((new MouseAdapter() {
            public void mousePressed(MouseEvent e)
            {
                user.setText("");
            }
        }));
        user.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent e) {
            if (e.isActionKey()) {
                    user.setText("");
                }
            }
        });
        user.addKeyListener(this);
        
        pass.addMouseListener((new MouseAdapter() {
            public void mousePressed(MouseEvent e)
            {
                pass.setText("");
            }
        }));
        pass.addFocusListener(new FocusAdapter(){
            public void focusGained(FocusEvent e)
            {
                pass.setText("");
            }
        });
        pass.addKeyListener(this);
        
        btnLogin.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                if(tkbus.getList()==null) try {
                    tkbus.DocTK();
                } catch (Exception ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
                String username = user.getText();
                String passwd = pass.getText();
                TaiKhoanDTO tk = tkbus.check(username, passwd);
                if(user == null || pass == null) {
                    JOptionPane.showMessageDialog(null, "Sai tên tài khoản hoặc mật khẩu");
//                    return;
                } else{  
//                    setVisible(false);
                    int matk = tk.getMatk();

                        NhanVienBUS list = new NhanVienBUS();
                        if(NhanVienBUS.dsnv==null)
                            try {
                                list.DocDSNV();
                        } catch (Exception ex) {
                            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    frMain = new Main();
                    frMain.setlbHello("Xin chào " + list.getFullname(matk));
                    load = new loading();
                    load.setVisible(true);
                    dispose();
                    // hiện 3 giây
                    Timer timer = new Timer(2000, timerListener);
                    timer.start();  
                    
                    
                }
//                if(nvbus.getList()==null) nvbus.DocDSNV();
//                NhanVienDTO nv = new NhanVienDTO();
//                nv = nvbus.timkiem(tk.getMaNV());
            }
        });
    }
    
    ActionListener timerListener = new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                
                        load.dispose();
                        frMain.setVisible(true); 
                    }
                };
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e) {
            
        }
        Login lg = new Login();
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        Object a = e.getSource();
        if(a.equals(user) || a.equals(pass))
        {
            if(e.getKeyCode() == KeyEvent.VK_ENTER)
            {
                btnLogin.doClick();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    
}
