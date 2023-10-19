package CDv0;

import java.util.Arrays;

public class ListHocSinh {
	public HocSinh List[];
	public int count;
	
	public ListHocSinh(int n) {
		List = new HocSinh[n];
		this.count = 0;
	}
	
	public ListHocSinh(HocSinh[] list, int count) {
		super();
		List = list;
		this.count = count;
	}

	public HocSinh[] getList() {
		return List;
	}

	public void setList(HocSinh[] list) {
		List = list;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
	
	public void SortMssv() {
		for(int i = 0 ; i < count - 1; i++) {
			for(int j = i + 1; j < count; j++) {
				if(List[i].getMssv() > List[j].getMssv()) {
					HocSinh temp = List[i];
					List[i] = List[j];
					List[j] = temp;
				}
			}
		}
	}
	
	public void Add(HocSinh hs) {
		if(count < List.length) {
			List[count] = hs;
			count++;
		}
	}
	
	public void Update(int mssv, String name, int age) {
		for(int i = 0 ; i < count - 1; i++) {
			if(List[i].getMssv() == mssv) {
				List[i].setName(name);
				List[i].setAge(age);
			}
		}
	}
	
	public HocSinh[] DeleteMssv(int mssv) {
		HocSinh[] tempHs = new HocSinh[List.length - 1]; 
		int updateIndex  = 0;
		for(int i = 0 ; i < count - 1; i++) {
			if(List[i].getMssv() == mssv) {
				
			}else {
				tempHs[updateIndex] = List[i];
				updateIndex++;
			}
		}
		List = tempHs;
		return List;
	}
	
	
	@Override
	public String toString() {
		return "["+ Arrays.toString(List) + ", count=" + count + "]";
	}
	
	
	
}
