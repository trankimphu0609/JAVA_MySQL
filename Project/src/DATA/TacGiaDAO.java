/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import DTO.TacGiaDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Trần Kim Phú
 */
public class TacGiaDAO {
    static Connection conn=null;
    Statement st=null;
    ResultSet rs=null;
    MySQLConnect mySQL = new MySQLConnect();
    
    public TacGiaDAO() throws Exception {
        if(conn==null){
            try{
                conn= mySQL.open();
            }
            catch (SQLException ex) {
                System.out.println("loi1");
            } 
            
        }
    }
    
    public ArrayList<TacGiaDTO> list() throws SQLException {
        ArrayList<TacGiaDTO> dsct = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM tacgia WHERE 1";
            st= conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()) {
                int matg = rs.getInt("maTG");
                String ho = rs.getString("ho");
                String ten = rs.getString("ten");
                int sdt = rs.getInt("sdt");
                String address = rs.getString("address");
                
                TacGiaDTO ct = new TacGiaDTO(matg, ho, ten, sdt, address);
                dsct.add(ct);
            }
            rs.close();
            
            return dsct;
        }catch (SQLException ex) {}
            Logger.getLogger(null,null);
            return null;
    }
    public void add(TacGiaDTO ct) throws SQLException {
        MySQLConnect mySQL = new MySQLConnect();
        String sql = "INSERT INTO tacgia VALUES (";
               sql += ct.getMaTG();
               sql += ",'" + ct.getHoTG()+ "'";
               sql += ",'" + ct.getTenTG()+ "'";
               sql += "," + ct.getsDT();
               sql += ",'" + ct.getAddress()+ "')";
        System.out.println(sql);
        st= conn.createStatement();
        st.executeUpdate(sql);
    }
    
    public void delete(int matg) throws SQLException {
        MySQLConnect mySQL = new MySQLConnect();
        String sql = "DELETE FROM tacgia WHERE maTG=" + matg;
        st= conn.createStatement();
        st.executeUpdate(sql); 
        System.out.println(sql);
    }


    public void Sua(TacGiaDTO tacgia) {
        try {
            MySQLConnect mySQL = new MySQLConnect();
            String qry = "Update tacgia set ";
            qry=qry + "ho = '" + tacgia.getHoTG()+"'";
            qry=qry + ",ten = '" + tacgia.getTenTG()+"'";
            qry=qry + ",sdt = '" + tacgia.getsDT()+"'";
            qry=qry + ",address = '" + tacgia.getAddress()+"'";
            qry=qry + " WHERE maTG = '" +tacgia.getMaTG()+"'";
            st= conn.createStatement();
            st.executeUpdate(qry);
            System.out.println(qry);
        } catch (SQLException ex) {
            Logger.getLogger(TacGiaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
}
