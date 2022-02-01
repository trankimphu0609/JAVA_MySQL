
package DATA;

import DTO.ChiTietPhieuMuonDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Logger;


public class ChiTietPhieuMuonDAO {
    static Connection conn=null;
    Statement st=null;
    ResultSet rs=null;
    MySQLConnect mySQL = new MySQLConnect();
    public ChiTietPhieuMuonDAO() throws Exception {
        if(conn==null){
            try{
                conn= mySQL.open();
            }
            catch (SQLException ex) {
                System.out.println("loi1");
            } 
            
        }
    }
    
    public ArrayList<ChiTietPhieuMuonDTO> list(String MaPM) {
        ArrayList<ChiTietPhieuMuonDTO> dsct = new ArrayList<>();
        
        try {
            String sql = "SELECT chitietphieumuon.maPM, chitietphieumuon.maDS, dausach.tensach, chitietphieumuon.soluong FROM chitietphieumuon, dausach WHERE chitietphieumuon.maDS=dausach.maDS AND chitietphieumuon.maPM="+MaPM; 
            st= conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()) {
               int maPM = rs.getInt("maPM");
               int maDS =  rs.getInt("MaDS");
               String Tensach = rs.getString("tensach");
               int soLuong = rs.getInt("soluong");
               
               ChiTietPhieuMuonDTO ct = new ChiTietPhieuMuonDTO(maPM, maDS, Tensach,soLuong);
               System.out.println(ct.getTensach());
               dsct.add(ct);
            }
            rs.close();
            return dsct;
        }catch (SQLException ex) {
            Logger.getLogger(null,null);
            return null;
        }
    }
    
    
    public void add(ChiTietPhieuMuonDTO ct) throws SQLException {
        MySQLConnect mySQL = new MySQLConnect();
        
        String sql = "INSERT INTO chitietphieumuon VALUES (";
               sql += ct.getMaPM();
               sql += "," + ct.getMaDS();
               sql += "," + ct.getSoluong() + ")";
        System.out.println(sql);
        System.out.println("CTPM DAO "+ct.toString());
        st= conn.createStatement();
        st.executeUpdate(sql);
    }
    public void delete(String maPM) throws SQLException {
        MySQLConnect mySQL = new MySQLConnect();
        String sql = "DELETE FROM chitietphieumuon WHERE maPM=" + maPM;
        st= conn.createStatement();
        st.executeUpdate(sql); 
        System.out.println(sql);
    }
    public void set(ChiTietPhieuMuonDTO pm){
        try{
        
        String qry="UPDATE chitietphieumuon SET maPM="+pm.getMaPM()+",maDS="+pm.getMaDS()+",soluong="+pm.getSoluong()+ " WHERE maPM= "+pm.getMaPM()+" AND maDS="+pm.getMaDS();
        System.out.println(qry); 
        st= conn.createStatement();
        st.executeUpdate(qry);
        }
        catch (SQLException ex) {
            System.out.println("loiSua");
        }
    }
}
