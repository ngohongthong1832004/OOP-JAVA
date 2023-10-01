package baitap.BaiTH;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class bai12KhoaHoc {
	
	private String tenKhoaHoc;
	private LocalDate thoiGianHoc;
	private LocalDate ngayMo;
	private bai12HocVien[] hocVien;
	

	public bai12KhoaHoc() {}

	public bai12KhoaHoc(String tenKhoaHoc, LocalDate thoiGianHoc, LocalDate ngayMo, bai12HocVien[] hocVien) {
		super();
		this.tenKhoaHoc = tenKhoaHoc;
		this.thoiGianHoc = thoiGianHoc;
		this.ngayMo = ngayMo;
		this.hocVien = hocVien;
	}
	
	public String getTenKhoaHoc() {
		return tenKhoaHoc;
	}
	public void setTenKhoaHoc(String tenKhoaHoc) {
		this.tenKhoaHoc = tenKhoaHoc;
	}
	public LocalDate getThoiGianHoc() {
		return thoiGianHoc;
	}
	public void setThoiGianHoc(LocalDate thoiGianHoc) {
		this.thoiGianHoc = thoiGianHoc;
	}
	public LocalDate getNgayMo() {
		return ngayMo;
	}
	public void setNgayMo(LocalDate ngayMo) {
		this.ngayMo = ngayMo;
	}
	public bai12HocVien[] getHocVien() {
		return hocVien;
	}
	public void setHocVien(bai12HocVien[] hocVien) {
		this.hocVien = hocVien;
	}
	
	
	public void timKhoaHoc(bai12KhoaHoc[] lKhoaHoc, String key) {
		for(int i = 0 ; i < lKhoaHoc.length; i++) {
			if(lKhoaHoc[i].tenKhoaHoc == key) {
				System.out.println(lKhoaHoc[i]);
			}
		}
	}
	
	public void timTenNguoi(bai12HocVien[] lSinhVien, String key) {
		for(bai12HocVien sv : lSinhVien) {
			if ( sv != null && sv.getHoTen() == key ) {
				System.out.println(sv);
			}
		}
	}
	
	public boolean NotInDate() {
		if (LocalDate.now().isBefore(getNgayMo())) {
			return true;
		}
		return false;
	}
	
	public boolean exprire() {
		if (getThoiGianHoc().isBefore(LocalDate.now())) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "[tenKhoaHoc=" + tenKhoaHoc + ", thoiGianHoc=" + thoiGianHoc + ", ngayMo=" + ngayMo
				+ ", hocVien=" + Arrays.toString(hocVien) + "] \n";
	}
	
	
}
