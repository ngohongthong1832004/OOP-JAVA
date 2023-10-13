package tuan5.BaiTH;

public class XeNgoaiThanh  extends ChuyenXe {
	private String NoiDen;
	private String SoNgayDiDuoc;
	
	public XeNgoaiThanh() {}
	
	
	
	public XeNgoaiThanh(String maChuyenXe, String hoTenTaiXe, int soXe, String noiDen, String soNgayDiDuoc) {
		super(maChuyenXe, hoTenTaiXe, soXe);
		NoiDen = noiDen;
		SoNgayDiDuoc = soNgayDiDuoc;
	}



	@Override
	public float DoanhThu() {
		return 0;
	}

	public String getNoiDen() {
		return NoiDen;
	}

	public void setNoiDen(String noiDen) {
		NoiDen = noiDen;
	}

	public String getSoNgayDiDuoc() {
		return SoNgayDiDuoc;
	}

	public void setSoNgayDiDuoc(String soNgayDiDuoc) {
		SoNgayDiDuoc = soNgayDiDuoc;
	}

	@Override
	public String toString() {
		return "XeNgoaiThanh [NoiDen=" + NoiDen + ", SoNgayDiDuoc=" + SoNgayDiDuoc + "]";
	}
	
	
	
}
