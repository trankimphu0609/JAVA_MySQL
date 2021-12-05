
package DTO;

public class ChiTietSachTraDTO {
    private int maPT;
    private int maDS;
    private int maSachcon;
    private String maTT;

    public ChiTietSachTraDTO() {

    }
    public ChiTietSachTraDTO(int maPT, int maDS,int maSachcon,String maTT) {
        this.maPT = maPT;
        this.maDS=maDS;
        this.maSachcon = maSachcon;
        this.maTT = maTT;
        
    }
    public int getMaPT() {
        return maPT;
    }
    public void setMaPT(int maPT) {
        this.maPT = maPT;
    }
    public int getMaSachcon() {
        return maSachcon;
    }
    public void setMaSachcon(int maSachcon) {
        this.maSachcon = maSachcon;
    }
    
    public String getMaTT() {
        return maTT;
    }
    public void setMaTT(String maTT) {
        this.maTT = maTT;
    }
    
    
    public int getMaDS() {
        return maDS;
    }

    public void setMaDS(int maDS) {
        this.maDS = maDS;
    }

    
    
}



