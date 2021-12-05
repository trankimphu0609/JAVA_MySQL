
package DTO;

import java.util.Date;


public class NhanVienDTO {
    public int maNV;
    public String ho;
    public String ten;
    public String ngaysinh;
    public String address;
    public int soDT;
    public int luong;
    public String tenCV;
    public int maCV;
    public NhanVienDTO() {

    }
    public NhanVienDTO(int maNV, String ho, String ten, String ngaysinh, String address, int soDT, int luong, String tenCV, int maCV) {
        this.maNV = maNV;
        this.ho = ho;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.address = address;
        this.soDT = soDT;
        this.luong = luong;
        this.tenCV = tenCV;
        this.maCV = maCV;
    }
    public int getMaNV() {
        return maNV;
    }
    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }
    public String getHo() {
        return ho;
    }
    public void setHo(String ho) {
        this.ho = ho;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getNgaysinh() {
        return ngaysinh;
    }
    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
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
    public int getLuong() {
        return luong;
    }
    public void setLuong(int luong) {
        this.luong = luong;
    }
    public String getTenCV() {
        return tenCV;
    }
    public void setTenCV(String tenCV) {
        this.tenCV = tenCV;
    }
    public int getMaCV() {
        return maCV;
    }
    public void setMaCV(int maCV) {
        this.maCV = maCV;
    }
    public String getFullname() {
        return this.ho + " " + this.ten;
    }
}

