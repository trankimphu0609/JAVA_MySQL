
package DTO;

import java.util.Date;


public class PhieuTraDTO {
    private int maPT;
    private int maPM;
    private String ngayTra;
    private int maNV;
    

    public PhieuTraDTO() {

    }
    public PhieuTraDTO(int maPT, int maPM, String ngayTra, int maNV) {
        this.maPT = maPT;
        this.maPM = maPM;
        this.ngayTra = ngayTra;
        this.maNV = maNV;
        

    }
    public int getMaPT() {
        return maPT;
    }
    public void setMaPT(int maPT) {
        this.maPT = maPT;
    }
    public int getMaPM() {
        return maPM;
    }
    public void setMaPM(int maPM) {
        this.maPM = maPM;
    }
    public String getNgayTra() {
        return ngayTra;
    }
    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }
    public int getMaNV() {
        return maNV;
    }
    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }
    
}

