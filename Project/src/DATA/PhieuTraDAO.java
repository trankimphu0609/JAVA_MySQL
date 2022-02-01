package DATA;

import DTO.PhieuTraDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;

public class PhieuTraDAO {
    static Connection conn=null;
    Statement st=null;
    ResultSet rs=null;
    MySQLConnect mySQL = new MySQLConnect();
    public PhieuTraDAO() throws Exception {  
        if(conn==null){
            try{
                conn= mySQL.open();
            }
            catch (SQLException ex) {
                System.out.println("loi1");
            } 
            
        }
    }
    public ArrayList<PhieuTraDTO> list() throws SQLException {
        ArrayList<PhieuTraDTO> dsct = new ArrayList<>();
        try {
            String sql = "SELECT * FROM phieutra";
            st= conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()) {
                int mapt = rs.getInt("maPT");
                int mapm = rs.getInt("maPM");
                String ngaytra = rs.getString("ngaytra");
                int manv = rs.getInt("maNV");
                
                
                PhieuTraDTO ct = new PhieuTraDTO(mapt, mapm, ngaytra, manv);
                dsct.add(ct);
            }
            rs.close();
            
            return dsct;
        }catch (SQLException ex) {
            Logger.getLogger(null,null);
            return null;
        }
    }
    public void add(PhieuTraDTO ct) throws SQLException {
        MySQLConnect mySQL = new MySQLConnect();
        String sql = "INSERT INTO phieutra VALUES (";
               sql += ct.getMaPT();
               sql += "," + ct.getMaPM();
               sql += ",'" + ct.getNgayTra()+ "'";
               sql += "," + ct.getMaNV()+ ")";
               
               
        System.out.println(sql);
        st= conn.createStatement();
        st.executeUpdate(sql);
    }
    public void delete(int mapt) throws SQLException {
        MySQLConnect mySQL = new MySQLConnect();
        String sql = "DELETE FROM phieutra WHERE maPT=" + mapt+ "";
        st= conn.createStatement();
        st.executeUpdate(sql);
        System.out.println(sql);
    }
    
}
