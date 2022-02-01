
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Trần Kim Phú
 */
public class PhieuMuonDTO {
    private int maPM;
    private int matheTV;
    private String ngaymuon;
    private String ngayhentra;
    private int maNV;
    
    public PhieuMuonDTO() {

    }
    public PhieuMuonDTO(int maPM, int matheTV, String ngaymuon,String ngayhentra,int maNV) {
        this.maPM = maPM;
        this.matheTV = matheTV;
        this.ngaymuon = ngaymuon;
        this.ngayhentra = ngayhentra;
        this.maNV = maNV;
    }
    public int getMaPM() {
        return maPM;
    }
    public void setMaPM(int maPM) {
        this.maPM = maPM;
    }
    public int getMatheTV() {
        return matheTV;
    }
    public void setMatheTV(int matheTV) {
        this.matheTV = matheTV;
    }
    public String getNgaymuon() {
        return ngaymuon;
    }
    public void setNgaymuon(String ngaymuon) {
        this.ngaymuon = ngaymuon;
    }
    public String getNgayhentra() {
        return ngayhentra;
    }
    public void setNgayhentra(String ngayhentra) {
        this.ngayhentra = ngayhentra;
    }
    public int getMaNV() {
        return maNV;
    }
    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    @Override
    public String toString() {
        return "PhieuMuonDTO{" + "maPM=" + maPM + ", matheTV=" + matheTV + ", ngaymuon=" + ngaymuon + ", ngayhentra=" + ngayhentra + ", maNV=" + maNV + '}';
    }
    
}
