
package DTO;

public class DauSachDTO {
    private int maDS;
    private String tenSach;
    private int soluong;
    private int maTG;
    

    public DauSachDTO() {

    }
    public int getMaDS() {
        return maDS;
    }

    public DauSachDTO(int maDS, String tenSach) {
        this.maDS = maDS;
        this.tenSach = tenSach;
    }
    
    public DauSachDTO(int maDS, String tenSach, int soluong, int maTG) {
        this.maDS = maDS;
        this.tenSach = tenSach;
        this.soluong = soluong;
        this.maTG = maTG;
    }
    public void setMaDS(int maDS) {
        this.maDS = maDS;
    }
    public String getTenSach() {
        return tenSach;
    }
    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }
    public int getSoluong() {
        return soluong;
    }
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    public int getMaTG() {
        return maTG;
    }
    public void setMaTG(int maTG) {
        this.maTG = maTG;
    }

    @Override
    public String toString() {
        return "DauSachDTO{" + "maDS=" + maDS + ", tenSach=" + tenSach + ", soluong=" + soluong + ", maTG=" + maTG + '}';
    }
    
    
}
