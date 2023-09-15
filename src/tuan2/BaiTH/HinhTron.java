package tuan2.BaiTH;

public class HinhTron {
	private ToaDo tam;
	private double bankinh;
	private final static double PI = 3.14;
	
	public HinhTron(ToaDo tam, double bankinh) {
		this.tam = tam;
		this.bankinh = bankinh;
	}
	
	public HinhTron() {}

	
	public ToaDo getTam() {
		return tam;
	}
	
	public void setTam(ToaDo tam) {
		this.tam = tam;
	}
	public double getBankinh() {
		return bankinh;
	}
	public void setBankinh(double bankinh) {
		this.bankinh = bankinh;
	}
	
	public double getPI() {
		return PI;
	}
	public double getChuVi() {
		return 2*getPI()*getBankinh();
	}
	public double getDienTich() {
		return 2*getBankinh()*getBankinh();
	}
	

	@Override
	public String toString() {
		return String.format("Hinh tron O(%.2f, %.2f); Ban kinh = %.2f; Chu vi = %.2f; Dien tich = %.2f;",getTam().getX(), getTam().getY(), getBankinh(), getChuVi(), getDienTich() );
	}
	
	
	
}
