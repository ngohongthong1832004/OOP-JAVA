package tuan2.BaiTH;

public class TestToaDo {
	public static void main (String[] args) {
		ToaDo td1  = new ToaDo("A", 4, 5);
		System.out.print(td1);
		
		System.out.println("\n");
		
		HinhTron ht1 = new HinhTron(td1, 5);
		System.out.println(ht1);
	}
}
