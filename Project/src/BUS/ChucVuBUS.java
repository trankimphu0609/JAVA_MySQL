
package BUS;

import DATA.ChucVuDAO;
import DTO.ChucVuDTO;
import java.sql.SQLException;
import java.util.ArrayList;


public class ChucVuBUS {
    public static ArrayList <ChucVuDTO> dscv;
    public ChucVuBUS(){
        
    }
    public void DocDSCV() throws SQLException, Exception{
        ChucVuDAO data= new ChucVuDAO();
        if(dscv==null){
            dscv=new ArrayList<ChucVuDTO>();
        }
        dscv=data.list();
    }
    public void Them(ChucVuDTO cv) throws Exception{
        ChucVuDAO data= new ChucVuDAO();
        data.add(cv);
        dscv.add(cv);
    }
    public void Xoa(int maCV) throws Exception{
        for(ChucVuDTO ct : dscv) {
            if(ct.getMaCV() == maCV) {
                dscv.remove(ct);
                ChucVuDAO loaiDAO = new ChucVuDAO();
                loaiDAO.delete(maCV);
                return;
            }
        }
    }
    public void Sua(ChucVuDTO nv) throws Exception{
        for(int i = 0; i < dscv.size(); i++ ) {
            if(dscv.get(i).getMaCV()== nv.getMaCV()) {
                dscv.set(i, nv);
                return;
            }
        }
        ChucVuDAO loaiDAO = new ChucVuDAO();
        loaiDAO.set(nv);
    }
    
}
