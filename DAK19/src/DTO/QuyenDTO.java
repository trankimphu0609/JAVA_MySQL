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
public class QuyenDTO {
    private int maquyen;
    private String tenquyen;
    public QuyenDTO() {

    }
    public QuyenDTO(int maquyen, String tenquyen) {
        this.maquyen = maquyen;
        this.tenquyen = tenquyen;
    }
    public int getMaquyen() {
        return maquyen;
    }
    public void setMaquyen(int maquyen) {
        this.maquyen = maquyen;
    }
    public String getTenquyen() {
        return tenquyen;
    }
    public void setTenquyen(String tenquyen) {
        this.tenquyen = tenquyen;
    }
}
