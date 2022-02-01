
package DATA;

import DTO.ChiTietSachTraDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Logger;


public class ChiTietSachTraDAO {
    static Connection conn=null;
    Statement st=null;
    ResultSet rs=null;
    MySQLConnect mySQL = new MySQLConnect();
    public ChiTietSachTraDAO() throws Exception {
        if(conn==null){
            try{
                conn= mySQL.open();
            }
            catch (SQLException ex) {
                System.out.println("loi1");
            } 
            
        }
    }
    
    public ArrayList<ChiTietSachTraDTO> list(String mapt, String mads) {
        ArrayList<ChiTietSachTraDTO> dsct = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM chitietsachtra WHERE maPT="+mapt+" AND maDS="+mads; 
            st= conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()) {
               int maPT = rs.getInt("maPT");
               int maDS = rs.getInt("maDS");
               int maSachCon =  rs.getInt("masachcon");
               String maTT = rs.getString("maTT");
               
               
               ChiTietSachTraDTO ct = new ChiTietSachTraDTO(maPT, maDS,maSachCon, maTT);
               dsct.add(ct);
            }
            rs.close();
            
            return dsct;
        }catch (SQLException ex) {
            return null;
        }
    }
    public ArrayList<ChiTietSachTraDTO> list() {
        ArrayList<ChiTietSachTraDTO> dsct = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM chitietsachtra"; 
            st= conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()) {
               int maPT = rs.getInt("maPT");
               int maDS = rs.getInt("maDS");
               int maSachCon =  rs.getInt("masachcon");
               String maTT = rs.getString("maTT");
               
               
               ChiTietSachTraDTO ct = new ChiTietSachTraDTO(maPT, maDS,maSachCon, maTT);
               dsct.add(ct);
            }
            rs.close();
            
            return dsct;
        }catch (SQLException ex) {
            return null;
        }
    }
    public void add(ChiTietSachTraDTO ct) throws SQLException {
        MySQLConnect mySQL = new MySQLConnect();
        String sql = "INSERT INTO chitietsachtra VALUES (";
               sql += ct.getMaPT();
               sql += "," + ct.getMaDS();
               sql += "," + ct.getMaSachcon();
               sql += ",'" + ct.getMaTT() + "')";
               
        System.out.println(sql);
        st= conn.createStatement();
        st.executeUpdate(sql);
    }
    public void delete(String maPT) throws SQLException {
        MySQLConnect mySQL = new MySQLConnect();
        String sql = "DELETE FROM chitietsachtra WHERE maPT='" + maPT + "'";
        st= conn.createStatement();
        st.executeUpdate(sql); 
        System.out.println(sql);
    }

    
}
