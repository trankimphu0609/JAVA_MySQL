
package DATA;

import static DATA.DauSachDAO.conn;
import DTO.DSTinhTrangDTO;
import DTO.SachConDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SachConDAO {
    static Connection conn=null;
    Statement st=null;
    ResultSet rs=null;
    MySQLConnect mySQL = new MySQLConnect();
    
    public SachConDAO() throws Exception {
        if(conn==null){
            try{
                conn= mySQL.open();
            }
            catch (SQLException ex) {
                System.out.println("loi1");
            } 
            
        }
    }
    
    public ArrayList<SachConDTO> list() throws SQLException {
        ArrayList<SachConDTO> dsct = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM sachcon";
            st= conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()) {
                int mads = rs.getInt("maDS");
                int masachcon = rs.getInt("masachcon");
                String matt = rs.getString("maTT");
                
                SachConDTO ct = new SachConDTO(mads, masachcon, matt);
                dsct.add(ct);
            }
            rs.close();
            
            return dsct;
        }catch (SQLException ex) {}
            Logger.getLogger(null,null);
            return null;
    }
    public ArrayList<SachConDTO> list(int ma) throws SQLException {
        ArrayList<SachConDTO> dsct = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM sachcon WHERE maDS="+ma;
            st= conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()) {
                int mads = rs.getInt("maDS");
                int masachcon = rs.getInt("masachcon");
                String matt = rs.getString("maTT");
                
                SachConDTO ct = new SachConDTO(mads, masachcon, matt);
                dsct.add(ct);
            }
            rs.close();
            
            return dsct;
        }catch (SQLException ex) {}
            Logger.getLogger(null,null);
            return null;
    }
    public void add(SachConDTO ct) throws SQLException {
        System.out.println("SachconDao: "+ct.toString());
        MySQLConnect mySQL = new MySQLConnect();
        String sql = "INSERT INTO sachcon VALUES (";
               sql += ct.getMaDS();
               sql += "," + ct.getMaSachCon();
               sql += ",'" + ct.getMaTinhTrang() + "'";
               sql += ",1)";
        System.out.println(sql);
        st= conn.createStatement();
        st.executeUpdate(sql);
    }
    
    public void delete(int maDS,int maSC) throws SQLException {
        MySQLConnect mySQL = new MySQLConnect();
        String sql = "DELETE FROM sachcon WHERE maDS=" + maDS + " AND masachcon="+maSC;
        st= conn.createStatement();
        st.executeUpdate(sql);
        System.out.println(sql);
    }
 
    public void setHienTrang(SachConDTO sach) throws SQLException {
        MySQLConnect mySQL = new MySQLConnect();
        String qry= "UPDATE sachcon SET maTT= "+ sach.getMaTinhTrang() +", hientrang=" + sach.getHientrang() + " WHERE masachcon=" +sach.getMaSachCon()+ " AND maDS="+sach.getMaDS();
        st= conn.createStatement();
        st.executeUpdate(qry);
        System.out.println(qry);
    }
    public void set(SachConDTO sachcon) throws SQLException {
        String qry = "Update sachcon set ";
        qry=qry+"maTT = " + sachcon.getMaTinhTrang();
        qry=qry+",hientrang= " + sachcon.getHientrang();
        qry=qry+" where maDS = " + sachcon.getMaDS()+" and masachcon = "+ sachcon.getMaSachCon();
        st= conn.createStatement();
        st.executeUpdate(qry);
    }
    public ArrayList<DSTinhTrangDTO> combobox(){
        ArrayList<DSTinhTrangDTO> combobox= new ArrayList<DSTinhTrangDTO>();
        try {
            
            String qry= "select * from dstinhtrang";
            st= conn.createStatement();
            rs=st.executeQuery( qry);
            combobox.clear();
            while(rs.next()){
                String s= rs.getString("maTT");
                String s2= rs.getString("TinhTrang");
                DSTinhTrangDTO n= new DSTinhTrangDTO(s,s2);
                combobox.add(n);
            }
    
        } catch (SQLException ex) {
            Logger.getLogger(SachConDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                return combobox;
    }
}
