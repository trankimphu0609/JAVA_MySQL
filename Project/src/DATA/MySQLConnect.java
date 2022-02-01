
package DATA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author trankimphu0609
 */
public class MySQLConnect {
    String user = "root";
    String password = "";
    String url = "jdbc:mysql://localhost:3306/librarydb?useUnicode=true&characterEncoding=UTF-8";
    Connection conn = null;
    
    
    MySQLConnect(){
        
    }
    public Connection open() throws Exception{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conn = DriverManager.getConnection(url, user, password);
        } 
        catch (java.sql.SQLException e) {
            throw new Exception("không thể kết nối");
        }
        return this.conn;
    }
    
    
    
}