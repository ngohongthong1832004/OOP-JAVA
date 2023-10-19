package OnGk;

import java.time.LocalDate;

public class ListCD {
	private CD[] ls;
	public int count;
	
	public ListCD(int n) {
		ls = new CD[n];
		count = 0;
	}
	
	public void tangKT() {
		if( ls.length == count ) {
			CD[] tam = new CD[ls.length*2];
			System.arraycopy(ls, 0, tam, 0, count);
			ls = tam;
		}
	}
	
	public boolean themCD(CD cdr) {
		tangKT();
		for(int i = 0; i < count; i++) {
			if(ls[i].getMaCD().equalsIgnoreCase(cdr.getMaCD()) == true)
				return false;
		}
		ls[count] = cdr;
		count++;
		return true;
	}
	
	public void xua(String maCD, String tuaCD, String caSy, LocalDate ngayPH, int soBH, double gia ) {
		for(int i = 0 ; i < ls.length - 1; i++) {
			if (ls[i].getMaCD() == maCD) {
	            ls[i].setTuaCD(tuaCD);
	            ls[i].setCaSy(caSy);
	            ls[i].setNgayPH(ngayPH);
	            ls[i].setSoBH(soBH);
	            ls[i].setGia(gia);
	        }
		}
	}	
	
	public CD timKiem( String key) {
		for(int i = 0 ; i < ls.length ; i++) {
			if (ls[i].getCaSy().equalsIgnoreCase(key)) {
				return ls[i];
			}
		}
		return null;
	}
	
	public CD[] sapXep() {
		for(int i = 0; i< ls.length; i++) {
			for(int j = i + 1; j < ls.length; j++ ) {
				CD temp = ls[j];
				ls[j] = ls[i];
				ls[i] = temp;
			}
		}
		return ls;
	}
	
	public void xoa(String maCD) {
		
		CD[] updatedList = new CD[ls.length - 1];
		int updatedIndex = 0;
		
		
		for(int i = 0 ; i < ls.length - 1; i++) {
			if (ls[i].getMaCD() == maCD) {
	            // If the CD is found (based on maCD), do nothing to skip it.
	        } else {
	            // If the CD is not found, copy it to the updated array.
	            updatedList[updatedIndex] = ls[i];
	            updatedIndex++;
	        }
		}
		ls = updatedList;
		count = this.count - 1;
	}
	
	public CD[] getAll () {
		return ls;
	}
	
}
