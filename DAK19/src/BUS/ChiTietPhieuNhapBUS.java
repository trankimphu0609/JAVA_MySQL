
package BUS;

import DATA.ChiTietPhieuNhapDAO;
import DTO.ChiTietPhieuNhapDTO;
import java.util.ArrayList;


public class ChiTietPhieuNhapBUS {
    public static ArrayList<ChiTietPhieuNhapDTO> dsctpn;
    
    public ChiTietPhieuNhapBUS() {
        
    }
    public void list() throws Exception {
        ChiTietPhieuNhapDAO loaiDAO = new ChiTietPhieuNhapDAO();
        if(dsctpn==null){
        dsctpn = new ArrayList<>();
        }
        dsctpn = loaiDAO.list();
    }
    public void list(int i) throws Exception {
        ChiTietPhieuNhapDAO loaiDAO = new ChiTietPhieuNhapDAO();
        if(dsctpn==null){
        dsctpn = new ArrayList<>();
        }
        dsctpn = loaiDAO.list(i);
    }
    public void add(ChiTietPhieuNhapDTO loai) throws Exception {
        list();
        dsctpn.add(loai);
        ChiTietPhieuNhapDAO loaiDAO = new ChiTietPhieuNhapDAO();
        loaiDAO.add(loai);
    }
    public void delete(int idPhieuNhap) throws Exception {
        for(ChiTietPhieuNhapDTO ct : dsctpn) {
            if(ct.getIDPhieuNhap()==idPhieuNhap) {
                dsctpn.remove(ct);
                ChiTietPhieuNhapDAO loaiDAO = new ChiTietPhieuNhapDAO();
                loaiDAO.delete(idPhieuNhap);
                return;
            }
        }
    }
    public void set(ChiTietPhieuNhapDTO s) {
        for(int i = 0; i < dsctpn.size(); i++) {
            if(dsctpn.get(i).getIDPhieuNhap()==(s.getIDPhieuNhap())) {
                dsctpn.set(i, s);
                return;
            }
        }
    }
    public ChiTietPhieuNhapDTO search(int IDPhieuNhap) {
        for(ChiTietPhieuNhapDTO ct : dsctpn)
        {
            if( ct.getIDPhieuNhap()==IDPhieuNhap)
            {
                return ct;
            }
        }
        return null;
    }
    public boolean isExistID(int IDPhieuNhap) {
        for(ChiTietPhieuNhapDTO s : dsctpn) {
            if(s.getIDPhieuNhap()==IDPhieuNhap)
                return true;
        }
        return false;
    }   
}
