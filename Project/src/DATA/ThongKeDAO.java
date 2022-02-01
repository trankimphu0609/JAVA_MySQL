
package DATA;

import DTO.DocGiaDTO;
import DTO.ThongKeDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class ThongKeDAO {
    Connection conn ;
    Statement st;
    ResultSet rs;
    MySQLConnect mySQL = new MySQLConnect();
    public ThongKeDAO(){
        try {
            if(conn==null)
                conn=mySQL.open();
        } catch (Exception ex) {
            System.out.println("KHông thể kết nối tới database");
        }
    }
    public ArrayList<ThongKeDTO> Doc(String ngaymuon,String ngaytra){
        ArrayList<ThongKeDTO> dstk =new ArrayList<ThongKeDTO>();
        try {

            String sql = "SELECT chitietphieumuon.maDS,sum(chitietphieumuon.soluong) as tong "
                    + " FROM phieumuon, chitietphieumuon "
                    + "WHERE phieumuon.maPM=chitietphieumuon.maPM AND"
                    + " phieumuon.ngaymuon between '"+ngaymuon+"' AND "
                    + "'"+ ngaytra +"' "
                    + "GROUP BY chitietphieumuon.maDS";
            System.out.println(sql);
            st=conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                ThongKeDTO tk = new ThongKeDTO();
                tk.setMaDS(rs.getInt("maDS"));
                tk.setTong(rs.getInt("tong"));
                dstk.add(tk);
            }

        } catch (SQLException ex) {
            System.out.println("Không thể thực hiện câu truy vấn 1");
        }
        return dstk;
    }
        public ArrayList<ThongKeDTO> Docgia(String ngaymuon,String ngaytra){
        ArrayList<ThongKeDTO> dstk =new ArrayList<ThongKeDTO>();
        try {
            String sql = "SELECT phieumuon.matheTV,docgia.maDG,docgia.ho,docgia.ten,SUM(chitietphieumuon.soluong) as tong  "
                    + "FROM phieumuon, chitietphieumuon, thethuvien, docgia "
                    + "WHERE phieumuon.maPM=chitietphieumuon.maPM and phieumuon.matheTV=thethuvien.matheTV AND thethuvien.maDG=docgia.maDG "
                    + "AND phieumuon.ngaymuon between '"+ngaymuon+"' AND '"+ngaytra+"' "
                    + "GROUP BY phieumuon.matheTV";
            System.out.println(sql);
            st=conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                ThongKeDTO tk = new ThongKeDTO();
                tk.setMatheTV(rs.getInt("matheTV"));
                tk.setMaDG(rs.getInt("maDG"));
                tk.setHo(rs.getString("ho"));
                tk.setTen(rs.getString("ten"));
                tk.setTong(rs.getInt("tong"));
                dstk.add(tk);
            }
        } catch (SQLException ex) {
            System.out.println("Không thể thực hiện câu truy vấn 2");
        }
        return dstk;
    }
        public ArrayList<ThongKeDTO> Docgia2(String ngaymuon,String ngaytra) throws SQLException{
            ArrayList<ThongKeDTO> dsdg =new ArrayList<ThongKeDTO>();
            try {
            String sql = "SELECT docgia.*  "
                    + "FROM thethuvien, docgia "
                    + "WHERE thethuvien.maDG=docgia.maDG "
                    + "AND thethuvien.ngaylamthe between '"+ngaymuon+"' AND '"+ngaytra+"' ";
                   int count=0;
            System.out.println(sql);
            st=conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                int maDG = rs.getInt("maDG");
                String ho = rs.getString("ho");
                String ten = rs.getString("ten");
                String ngaysinh = rs.getString("ngaysinh");
                String address = rs.getString("address");
                int sdt = rs.getInt("sdt");
                String trinhdo = rs.getString("trinhdo");
                String noicongtac = rs.getString("noicongtac");
                
                ThongKeDTO ct = new ThongKeDTO(maDG, ho, ten, ngaysinh, address, sdt, trinhdo, noicongtac);
                dsdg.add(ct);
                count++;
            }
                System.out.println("count: "+count);
            }
            catch (SQLException ex) {
                System.out.println("Không thể thực hiện câu truy vấn 3");
            }
            return dsdg;
        }
}
