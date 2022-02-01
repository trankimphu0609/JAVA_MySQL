/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class Controller {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
    public void readdata(DefaultTableModel model, String table) throws SQLException, Exception
    {
            String a,b,c,d,e,f,g,h;
            ArrayList<String> data = new ArrayList<String>();
            //DefaultTableModel model = (DefaultTableModel) table.getModel();
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root", "");
            PreparedStatement st = (PreparedStatement) connection.prepareStatement("Select * FROM "+ table +";");
            //String sql="SELECT * FROM hwList";
            
            //Statement statement = (Statement) connection.createStatement(); 
            //ResultSet results = statement.executeQuery("SELECT * FROM "+table);
            
            ResultSet results = st.executeQuery();
            ResultSetMetaData metadata = (ResultSetMetaData) results.getMetaData();
            
            int columnCount = metadata.getColumnCount();
            for (int i=1; i<=columnCount; i++) 
                {
                String columnName = metadata.getColumnName(i);
                data.add(columnName);
                System.out.println(columnName);
                }
            if(columnCount==2)
            {
                while(results.next())
                {
                    a = results.getString(data.get(0));
                    b = results.getString(data.get(1));
                    model.addRow(new Object[]{a,b}); 
                }  
            }
            if(columnCount==3)
            {
                while(results.next())
                {
                    a = results.getString(data.get(0));
                    b = results.getString(data.get(1));
                    c = results.getString(data.get(2));
                    model.addRow(new Object[]{a,b,c}); 
                }  
            }
            if(columnCount==4)
            {
                while(results.next())
                {
                    a = results.getString(data.get(0));
                    b = results.getString(data.get(1));
                    c = results.getString(data.get(2));
                    d = results.getString(data.get(3));
                    model.addRow(new Object[]{a,b,c,d}); 
                }  
            }
            if(columnCount==5)
            {
                while(results.next())
                {
                    a = results.getString(data.get(0));
                    b = results.getString(data.get(1));
                    c = results.getString(data.get(2));
                    d = results.getString(data.get(3));
                    e = results.getString(data.get(4));
                    model.addRow(new Object[]{a,b,c,d,e}); 
                }  
            }
            if(columnCount==6)
            {
                while(results.next())
                {
                    a = results.getString(data.get(0));
                    b = results.getString(data.get(1));
                    c = results.getString(data.get(2));
                    d = results.getString(data.get(3));
                    e = results.getString(data.get(4));
                    f = results.getString(data.get(5));
                    model.addRow(new Object[]{a,b,c,d,e,f}); 
                }  
            }
            if(columnCount==7)
            {
                while(results.next())
                {
                    a = results.getString(data.get(0));
                    b = results.getString(data.get(1));
                    c = results.getString(data.get(2));
                    d = results.getString(data.get(3));
                    e = results.getString(data.get(4));
                    f = results.getString(data.get(5));
                    g = results.getString(data.get(6));
                    model.addRow(new Object[]{a,b,c,d,e,f,g}); 
                }  
            }
            if(columnCount==8)
            {
                while(results.next())
                {
                    a = results.getString(data.get(0));
                    b = results.getString(data.get(1));
                    c = results.getString(data.get(2));
                    d = results.getString(data.get(3));
                    e = results.getString(data.get(4));
                    f = results.getString(data.get(5));
                    g = results.getString(data.get(6));
                    h = results.getString(data.get(7));
                    model.addRow(new Object[]{a,b,c,d,e,f,g,h}); 
                }  
            }
    }
            public void cleartable(DefaultTableModel model) {
        int rowsToRemove = model.getRowCount();
        //remove rows from the bottom one by one
        for (int i = rowsToRemove - 1; i >= 0; i--) {
           model.removeRow(i);
        }
        }
    }           