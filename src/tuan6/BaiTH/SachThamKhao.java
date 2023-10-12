package tuan6.BaiTH;

import java.time.LocalDate;

public class SachThamKhao extends Sach {
	private int Thue;
	
	public SachThamKhao(String maSach, LocalDate ngayNhap, int donGia, int soLuong, String nhaXuatBan, int thue) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		Thue = thue;
	}

	public int getThue() {
		return Thue;
	}

	public void setThue(int thue) {
		Thue = thue;
	}

	@Override 
	public float ThanhTien() {
		return SoLuong * DonGia * Thue;
	}
}
