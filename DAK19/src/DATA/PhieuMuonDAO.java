package DATA;

import DTO.PhieuMuonDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;

public class PhieuMuonDAO {
    static Connection conn=null;
    Statement st=null;
    ResultSet rs=null;
    MySQLConnect mySQL = new MySQLConnect();
    public PhieuMuonDAO() throws Exception {  
        if(conn==null){
            try{
                conn= mySQL.open();
            }
            catch (SQLException ex) {
                System.out.println("loi1");
            } 
            
        }
    }
    public ArrayList<PhieuMuonDTO> list() throws SQLException {
        ArrayList<PhieuMuonDTO> dspm = new ArrayList<>();
        try {
            String sql = "SELECT * FROM phieumuon";
            st= conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()) {
                int mapm = rs.getInt("maPM");
                int mathetv = rs.getInt("matheTV");
                String ngaymuon = rs.getString("ngaymuon");
                String ngayhentra = rs.getString("ngayhentra");
                int manv = rs.getInt("maNV");
                
                PhieuMuonDTO ct = new PhieuMuonDTO(mapm, mathetv, ngaymuon, ngayhentra, manv);
                dspm.add(ct);
            }
            rs.close();
            
            return dspm;
        }catch (SQLException ex) {
            return null;
        }
    }
    public void add(PhieuMuonDTO ct) throws SQLException {
        MySQLConnect mySQL = new MySQLConnect();
        String sql = "INSERT INTO phieumuon VALUES (";
               sql += ct.getMaPM();
               sql += "," + ct.getMatheTV();
               sql += ",'" + ct.getNgaymuon()+ "'";
               sql += ",'" + ct.getNgayhentra()+ "'";
               sql += ",'" + ct.getMaNV()+ "')";
               
        System.out.println(sql);
        st= conn.createStatement();
        st.executeUpdate(sql);
    }
    public void delete(int mapm) throws SQLException {
        MySQLConnect mySQL = new MySQLConnect();
        String sql = "DELETE FROM phieumuon WHERE maPM=" + mapm+ "";
        st= conn.createStatement();
        st.executeUpdate(sql);
        System.out.println(sql);
    }
    public void set(PhieuMuonDTO pm){
        try{
        
        String qry="UPDATE phieumuon SET ngayhentra='"+pm.getNgayhentra()+"' WHERE maPM= "+pm.getMaPM();
        System.out.println(qry); 
        st= conn.createStatement();
        st.executeUpdate(qry);
        }
        catch (SQLException ex) {
            System.out.println("loiSua");
        }
    }
}
