/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import DTO.TheThuVienDTO;
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
public class TheThuVienDAO {
    static Connection conn=null;
    Statement st=null;
    ResultSet rs=null;
    MySQLConnect mySQL = new MySQLConnect();
    
    public TheThuVienDAO() throws Exception {
        if(conn==null){
            try{
                conn= mySQL.open();
            }
            catch (SQLException ex) {
                System.out.println("loi1");
            } 
            
        }
    }
    
    public ArrayList<TheThuVienDTO> list() throws SQLException {
        ArrayList<TheThuVienDTO> dsct = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM thethuvien WHERE 1";
            st= conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()) {
                int mathetv = rs.getInt("matheTV");
                int madocgia = rs.getInt("maDG");
                String ngaylamthe = rs.getString("ngaylamthe");
                String ngayhethan = rs.getString("ngayhethan");
                
                TheThuVienDTO ct = new TheThuVienDTO(mathetv, madocgia, ngaylamthe, ngayhethan);
                dsct.add(ct);
            }
            rs.close();
            
            return dsct;
        }catch (SQLException ex) {
            Logger.getLogger(null,null);
            return null;
        }
    }
    public void add(TheThuVienDTO ct) throws SQLException {
        MySQLConnect mySQL = new MySQLConnect();
        String sql = "INSERT INTO thethuvien VALUES (";
               sql += ct.getMatheTV();
               sql += "," + ct.getMaDocGia();
               sql += ",'" + ct.getNgayLamThe()+ "'";
               sql += ",'" + ct.getNgayHetHan()+ "')";
        System.out.println(sql);
        st= conn.createStatement();
        st.executeUpdate(sql);
    }
    
    public void delete(int mathetv) throws SQLException {
        MySQLConnect mySQL = new MySQLConnect();
        String sql = "DELETE FROM thethuvien WHERE matheTV='" + mathetv + "'";
        st= conn.createStatement();
        st.executeUpdate(sql); 
    }
    public void set(TheThuVienDTO the){
        try{
        
        String qry="UPDATE thethuvien SET matheTV="+the.getMatheTV()+",maDG="+the.getMaDocGia()+",ngaylamthe='"+the.getNgayLamThe()+"',ngayhethan='"+the.getNgayHetHan()+ "' WHERE matheTV= "+the.getMatheTV();
        System.out.println(qry); 
        st= conn.createStatement();
        st.executeUpdate(qry);
        }
        catch (SQLException ex) {
            System.out.println("loiSua");
        }
    }
}
