package BUS;

import DATA.PhieuMuonDAO;
import DTO.PhieuMuonDTO;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class PhieuMuonBUS {
    public static ArrayList <PhieuMuonDTO> dspm;
    public PhieuMuonBUS(){
        
    }
    public void DocPM() throws SQLException, Exception{
        PhieuMuonDAO data= new PhieuMuonDAO();
        
            dspm=new ArrayList<PhieuMuonDTO>();
            dspm=data.list();
        
    }
    public void Them(PhieuMuonDTO dg) throws Exception{
        PhieuMuonDAO data= new PhieuMuonDAO();
        data.add(dg);
        dspm.add(dg);
        
    }
    public void Xoa(int mapm) throws Exception{
        for(PhieuMuonDTO ct : dspm) {
            if(ct.getMaPM() == mapm) {
                dspm.remove(ct);
                PhieuMuonDAO loaiDAO = new PhieuMuonDAO();
                loaiDAO.delete(mapm);
                return;
            }
        }
    }
    public void Sua(PhieuMuonDTO nv) throws Exception{
        for(int i = 0; i < dspm.size(); i++ ) {
            if(dspm.get(i).getMaPM()== nv.getMaPM()) {
                dspm.set(i, nv); 
            }
        }
        PhieuMuonDAO loaiDAO = new PhieuMuonDAO();
        loaiDAO.set(nv);
        
    }
    public PhieuMuonDTO timkiem(int ma){
        for(PhieuMuonDTO nv : dspm){
            if(nv.getMaPM() == ma)
                return nv;
        }
        return null;
    }
    public ArrayList <PhieuMuonDTO> timkiemtheoMaTheTV(int mathetv){
        ArrayList <PhieuMuonDTO> kq= new ArrayList <PhieuMuonDTO>();
        for(PhieuMuonDTO pm : dspm){
            if(pm.getMatheTV()==mathetv){
                kq.add(pm);
                return kq;
            }
        }
        return null;
    }
    public ArrayList <PhieuMuonDTO> timkiemtheoMaPM(int mapm){
        ArrayList <PhieuMuonDTO> kq= new ArrayList <PhieuMuonDTO>();
        for(PhieuMuonDTO nv : dspm){
            if(nv.getMaPM()==mapm){
                kq.add(nv);
                return kq;
            }
        }
        return null;
    }
    /// ngay bat dau <= ngay muon <= ngay ket thuc  hoac ngay bat dau <= ngay hen tra <= ngay ket thuc
    public ArrayList<PhieuMuonDTO> timTheoNgay(String start, String end) throws ParseException{
        ArrayList<PhieuMuonDTO> list = new ArrayList<>();
        for(PhieuMuonDTO b : dspm){
            Date ngay= new SimpleDateFormat("yyyy-MM-dd").parse(b.getNgaymuon());
            Date BD= new SimpleDateFormat("yyyy-MM-dd").parse(start);
            Date KT= new SimpleDateFormat("yyyy-MM-dd").parse(end);
       
            if( (BD.compareTo(ngay)<=0 && ngay.compareTo(KT)<=0))
                list.add(b);
        }
        return list;
    }
}
