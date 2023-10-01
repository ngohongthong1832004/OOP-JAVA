package baitap.BaiTH;

public class bai3TamGIac {
	private double ma;
	private double mb;
	private double mc;
	
	public bai3TamGIac() {}
	
	public bai3TamGIac(double ma, double mb, double mc) {
		this.ma = ma;
		this.mb = mb;
		this.mc = mc;
	}
	
	public double getMa() {
		return ma;
	}
	public void setMa(double ma) {
		this.ma = ma;
	}
	public double getMb() {
		return mb;
	}
	public void setMb(double mb) {
		this.mb = mb;
	}
	public double getMc() {
		return mc;
	}
	public void setMc(double mc) {
		this.mc = mc;
	}
	
	public double tinhDienTich(double ma, double mb, double mc) {
		double p = ( ma + mb + mc ) / 2;
		return Math.sqrt(p * (p - ma) * (p - mb) * (p -mc));
	}
	
	public double tinhChuVi(double ma, double mb, double mc) {
		return ma + mb + mc;
	}

	@Override
	public String toString() {
		return "bai3TamGIac [ma=" + ma + ", mb=" + mb + ", mc=" + mc + "]" + "Dien tich " + tinhDienTich( ma , mb , mc) + " Chu vi " + tinhChuVi( ma , mb , mc);
	}
	

	
	public  static void main (String args[]) {
		bai3TamGIac tg1 = new bai3TamGIac(3,4,5);
		System.out.println(tg1);
	}
	
	
	
}
