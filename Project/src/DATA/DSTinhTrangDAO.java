
package DATA;

import DTO.DSTinhTrangDTO;
import java.util.ArrayList;
import DATA.MySQLConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;


public class DSTinhTrangDAO {
    static Connection conn=null;
    Statement st=null;
    ResultSet rs=null;
    MySQLConnect mySQL = new MySQLConnect();
    
    public DSTinhTrangDAO() throws Exception {
        if(conn==null){
            try{
                conn= mySQL.open();
            }
            catch (SQLException ex) {
                System.out.println("loi1");
            } 
            
        }
    }
    
    public ArrayList<DSTinhTrangDTO> list() {
        ArrayList<DSTinhTrangDTO> dsct = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM dstinhtrang"; 
            st= conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()) {
               String MaTinhTrang = rs.getString("matt");
               String TinhTrang =  rs.getString("tinhtrang");
               
               DSTinhTrangDTO ct = new DSTinhTrangDTO(MaTinhTrang, TinhTrang);
               dsct.add(ct);
            }
            rs.close();
            
            return dsct;
        }catch (SQLException ex) {
            Logger.getLogger(null,null);
            return null;
        }
    }
    public void add(DSTinhTrangDTO ct) throws SQLException {
        MySQLConnect mySQL = new MySQLConnect();
        String sql = "INSERT INTO dstinhtrang VALUES(";
               sql += "'"+ct.getMaTinhTrang()+"'";
               sql += ",'" + ct.getTinhTrang() + "')";
               
        System.out.println(sql);
        st= conn.createStatement();
        st.executeUpdate(sql);
    }
    public void delete(String MaTinhTrang) throws SQLException {
        MySQLConnect mySQL = new MySQLConnect();
        String sql = "DELETE FROM dstinhtrang WHERE maTT='" + MaTinhTrang+"'";
        st= conn.createStatement();
        st.executeUpdate(sql);
        System.out.println(sql);
    }
    public void set(DSTinhTrangDTO ct) throws SQLException {
        MySQLConnect mySQL = new MySQLConnect();
        System.out.println("22222 "+ct);
        String sql = "UPDATE dstinhtrang SET tinhtrang='" + ct.getTinhTrang() + "' WHERE maTT='" + ct.getMaTinhTrang()+"'";
        st= conn.createStatement();
        st.executeUpdate(sql);
        System.out.println(sql);
    }
}
