package tuan5.BaiTH;

public class XeNoiThanh extends ChuyenXe {
	private int SoTuyen;
	private int SoKm;
	
	public XeNoiThanh() {}
	
	
	
	public XeNoiThanh(String maChuyenXe, String hoTenTaiXe, int soXe, int soTuyen, int soKm) {
		super(maChuyenXe, hoTenTaiXe, soXe);
		SoTuyen = soTuyen;
		SoKm = soKm;
	}



	@Override
	public float DoanhThu() {
		return 0;
	}
	
	public int getSoTuyen() {
		return SoTuyen;
	}
	public void setSoTuyen(int soTuyen) {
		SoTuyen = soTuyen;
	}
	public int getSoKm() {
		return SoKm;
	}
	public void setSoKm(int soKm) {
		SoKm = soKm;
	}

	@Override
	public String toString() {
		return "XeNoiThanh [SoTuyen=" + SoTuyen + ", SoKm=" + SoKm + "]";
	}

	
	
	
}
