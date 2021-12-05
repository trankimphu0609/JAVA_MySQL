/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author trankimphu0609
 */
public class NhaCungCapDTO {
    private String maNCC;
    private String tenNCC;
    private String DiaChiNCC;
    private String emailNCC;
    private int SdtNCC;
    
    public NhaCungCapDTO() {
        
    }
    public NhaCungCapDTO(String mncc, String tncc, String dc, String e, int sdt) {
        maNCC = mncc;
        tenNCC = tncc;
        DiaChiNCC = dc;
        emailNCC = e;
        SdtNCC = sdt;
    }
    public String getMaNCC() {
        return this.maNCC;
    }
    public void setMaNCC(String mncc) {
        this.maNCC = mncc;
    }
    public String getTenNCC() {
        return this.tenNCC;
    }
    public void setTenNCC(String tncc) {
        this.tenNCC = tncc;
    }
    public String getDiaChiNCC() {
        return this.DiaChiNCC;
    }
    public void setDiaChiNCC(String dc) {
        this.DiaChiNCC = dc;
    }
    public String getEmailNCC() {
        return this.emailNCC;
    }
    public void setEmailNCC(String e) {
        this.emailNCC = e;
    }
    public int getSoDTNCC() {
        return this.SdtNCC;
    }
    public void setSoDTNCC(int sdt) {
        this.SdtNCC = sdt;
    }
}