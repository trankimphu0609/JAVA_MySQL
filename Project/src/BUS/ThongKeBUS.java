/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DATA.ThongKeDAO;
import DTO.ThongKeDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class ThongKeBUS {
    public static ArrayList<ThongKeDTO> dsds;// danh sách đầu sách
    public static ArrayList<ThongKeDTO> dsdg; // danh sách độc giả
    public static ArrayList<ThongKeDTO> dsdg2; // danh sách độc giả2
    public ArrayList Doc(String ngaymuon,String ngaytra){
        ThongKeDAO data = new ThongKeDAO();
        dsds=data.Doc(ngaymuon,ngaytra);
        return dsds;
    }
    public ArrayList Docgia(String ngaymuon,String ngaytra){
        ThongKeDAO data = new ThongKeDAO();
        dsdg = data.Docgia(ngaymuon, ngaytra);
        return dsdg;
    }
    public ArrayList Docgia2(String ngaymuon,String ngaytra) throws SQLException{
        ThongKeDAO data = new ThongKeDAO();
        dsdg2 = data.Docgia2(ngaymuon, ngaytra);
        return dsdg2;
    }
}
