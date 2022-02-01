
package DTO;

import java.util.Date;


public class DocGiaDTO {
    private int maDG;
    private String hoDG;
    private String tenDG; 
    private String ngaySinh;
    private String address;
    private int soDT;
    private String trinhDo;
    private String noicongtac;
    private int sl_sachmuon;
    

    public DocGiaDTO() {

    }
    public DocGiaDTO(int maDG, String hoDG, String tenDG, String ngaySinh, String address, int soDT, String trinhDo, String noicongtac) {
        this.maDG = maDG;
        this.hoDG = hoDG;
        this.tenDG = tenDG;
        this.ngaySinh = ngaySinh;
        this.address = address;
        this.soDT = soDT;
        this.trinhDo = trinhDo;
        this.noicongtac = noicongtac;
    }
    public int getMaDG() {
        return maDG;
    }
    public void setMaDG(int maDG) {
        this.maDG = maDG;
    }
    public String getHoDG() {
        return hoDG;
    }
    public void setHoDG(String hoDG) {
        this.hoDG = hoDG;
    }
    public String getTenDG() {
        return tenDG;
    }
    public void setTenDG(String tenDG) {
        this.tenDG = tenDG;
    }
    public String getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getSoDT() {
        return soDT;
    }
    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }
    public String getTrinhDo() {
        return trinhDo;
    }
    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }
    public String getNoicongtac() {
        return noicongtac;
    }
    public void setNoicongtac(String noicongtac) {
        this.noicongtac = noicongtac;
    }
    public int getSl_sachmuon() {
        return sl_sachmuon;
    }

    public void setSl_sachmuon(int sl_sachmuon) {
        this.sl_sachmuon = sl_sachmuon;
    }
}

