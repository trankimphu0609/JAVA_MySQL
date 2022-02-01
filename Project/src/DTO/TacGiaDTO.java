
package DTO;


public class TacGiaDTO {
    private int maTG;
    private String hoTG;
    private String tenTG;
    private int sDT;
    private String address;

    public TacGiaDTO() {

    }

    public TacGiaDTO(String hoTG, String tenTG) {
        this.hoTG = hoTG;
        this.tenTG = tenTG;
    }

    public TacGiaDTO(int maTG, String hoTG, String tenTG) {
        this.maTG = maTG;
        this.hoTG = hoTG;
        this.tenTG = tenTG;
    }
    
    public TacGiaDTO(int maTG, String hoTG, String tenTG, int sDT, String address) {
        this.maTG = maTG;
        this.hoTG = hoTG;
        this.tenTG = tenTG;
        this.sDT = sDT;
        this.address = address;
    }
    public int getMaTG() {
        return maTG;
    }
    public void setMaTG(int maTG) {
        this.maTG = maTG;
    }
    public String getHoTG() {
        return hoTG;
    }
    public void setHoTG(String hoTG) {
        this.hoTG = hoTG;
    }
    public String getTenTG() {
        return tenTG;
    }
    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }
    public int getsDT() {
        return sDT;
    }
    public void setsDT(int sDT) {
        this.sDT = sDT;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
