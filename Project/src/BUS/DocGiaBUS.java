
package BUS;
import DATA.DocGiaDAO;
import DTO.DocGiaDTO;
import java.sql.SQLException;
import java.util.ArrayList;


public class DocGiaBUS {
    public static ArrayList <DocGiaDTO> dsdg;
    public DocGiaBUS(){
        
    }
    public void DocDSDG() throws SQLException, Exception{
        DocGiaDAO data= new DocGiaDAO();
        if(dsdg==null){
            dsdg=new ArrayList<DocGiaDTO>();
            dsdg=data.list();
        }
    }
    public void Them(DocGiaDTO dg) throws Exception{
        DocGiaDAO data= new DocGiaDAO();
        data.add(dg);
        dsdg.add(dg);
        
    }
    public void Xoa(int maDG) throws Exception{
        for(DocGiaDTO ct : dsdg) {
            if(ct.getMaDG() == maDG) {
                dsdg.remove(ct);
                DocGiaDAO loaiDAO = new DocGiaDAO();
                loaiDAO.delete( Integer.toString(maDG));
                return;
            }
        }
    }
    public void Sua(DocGiaDTO nv) throws Exception{
        for(int i = 0; i < dsdg.size(); i++ ) {
            if(dsdg.get(i).getMaDG()== nv.getMaDG()) {
                dsdg.set(i, nv); 
            }
        }
        DocGiaDAO loaiDAO = new DocGiaDAO();
        loaiDAO.set(nv);
        
    }
    public DocGiaDTO timkiem(int ma){
        for(DocGiaDTO nv : dsdg){
            if(nv.getMaDG() == ma)
                return nv;
        }
        return null;
    }
    public ArrayList <DocGiaDTO> timkiemtheoHo(String Ho){
        ArrayList <DocGiaDTO> kq= new ArrayList <DocGiaDTO>();
        for(DocGiaDTO nv : dsdg){
            if(nv.getHoDG().indexOf(Ho)>=0)
                kq.add(nv);
        }
        return kq;
    }
    public ArrayList <DocGiaDTO> timkiemtheoTen(String Ten){
        ArrayList <DocGiaDTO> kq= new ArrayList <DocGiaDTO>();
        for(DocGiaDTO nv : dsdg){
            if(nv.getTenDG().indexOf(Ten)>=0)
                kq.add(nv);
        }
        return kq;
    }
    public ArrayList <DocGiaDTO> timkiemtheoMaThe(int maTheTV) throws Exception{
        ArrayList <DocGiaDTO> kq= new ArrayList <DocGiaDTO>();
        DocGiaDAO data= new DocGiaDAO();
        kq = data.list_timkiem(maTheTV);
        return kq;
    }
}
