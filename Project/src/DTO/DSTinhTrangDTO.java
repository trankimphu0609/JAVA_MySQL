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

public class DSTinhTrangDTO {
	private String MaTinhTrang;
	private String TinhTrang;
	public DSTinhTrangDTO() {
		
	}
	public DSTinhTrangDTO(String matt, String tt) {
            MaTinhTrang = matt;
            TinhTrang = tt;
        }
        public String getMaTinhTrang() {
            return this.MaTinhTrang;
        }
        public void setMaTinhTrang(String matt) {
            this.MaTinhTrang = matt;
        }
        public String getTinhTrang() {
            return this.TinhTrang;
        }
        public void setTinhTrang(String tt) {
            this.TinhTrang = tt;
        }

    @Override
    public String toString() {
        return "DSTinhTrangDTO{" + "MaTinhTrang=" + MaTinhTrang + ", TinhTrang=" + TinhTrang + '}';
    }
        
}