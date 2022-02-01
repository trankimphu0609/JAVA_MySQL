/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;
//import java.sql.Date;

/**
 *
 * @author trankimphu0609
 */
public class PhieuNhapSachDTO {
    private int IDPhieuNhap;
    private String MaNCC;
    private int MaNV;
    private String NgayNhap;
    private int TongTien;
    
    public PhieuNhapSachDTO() {
        
    }
    public PhieuNhapSachDTO(int IDPhieuNhap, String MaNCC, int MaNV, String NgayNhap, int TongTien) {
        this.IDPhieuNhap = IDPhieuNhap;
        this.MaNCC = MaNCC;
        this.MaNV = MaNV;
        this.NgayNhap = NgayNhap;
        this.TongTien = TongTien;
    }
    public int getIDPhieuNhap() {
        return this.IDPhieuNhap;
    }
    public void setIDPhieuNhap(int IDPhieuNhap) {
        this.IDPhieuNhap = IDPhieuNhap;
    }
    public String getMaNCC() {
        return this.MaNCC;
    }
    public void setNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }
    public int getMaNV() {
        return this.MaNV;
    }
    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }
    public String getNgayNhap() {
        return this.NgayNhap;
    }
    public void setNgayNhap(String NgayNhap) {
        this.NgayNhap = NgayNhap;
    }
    public int getTongTien() {
        return this.TongTien;
    }
    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }
}