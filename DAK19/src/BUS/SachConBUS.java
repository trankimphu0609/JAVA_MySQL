
package BUS;

import DATA.SachConDAO;
import DTO.DSTinhTrangDTO;
import DTO.SachConDTO;
import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.util.ArrayList;


public class SachConBUS {
    public static ArrayList <SachConDTO> dssc;
    public static ArrayList <SachConDTO> dsscchose;
    public static ArrayList<DSTinhTrangDTO> combobox;
    public SachConBUS(){
        
    }
    public void DocDS() throws SQLException, Exception{
        SachConDAO data= new SachConDAO();
        if(dssc==null){
            dssc=new ArrayList<SachConDTO>();
        }
            dssc=data.list(); 
    }
    public ArrayList <SachConDTO> DocDS(int ma) throws SQLException, Exception{
        ArrayList <SachConDTO> kq= new ArrayList <SachConDTO>();
        SachConDAO data= new SachConDAO();
            kq=data.list(ma); 
            if(dsscchose==null){
            dsscchose=new ArrayList<SachConDTO>();
            }
            dsscchose=data.list(ma); 
        return kq;
    }
    public void combobox() throws Exception{
        SachConDAO data = new SachConDAO();
        if(combobox==null)
            combobox= new ArrayList<DSTinhTrangDTO>();
        combobox=data.combobox();
    }
    public void Them(SachConDTO dg) throws Exception{
        SachConDAO data= new SachConDAO();
        data.add(dg);
        DocDS();
        dssc.add(dg);
        
    }
    public void Xoa(int maDS, int maSC) throws Exception{
        for(SachConDTO ct : dsscchose) {
            if(ct.getMaSachCon() == maSC && ct.getMaDS()==maDS) {
                dsscchose.remove(ct);
                
                SachConDAO loaiDAO = new SachConDAO();
                loaiDAO.delete(maDS,maSC);
                return;
            }
        }
        
    }
    public void Sua(SachConDTO sachcon, int i) throws SQLException, Exception {
        SachConDAO data= new SachConDAO();
        data.set(sachcon);
        dssc.set(i, sachcon);
    }
    public void SuaHienTrang(SachConDTO s) throws Exception {
        System.out.println("SachconBus"+s.toString());
        DocDS();
        for(int i = 0; i < dssc.size(); i++) {
            if(dssc.get(i).getMaDS() == s.getMaDS() && dssc.get(i).getMaSachCon()==s.getMaSachCon()) {
                dssc.get(i).setHientrang(s.getHientrang());
                dssc.get(i).setMaTinhTrang(s.getMaTinhTrang());
            }
            SachConDAO loaiDAO = new SachConDAO();
            loaiDAO.setHienTrang(s);
        }
    }
    public SachConDTO timkiem(int ma) throws Exception{
        if(dssc==null){
            DocDS();
        }
        for(SachConDTO ds : dssc){
            if(ds.getMaDS() == ma)
                return ds;
        }
        return null;
    }
    
    public ArrayList<SachConDTO> Timkiem(String ten) {
        ArrayList<SachConDTO> kq= new ArrayList<SachConDTO>();
        for(SachConDTO sv : dssc)
        {
            if(sv.getMaDS() == parseInt(ten))
                kq.add(sv);
        }
        return kq;
    }

    public void Xoa(SachConDTO sachcon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
