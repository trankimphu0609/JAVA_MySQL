
package BUS;


import DATA.TacGiaDAO;
import DTO.TacGiaDTO;
import java.sql.SQLException;
import java.util.ArrayList;


public class TacGiaBUS {
    public static ArrayList <TacGiaDTO> dstg;
    public TacGiaBUS(){
        
    }
    public void DocTG() throws SQLException, Exception{
        TacGiaDAO data= new TacGiaDAO();
        if(dstg==null){
            dstg=new ArrayList<TacGiaDTO>();
        }
        dstg=data.list();
    }
    public void Them(TacGiaDTO dg) throws Exception{
        TacGiaDAO data= new TacGiaDAO();
        data.add(dg);
        dstg.add(dg);
        
    }
//        public void Xoa(TacGiaDTO tacgia) throws Exception
//    {
//        TacGiaDAO data= new TacGiaDAO();
//        data.Xoa(tacgia.getMaTG());
//        dstg.remove(tacgia);
//    }
    public void Xoa(int maTG) throws Exception{
        for(TacGiaDTO ct : dstg) {
            if(ct.getMaTG() == maTG) {
                dstg.remove(ct);
                TacGiaDAO loaiDAO = new TacGiaDAO();
                loaiDAO.delete(maTG);
                return;
            }
        }
    }
        public void Sua(TacGiaDTO tacgia, int i) throws Exception {
        TacGiaDAO data= new TacGiaDAO();
        data.Sua(tacgia);
        dstg.set(i, tacgia);
    }
    public TacGiaDTO timkiem(int ma){
        for(TacGiaDTO nv : dstg){
            if(nv.getMaTG() == ma)
                return nv;
        }
        return null;
    }
    public int timkiem(String ten) throws Exception{
        if(dstg==null){
            DocTG();
        }
        for(TacGiaDTO nv : dstg){
            if(nv.getTenTG().equals(ten))
                return nv.getMaTG();
        }
        return -1;
    }
        public ArrayList<TacGiaDTO> Timkiem (String ten){
        ArrayList<TacGiaDTO> kq= new ArrayList<TacGiaDTO>();
        for(TacGiaDTO sv : dstg)
        {
            if(sv.getTenTG().indexOf(ten)>=0)
                kq.add(sv);
        }
        return kq;
    }
    
}
