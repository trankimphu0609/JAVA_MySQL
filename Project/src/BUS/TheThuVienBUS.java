
package BUS;
import DATA.TheThuVienDAO;
import DTO.TheThuVienDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public class TheThuVienBUS {
    public static ArrayList <TheThuVienDTO> dsthe;
    public TheThuVienBUS(){
        
    }
    public void DocDSThe() throws SQLException, Exception{
        TheThuVienDAO data= new TheThuVienDAO();
        if(dsthe==null){
            dsthe=new ArrayList<TheThuVienDTO>();
        }
        dsthe=data.list();
    }
    public void Them(TheThuVienDTO the) throws Exception{
        TheThuVienDAO data= new TheThuVienDAO();
        data.add(the);
        dsthe.add(the);
        
    }
    public void Xoa(int maThe) throws Exception{
        for(TheThuVienDTO ct : dsthe) {
            if(ct.getMatheTV() == maThe) {
                dsthe.remove(ct);
                TheThuVienDAO loaiDAO = new TheThuVienDAO();
                loaiDAO.delete(maThe);
                return;
            }
        }
    }
    public void Sua(TheThuVienDTO the) throws Exception{
        for(int i = 0; i < dsthe.size(); i++ ) {
            if(dsthe.get(i).getMatheTV()== the.getMatheTV()) {
                dsthe.set(i, the);
                
                
            }
        }
        TheThuVienDAO loaiDAO = new TheThuVienDAO();
        loaiDAO.set(the);
        
    }
    
    public ArrayList <TheThuVienDTO> TimkiemMaThe(int maThe){
        ArrayList <TheThuVienDTO> kq= new ArrayList <TheThuVienDTO>();
        for(TheThuVienDTO the : dsthe){
            if(the.getMatheTV() == maThe){
                kq.add(the);
                return kq;
            }
        }
        return null;
    }
    
    public ArrayList <TheThuVienDTO> TimkiemMaDG(int maDG){
        ArrayList <TheThuVienDTO> kq= new ArrayList <TheThuVienDTO>();
        for(TheThuVienDTO the : dsthe){
            if(the.getMaDocGia() == maDG){
                kq.add(the);
                return kq;
            }
        }
        return null;
    }
}
