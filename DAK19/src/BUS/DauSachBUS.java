package BUS;

import DATA.DauSachDAO;
import DTO.ChooseSachDTO;
import DTO.DauSachDTO;
import java.sql.SQLException;
import java.util.ArrayList;


public class DauSachBUS {
    public static ArrayList <DauSachDTO> dsds;
    public static ArrayList <ChooseSachDTO> dschoose;
    public static ArrayList <ChooseSachDTO> dschooseMuon;
    public static ArrayList <ChooseSachDTO> dschooseTra;
    public DauSachBUS(){
        
    }
    public void DocDS() throws SQLException, Exception{
        DauSachDAO data= new DauSachDAO();
        if(dsds==null){
            dsds=new ArrayList<DauSachDTO>();
        }
        dsds=data.list();
    }
    public void Them(DauSachDTO dg) throws Exception{
        DauSachDAO data= new DauSachDAO();
        data.add(dg);
        dsds.add(dg);
        
    }
    public void Xoa(int maDS) throws Exception{
        for(DauSachDTO ct : dsds) {
            if(ct.getMaDS() == maDS) {
                dsds.remove(ct);
                DauSachDAO loaiDAO = new DauSachDAO();
                loaiDAO.delete( Integer.toString(maDS));
                return;
            }
        }
    }
    public void Sua(DauSachDTO sach, int i) throws SQLException, Exception {
        DauSachDAO data= new DauSachDAO();
        data.set(sach);
        dsds.set(i, sach);
    }
    public DauSachDTO timkiem(int ma){
        for(DauSachDTO ds : dsds){
            if(ds.getMaDS() == ma)
                return ds;
        }
        return null;
    }
    public ArrayList<DauSachDTO> Timkiem (String ten){
        ArrayList<DauSachDTO> kq= new ArrayList<DauSachDTO>();
        for(DauSachDTO sv : dsds)
        {
            if(sv.getTenSach().equals(ten))
                kq.add(sv);
        }
        return kq;
    }
    public ArrayList <DauSachDTO> timkiemtheoTenTG(String Ten) throws Exception{
        ArrayList <DauSachDTO> kq= new ArrayList <DauSachDTO>();
        TacGiaBUS tg= new TacGiaBUS();
        int ma=tg.timkiem(Ten);
        
        for(DauSachDTO ds : dsds){
            if(ds.getMaTG()==ma)
                kq.add(ds);
        }
        return kq;
    }
    public ArrayList <DauSachDTO> timkiemTong(String TenTG, String TenDS) throws Exception{
        ArrayList <DauSachDTO> kq= new ArrayList <DauSachDTO>();
        TacGiaBUS tg= new TacGiaBUS();
        int ma=tg.timkiem(TenTG);
        
        for(DauSachDTO ds : dsds){
            if(ds.getMaTG()==ma && ds.getTenSach().equals(TenDS))
                kq.add(ds);
        }
        return kq;
    }
    public void DocDSChoose() throws SQLException, Exception{
        DauSachDAO data= new DauSachDAO();
        
            dschoose=new ArrayList<ChooseSachDTO>();
            dschoose=data.listChoose();
        
    }
    public void DocDSChoose(String MaPM) throws SQLException, Exception{
        DauSachDAO data= new DauSachDAO();
            if(dschooseMuon==null){
                dschooseMuon=new ArrayList<ChooseSachDTO>(); 
            }
            dschooseMuon=data.listChoose(MaPM);
        
    }

    public void DocDSChooseT(String MaPM) throws Exception {
           DauSachDAO data= new DauSachDAO();
            if(dschooseTra==null){
                dschooseTra=new ArrayList<ChooseSachDTO>(); 
            }
            dschooseTra=data.listChooseT(MaPM);
    }
    
    public ArrayList<ChooseSachDTO> TimkiemDSChoose (String ten){
        ArrayList<ChooseSachDTO> kq= new ArrayList<ChooseSachDTO>();
        for(ChooseSachDTO sv : dschoose)
        {
            if(sv.getTensach().equals(ten))
                kq.add(sv);
        }
        return kq;
    }
    public String timTentheoMaDS(int maDS){
        for(DauSachDTO ds : dsds){
            if(ds.getMaDS()==maDS){
                return ds.getTenSach();
            }
        }
        return null;
    }
}

