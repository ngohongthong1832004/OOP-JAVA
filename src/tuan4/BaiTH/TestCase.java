package tuan4.BaiTH;

import java.time.LocalDate;

public class TestCase {
	public static void main (String args[]) {
		Product pr1 = new Product("Cafe da", "10", 8.5);
		Product pr2 = new Product("tra sua", "15", 3.5);
		Product pr3 = new Product("sinh to", "16", 9.5);
		Oder o1 = new Oder(1, LocalDate.of(5, 03, 04));
		o1.addLineItem(pr3, 1);
		o1.addLineItem(pr2, 1);
		o1.addLineItem(pr1, 1);
		
		System.out.println(o1.calcTotalCharge());
		System.out.println(pr1);
		System.out.println(pr2);
		System.out.println(pr3);
		
	}
}
