
package DATA;

import DTO.TaiKhoanDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;

public class TaiKhoanDAO {
    static Connection conn=null;
    Statement st=null;
    ResultSet rs=null;
    MySQLConnect mySQL = new MySQLConnect();
    public TaiKhoanDAO() throws Exception {    
        if(conn==null){
            try{
                conn= mySQL.open();
            }
            catch (SQLException ex) {
                System.out.println("loi1");
            } 
            
        }
    }
    public ArrayList<TaiKhoanDTO> list() throws SQLException {
        ArrayList<TaiKhoanDTO> dsct = new ArrayList<>();
        try {
            String sql = "SELECT * FROM taikhoan";
            st= conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()) {
                int matk = rs.getInt("maTK");
                String username = rs.getString("username");
                String matkhau = rs.getString("matkhau");
                int maquyen = rs.getInt("maquyen");
                TaiKhoanDTO ct = new TaiKhoanDTO(matk, username, matkhau,maquyen);
                dsct.add(ct);
            }
            rs.close();
            
            return dsct;
        }catch (SQLException ex) {
            Logger.getLogger(null,null);
            return null;
        }
    }
    public void add(TaiKhoanDTO ct){
        try{
        
        String sql = "INSERT INTO taikhoan VALUES (";
               sql += ct.getMatk() ;
               sql += ",'" + ct.getUsername() + "'";
               sql += ",'" + ct.getMatkhau() + "'";
               sql += "," + ct.getMaquyen() + ")";
        System.out.println(sql);       
        st= conn.createStatement();
        st.executeUpdate(sql);
        }
        catch (SQLException ex) {
            System.out.println("loiThem");
        }
    }
    public void delete(int matk) {
        try{
        String sql = "DELETE FROM taikhoan WHERE maTK=" + matk + "";
        st= conn.createStatement();
        st.executeUpdate(sql); 
        }
        catch (SQLException ex) {
            System.out.println("loiXoa");
        }
    }
    public void set(TaiKhoanDTO tk){
        try{
        
        String qry="UPDATE taikhoan SET maTK=" + tk.getMatk() + ",username='" + tk.getUsername()+ "',matkhau='" + tk.getMatkhau() + "',maquyen=" + tk.getMaquyen()+ " WHERE maTK= " + tk.getMatk();
        System.out.println(qry); 
        st= conn.createStatement();
        st.executeUpdate(qry);
        }
        catch (SQLException ex) {
            System.out.println("loiSua");
        }
    }
}

