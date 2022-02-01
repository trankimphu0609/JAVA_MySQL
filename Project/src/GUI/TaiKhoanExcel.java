/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.TaiKhoanBUS;
import DATA.MySQLConnect;
import DATA.TaiKhoanDAO;
import DTO.TaiKhoanDTO;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFCell;
 
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
 /**
 *
 * @author Trần Kim Phú
 */

public class TaiKhoanExcel  {
//    MySQLConnect connect;
    TaiKhoanDAO accdao = new TaiKhoanDAO();
    TaiKhoanDTO accdto = new TaiKhoanDTO();
    JFileChooser opensave = new JFileChooser();
    private static HSSFCellStyle createStyleForTitle(HSSFWorkbook workbook) {
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        HSSFCellStyle style = workbook.createCellStyle();
        style.setFont(font);
        return style;
    }
//    public void WriteExcel() throws FileNotFoundException, IOException, Exception{
//        int rVal = opensave.showSaveDialog(null);
//        if (rVal == JFileChooser.APPROVE_OPTION) 
//        {
//        String filename = opensave.getSelectedFile().getName();
//        String dir = opensave.getCurrentDirectory().toString();
//        
//        String filePath = dir+"\\"+filename;
//        
//        HSSFWorkbook workbook = new HSSFWorkbook();
//        HSSFSheet sheet = workbook.createSheet("TaiKhoans");
//        HSSFSheet sheet2 = workbook.createSheet("Staff");
//        
//        TaiKhoanDAO accDAO = new TaiKhoanDAO();
//        List<TaiKhoanDTO> listTaiKhoans = accDAO.listTaiKhoans();
//        List<StaffDTO> listStaffs = stfDAO.listStaffs();
//        //List<TaiKhoanDTO> accounts = TaiKhoanDAO.listTaiKhoans();
//
// 
//        int rownum = 0;
//        int rownum2 = 0;
//        Cell cell;
//        Row row;
//        Cell cell2;
//        Row row2;
//        //
//        HSSFCellStyle style = createStyleForTitle(workbook);
// 
//        row = sheet.createRow(rownum);
// 
//        // EmpNo
//        cell = row.createCell(0, CellType.STRING);
//        cell.setCellValue("ID");
//        cell.setCellStyle(style);
//        // EmpName
//        cell = row.createCell(1, CellType.STRING);
//        cell.setCellValue("Tên Tài Khoản");
//        cell.setCellStyle(style);
//        // Salary
//        cell = row.createCell(2, CellType.STRING);
//        cell.setCellValue("Mật Khẩu");
//        cell.setCellStyle(style);
//        // Grade
//        cell = row.createCell(3, CellType.STRING);
//        cell.setCellValue("Chức Danh");
//        cell.setCellStyle(style);
// 
//        // Data
//        for (TaiKhoanDTO acc : listTaiKhoans) {
//            rownum++;
//            row = sheet.createRow(rownum);
// 
//            // EmpNo (A)
//            cell = row.createCell(0, CellType.NUMERIC);
//            cell.setCellValue(acc.getID());
//            // EmpName (B)
//            cell = row.createCell(1, CellType.STRING);
//            cell.setCellValue(acc.getUserName());
//            // Salary (C)
//            cell = row.createCell(2, CellType.STRING);
//            cell.setCellValue(acc.getPassword());
//            // Grade (D)
//            cell = row.createCell(3, CellType.NUMERIC);
//            cell.setCellValue(acc.getLevel());
//        }
//        
//        
//        row2 = sheet2.createRow(rownum2);
// 
//        // EmpNo
//        cell2 = row2.createCell(0, CellType.STRING);
//        cell2.setCellValue("ID");
//        cell2.setCellStyle(style);
//        // EmpName
//        cell2 = row2.createCell(1, CellType.STRING);
//        cell2.setCellValue("Họ");
//        cell2.setCellStyle(style);
//        // Salary
//        cell2 = row2.createCell(2, CellType.STRING);
//        cell2.setCellValue("Tên");
//        cell2.setCellStyle(style);
//        // Grade
//        cell2 = row2.createCell(3, CellType.STRING);
//        cell2.setCellValue("Ngày Sinh");
//        cell2.setCellStyle(style);
//        
//        cell2 = row2.createCell(4, CellType.STRING);
//        cell2.setCellValue("Email");
//        cell2.setCellStyle(style);
//        
//        cell2 = row2.createCell(5, CellType.STRING);
//        cell2.setCellValue("Lương");
//        cell2.setCellStyle(style);
//    }
    public void ReadExcel() throws FileNotFoundException, IOException, SQLException, Exception {
       int rVal = opensave.showOpenDialog(null);
       if (rVal == JFileChooser.APPROVE_OPTION) 
       {
       String filename = opensave.getSelectedFile().getName();
       String dir = opensave.getCurrentDirectory().toString();        
        
       String filePath = dir+"\\"+filename;
        
       TaiKhoanBUS accbus = new TaiKhoanBUS();
       ArrayList<String> account = new ArrayList<>();
       // Đọc một file XSL.
       FileInputStream inputStream = new FileInputStream(new File(filePath));
       
//       connect = new MySQLConnect();
//       Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root", "");
//       PreparedStatement st = (PreparedStatement) connection.prepareStatement("DELETE FROM tableCSDLtk;");   
//      int results = st.executeUpdate();
//
//       connect.Close();
       // Đối tượng workbook cho file XSL.
       HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
 
  
       // Lấy ra sheet đầu tiên từ workbook
       HSSFSheet sheet = workbook.getSheet("Taikhoan");

       // Lấy ra Iterator cho tất cả các dòng của sheet hiện tại.
       Iterator<Row> rowIterator = sheet.iterator();
       int indexrow=0;
       while (rowIterator.hasNext()) 
       {
           Row row = rowIterator.next();
     
           // Lấy Iterator cho tất cả các cell của dòng hiện tại.
           Iterator<Cell> cellIterator = row.cellIterator();
 
           while (cellIterator.hasNext()) 
           {
               Cell cell = cellIterator.next();
  
               // Đổi thành getCellType() nếu sử dụng POI 4.x
               CellType cellType = cell.getCellType();
 
               switch (cellType) {
               case _NONE:
                   System.out.print("");
                   System.out.print("\t");
                   break;
               case BOOLEAN:
                   System.out.print(cell.getBooleanCellValue());
                   System.out.print("\t");
                   break;
               case BLANK:
                   System.out.print("");
                   System.out.print("\t");
                   break;
               case FORMULA:
       
                   // Công thức
                   System.out.print(cell.getCellFormula());
                   System.out.print("\t");
                    
                   FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
         
                   // In ra giá trị từ công thức
                   System.out.print(evaluator.evaluate(cell).getNumberValue());
                   break;
               case NUMERIC:
                   Double pointernum = cell.getNumericCellValue();
                   String rounded = String.format("%.0f", pointernum);
//                   if(indexrow!=0)
//                   {
                   account.add(rounded);
//                   }
                   //System.out.print(b);
                   System.out.print("\t");
                   break;


               case STRING:
                   String pointer = cell.getStringCellValue();
//                   if(indexrow!=0)
//                   {
                   account.add(pointer);
//                   }
                  // System.out.print(a);
                   System.out.print("\t");
                   break;
               case ERROR:
                   System.out.print("!");
                   System.out.print("\t");
                   break;
               }
           
           }
           
//           if(indexrow!=0)
//           {
           System.out.println("");
           System.out.println(account);
           String a=account.get(0);
           int aint = Integer.parseInt(a);
           accdto.setMatk(aint);
           
           String b=account.get(1);
           accdto.setUsername(b);
           
           String c=account.get(2);
           accdto.setMatkhau(c);
           
           String d=account.get(3);
           int dint = Integer.parseInt(d);
           accdto.setMaquyen(dint);
           
           account.clear();
           accbus.Them(accdto);
//           }
            indexrow++;
       }
       
       }
       }
    }