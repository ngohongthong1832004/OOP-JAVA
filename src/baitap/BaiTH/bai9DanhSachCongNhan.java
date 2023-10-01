package baitap.BaiTH;

import java.util.Arrays;

public class bai9DanhSachCongNhan {
	private bai9CongNhan[] listCongNhan;
	private int n;
	
	
	
	
	public bai9DanhSachCongNhan(bai9CongNhan[] listCongNhan, int n) {
		super();
		this.listCongNhan = listCongNhan;
		this.n = n;
	}


	public bai9CongNhan[] getListCongNhan() {
		return listCongNhan;
	}


	public void setListCongNhan(bai9CongNhan[] listCongNhan) {
		this.listCongNhan = listCongNhan;
	}


	public int getN() {
		return n;
	}


	public void setN(int n) {
		this.n = n;
	}
	
	public void addOne( bai9CongNhan congNhan, int n ) {
		if(listCongNhan.length == 0 | n < listCongNhan.length) {
			listCongNhan[n] = congNhan;
			this.n = n+1;
		}
	}

	public void showAll() {
		System.out.println("[listCongNhan=" + Arrays.toString(listCongNhan) + ", n=" + n + "] \n");
	}
	
	public long countStaff() {
		return listCongNhan.length;
	}

	public void showBiger200() {
		for(int i = 0; i< n; i++) {
			if(listCongNhan[i].getmSoSP() > 200 && listCongNhan[i] != null) {
				System.out.println("Cong nhan=" + listCongNhan[i].getmHo() + " " +listCongNhan[i].getmTen() +" "+ listCongNhan[i].getmSoSP() + "\n" );
			}
		}
	}

	
	public void sortNhanCong( bai9CongNhan listCongNhan[] ) {
		for(int i = 0; i < n  ; i++ ) {
			for (int j = 0; j < n; j++) {
				if (listCongNhan[i].getmSoSP() < listCongNhan[j].getmSoSP() ) {
					bai9CongNhan  temp = listCongNhan[i];
					listCongNhan[i] = listCongNhan[j];
					listCongNhan[j] = temp;
				}
			}
		}
	}
	
	@Override
	public String toString() {
		return "[listCongNhan= \n" + Arrays.toString(listCongNhan) + ", n=" + n + "] \n";
	}

	
	
	
}
