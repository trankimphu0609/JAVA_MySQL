
package DTO;

import javax.swing.JTextField;


public class TaiKhoanDTO {
    private int matk;
    private String username;
    private String matkhau;
    private int maquyen;
    public TaiKhoanDTO() {

    }
    public TaiKhoanDTO(int matk, String username, String matkhau, int maquyen) {
        this.matk = matk;
        this.username = username;
        this.matkhau = matkhau;
        this.maquyen = maquyen;
    }
    public int getMatk() {
        return matk;
    }
    public void setMatk(int matk) {
        this.matk = matk;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getMatkhau() {
        return matkhau;
    }
    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }
    public int getMaquyen() {
        return maquyen;
    }
    public void setMaquyen(int maquyen) {
        this.maquyen = maquyen;
    }

    public int setMatk(JTextField txtMaTK) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

