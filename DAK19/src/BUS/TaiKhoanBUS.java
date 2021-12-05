
package BUS;


import DATA.TaiKhoanDAO;
import DTO.NhanVienDTO;
import DTO.TaiKhoanDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;


public class TaiKhoanBUS {
    public static ArrayList <TaiKhoanDTO> dstk;
    public TaiKhoanBUS(){
        
    }
    public void DocTK() throws SQLException, Exception{
        TaiKhoanDAO data= new TaiKhoanDAO();
        if(dstk==null){
            dstk=new ArrayList<TaiKhoanDTO>();
        }
        dstk=data.list();
    }
    public void Them(TaiKhoanDTO dg) throws Exception{
        TaiKhoanDAO data= new TaiKhoanDAO();
        data.add(dg);
        dstk.add(dg);
        
    }
    public void Xoa(int matk) throws Exception{
        for(TaiKhoanDTO ct : dstk) {
            if(ct.getMatk() == matk) {
                dstk.remove(ct);
                TaiKhoanDAO loaiDAO = new TaiKhoanDAO();
                loaiDAO.delete(matk);
                return;
            }
        }
    }
    public void Sua(TaiKhoanDTO nv) throws Exception{
        for(int i = 0; i < dstk.size(); i++ ) {
            if(dstk.get(i).getMatk()== nv.getMatk()) {
                dstk.set(i, nv); 
            }
        }
        TaiKhoanDAO loaiDAO = new TaiKhoanDAO();
        loaiDAO.set(nv);
        
    }
    public TaiKhoanDTO timkiem(int ma){
        for(TaiKhoanDTO nv : dstk){
            if(nv.getMatk() == ma)
                return nv;
        }
        return null;
    }
    public ArrayList<TaiKhoanDTO> getList() {
        return dstk;
    }
    public TaiKhoanDTO timkiemTen(String username) {
        for(TaiKhoanDTO tk : dstk) {
            if(tk.getUsername().equals(username)) {
                return tk;
            }
        }
        return null;
    }
    public int CheckMaTK(int maTK) throws Exception{
        if(NhanVienBUS.dsnv==null){
            NhanVienBUS.DocDSNV(); 
        }
        for(int i=0; i<NhanVienBUS.dsnv.size(); i++){
            if(NhanVienBUS.dsnv.get(i).getMaNV()==maTK){
                return 1;
            }
        }
        return 0;
    }
    public TaiKhoanDTO check(String user, String pass){
        for(TaiKhoanDTO tk : dstk){
            if(tk.getUsername().equals(user)){
                return tk;
            }
        }
        return null;
    }
    
}
