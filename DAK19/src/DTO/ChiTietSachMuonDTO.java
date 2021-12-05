
package DTO;


public class ChiTietSachMuonDTO {
    private int maPM;
    private int maSachCon;
    private int maDS;
    private String maTinhtrang;

    public ChiTietSachMuonDTO() {

    }
    public ChiTietSachMuonDTO(int maPM, int maDS,int maSachCon, String maTinhtrang) {
        this.maPM = maPM;
        this.maDS = maDS;
        this.maSachCon = maSachCon;
        this.maTinhtrang = maTinhtrang;
    }
    public int getMaPM() {
        return maPM;
    }
    public void setMaPM(int maPM) {
        this.maPM = maPM;
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
    public String getMaTinhtrang() {
        return maTinhtrang;
    }
    public void setMaTinhtrang(String maTinhtrang) {
        this.maTinhtrang = maTinhtrang;
    }

    @Override
    public String toString() {
        return "ChiTietSachMuonDTO{" + "maPM=" + maPM + ", maSachCon=" + maSachCon + ", maDS=" + maDS + ", maTinhtrang=" + maTinhtrang + '}';
    }
    
} 

