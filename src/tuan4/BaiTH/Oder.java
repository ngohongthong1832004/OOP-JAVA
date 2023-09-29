package tuan4.BaiTH;

import java.time.LocalDate;

public class Oder {
	private int oderID;
	private LocalDate oderDate;
	private OderDetail lineItems[]; 
	private int count;
	
	public Oder(int oderID, LocalDate oderDate) {
		this.oderID = oderID;
		this.oderDate = oderDate;
		this.lineItems = new OderDetail[10];
	}



	public int getOderID() {
		return oderID;
	}



	public void setOderID(int oderID) {
		this.oderID = oderID;
	}



	public LocalDate getOderDate() {
		return oderDate;
	}



	public void setOderDate(LocalDate oderDate) {
		this.oderDate = oderDate;
	}

	public void addLineItem(Product a, int b) {
		if(count < lineItems.length) {
			lineItems[count++] = new OderDetail(b, a);
		}
	}
	
	public double calcTotalCharge() {
		double tongtien = 0;
		for (int i = 0 ; i< count; i++) {
			tongtien += lineItems[i].calcTotalPrice();
		}
		return tongtien;
	}
	
	@Override
	public String toString() {
		return "Oder [oderID=" + oderID + ", oderDate=" + oderDate + ", lineItems=" + lineItems + ", count=" + count
				+ "]";
	}



	public  OderDetail[] getLineItem() {
		return lineItems;
	}
	

}
