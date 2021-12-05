package DTO;

public class ChiTietPhieuMuonDTO {
    private int maPM;
    private int maDS;
    private int soluong;
    private String tensach;
    public ChiTietPhieuMuonDTO() {

    }
    public ChiTietPhieuMuonDTO(int maPM, int maDS,int soluong) {
        this.maPM = maPM;
        this.maDS = maDS;
        this.soluong = soluong;
    }
    public ChiTietPhieuMuonDTO(int maPM, int maDS, String tensach,int soluong) {
        this.maPM = maPM;
        this.maDS = maDS;
        this.tensach = tensach;
        this.soluong = soluong;
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
    public int getSoluong() {
        return soluong;
    }
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    public String getTensach() {
        return tensach;
    }
    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    @Override
    public String toString() {
        return "ChiTietPhieuMuonDTO{" + "maPM=" + maPM + ", maDS=" + maDS + ", soluong=" + soluong + ", tensach=" + tensach + '}';
    }
    
    
}
