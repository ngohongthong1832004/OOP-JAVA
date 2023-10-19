package OnGk;

import java.time.LocalDate;

public class CD {
	private String maCD, tuaCD, caSy;
	private LocalDate ngayPH;
	private int soBH;
	private  double gia;
	
	public double thanhTien() {
		return getGia()*getSoBH();
	}
	
	public CD() {}
	
	public CD(String maCD, String tuaCD, String caSy, LocalDate ngayPH, int soBH, double gia) {
		super();
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.caSy = caSy;
		this.ngayPH = ngayPH;
		this.soBH = soBH;
		this.gia = gia;
	}

	public String getMaCD() {
		return maCD;
	}

	public void setMaCD(String maCD) {
		this.maCD = maCD;
	}

	public String getTuaCD() {
		return tuaCD;
	}

	public void setTuaCD(String tuaCD) {
		this.tuaCD = tuaCD;
	}

	public String getCaSy() {
		return caSy;
	}

	public void setCaSy(String caSy) {
		this.caSy = caSy;
	}

	public LocalDate getNgayPH() {
		return ngayPH;
	}

	public void setNgayPH(LocalDate ngayPH) {
		this.ngayPH = ngayPH;
	}

	public int getSoBH() {
		return soBH;
	}

	public void setSoBH(int soBH) {
		this.soBH = soBH;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}
	

	@Override
	public String toString() {
		String s = "";
		s += s.format("|%-12s|%-12s|%-20s|%-12s|%-12s|%-12s|", 
					getMaCD(), getTuaCD(), getCaSy(), getNgayPH(), getSoBH(), getGia()
				);
		return s;
	}
	
}
