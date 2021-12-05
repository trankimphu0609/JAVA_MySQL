/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Trần Kim Phú
 */
public class TheThuVienDTO {
    private int matheTV;
    private int maDocGia;
    private String ngayLamThe;
    private String ngayHetHan;
    
    public TheThuVienDTO() {
        
    }
    public TheThuVienDTO(int matheTV, int maDocGia, String ngayLamThe, String ngayHetHan) {
        this.matheTV = matheTV;
        this.maDocGia = maDocGia;
        this.ngayLamThe = ngayLamThe;
        this.ngayHetHan = ngayHetHan;
    }
    public int getMaDocGia() {
        return maDocGia;
    }
    public void setMaDocGia(int maDocGia) {
        this.maDocGia = maDocGia;
    }
    public int getMatheTV() {
        return matheTV;
    }
    public void setMatheTV(int matheTV) {
        this.matheTV = matheTV;
    }
    public String getNgayLamThe() {
        return ngayLamThe;
    }
    public void setNgayLamThe(String ngayLamThe) {
        this.ngayLamThe = ngayLamThe;
    }
    public String getNgayHetHan() {
        return ngayHetHan;
    }
    public void setNgayHetHan(String ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
    
    
}
