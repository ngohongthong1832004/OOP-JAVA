package tuan2.BaiTH;

public class TestCD {
    public static void main(String[] args) {
        
        CD[] cdArray = new CD[3]; 
        CDList list = new CDList();
      
//        cdArray[0] = new CD(8888, "Album 1", 9, 86.86);
//        cdArray[1] = new CD(7777, "Album 2", 12, 105.50);
        cdArray[2] = new CD(6666, "Album 3", 10, 92.75);

//        CD itemCD = new CD(5555, "Album 5", 778, 2392.75);
        CD itemCD2 = new CD(4444, "Album 4", 128, 56.75);
        
        list.setList(cdArray);
        
        list.setN(1);
//        list.addOneCD(itemCD);
        list.addOneCD(itemCD2);
        
        
        
        System.out.println(list.TongGiaTien());
    }
}