/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import DTO.NhaCungCapDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class NhaCungCapDAO {
    static Connection conn=null;
    Statement st=null;
    ResultSet rs=null;
    MySQLConnect mySQL = new MySQLConnect();
    public NhaCungCapDAO() throws Exception{
        if(conn==null){
            try{
                conn= mySQL.open();
            }
            catch (SQLException ex) {
                System.out.println("loi1");
            } 
        }
    }
    public ArrayList<NhaCungCapDTO> Doc() throws SQLException {
        ArrayList<NhaCungCapDTO> arrayncc= new ArrayList<NhaCungCapDTO>();
        String qry= "select * from ncc";
            st= conn.createStatement();
            rs=st.executeQuery(qry);
        arrayncc.clear();

            try {
                while(rs.next()){
                    NhaCungCapDTO ncc= new NhaCungCapDTO();
                    ncc.setMaNCC(rs.getString(1));
                    ncc.setTenNCC(rs.getString(2));
                    ncc.setDiaChiNCC(rs.getString(3));
                    ncc.setEmailNCC(rs.getString(4));
                    ncc.setSoDTNCC(Integer.parseInt(rs.getString(5)));
                    arrayncc.add(ncc);
                }
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return arrayncc;
    }

    public void Them(NhaCungCapDTO ncc) throws SQLException {
        ArrayList<NhaCungCapDTO> arrayncc= new ArrayList<NhaCungCapDTO>();
                MySQLConnect mySQL = new MySQLConnect();
        String qry="Insert into ncc values(";
        qry=qry+"'"+ncc.getMaNCC()+"'";
        qry=qry+","+"'"+ncc.getTenNCC()+"'";
        qry=qry+","+"'"+ncc.getDiaChiNCC()+"'";
        qry=qry+","+"'"+ncc.getEmailNCC()+"'";
        qry=qry+","+"'"+ncc.getSoDTNCC()+"')";
                    System.out.println(qry);
        st= conn.createStatement();
        st.executeUpdate(qry);

    }

    public void Sua(NhaCungCapDTO ncc) throws SQLException {
        MySQLConnect mySQL = new MySQLConnect();
        String qry = "Update ncc set ";
        qry=qry + "tenNCC = '" + ncc.getTenNCC()+"'";
        qry=qry + ",address = '" + ncc.getDiaChiNCC()+"'";
        qry=qry + ",email = '" + ncc.getEmailNCC()+"'";
        qry=qry + ",SDT = '" + ncc.getSoDTNCC()+"'";
        qry=qry + " WHERE maNCC = '" +ncc.getMaNCC()+"'";
            st= conn.createStatement();
            st.executeUpdate(qry);
    }

    public void Xoa(String mancc) throws SQLException {
        MySQLConnect mySQL = new MySQLConnect();
        String qry= "delete from ncc where maNCC = '"+mancc+"'";
            st= conn.createStatement();
            st.executeUpdate(qry);
    }
    
}
