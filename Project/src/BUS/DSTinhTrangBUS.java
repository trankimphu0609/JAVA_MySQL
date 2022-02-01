package BUS;

import DATA.DSTinhTrangDAO;
import DTO.DSTinhTrangDTO;
import java.util.ArrayList;


public class DSTinhTrangBUS {
    public static ArrayList<DSTinhTrangDTO> dsTinhTrang;
    public DSTinhTrangBUS() {
        
    }
    public DSTinhTrangBUS(int i) throws Exception {
        list();
    }
    public void list() throws Exception {
        DSTinhTrangDAO loaiDAO = new DSTinhTrangDAO();
        if(dsTinhTrang==null){
        dsTinhTrang = new ArrayList<DSTinhTrangDTO>();
        }
        dsTinhTrang = loaiDAO.list();
    }
    public void add(DSTinhTrangDTO loai) throws Exception {
        dsTinhTrang.add(loai);
        DSTinhTrangDAO loaiDAO = new DSTinhTrangDAO();
        loaiDAO.add(loai);
    }
    public void delete(String maTT) throws Exception {
        for(DSTinhTrangDTO ct : dsTinhTrang) {
            if(ct.getMaTinhTrang().equals(maTT)) {
                dsTinhTrang.remove(ct);
                DSTinhTrangDAO loaiDAO = new DSTinhTrangDAO();
                loaiDAO.delete(maTT);
                return;
            }
        }
    }
    public void set(DSTinhTrangDTO s) throws Exception {
        System.out.println(s);
        for(int i = 0; i < dsTinhTrang.size(); i++) {
            
            if(dsTinhTrang.get(i).getMaTinhTrang().equals(s.getMaTinhTrang())) {
                DSTinhTrangDAO dao=new DSTinhTrangDAO();
                dsTinhTrang.set(i, s);
                dao.set(s);
                System.out.println("22222");
            }
        }
    }
    public DSTinhTrangDTO search(String maTT) {
        for(DSTinhTrangDTO ct : dsTinhTrang) {
            if(ct.getMaTinhTrang().equals(maTT)) {
                return ct;
            }
        }
        return null;
    }
}
