package tuan2.BaiTH;

public class CD {
	private int maCD;
	private String tuaCD;
	private int soBaiHat;
	private double giaThanh;
	
	public CD() {
		this.maCD = 99999;
		this.tuaCD = "Unknow";
		this.soBaiHat = 0;
		this.giaThanh = 0;
	}
	
	
	public CD(int maCD, String tuaCD, int soBaiHat, double giaThanh) {
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.soBaiHat = soBaiHat;
		this.giaThanh = giaThanh;
	}
	
	
	public int getMaCD() {
		return maCD;
	}
	public void setMaCD(int maCD) {
		this.maCD = maCD;
	}
	public String getTuaCD() {
		return tuaCD;
	}
	public void setTuaCD(String tuaCD) {
		this.tuaCD = tuaCD;
	}
	public int getSoBaiHat() {
		return soBaiHat;
	}
	public void setSoBaiHat(int soBaiHat) {
		this.soBaiHat = soBaiHat;
	}
	public double getGiaThanh() {
		return giaThanh;
	}
	public void setGiaThanh(double giaThanh) {
		this.giaThanh = giaThanh;
	}
	
	@Override
	public String toString () {
		return String.format("maCD= %d ; Tua CD= %s ; So bai hat= %s ; Gia thanh= %f " ,getMaCD(),getTuaCD(),getSoBaiHat(), getGiaThanh()  );
	}
	
	
}
