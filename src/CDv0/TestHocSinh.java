package CDv0;

public class TestHocSinh {
	public static void main (String[] agrs) {
		HocSinh hs1 = new HocSinh(12,"ngo hong thong", 18);
		HocSinh hs2 = new HocSinh(5,"bap hong pine", 28);
		HocSinh hs3 = new HocSinh(72,"Nguyen Tam Nhu", 5);
		
		ListHocSinh ls  = new ListHocSinh(4);
		
		
		ls.Add(hs1);
		ls.Add(hs2);
		ls.Add(hs3);
		
		System.out.println(ls);
		
		ls.SortMssv();
		
		System.out.println(ls);
		
		
		ls.DeleteMssv(72);
		
		System.out.println(ls);
		
		ls.Update(5, "Tam Nhu iu", 19);
		
		System.out.println(ls);
	}
}
