/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Trần Kim Phú
 */
public class DanhMucDTO {
    private int maDM;
    private String tenDM;
    public DanhMucDTO(){
        
    }
    public DanhMucDTO(int maDM, String tenDM) {
        this.maDM = maDM;
        this.tenDM= tenDM;
    }
   public int getMaDM() {
       return this.maDM;
   }
   public void setMaDM(int maDM) {
       this.maDM = maDM;
   }
   public String getTenDM() {
       return this.tenDM;
   }
   public void setTenDM(String tenDM) {
       this.tenDM = tenDM;
   }
}
