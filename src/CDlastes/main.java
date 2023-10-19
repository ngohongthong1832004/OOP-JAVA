package CDlastes;

import java.util.*;
public class main {
// cach tuong tac voi he thong list
    public static void main(String[] args) {
    	CDList ds = new CDList(5);
    	String s = String.format("%5s  %-20s%-20s%-15s", "ma cd","tua cd","so bai hat","gia thanh");
//    	 tao cd de nap vao cd chinh 
    	CD cd1 = new CD(1,"truong dep trai", 10, 16.7);
    	CD cd2 = new CD(2,"tri dep trai", 3, 20.3);
    	CD cd3 = new CD(3,"tuyen dep gai", 34, 15.9);
    	CD cd5 = new CD(5,"khang dep trai", 8, 17.9);
    	CD cd4 = new CD(4,"long dep trai", 19, 20.4);

//    	them vao danh sach 
    	ds.them(cd1);
    	ds.them(cd2);
    	ds.them(cd3);
    	ds.them(cd4);
    	ds.them(cd5);
    	Scanner sc= new Scanner(System.in);
    	
    	while (true) {
    		System.out.println("nhap 1 de tinh so luong cd co trong danh sach");
    		System.out.println("nhap 2 de tinh tong gia thanh cac cd co trong danh sach");
    		System.out.println("nhap 3 de hien thi danh sach ");
    		System.out.println("nhap 4 de tim kiem cd theo ma cd");
    		System.out.println("nhap 5 de sap xep cd theo gia thanh trong danh sach");
    		System.out.println("nhap 6 de sap xep cd theo tua cd trong danh sach");
    		System.out.println("nhap 0 de thoat chuong trinh");
    		System.out.println("nhap vao lua chon cua ban");
    		int chon = sc.nextInt();
    		if(chon==1) {
//    	  		 tisnh so luong cd co trong danh sahc
    	    	System.out.println("so luong cd co trong danh sach la:"+ds.soluongcd()+"\n");
    		}
    		else if (chon==2) {
//    	   		tinh tong gia thanh cua cac cd co trong list
    	    	System.out.println("tong gia thanh cac cd co trong danh sach:"+ds.tonggia()+"\n");
    		}
    		else if (chon==3) {
//    	   	phuongthuc tra thong tin cua toan bo cd co trong list 
    	    	System.out.println("danh sach cd sau khi them la:");
    	    	System.out.println(s);
    	    	ds.hienthicdlist();
    		}
    		else if (chon==4) {
//    	   		thuc hien ti mkiem theo ma cd 
    	    	
    	    	System.out.println("nhap vao ma cd ma ban muon tim :");
    	    	int bien=sc.nextInt();
    	    	CD cdtimduoc = ds.timmacd(bien);
    	    	if (cdtimduoc != null) {
    	    		System.out.println("tim thay cd:");
    	    		System.out.println(s);
    	    		System.out.println(cdtimduoc);
    	    		System.out.println("\n");
    	    	}
    	    	else {
    	    		System.out.println("khong tim thay cd\n");
    	    	}
    		}
    		else if (chon==5) {
//    	   	phuong thuc sap xep danh sach giam dan theo gia thanh 
    	    	System.out.println("sap xep cd theo gia thanh");
    	    	System.out.println("danh sach cd da sap xep");
    	    	
    	    	ds.sapxepcdtheogiathanh();
    	    	System.out.println(s);
    	    	ds.hienthicdlist();
    	    	System.out.println("\n");
    		}
    		else if (chon==6) {
//    	   	phuong thuc sap xep danh sachtheo tua cd
    	    	System.out.println("sap xep cd theo ma cd");
    	    	System.out.println("danh sach cd da sap xep");
    	    	ds.sapxepcdtheomacd();
    	    	System.out.println(s);
    	    	ds.hienthicdlist();
    	    	System.out.println("\n");
    		}
    		
    	}
    }
}
