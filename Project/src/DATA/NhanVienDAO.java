
package DATA;

import DTO.NhanVienDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;

public class NhanVienDAO {
    static Connection conn=null;
    Statement st=null;
    ResultSet rs=null;
    MySQLConnect mySQL = new MySQLConnect();
    public NhanVienDAO() throws Exception {    
        if(conn==null){
            try{
                conn= mySQL.open();
            }
            catch (SQLException ex) {
                System.out.println("loi1");
            } 
            
        }
    }
    public ArrayList<NhanVienDTO> list() throws SQLException {
        ArrayList<NhanVienDTO> dsct = new ArrayList<>();
        try {
            String sql = "SELECT * FROM nhanvien, chucvu WHERE nhanvien.maCV=chucvu.maCV";
            st= conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()) {
                int maNV = rs.getInt("maNV");
                String ho = rs.getString("ho");
                String ten = rs.getString("ten");
                String ngaysinh = rs.getString("ngaysinh");
                String address = rs.getString("address");
                int sdt = rs.getInt("sdt");
                int luong = rs.getInt("luong");
                String tencv = rs.getString("tenCV");
                int macv = rs.getInt("maCV");
                NhanVienDTO ct = new NhanVienDTO(maNV, ho, ten, ngaysinh, address, sdt, luong, tencv,macv);
                dsct.add(ct);
            }
            rs.close();
            
            return dsct;
        }catch (SQLException ex) {
            Logger.getLogger(null,null);
            return null;
        }
    }
    public void add(NhanVienDTO ct){
        try{
        int temp= ct.getMaCV() + 1;
        String sql = "INSERT INTO nhanvien VALUES (";
               sql += ct.getMaNV() ;
               sql += ",'" + ct.getHo() + "'";
               sql += ",'" + ct.getTen() + "'";
               sql += ",'" + ct.getNgaysinh() + "'";
               sql += ",'" + ct.getAddress() + "'";
               sql += "," + ct.getSoDT() ;
               sql += "," + ct.getLuong() ;
               sql += "," + temp + ")";
        System.out.println(sql);       
        st= conn.createStatement();
        st.executeUpdate(sql);
        }
        catch (SQLException ex) {
            System.out.println("loiThem");
        }
    }
    public void delete(String maNV) {
        try{
        String sql = "DELETE FROM nhanvien WHERE maNV=" + maNV+ "";
        st= conn.createStatement();
        st.executeUpdate(sql); 
        }
        catch (SQLException ex) {
            System.out.println("loiXoa");
        }
    }
    public void set(NhanVienDTO nv){
        try{
        int temp= nv.getMaCV() + 1;
        String qry="UPDATE nhanvien SET maNV="+nv.getMaNV()+",ho='"+nv.getHo()+"',ten='"+nv.getTen()+"',ngaysinh='"+nv.getNgaysinh()+"',address='"+nv.getAddress()+"',sdt="+nv.getSoDT() + ",luong="+nv.getLuong()+",maCV="+temp+ " WHERE maNV= "+nv.getMaNV();
        System.out.println(qry); 
        st= conn.createStatement();
        st.executeUpdate(qry);
        }
        catch (SQLException ex) {
            System.out.println("loiSua");
        }
    }
}
