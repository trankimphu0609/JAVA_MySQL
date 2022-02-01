
package DATA;

import DTO.ChiTietPhieuTraDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Logger;


public class ChiTietPhieuTraDAO {
    static Connection conn=null;
    Statement st=null;
    ResultSet rs=null;
    MySQLConnect mySQL = new MySQLConnect();
    public ChiTietPhieuTraDAO() throws Exception {
        if(conn==null){
            try{
                conn= mySQL.open();
            }
            catch (SQLException ex) {
                System.out.println("loi1");
            } 
            
        }
    }
    
    public ArrayList<ChiTietPhieuTraDTO> list(String MaPT) {
        ArrayList<ChiTietPhieuTraDTO> dsct = new ArrayList<>();
        
        try {
            String sql = "SELECT chitietphieutra.maPT, chitietphieutra.maDS, dausach.tensach, chitietphieutra.soluongtra FROM chitietphieutra, dausach WHERE chitietphieutra.maDS=dausach.maDS AND chitietphieutra.maPT="+MaPT; 
            st= conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()) {
               int maPT = rs.getInt("maPT");
               int maDS =  rs.getInt("MaDS");
               String Tensach = rs.getString("tensach");
               int soLuong = rs.getInt("soluongtra");
               
               
               ChiTietPhieuTraDTO ct = new ChiTietPhieuTraDTO(maPT, maDS,soLuong, Tensach);
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
    public void add(ChiTietPhieuTraDTO ct) throws SQLException {
        MySQLConnect mySQL = new MySQLConnect();
        
        String sql = "INSERT INTO chitietphieutra VALUES (";
               sql += ct.getMaPT();
               sql += "," + ct.getMaDS();
               sql += "," + ct.getSoluongtra()+")";
               
        System.out.println(sql);
        System.out.println("CTPT DAO "+ct.toString());
        st= conn.createStatement();
        st.executeUpdate(sql);
    }
    public void delete(String maPT) throws SQLException {
        MySQLConnect mySQL = new MySQLConnect();
        String sql = "DELETE FROM chitietphieutra WHERE maPT=" + maPT;
        st= conn.createStatement();
        st.executeUpdate(sql); 
        System.out.println(sql);
    }
    public void set(ChiTietPhieuTraDTO pt){
        try{
        
        String qry="UPDATE chitietphieutra SET maPT="+pt.getMaPT()+",maDS="+pt.getMaDS()+",soluongtra="+pt.getSoluongtra()+ " WHERE maPT= "+pt.getMaPT()+" AND maDS="+pt.getMaDS();
        System.out.println(qry); 
        st= conn.createStatement();
        st.executeUpdate(qry);
        }
        catch (SQLException ex) {
            System.out.println("loiSua");
        }
    }
}
