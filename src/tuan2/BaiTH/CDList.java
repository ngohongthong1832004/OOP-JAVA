package tuan2.BaiTH;

import java.util.Arrays;

public class CDList {
	private CD[] list;
    private int n = 0;
    private int Total;

    public CDList(CD[] list, int n) {
        this.list = list;
        this.n = n;
    }

    public CDList() {
    }

    public CD[] getList() {
        return list;
    }

    public void setList(CD[] list) {
        this.list = list;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public int GetSoLuongCD() {
    	return list.length;
    }
    
    public double TongGiaTien () {
    	for (int i = 0 ; i < n ; i++) {
    		Total += list[i].getGiaThanh();
    	}
    	return Total;
    }

    public boolean addOneCD(CD cd) {
    	
    
        if (n < list.length) {
            // Check if the CD already exists in the list
            for (int i = 0; i < n; i++) {
                if (list[i].equals(cd)) {
                    System.out.println("CD already exists in the list.");
                    return false;
                }
            }

            // Add the CD to the list
           
            list[n] = cd;
            n++;
            return true;
        } else {
            System.out.println("The CD list is full.");
            return false;
        }
    }

    // Add other methods for operations like calculating total price, sorting, etc.

    @Override
    public String toString() {
        return "[list=" + Arrays.toString(list) + ", n=" + n + "]";
    }
}
