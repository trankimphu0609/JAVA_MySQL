package BUS;

import DATA.ChiTietPhieuTraDAO;
import DTO.ChiTietPhieuTraDTO;
import java.sql.SQLException;
import java.util.ArrayList;


public class ChiTietPhieuTraBUS {
    public static ArrayList<ChiTietPhieuTraDTO> dsphieutra;
    public ChiTietPhieuTraBUS() {
        
    }
    public void DocDSCTPT(String maPT) throws SQLException, Exception  {
        ChiTietPhieuTraDAO loaiDAO = new ChiTietPhieuTraDAO();
            dsphieutra = new ArrayList<ChiTietPhieuTraDTO>();
            dsphieutra = loaiDAO.list(maPT);
        
    }
    public void Them(ChiTietPhieuTraDTO loai) throws Exception {
        if(dsphieutra==null){
            dsphieutra = new ArrayList<ChiTietPhieuTraDTO>();
        }
        dsphieutra.add(loai);
        ChiTietPhieuTraDAO loaiDAO = new ChiTietPhieuTraDAO();
        loaiDAO.add(loai);
    }
    public void Xoa(int mapt) throws Exception {
        for(ChiTietPhieuTraDTO ct : dsphieutra) {
            if(ct.getMaPT() == mapt) {
                dsphieutra.remove(ct);
                ChiTietPhieuTraDAO loaiDAO = new ChiTietPhieuTraDAO();
                loaiDAO.delete(Integer.toString(mapt));
                return;
            }
        }
    }
    public void Sua(ChiTietPhieuTraDTO s) throws Exception {
        for(int i = 0; i < dsphieutra.size(); i++) {
            if(dsphieutra.get(i).getMaPT() == s.getMaPT()) {
                dsphieutra.set(i, s);
            }
            ChiTietPhieuTraDAO loaiDAO = new ChiTietPhieuTraDAO();
            loaiDAO.set(s);
        }
    }
    public ChiTietPhieuTraDTO timkiem(int mapt) {
        for(ChiTietPhieuTraDTO ct : dsphieutra) {
            if(ct.getMaPT() == mapt) {
                return ct;
            }
        }
        return null;
    }
    
}

