package tuan6.BaiTH;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach {
	private String TinhTrang;
	
	
	
	public SachGiaoKhoa(String maSach, LocalDate string, int donGia, int soLuong, String nhaXuatBan,
			String tinhTrang) {
		super(maSach, string, donGia, soLuong, nhaXuatBan);
		TinhTrang = tinhTrang;
	}


	public String getTinhTrang() {
		return TinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		TinhTrang = tinhTrang;
	}


	@Override 
	public float ThanhTien() {
		if( TinhTrang.equals("new")) {
			return SoLuong * DonGia;
		}else if (TinhTrang.equals("old")) {
			return SoLuong * DonGia * 0.5f;
		}
		return 0;
	}
}
