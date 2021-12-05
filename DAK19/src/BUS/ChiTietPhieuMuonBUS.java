package BUS;

import DATA.ChiTietPhieuMuonDAO;
import DTO.ChiTietPhieuMuonDTO;
import java.sql.SQLException;
import java.util.ArrayList;


public class ChiTietPhieuMuonBUS {
    public static ArrayList<ChiTietPhieuMuonDTO> dsphieumuon;
    public ChiTietPhieuMuonBUS() {
        
    }
    public void DocDSCTPM(String maPM) throws SQLException, Exception  {
        ChiTietPhieuMuonDAO loaiDAO = new ChiTietPhieuMuonDAO();
            dsphieumuon = new ArrayList<ChiTietPhieuMuonDTO>();
            dsphieumuon = loaiDAO.list(maPM);
    }
    
    public void Them(ChiTietPhieuMuonDTO loai) throws Exception {
        if(dsphieumuon==null){
            dsphieumuon = new ArrayList<ChiTietPhieuMuonDTO>();
        }
        
        dsphieumuon.add(loai);
        System.out.println("CTPM BUS "+loai.toString());
        ChiTietPhieuMuonDAO loaiDAO = new ChiTietPhieuMuonDAO();
        loaiDAO.add(loai);
    }
    public void Xoa(int mapm) throws Exception {
        for(ChiTietPhieuMuonDTO ct : dsphieumuon) {
            if(ct.getMaPM() == mapm) {
                dsphieumuon.remove(ct);
                ChiTietPhieuMuonDAO loaiDAO = new ChiTietPhieuMuonDAO();
                loaiDAO.delete(Integer.toString(mapm));
                return;
            }
        }
    }
    public void Sua(ChiTietPhieuMuonDTO s) throws Exception {
        for(int i = 0; i < dsphieumuon.size(); i++) {
            if(dsphieumuon.get(i).getMaPM() == s.getMaPM()) {
                dsphieumuon.set(i, s);
            }
            ChiTietPhieuMuonDAO loaiDAO = new ChiTietPhieuMuonDAO();
            loaiDAO.set(s);
        }
    }
    public ChiTietPhieuMuonDTO timkiem(int mapm) {
        for(ChiTietPhieuMuonDTO ct : dsphieumuon) {
            if(ct.getMaPM() == mapm) {
                return ct;
            }
        }
        return null;
    }
    
}
