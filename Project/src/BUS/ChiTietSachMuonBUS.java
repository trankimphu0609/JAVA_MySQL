package BUS;

import DATA.ChiTietSachMuonDAO;
import DTO.ChiTietSachMuonDTO;
import java.sql.SQLException;
import java.util.ArrayList;


public class ChiTietSachMuonBUS {
    public static ArrayList<ChiTietSachMuonDTO> dssachmuon;
    public static ArrayList<ChiTietSachMuonDTO> dsktra;
    public ChiTietSachMuonBUS() {
        
    }
    public void DocDSCTSM(String mapm, String mads) throws SQLException, Exception  {
        ChiTietSachMuonDAO loaiDAO = new ChiTietSachMuonDAO();
            dssachmuon = new ArrayList<ChiTietSachMuonDTO>();
            dssachmuon = loaiDAO.list(mapm, mads);
        
    }
    public void DocDSCTSM() throws SQLException, Exception  {
        ChiTietSachMuonDAO loaiDAO = new ChiTietSachMuonDAO();
            dsktra = new ArrayList<ChiTietSachMuonDTO>();
            dsktra = loaiDAO.list();
        
    }
    public void Them(ChiTietSachMuonDTO loai) throws Exception {
        System.out.println("CTSM BUS "+loai.toString());
        if(dssachmuon==null){
            dssachmuon = new ArrayList<ChiTietSachMuonDTO>();
        }
        dssachmuon.add(loai);
        ChiTietSachMuonDAO loaiDAO = new ChiTietSachMuonDAO();
        loaiDAO.add(loai);
    }
    public void Xoa(int mapm) throws Exception {
        for(ChiTietSachMuonDTO ct : dssachmuon) {
            if(ct.getMaPM() == mapm) {
                dssachmuon.remove(ct);
                ChiTietSachMuonDAO loaiDAO = new ChiTietSachMuonDAO();
                loaiDAO.delete(Integer.toString(mapm));
                return;
            }
        }
    }
    public void Sua(ChiTietSachMuonDTO s) throws Exception {
        for(int i = 0; i < dssachmuon.size(); i++) {
            if(dssachmuon.get(i).getMaPM() == s.getMaPM()) {
                dssachmuon.set(i, s);
            }
            ChiTietSachMuonDAO loaiDAO = new ChiTietSachMuonDAO();
            loaiDAO.set(s);
        }
    }
    
    
}