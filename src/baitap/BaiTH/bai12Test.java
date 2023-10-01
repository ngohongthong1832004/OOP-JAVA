package baitap.BaiTH;

import java.util.ArrayList;
import java.time.*;

public class bai12Test {
	public static void main (String args[]) {
		ArrayList<bai12KhoaHoc> dsKhoaHoc = new ArrayList<>();
		
		
//		ArrayList<bai12HocVien> dsHocVien = new ArrayList<>();
//		dsHocVien.add(new bai12HocVien("Thong", "709F2", 345223));
//		dsHocVien.add(new bai12HocVien("Pine", "UK-US", 8888888));
		
		
		bai12HocVien[] bai12HocVien = new bai12HocVien[20];
		bai12HocVien[1] = new bai12HocVien("Thong", "709F2", 345223);
		bai12HocVien[2] = new bai12HocVien("Pine", "US_UK", 88888);
		LocalDate start1 = LocalDate.of(2023, 10, 3);
		LocalDate end1 = LocalDate.of(2023, 12, 31);
		
		
		bai12HocVien[] bai12HocVien2 = new bai12HocVien[20];
		bai12HocVien2[1] = new bai12HocVien("Quoc", "HCM", 696969);
		bai12HocVien2[2] = new bai12HocVien("Nhi", "CAN_THO", 333333);
		LocalDate start2 = LocalDate.of(2023, 11, 1);
		LocalDate end2 = LocalDate.of(2023, 11, 5);
		
		
		dsKhoaHoc.add(new bai12KhoaHoc("toan", start1, end1, bai12HocVien));
		dsKhoaHoc.add(new bai12KhoaHoc("anh", start2, end2, bai12HocVien2));
		
//		System.out.println(dsKhoaHoc);
		
//		TIm nguoi
//		for(bai12KhoaHoc dsKH : dsKhoaHoc) {
//			dsKH.timTenNguoi(bai12HocVien, "Thong");
//			break;
////			dsKH.timTenNguoi(bai12HocVien2, "Thong");
//		}
		
//		dsKhoaHoc.timTenNguoi(bai12HocVien, "Thong");
		
		
//		Khoa het han
		for(bai12KhoaHoc dsKH : dsKhoaHoc) {
			if(dsKH.exprire()) {
				System.out.println(dsKH);
			}
			break;
		}
		
//		Khoa het han
		for(bai12KhoaHoc dsKH : dsKhoaHoc) {
			if(dsKH.NotInDate()) {
				System.out.println(dsKH);
			}
			break;
		}
		
		
	}
	
}
