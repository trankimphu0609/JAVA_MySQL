package BUS;

import DATA.ChiTietSachTraDAO;
import DTO.ChiTietSachTraDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public class ChiTietSachTraBUS {
    public static ArrayList<ChiTietSachTraDTO> dssachtra;
    public static ArrayList<ChiTietSachTraDTO> dsktratra;
    public ChiTietSachTraBUS() {
        
    }
    public void DocDSCTST(String mapt, String mads) throws SQLException, Exception  {
        ChiTietSachTraDAO loaiDAO = new ChiTietSachTraDAO();
        
            dssachtra = new ArrayList<ChiTietSachTraDTO>();
            dssachtra = loaiDAO.list(mapt,mads);
        
    }
    public void DocDSCTST() throws SQLException, Exception  {
        ChiTietSachTraDAO loaiDAO = new ChiTietSachTraDAO();
        
            dsktratra = new ArrayList<ChiTietSachTraDTO>();
            dsktratra = loaiDAO.list();
        
    }
    public void Them(ChiTietSachTraDTO loai) throws Exception {
        if(dssachtra==null){
            dssachtra = new ArrayList<ChiTietSachTraDTO>();
        }
        dssachtra.add(loai);
        ChiTietSachTraDAO loaiDAO = new ChiTietSachTraDAO();
        loaiDAO.add(loai);
    }
    public void Xoa(int mapt) throws Exception {
        for(ChiTietSachTraDTO ct : dssachtra) {
            if(ct.getMaPT() == mapt) {
                dssachtra.remove(ct);
                ChiTietSachTraDAO loaiDAO = new ChiTietSachTraDAO();
                loaiDAO.delete(Integer.toString(mapt));
                return;
            }
        }
    }
    
    public ChiTietSachTraDTO timkiem(int mapt) {
        for(ChiTietSachTraDTO ct : dssachtra) {
            if(ct.getMaPT() == mapt) {
                return ct;
            }
        }
        return null;
    }
    
}

