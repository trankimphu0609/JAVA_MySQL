
package DATA;

import DTO.QuyenDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Logger;


public class QuyenDAO {
    static Connection conn=null;
    Statement st=null;
    ResultSet rs=null;
    MySQLConnect mySQL = new MySQLConnect();
    
    public QuyenDAO() throws Exception {
        if(conn==null){
            try{
                conn= mySQL.open();
            }
            catch (SQLException ex) {
                System.out.println("loi1");
            } 
            
        }
    }
    
    public ArrayList<QuyenDTO> list() throws SQLException {
        ArrayList<QuyenDTO> dsct = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM quyen WHERE 1";
            st= conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()) {
                int maquyen = rs.getInt("maquyen");
                String tenquyen = rs.getString("tenquyen");
                
                QuyenDTO ct = new QuyenDTO(maquyen, tenquyen);
                dsct.add(ct);
            }
            rs.close();
           
            return dsct;
        }catch (SQLException ex) {}
            Logger.getLogger(null,null);
            return null;
    }
    public void add(QuyenDTO ct) throws SQLException {
        MySQLConnect mySQL = new MySQLConnect();
        String sql = "INSERT INTO quyen VALUES (";
               sql += "'" + ct.getMaquyen() + "'";
               sql += ",'" + ct.getTenquyen() + "')";
        System.out.println(sql);
        st= conn.createStatement();
        st.executeUpdate(sql);
    }
    
    public void delete(int maquyen) throws SQLException {
        MySQLConnect mySQL = new MySQLConnect();
        String sql = "DELETE FROM quyen WHERE maquyen='" + maquyen + "'";
        st= conn.createStatement();
        st.executeUpdate(sql);
        System.out.println(sql);
    }
    public void set(QuyenDTO q){
        try{
        String qry="UPDATE quyen SET maquyen="+q.getMaquyen()+",tenquyen="+q.getTenquyen()+ " WHERE maquyen= "+q.getMaquyen();
        System.out.println(qry); 
        st= conn.createStatement();
        st.executeUpdate(qry);
        }
        catch (SQLException ex) {
            System.out.println("loiSua");
        }
    }
}
