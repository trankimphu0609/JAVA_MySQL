/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import static DATA.NhanVienDAO.conn;
import DTO.ChucVuDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author Trần Kim Phú
 */
public class ChucVuDAO {
    static Connection conn=null;
    Statement st=null;
    ResultSet rs=null;
    MySQLConnect mySQL = new MySQLConnect();
    public ChucVuDAO() throws Exception {    
        if(conn==null){
            try{
                conn= mySQL.open();
            }
            catch (SQLException ex) {
                System.out.println("loi1");
            } 
            
        }
    }
    public ArrayList<ChucVuDTO> list() throws SQLException {
        ArrayList<ChucVuDTO> dsct = new ArrayList<>();
        try {
            String sql = "SELECT * FROM chucvu";
            st= conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()) {
                int maCV = rs.getInt("maCV");
                String tenCV = rs.getString("tenCV");
                
                ChucVuDTO ct = new ChucVuDTO(maCV, tenCV);
                dsct.add(ct);
            }
            rs.close();
            
            return dsct;
        }catch (SQLException ex) {
            Logger.getLogger(null,null);
            return null;
        }
    }
    public void add(ChucVuDTO ct) {
        try{
        String sql = "INSERT INTO chucvu VALUES (";
               sql += ct.getMaCV();
               sql += ",'" + ct.getTenCV() + "')";
        System.out.println(sql);
        st= conn.createStatement();
        st.executeUpdate(sql);
        }
        catch (SQLException ex) {
            System.out.println("loiThem");
        }
    }
    public void delete(int macv) {
        try{
        String sql = "DELETE FROM chucvu WHERE maCV=" + macv;
        st= conn.createStatement();
        st.executeUpdate(sql); 
        System.out.println(sql);
        }
        catch (SQLException ex) {
            System.out.println("loiXoa");
        }
    }
    public void set(ChucVuDTO cv){
        try{
        String qry="UPDATE chucvu SET maCV="+cv.getMaCV()+ ",tenCV='"+cv.getTenCV()+"' WHERE maCV="+cv.getMaCV();
        st= conn.createStatement();
        st.executeUpdate(qry);
        System.out.println(qry);
        }
        catch (SQLException ex) {
            System.out.println("loiXoa");
        }
    }
}

