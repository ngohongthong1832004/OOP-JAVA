package tuan6.BaiTH;

import java.time.LocalDate;

public abstract class Sach {
	protected String MaSach;
	protected LocalDate NgayNhap;
	protected int  DonGia;
	protected int SoLuong;
	protected String NhaXuatBan;
	
	public Sach() {}
	
	public Sach(String maSach, LocalDate LocalDate, int donGia, int soLuong, String nhaXuatBan) {
		super();
		MaSach = maSach;
		NgayNhap = LocalDate;
		DonGia = donGia;
		SoLuong = soLuong;
		NhaXuatBan = nhaXuatBan;
	}



	public String getMaSach() {
		return MaSach;
	}



	public void setMaSach(String maSach) {
		MaSach = maSach;
	}



	public LocalDate getNgayNhap() {
		return NgayNhap;
	}



	public void setNgayNhap(LocalDate ngayNhap) {
		NgayNhap = ngayNhap;
	}



	public int getDonGia() {
		return DonGia;
	}



	public void setDonGia(int donGia) {
		DonGia = donGia;
	}



	public int getSoLuong() {
		return SoLuong;
	}



	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}



	public String getNhaXuatBan() {
		return NhaXuatBan;
	}



	public void setNhaXuatBan(String nhaXuatBan) {
		NhaXuatBan = nhaXuatBan;
	}



	public float ThanhTien() {
		return 0;
	}

	@Override
	public String toString() {
		return "Sach [MaSach=" + MaSach + ", NgayNhap=" + NgayNhap + ", DonGia=" + DonGia + ", SoLuong=" + SoLuong
				+ ", NhaXuatBan=" + NhaXuatBan + "]";
	}
	
	
	
}
