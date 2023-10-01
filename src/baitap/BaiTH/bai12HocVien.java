package baitap.BaiTH;
import java.util.ArrayList;


public class bai12HocVien {
	

	private String hoTen;
	private String diaChi;
	private long dienThoai;
	
	public bai12HocVien() {}
	
	public bai12HocVien(String hoTen, String diaChi, long dienThoai) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.dienThoai = dienThoai;
	}
	
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public long getDienThoai() {
		return dienThoai;
	}
	public void setDienThoai(long dienThoai) {
		this.dienThoai = dienThoai;
	}
	

	@Override
	public String toString() {
		return "\n ["+ hoTen + ", " + diaChi + ", " + dienThoai + "] \n";
	}
	
}
