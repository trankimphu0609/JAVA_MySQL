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
public class ChucVuDTO {
    private int maCV;
    private String tenCV;
    
    public ChucVuDTO() {

    }
    public ChucVuDTO(int maCV, String tenCV) {
        this.maCV = maCV;
        this.tenCV = tenCV;
    }
    public int getMaCV() {
        return maCV;
    }
    public void setMaCV(int maCV) {
        this.maCV = maCV;
    }
    public String getTenCV() {
        return tenCV;
    }
    public void setTenCV(String tenCV) {
        this.tenCV = tenCV;
    }
}

