package tuan5.BaiTH;

public class ChuyenXe {
	protected String MaChuyenXe;
	protected String HoTenTaiXe;
	protected int SoXe;
	
	
	public ChuyenXe() {}
	
	public ChuyenXe(String maChuyenXe, String hoTenTaiXe, int soXe) {
		super();
		MaChuyenXe = maChuyenXe;
		HoTenTaiXe = hoTenTaiXe;
		SoXe = soXe;
	}

	protected float DoanhThu() {
		return 0;
	}

	public String getMaChuyenXe() {
		return MaChuyenXe;
	}

	public void setMaChuyenXe(String maChuyenXe) {
		MaChuyenXe = maChuyenXe;
	}

	public String getHoTenTaiXe() {
		return HoTenTaiXe;
	}

	public void setHoTenTaiXe(String hoTenTaiXe) {
		HoTenTaiXe = hoTenTaiXe;
	}

	public int getSoXe() {
		return SoXe;
	}

	public void setSoXe(int soXe) {
		SoXe = soXe;
	}

	@Override
	public String toString() {
		return "XeNgoaiThanh [MaChuyenXe=" + MaChuyenXe + ", HoTenTaiXe=" + HoTenTaiXe + ", SoXe=" + SoXe + "]";
	}
	
	
	
}
