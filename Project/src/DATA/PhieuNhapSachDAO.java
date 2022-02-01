
package DATA;

import DTO.PhieuNhapSachDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;


public class PhieuNhapSachDAO {
    static Connection conn=null;
    Statement st=null;
    ResultSet rs=null;
    MySQLConnect mySQL = new MySQLConnect();
    public PhieuNhapSachDAO() throws Exception {
        if(conn==null){
            try{
                conn= mySQL.open();
            }
            catch (SQLException ex) {
                System.out.println("loi1");
            } 
            
        }
    }
    public ArrayList<PhieuNhapSachDTO> list() throws SQLException {
        ArrayList<PhieuNhapSachDTO> dsct = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM phieunhapsach";
            st= conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()) {
                int IDPhieuNhap = rs.getInt("idphieunhap");
                String MaNCC = rs.getString("maNCC");
                int MaNV = rs.getInt("maNV");
                String NgayNhap = rs.getString("ngaynhap");
                int TongTien = rs.getInt("tongtien");
                
                PhieuNhapSachDTO ct = new PhieuNhapSachDTO(IDPhieuNhap,MaNCC,MaNV,NgayNhap,TongTien);
                dsct.add(ct);
            }
            rs.close();
            return dsct;
        }catch (SQLException ex) {
            Logger.getLogger(null, null);
            return null;
        }
    }
    public void add(PhieuNhapSachDTO ct) throws SQLException {
        
        String sql = "INSERT INTO phieunhapsach VALUES (";
               sql += ct.getIDPhieuNhap();
               sql += ",'" + ct.getMaNCC() + "'";
               sql += "," + ct.getMaNV();
               sql += ",'" + ct.getNgayNhap() + "'";
               sql += "," + ct.getTongTien() + ")";
        System.out.println(sql);
        st= conn.createStatement();
        st.executeUpdate(sql);
    }
    public void delete(int IDPhieuNhap) throws Exception {
        
        String sql = "DELETE FROM phieunhapsach WHERE idphieunhap=" + IDPhieuNhap;
        st= conn.createStatement();
        st.executeUpdate(sql);
        System.out.println(sql);
    }
    public void set(PhieuNhapSachDTO ct){
        try{
        
        String qry="UPDATE phieunhapsach SET maNCC='"+ct.getMaNCC()+"', maNV=" +ct.getMaNV()+",ngaynhap='"+ct.getNgayNhap()+"',tongtien="+ct.getTongTien() + " WHERE idphieunhap= "+ct.getIDPhieuNhap();
        System.out.println(qry); 
        st= conn.createStatement();
        st.executeUpdate(qry);
        }
        catch (SQLException ex) {
            System.out.println("loiSua");
        }
    }
}
