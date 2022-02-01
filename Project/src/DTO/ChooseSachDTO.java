
package DTO;

public class ChooseSachDTO {
    int maDS;
    String tensach;
    int masachcon;
    int maTT;
    public ChooseSachDTO() {
        
    }
    public ChooseSachDTO(int maDS, String tensach, int masachcon, int maTT) {
        this.maDS = maDS;
        this.tensach = tensach;
        this.masachcon = masachcon;
        this.maTT= maTT;
    }

    public int getMaTT() {
        return maTT;
    }

    public void setMaTT(int maTT) {
        this.maTT = maTT;
    }

    public int getMaDS() {
        return maDS;
    }

    public void setMaDS(int maDS) {
        this.maDS = maDS;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public int getMasachcon() {
        return masachcon;
    }

    public void setMasachcon(int masachcon) {
        this.masachcon = masachcon;
    }
    
}
