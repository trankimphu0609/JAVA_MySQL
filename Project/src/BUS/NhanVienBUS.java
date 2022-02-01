
package BUS;

import DATA.NhanVienDAO;
import DTO.NhanVienDTO;
import java.sql.SQLException;
import java.util.ArrayList;


public class NhanVienBUS {
    public static ArrayList <NhanVienDTO> dsnv;
    public NhanVienBUS(){
        
    }
    public static void DocDSNV() throws SQLException, Exception{
        NhanVienDAO data= new NhanVienDAO();
        if(dsnv==null){
            dsnv=new ArrayList<NhanVienDTO>();
        }
        dsnv=data.list();
    }
    public void Them(NhanVienDTO nv) throws Exception{
        NhanVienDAO data= new NhanVienDAO();
        data.add(nv);
        dsnv.add(nv);
        
    }
    public void Xoa(int maNV) throws Exception{
        for(NhanVienDTO ct : dsnv) {
            if(ct.getMaNV() == maNV) {
                dsnv.remove(ct);
                NhanVienDAO loaiDAO = new NhanVienDAO();
                loaiDAO.delete( Integer.toString(maNV));
                return;
            }
        }
    }
    public void Sua(NhanVienDTO nv) throws Exception{
        for(int i = 0; i < dsnv.size(); i++ ) {
            if(dsnv.get(i).getMaNV()== nv.getMaNV()) {
                dsnv.set(i, nv);
                
                
            }
        }
        NhanVienDAO loaiDAO = new NhanVienDAO();
        loaiDAO.set(nv);
        
    }
    public NhanVienDTO timkiem(int ma){
        for(NhanVienDTO nv : dsnv){
            if(nv.getMaNV() == ma)
                return nv;
        }
        return null;
    }
    public ArrayList <NhanVienDTO> timkiemtheoHo(String Ho){
        ArrayList <NhanVienDTO> kq= new ArrayList <NhanVienDTO>();
        for(NhanVienDTO nv : dsnv){
            if(nv.getHo().indexOf(Ho)>=0)
                kq.add(nv);
        }
        return kq;
    }
    public ArrayList <NhanVienDTO> timkiemtheoTen(String Ten){
        ArrayList <NhanVienDTO> kq= new ArrayList <NhanVienDTO>();
        for(NhanVienDTO nv : dsnv){
            if(nv.getTen().equals(Ten))
                kq.add(nv);
        }
        return kq;
    }
    public String getFullname(int ma){
        for(NhanVienDTO nv : dsnv){
            if(nv.getMaNV() == ma){
                return nv.getFullname();
            }
                
        }
        return "";
    }
}
