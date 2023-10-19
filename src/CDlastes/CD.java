package CDlastes;

import java.text.DecimalFormat;

public class CD {
	private int macd;
	private String tuacd;
	private int sobaihat;
	private double giathanh;
	public CD(int macd,String tuacd,int sobaihat,double giathanh) {
		setMacd(macd);
		setTuacd(tuacd);
		setSobaihat(sobaihat);
		setGiathanh(giathanh);
	}
	public int getMacd() {
		return macd;
	}
	public void setMacd(int macd) {
		if (macd > 0 )
			this.macd = macd;
		else 
			this.macd = 999999;
	}
	public String getTuacd() {
		return tuacd;
	}
	public void setTuacd(String tuacd) {
		if (!tuacd.trim().equals(""))
			this.tuacd = tuacd;
		else 
			this.tuacd = "chua xac dinh";
	}
	public int getSobaihat() {
		return sobaihat;
	}
	public void setSobaihat(int sobaihat) {
		if (sobaihat>0)
			this.sobaihat = sobaihat;
		else
			this.sobaihat = 0;
	}
	public double getGiathanh() {
		return giathanh;
	}
	public void setGiathanh(double giathanh) {
		if (giathanh > 0)
			this.giathanh = giathanh;
		else 
			this.giathanh = 0;
	}

	@Override 
	public String toString() {
//		thuc hien format lai gia thanh 
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return String.format("%5d  %-20s%-20d%-15s",macd,tuacd,sobaihat,df.format(giathanh));
	}
}
