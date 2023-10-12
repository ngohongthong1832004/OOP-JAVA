package tuan6.BaiTH;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class testSach {
	public static void main (String args[]) {
		ArrayList<Sach> Sachs = new ArrayList<>();
		
        Sachs.add(new SachGiaoKhoa("TK002", LocalDate.of(2023, 10, 1), 80, 3, "NXB B", "old"));
        Sachs.add(new SachGiaoKhoa("TK003", LocalDate.of(2023, 10, 2), 120, 2, "NXB A", "new"));
        Sachs.add(new SachThamKhao("TB001", LocalDate.of(2023, 10, 3), 150, 4, "NXB C", 10));
        Sachs.add(new SachThamKhao("TB002", LocalDate.of(2023, 10, 4), 130, 6, "NXB D", 12));
        Sachs.add(new SachThamKhao("TB003", LocalDate.of(2023, 10, 5), 110, 4, "NXB C", 9));
        
        float tongThanhTienSGK = 0;
        
        
        float tongThanhTienSTK = 0;
        float TBCDonGIa = 0;
        int indexDonGia = 0;
        
        
       for(Sach sachItem : Sachs) {
    	   if(sachItem instanceof SachGiaoKhoa ) {
    		   tongThanhTienSGK += sachItem.ThanhTien();
    		   
    	   }else {
    		   tongThanhTienSTK += sachItem.ThanhTien();
    		   
    		   TBCDonGIa += sachItem.getDonGia();
    		   indexDonGia++;
    	   }
       }
       
       System.out.println("Tổng thành tiền sách giáo khoa: " + tongThanhTienSGK );
       System.out.println("Tổng thành tiền sách tham khảo: " + tongThanhTienSTK);
       
       System.out.println("TBC DON GIA tham khảo: " + TBCDonGIa / indexDonGia);
       
       
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ten NXB SGK: ");
       String TenNSB  = scanner.nextLine();
       

       for(Sach sachItem : Sachs) {
    	   if(sachItem instanceof SachGiaoKhoa ) {
    		   if ( sachItem.getNhaXuatBan().equals(TenNSB)) {
    			   System.out.println(sachItem);
    		   }
    	   }
       }
       
		
	}
}
