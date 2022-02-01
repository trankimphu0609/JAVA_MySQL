
package BUS;

import DATA.QuyenDAO;
import DTO.QuyenDTO;
import java.sql.SQLException;
import java.util.ArrayList;


public class QuyenBUS {
    public static ArrayList <QuyenDTO> dsq;
    public QuyenBUS(){
        
    }
    public void DocQ() throws SQLException, Exception{
        QuyenDAO data= new QuyenDAO();
        if(dsq==null){
            dsq=new ArrayList<QuyenDTO>();
        }
        dsq=data.list();
    }
    public void Them(QuyenDTO dg) throws Exception{
        QuyenDAO data= new QuyenDAO();
        data.add(dg);
        dsq.add(dg);
        
    }
    public void Xoa(int maquyen) throws Exception{
        for(QuyenDTO ct : dsq) {
            if(ct.getMaquyen() == maquyen) {
                dsq.remove(ct);
                QuyenDAO loaiDAO = new QuyenDAO();
                loaiDAO.delete(maquyen);
                return;
            }
        }
    }
    public void Sua(QuyenDTO q) throws Exception{
        for(int i = 0; i < dsq.size(); i++ ) {
            if(dsq.get(i).getMaquyen()== q.getMaquyen()) {
                dsq.set(i, q); 
            }
        }
        QuyenDAO loaiDAO = new QuyenDAO();
        loaiDAO.set(q);
        
    }
    public QuyenDTO timkiem(int ma){
        for(QuyenDTO q : dsq){
            if(q.getMaquyen() == ma)
                return q;
        }
        return null;
    }
}
