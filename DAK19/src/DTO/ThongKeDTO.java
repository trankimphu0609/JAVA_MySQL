/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author HP
 */
public class ThongKeDTO {
    private int sum, maPM,maDS,matheTV,maDG;
    private String ho,ten;
    private int madg;
    private String hoDG;
    private String tenDG; 
    private String ngaySinh;
    private String address;
    private int soDT;
    private String trinhDo;
    private String noicongtac;
    private DateFormat ngaymuon = new SimpleDateFormat("yyyy-MM-dd");
        private DateFormat ngaytra = new SimpleDateFormat("yyyy-MM-dd");
    java.sql.Date date = new java.sql.Date(1);
    public ThongKeDTO(){
    }
    public ThongKeDTO(int maDG, String hoDG, String tenDG, String ngaySinh, String address, int soDT, String trinhDo, String noicongtac) {
        this.madg = maDG;
        this.hoDG = hoDG;
        this.tenDG = tenDG;
        this.ngaySinh = ngaySinh;
        this.address = address;
        this.soDT = soDT;
        this.trinhDo = trinhDo;
        this.noicongtac = noicongtac;
    }

    public int getMadg() {
        return madg;
    }

    public void setMadg(int madg) {
        this.madg = madg;
    }

    public String getHoDG() {
        return hoDG;
    }

    public void setHoDG(String hoDG) {
        this.hoDG = hoDG;
    }

    public String getTenDG() {
        return tenDG;
    }

    public void setTenDG(String tenDG) {
        this.tenDG = tenDG;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSoDT() {
        return soDT;
    }

    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getNoicongtac() {
        return noicongtac;
    }

    public void setNoicongtac(String noicongtac) {
        this.noicongtac = noicongtac;
    }
    public int getTong(){
        return sum;
    }
    public void setTong(int sum){
        this.sum=sum;
    }
    public int getMaPM(){
        return maPM;
    }
    public void setMaPM(int maPM){
        this.maPM=maPM;
    }
    
    public int getMaDS(){
        return maDS;
    }
    public void setMaDS(int maDS){
        this.maDS=maDS;
    }
    
    public DateFormat getNgayMuon(){
        return ngaymuon;
    }
    public void setNgayMuon(DateFormat ngaymuon){
        this.ngaymuon=ngaymuon;
    }
    public DateFormat getNgayTra(){
        return ngaytra;
    }
    public void setNgayTra(DateFormat ngaytra){
        this.ngaytra=ngaytra;
    }
    public java.sql.Date getDate(){
        return date;
    }
    public void setDate(java.sql.Date date){
        this.date=date;
    }
        public int getMatheTV(){
        return matheTV;
    }
    public void setMatheTV(int matheTV){
        this.matheTV=matheTV;
    }
        public int getMaDG(){
        return maDG;
    }
    public void setMaDG(int maDG){
        this.maDG=maDG;
    }
        public String getHo(){
        return ho;
    }
    public void setHo(String ho){
        this.ho=ho;
    }
        public String getTen(){
        return ten;
    }
    public void setTen(String ten){
        this.ten=ten;
    }
//    public int getThangMuon(){
//        return thangmuon;
//    }
//    public void setThangMuon(int thangmuon){
//        this.thangmuon=thangmuon;
//    }
//    
//    public int getNamMuon(){
//        return nammuon;
//    }
//    public void setNamMuon(int nammuon){
//        this.nammuon=nammuon;
//    }
}
