/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import DTO.ChiTietPhieuNhapDTO;
import java.util.ArrayList;
import DATA.MySQLConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;


public class ChiTietPhieuNhapDAO {
    
    static Connection conn=null;
    Statement st=null;
    ResultSet rs=null;
    MySQLConnect mySQL = new MySQLConnect();
    public ChiTietPhieuNhapDAO() throws Exception {
        if(conn==null){
            try{
                conn= mySQL.open();
            }
            catch (SQLException ex) {
                System.out.println("loi1");
            } 
            
        }
    }
    public ArrayList<ChiTietPhieuNhapDTO> list() {
        ArrayList<ChiTietPhieuNhapDTO> dsct = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM chitietphieunhap"; 
            st= conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()) {
               int IDPhieuNhap = rs.getInt("idphieunhap");
               int maSach =  rs.getInt("MaDS");
               String TenSach =  rs.getString("Tensach");
               int soLuong = rs.getInt("soluong");
               int donGia = rs.getInt("dongia");
               
               ChiTietPhieuNhapDTO ct = new ChiTietPhieuNhapDTO(IDPhieuNhap, maSach,TenSach, soLuong, donGia);
               dsct.add(ct);
            }
            rs.close();
            return dsct;
        }catch (SQLException ex) {
            Logger.getLogger(null,null);
            return null;
        }
    }
    public ArrayList<ChiTietPhieuNhapDTO> list(int i) {
        ArrayList<ChiTietPhieuNhapDTO> dsct = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM chitietphieunhap WHERE idphieunhap="+i; 
            st= conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()) {
               int IDPhieuNhap = rs.getInt("idphieunhap");
               int maSach =  rs.getInt("MaDS");
               String TenSach =  rs.getString("Tensach");
               int soLuong = rs.getInt("soluong");
               int donGia = rs.getInt("dongia");
               
               ChiTietPhieuNhapDTO ct = new ChiTietPhieuNhapDTO(IDPhieuNhap, maSach,TenSach, soLuong, donGia);
               dsct.add(ct);
            }
            rs.close();
            return dsct;
        }catch (SQLException ex) {
            Logger.getLogger(null,null);
            return null;
        }
    }
    public void add(ChiTietPhieuNhapDTO ct) throws SQLException {
        
        String sql = "INSERT INTO chitietphieunhap VALUES (";
               sql += ct.getIDPhieuNhap();
               sql += "," + ct.getMaSach();
               sql += ",'" + ct.getTenSach()+"'";
               sql += "," + ct.getSoLuong();
               sql += "," + ct.getDonGia() + ")";
        System.out.println(sql);
        st= conn.createStatement();
        st.executeUpdate(sql);
    }
    public void delete(int IDPhieuNhap) throws Exception {
        
        String sql = "DELETE FROM chitietphieunhap WHERE idphieunhap=" + IDPhieuNhap;
        st= conn.createStatement();
        st.executeUpdate(sql);
        System.out.println(sql);
    }
}
