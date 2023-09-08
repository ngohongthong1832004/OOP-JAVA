package tuan1;

public class HinhChuNhat {
	private  double ChieuDai;
	private  double ChieuRong;
	
	public HinhChuNhat() {
    }
	
	public HinhChuNhat(double dai, double rong) {
        this.ChieuDai = dai;
        this.ChieuRong = rong;
    }
	
	public void setChieuDai(double d) {
		this.ChieuDai = d;
	}
	
	public void setChieuRong(double r) {
		this.ChieuRong = r;
	}
	
	public double getChieuDai() {
		return ChieuDai;
	}
	
	public double getChieuRong() {
		return ChieuRong;
	}
	public double getChuVi() {
		return (getChieuDai() + getChieuRong()) * 2;
	}
	public double getDienTich() {
		return getChieuDai() * getChieuRong();
	}
	
	 @Override
	 public String toString() {
		 return String.format("Chieu dai : %f Chieu Rong : %f =>  Dien tich va chu vi la : %f and %f", getChieuDai(), getChieuRong(), getDienTich(), getChuVi());
	 }
	 
	
	
}
