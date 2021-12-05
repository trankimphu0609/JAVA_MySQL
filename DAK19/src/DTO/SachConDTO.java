/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Trần Kim Phú
 */
public class SachConDTO {
    private int maDS;
    private int maSachCon;
    private String maTinhTrang;
    private int hientrang;
    public SachConDTO() {

    }
    public SachConDTO(int maDS, int maSachCon, String maTinhTrang) {
        this.maDS = maDS;
        this.maSachCon = maSachCon;
        this.maTinhTrang = maTinhTrang;
    }

    public SachConDTO(int maDS, int maSachCon, String maTinhTrang, int hientrang) {
        this.maDS = maDS;
        this.maSachCon = maSachCon;
        this.maTinhTrang = maTinhTrang;
        this.hientrang = hientrang;
    }
    
    public int getMaDS() {
        return maDS;
    }
    public void setMaDS(int maDS) {
        this.maDS = maDS;
    }
    public int getMaSachCon() {
        return maSachCon;
    }
    public void setMaSachCon(int maSachCon) {
        this.maSachCon = maSachCon;
    }
    public String getMaTinhTrang() {
        return maTinhTrang;
    }
    public void setMaTinhTrang(String maTinhTrang) {
        this.maTinhTrang = maTinhTrang;
    }

    public int getHientrang() {
        return hientrang;
    }

    public void setHientrang(int hientrang) {
        this.hientrang = hientrang;
    }

    @Override
    public String toString() {
        return "SachConDTO{" + "maDS=" + maDS + ", maSachCon=" + maSachCon + ", maTinhTrang=" + maTinhTrang + ", hientrang=" + hientrang + '}';
    }
    
}

