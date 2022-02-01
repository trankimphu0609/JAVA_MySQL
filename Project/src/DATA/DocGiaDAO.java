
package DATA;

import DTO.DocGiaDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Logger;

public class DocGiaDAO {
    static Connection conn=null;
    Statement st=null;
    ResultSet rs=null;
    MySQLConnect mySQL = new MySQLConnect();
    public DocGiaDAO() throws Exception {   
        if(conn==null){
            try{
                conn= mySQL.open();
            }
            catch (SQLException ex) {
                System.out.println("loi1");
            } 
            
        }
    }
    public ArrayList<DocGiaDTO> list() throws SQLException {
        ArrayList<DocGiaDTO> dsct = new ArrayList<>();
        try {
            String sql = "SELECT * FROM docgia";
            st= conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()) {
                int maDG = rs.getInt("maDG");
                String ho = rs.getString("ho");
                String ten = rs.getString("ten");
                String ngaysinh = rs.getString("ngaysinh");
                String address = rs.getString("address");
                int sdt = rs.getInt("sdt");
                String trinhdo = rs.getString("trinhdo");
                String noicongtac = rs.getString("noicongtac");
                
                DocGiaDTO ct = new DocGiaDTO(maDG, ho, ten, ngaysinh, address, sdt, trinhdo, noicongtac);
                dsct.add(ct);
            }
            rs.close();
            
            return dsct;
        }catch (SQLException ex) {
            Logger.getLogger(null,null);
            return null;
        }
    }
    public ArrayList<DocGiaDTO> list_timkiem(int maTheTV) throws SQLException {
        ArrayList<DocGiaDTO> dsct = new ArrayList<>();
        try {
            String sql = "SELECT * FROM `thethuvien`, `docgia` WHERE thethuvien.maDG=docgia.maDG and thethuvien.matheTV="+maTheTV;
            st= conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()) {
                int maDG = rs.getInt("maDG");
                String ho = rs.getString("ho");
                String ten = rs.getString("ten");
                String ngaysinh = rs.getString("ngaysinh");
                String address = rs.getString("address");
                int sdt = rs.getInt("sdt");
                String trinhdo = rs.getString("trinhdo");
                String noicongtac = rs.getString("noicongtac");
                
                DocGiaDTO ct = new DocGiaDTO(maDG, ho, ten, ngaysinh, address, sdt, trinhdo, noicongtac);
                dsct.add(ct);
            }
            rs.close();
            
            return dsct;
        }catch (SQLException ex) {
            Logger.getLogger(null,null);
            return null;
        }
    }
    public void add(DocGiaDTO ct) {
        try{
        String sql = "INSERT INTO docgia VALUES (";
               sql += ct.getMaDG() ;
               sql += ",'" + ct.getHoDG() + "'";
               sql += ",'" + ct.getTenDG() + "'";
               sql += ",'" + ct.getNgaySinh() + "'";
               sql += ",'" + ct.getAddress() + "'";
               sql += "," + ct.getSoDT();
               sql += ",'" + ct.getTrinhDo() + "'";
               sql += ",'" + ct.getNoicongtac() + "')";
               
        System.out.println(sql);
        st= conn.createStatement();
        st.executeUpdate(sql);
        }
        catch (SQLException ex) {
            System.out.println("loiThem");
        }
    }
    public void delete(String maDG) {
        try{
        
        String sql = "DELETE FROM docgia WHERE maDG=" + maDG+ "";
        st= conn.createStatement();
        st.executeUpdate(sql); 
        }
        catch (SQLException ex) {
            System.out.println("loiXoa");
        }
    }
    public void set(DocGiaDTO dg){
        try{
        
        String qry="UPDATE docgia SET maDG="+dg.getMaDG()+",ho='"+dg.getHoDG()+"',ten='"+dg.getTenDG()+"',ngaysinh='"+dg.getNgaySinh()+"',address='"+dg.getAddress()+"',sdt="+dg.getSoDT() + ",trinhdo='"+dg.getTrinhDo()+"',noicongtac='"+dg.getNoicongtac()+ "' WHERE maDG= "+dg.getMaDG();
        System.out.println(qry); 
        st= conn.createStatement();
        st.executeUpdate(qry);
        }
        catch (SQLException ex) {
            System.out.println("loiSua");
        }
    }
}
