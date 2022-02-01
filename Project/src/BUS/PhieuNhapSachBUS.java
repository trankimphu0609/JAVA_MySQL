
package BUS;

import DATA.PhieuNhapSachDAO;
import DTO.PhieuNhapSachDTO;
import java.sql.SQLException;
import java.util.ArrayList;


public class PhieuNhapSachBUS {
    public static ArrayList<PhieuNhapSachDTO> dsPNS;
    
    public PhieuNhapSachBUS() {
        
    }
    public PhieuNhapSachBUS(int i) throws SQLException, Exception {
        list();
    }
    public void list() throws SQLException, Exception {
        PhieuNhapSachDAO loaiDAO = new PhieuNhapSachDAO();
        if(dsPNS==null){
        dsPNS = new ArrayList<PhieuNhapSachDTO>();
        }
        dsPNS = loaiDAO.list();
    }
    public void add(PhieuNhapSachDTO loai) throws Exception {
        dsPNS.add(loai);
        PhieuNhapSachDAO loaiDAO = new PhieuNhapSachDAO();
        loaiDAO.add(loai);
    }
    public void delete(int IDPhieuNhap) throws Exception {
        for(PhieuNhapSachDTO ct : dsPNS) {
            if(ct.getIDPhieuNhap()== IDPhieuNhap) {
                dsPNS.remove(ct);
                PhieuNhapSachDAO loaiDAO = new PhieuNhapSachDAO();
                loaiDAO.delete(IDPhieuNhap);
                
            }
        }
    }
    public void set(PhieuNhapSachDTO s) throws Exception {
        for(int i = 0; i < dsPNS.size(); i++) {
            if(dsPNS.get(i).getIDPhieuNhap()==(s.getIDPhieuNhap())) {
                dsPNS.set(i, s);
                PhieuNhapSachDAO dao=new PhieuNhapSachDAO();
                dao.set(s);
                
            }
        }
    }
}
