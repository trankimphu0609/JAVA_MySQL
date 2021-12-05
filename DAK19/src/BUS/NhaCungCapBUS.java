
package BUS;

import DATA.NhaCungCapDAO;
import DTO.NhaCungCapDTO;
import java.util.ArrayList;


public class NhaCungCapBUS {
    public static ArrayList<NhaCungCapDTO> arrayncc;
    public NhaCungCapBUS(){}
    public void Doc() throws Exception{
        NhaCungCapDAO data = new NhaCungCapDAO();
        if(arrayncc==null)
            arrayncc= new ArrayList<NhaCungCapDTO>();
        arrayncc=data.Doc();
    }

    public void Them(NhaCungCapDTO ncc) throws Exception{
        NhaCungCapDAO data= new NhaCungCapDAO();
        data.Them(ncc);
        arrayncc.add(ncc);
    }

    public void Sua(NhaCungCapDTO ncc, int i) throws Exception {
        NhaCungCapDAO data= new NhaCungCapDAO();
        data.Sua(ncc);
        arrayncc.set(i, ncc);
    }
    public void Xoa(NhaCungCapDTO ncc) throws Exception
    {
        NhaCungCapDAO data= new NhaCungCapDAO();
        data.Xoa(ncc.getMaNCC());
        arrayncc.remove(ncc);
    }
    public ArrayList<NhaCungCapDTO> Timkiemten (String ten){
        ArrayList<NhaCungCapDTO> kq= new ArrayList<NhaCungCapDTO>();
        for(NhaCungCapDTO sv : arrayncc)
        {
            if(sv.getTenNCC().equals(ten))
                kq.add(sv);
        }
        return kq;
    }
    public ArrayList<NhaCungCapDTO> Timkiemma (int ma){
        ArrayList<NhaCungCapDTO> kq= new ArrayList<NhaCungCapDTO>();
        for(NhaCungCapDTO sv : arrayncc)
        {
            if(sv.getMaNCC().equals(Integer.toString(ma)))
                kq.add(sv);
        }
        return kq;
    }
}
