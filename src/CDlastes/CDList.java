package CDlastes;

public class CDList {
	// xay dung cac chuc nang cho lop cd list 
//	 them phan tu vao cdlist
//	 tisnh so luong cd co trong danh sahc 
//	tinh tong gia thanh cua cac cd co trong list
//	phuongthuc tra thong tin cua toan bo cd co trong list 
//	thuc hien ti mkiem theo ma cd 
//	phuong thuc sap xep danh sach giam dan theo gia thanh 
//	phuong thuc sap xep danh sachtheo tua cd
//	ranh lam luon viec xoa mot cd theo ma cd co trong danh sach 
	
	
//	 cach khai bao mot list cd 
	private CD[] dscd;
	private int count;
	
	public CDList(int n) {
		dscd = new CD [n];
		count = 0;
	}
	public boolean them(CD bien) {
		if (count < dscd.length) {
			dscd[count] = bien;
			count++;
			return true;
		}
		return false;
	}
	
	public int soluongcd(){
		return count;
	}
	public double tonggia() {
		double bien =0;
		for (int i=0;i<count;i++) {
			bien += dscd[i].getGiathanh();
		}
		return bien;
	}
	public void hienthicdlist() {
		for (int i=0;i<count;i++) {
			System.out.println(dscd[i]);
		}
	}
	public CD timmacd(int macd) {
		for (int i=0;i<count;i++) {
			if (dscd[i].getMacd()==macd)
				return dscd[i];
		}
		return null;
	}
	public void sapxepcdtheogiathanh() {
		for (int i=0;i<count-1;i++) {
			for(int j=i+1;j<count;j++) {
				if(dscd[j].getGiathanh() > dscd[i].getGiathanh()) {
					CD temp = dscd[j];
					dscd[j]= dscd[i];
					dscd[i]= temp;
				}
			}
		}
	}
	public void sapxepcdtheomacd() {
		for (int i=0;i<count-1;i++) {
			for(int j=i+1;j<count;j++) {
				if(dscd[j].getTuacd().compareToIgnoreCase(dscd[i].getTuacd()) <0) {
					CD temp = dscd[j];
					dscd[j]= dscd[i];
					dscd[i]= temp;
				}
			}
		}
	}
}
