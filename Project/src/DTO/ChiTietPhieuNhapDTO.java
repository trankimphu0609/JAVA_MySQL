package DTO;

public class ChiTietPhieuNhapDTO {
    private int IDPhieuNhap;
    private int maSach;
    private String TenSach;
    private int soLuong;
    private int donGia;
    
    public ChiTietPhieuNhapDTO() {
        
    }
    public ChiTietPhieuNhapDTO(int IDPhieuNhap, int maSach,String ten, int soLuong, int donGia) {
        this.IDPhieuNhap = IDPhieuNhap;
        this.maSach = maSach;
        this.TenSach=ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    
    public int getIDPhieuNhap() {
        return this.IDPhieuNhap;
    }
    public void setIDPhieuNhap(int IDPhieuNhap) {
        this.IDPhieuNhap = IDPhieuNhap;
    }
    public int getMaSach() {
        return this.maSach;
    }
    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }
    public int getSoLuong() {
        return this.soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public int getDonGia() {
        return this.donGia;
    }
    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    @Override
    public String toString() {
        return "ChiTietPhieuNhapDTO{" + "IDPhieuNhap=" + IDPhieuNhap + ", maSach=" + maSach + ", TenSach=" + TenSach + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }

    
    
}