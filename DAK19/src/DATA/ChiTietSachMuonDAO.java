
package DATA;

import DTO.ChiTietSachMuonDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Logger;

public class ChiTietSachMuonDAO {
    static Connection conn=null;
    Statement st=null;
    ResultSet rs=null;
    MySQLConnect mySQL = new MySQLConnect();
    public ChiTietSachMuonDAO() throws Exception {
        if(conn==null){
            try{
                conn= mySQL.open();
            }
            catch (SQLException ex) {
                System.out.println("loi1");
            } 
            
        }
    }
    
    public ArrayList<ChiTietSachMuonDTO> list(String mapm, String mads) {
        ArrayList<ChiTietSachMuonDTO> dsct = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM chitietsachmuon WHERE maPM="+mapm+" AND maDS="+mads; 
            st= conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()) {
               int maPM = rs.getInt("maPM");
               int maDS = rs.getInt("maDS");
               int maSachCon =  rs.getInt("masachcon");
               String maTT = rs.getString("maTT");
               
               ChiTietSachMuonDTO ct = new ChiTietSachMuonDTO(maPM, maDS,maSachCon, maTT);
               dsct.add(ct);
            }
            rs.close();
            
            return dsct;
        }catch (SQLException ex) {
            return null;
        }
    }
    public ArrayList<ChiTietSachMuonDTO> list() {
        ArrayList<ChiTietSachMuonDTO> dsct = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM chitietsachmuon"; 
            st= conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()) {
               int maPM = rs.getInt("maPM");
               int maDS = rs.getInt("maDS");
               int maSachCon =  rs.getInt("masachcon");
               String maTT = rs.getString("maTT");
               
               ChiTietSachMuonDTO ct = new ChiTietSachMuonDTO(maPM, maDS,maSachCon, maTT);
               dsct.add(ct);
            }
            rs.close();
            
            return dsct;
        }catch (SQLException ex) {
            return null;
        }
    }
    public void add(ChiTietSachMuonDTO ct) throws SQLException {
        System.out.println("CTSMDao: "+ct.toString());
        MySQLConnect mySQL = new MySQLConnect();
        String sql = "INSERT INTO chitietsachmuon VALUES (";
               sql += ct.getMaPM();
               sql += "," + ct.getMaDS();
               sql += "," + ct.getMaSachCon();
               sql += ",'" + ct.getMaTinhtrang() + "')";
        System.out.println(sql);
        st= conn.createStatement();
        st.executeUpdate(sql);
    }
    public void delete(String maPM) throws SQLException {
        MySQLConnect mySQL = new MySQLConnect();
        String sql = "DELETE FROM chitietsachmuon WHERE maPM= "+maPM;
        st= conn.createStatement();
        st.executeUpdate(sql); 
    }
    public void set(ChiTietSachMuonDTO n){
        try{
        
        String qry="UPDATE chitietsachmuon SET maPM="+n.getMaPM()+",maDS="+n.getMaDS()+",masachcon="+n.getMaSachCon()+",maTT='"+n.getMaTinhtrang()+ "' WHERE maPM= "+n.getMaPM();
        System.out.println(qry); 
        st= conn.createStatement();
        st.executeUpdate(qry);
        }
        catch (SQLException ex) {
            System.out.println("loiSua");
        }
    }
}
