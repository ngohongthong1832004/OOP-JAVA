package baitap.BaiTH;

public class bai9CongNhan {
	private long maCN;
	private String mHo;
	private String mTen;
	private long mSoSP;
	

	public bai9CongNhan() {}
	
	public bai9CongNhan(long maCN, String mHo, String mTen, long mSoSP) {
		super();
		this.maCN = maCN;
		this.mHo = mHo;
		this.mTen = mTen;
		this.mSoSP = mSoSP;
	}
	
	
	public long getMaCN() {
		return maCN;
	}
	public void setMaCN(long maCN) {
		this.maCN = maCN;
	}
	public String getmHo() {
		return mHo;
	}
	public void setmHo(String mHo) {
		this.mHo = mHo;
	}
	public String getmTen() {
		return mTen;
	}
	public void setmTen(String mTen) {
		this.mTen = mTen;
	}
	public long getmSoSP() {
		return mSoSP;
	}
	public void setmSoSP(long mSoSP) {
		this.mSoSP = mSoSP;
	}
	
	
	public double tinhLuong() {
		double luong;
		luong = mSoSP * (  mSoSP < 200 ?  0.5  : ( mSoSP < 400 ? 0.55 : ( mSoSP < 600 ? 0.6 : 0.65 )));
		return luong;	
	}

	@Override
	public String toString() {
		return "[maCN=" + maCN + ", mHo=" + mHo + ", mTen=" + mTen + ", mSoSP=" + mSoSP + " Luong: " + tinhLuong() + "] \n";
	}
	
	
	
	public static void main (String agrs[]) {
		
		
		bai9CongNhan[] list = new bai9CongNhan[10];
		
		list[0] = new bai9CongNhan(1, "Hong1", "Thong1", 400);
		list[1] = new bai9CongNhan(1, "Hong1", "Thong1s", 40);
		list[2] = new bai9CongNhan(1, "Hong1", "Thong1sad", 3400);
		
		bai9DanhSachCongNhan ds = new bai9DanhSachCongNhan(list, 3);
		
		bai9CongNhan ls1 = new bai9CongNhan(1, "Hong1", "pine", 400);
		bai9CongNhan ls2 = new bai9CongNhan(2, "Hong3", "Thong3", 100);
		bai9CongNhan ls3 = new bai9CongNhan(3, "Hong4", "Thong4", 200);
		bai9CongNhan ls4 = new bai9CongNhan(4, "Hong5", "Thong5", 3100);
		
		ds.addOne(ls1, 3);
		
		System.out.println(ds);
		
		System.out.println("\n");
//		System.out.println("\n");
		
//		ds.showBiger200();
		
//		System.out.println(ds.getN());
		
		ds.sortNhanCong(ds.getListCongNhan());
		
		System.out.println(ds);
	}
	
	
	
}
