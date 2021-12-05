package BUS;


import DATA.PhieuTraDAO;
import DTO.PhieuTraDTO;
import java.sql.SQLException;
import java.util.ArrayList;


public class PhieuTraBUS {
    public static ArrayList <PhieuTraDTO> dspt;
    public PhieuTraBUS(){
        
    }
    public void DocDSPT() throws SQLException, Exception{
        PhieuTraDAO data= new PhieuTraDAO();
        if(dspt==null){
            dspt=new ArrayList<PhieuTraDTO>();
        }
        dspt=data.list();
    }
    public void Them(PhieuTraDTO dg) throws Exception{
        PhieuTraDAO data= new PhieuTraDAO();
        data.add(dg);
        dspt.add(dg);
        
    }
    public void Xoa(int maPT) throws Exception{
        for(PhieuTraDTO ct : dspt) {
            if(ct.getMaPT() == maPT) {
                dspt.remove(ct);
                PhieuTraDAO loaiDAO = new PhieuTraDAO();
                loaiDAO.delete(maPT);
                return;
            }
        }
    }
    
    
    public PhieuTraDTO timkiem(int ma){
        for(PhieuTraDTO nv : dspt){
            if(nv.getMaPT() == ma)
                return nv;
        }
        return null;
    }
}

