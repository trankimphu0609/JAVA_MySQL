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
public class ChiTietPhieuTraDTO {
    private int maPT;
    private int maDS;
    private int soluongtra;
    String tensach;

    public ChiTietPhieuTraDTO() {

    }
    public ChiTietPhieuTraDTO(int maPT, int maDS, int soluongtra, String tensach) {
        this.maPT = maPT;
        this.maDS = maDS;
        this.soluongtra = soluongtra;
        this.tensach=tensach;
    }
    public int getMaPT() {
        return maPT;
    }
    public void setMaPT(int maPT) {
        this.maPT = maPT;
    }
    public int getMaDS() {
        return maDS;
    }
    public void setMaDS(int maDS) {
        this.maDS = maDS;
    }
    public int getSoluongtra() {
        return soluongtra;
    }
    public void setSoluongtra(int soluongtra) {
        this.soluongtra = soluongtra;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    
    
}
