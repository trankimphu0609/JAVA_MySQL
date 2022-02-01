
package DATA;
import DATA.MySQLConnect;
import DTO.DauSachDTO;
import DTO.ChooseSachDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Logger;

public class DauSachDAO {
    static Connection conn=null;
    Statement st=null;
    ResultSet rs=null;
    MySQLConnect mySQL = new MySQLConnect();
    public DauSachDAO() throws Exception {
        if(conn==null){
            try{
                conn= mySQL.open();
            }
            catch (SQLException ex) {
                System.out.println("loi1");
            } 
            
        }
    }
    public ArrayList<DauSachDTO> list() throws SQLException {
        ArrayList<DauSachDTO> dsct = new ArrayList<>();
        try {
            String sql = "SELECT * FROM dausach";
            st= conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()) {
                int maDS = rs.getInt("maDS");
                String tensach = rs.getString("tensach");
                int soluong = rs.getInt("soluong");
                int maTG = rs.getInt("maTG");
                
                DauSachDTO ct = new DauSachDTO(maDS, tensach, soluong, maTG);
                dsct.add(ct);
            }
            rs.close();
            return dsct;
        }catch (SQLException ex) {
            Logger.getLogger(null,null);
            return null;
        }
    }
    public void add(DauSachDTO ct) throws SQLException {
        MySQLConnect mySQL = new MySQLConnect();
        String sql = "INSERT INTO dausach VALUES (";
               sql += ct.getMaDS() ;
               sql += ",'" + ct.getTenSach() + "'";
               sql += "," + ct.getSoluong();
               sql += "," + ct.getMaTG() +")";
               
               
        System.out.println(sql);
        st= conn.createStatement();
        st.executeUpdate(sql);
    }
    public void delete(String maDS) throws SQLException {
        MySQLConnect mySQL = new MySQLConnect();
        String sql = "DELETE FROM dausach WHERE maDS=" + maDS+ "";
        st= conn.createStatement();
        st.executeUpdate(sql);
        System.out.println(sql);
    }
    public void set(DauSachDTO sach) throws SQLException{
        String qry="update dausach set"+" tensach = '"+ sach.getTenSach() +"',soluong = "+ sach.getSoluong() +",maTG = " +sach.getMaTG() +" WHERE maDS = "+sach.getMaDS();
        st=conn.createStatement();
        st.executeUpdate(qry);  
    }
    public ArrayList<ChooseSachDTO> listChoose() throws SQLException {
        ArrayList<ChooseSachDTO> dsct = new ArrayList<>();
        try {
            String sql = "SELECT dausach.maDS, dausach.tensach, sachcon.masachcon, sachcon.maTT FROM dausach,sachcon WHERE dausach.maDS=sachcon.maDS AND sachcon.hientrang='1'";
            st= conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()) {
                int maDS = rs.getInt("maDS");
                String tensach = rs.getString("tensach");
                int masachcon = rs.getInt("masachcon");
                int maTT = rs.getInt("maTT");
                ChooseSachDTO ct = new ChooseSachDTO(maDS, tensach, masachcon,maTT);
                dsct.add(ct);
            }
            rs.close();
            return dsct;
        }catch (SQLException ex) {
            Logger.getLogger(null,null);
            return null;
        }
    }
    
    public ArrayList<ChooseSachDTO> listChoose(String MaPM) throws SQLException {
        ArrayList<ChooseSachDTO> dsct = new ArrayList<>();
        try {
            String sql = "SELECT dausach.maDS, dausach.tensach, chitietsachmuon.masachcon, chitietsachmuon.maTT FROM chitietsachmuon,dausach WHERE chitietsachmuon.maDS=dausach.maDS AND chitietsachmuon.maPM="+MaPM;
            st= conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()) {
                int maDS = rs.getInt("maDS");
                String tensach = rs.getString("tensach");
                int masachcon = rs.getInt("masachcon");
                int maTT = rs.getInt("maTT");
                ChooseSachDTO ct = new ChooseSachDTO(maDS, tensach, masachcon,maTT);
                dsct.add(ct);
            }
            rs.close();
            return dsct;
        }catch (SQLException ex) {
            Logger.getLogger(null,null);
            return null;
        }
    }

    public ArrayList<ChooseSachDTO> listChooseT(String MaPM) {
        ArrayList<ChooseSachDTO> dsct = new ArrayList<>();
        try {
            String sql = "SELECT dausach.maDS, dausach.tensach, chitietsachmuon.masachcon, chitietsachmuon.maTT FROM chitietsachmuon,dausach WHERE chitietsachmuon.maDS=dausach.maDS AND dausach.maDS= sachcon.maDS AND sachcon.hientrang=0 AND chitietsachmuon.maPM="+MaPM;
            st= conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()) {
                int maDS = rs.getInt("maDS");
                String tensach = rs.getString("tensach");
                int masachcon = rs.getInt("masachcon");
                int maTT = rs.getInt("maTT");
                ChooseSachDTO ct = new ChooseSachDTO(maDS, tensach, masachcon,maTT);
                dsct.add(ct);
            }
            rs.close();
            return dsct;
        }catch (SQLException ex) {
            Logger.getLogger(null,null);
            return null;
        }
    }
}
