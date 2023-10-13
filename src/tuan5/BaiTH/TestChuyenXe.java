package tuan5.BaiTH;

import java.util.ArrayList;

public class TestChuyenXe {
	public static void main (String agrs[]) {
		ArrayList<ChuyenXe> ChuyenXes = new ArrayList();
		
		ChuyenXes.add(new XeNoiThanh("MA01", "Bap Hong Pine", 20, 20, 1000));
		ChuyenXes.add(new XeNoiThanh("MA02", "Ngo Hong Thong", 40, 20, 2000));
		
		ChuyenXes.add(new XeNgoaiThanh("MA02", "Ngo Hong Thong", 40, "HCM", "3 ngay"));
		ChuyenXes.add(new XeNgoaiThanh("MA02", "Ngo Hong Thong", 40, "CanTHo", "2 ngay"));
		
		for(ChuyenXe xe : ChuyenXes) {
			System.err.println(xe + "\n");
		}
	}
}
