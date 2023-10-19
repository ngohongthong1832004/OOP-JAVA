package OnGk;

import java.time.LocalDate;

public class TestCD {
	
	public static void main (String[] args) {
		CD cd1 = new CD("12345668", "mua xuan", "ngoc chau", LocalDate.of(2023, 1, 3), 10, 35000);
		CD cd2 = new CD("12232131", "mua ha", "ngoc hoan chau", LocalDate.of(2023, 12, 2), 3, 20000);
		CD cd3 = new CD("234230948", "mua thu", "ngoc ky chau", LocalDate.of(2023, 7, 3), 14, 1000);
		CD cd4 = new CD("23094123", "mua dong", "pine chau", LocalDate.of(2023, 6, 23), 72, 60606);
		CD cd5 = new CD("2349832", "sunmer", "ngo ngoc chau", LocalDate.of(2023, 3, 18), 9, 7000);
		CD cd6 = new CD("23409", "fall", "ngoc thong", LocalDate.of(2023, 10, 16), 101, 33333);
		CD cd7 = new CD("2309408324", "spring", "ngo hong thon", LocalDate.of(2023, 3, 31), 17, 5000);
		
		ListCD ls = new ListCD(2);
		ls.themCD(cd1);
		ls.themCD(cd2);
		ls.themCD(cd3);
		ls.themCD(cd4);
		ls.themCD(cd5);
		ls.themCD(cd6);
		ls.themCD(cd7);
	
		ls.xua("23409", "ngo hong thong", "bap hong pine", LocalDate.of(9999, 9,9), 120, 340);
		
		for(int i = 0; i < ls.count ; i++) {
			System.out.println( (i+1) + " " + ls.getAll()[i]);
		}

//		System.out.print("\n");	
//		System.out.println(ls.timKiem("ngo hong thon"));
//		
//		ls.sapXep();
		
		System.out.print("\n");
		
//		for(int i = 0; i < ls.count ; i++) {
//			System.out.println( (i+1) + " " + ls.getAll()[i]);
//		}
		
		
		
	}
	
	
	
}
