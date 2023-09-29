package tuan3.BaiTH;


abstract class Bed {
    public abstract void greeting();  
    public void sleep() {
    System.out.println("Zzz");
  }  
}


class subClass extends Bed{
    public void greeting(){
        System.out.println("Hello");
    }
}


class test2 {
    public static void main (String args[]){
        subClass t2 = new subClass();
        t2.greeting();
        t2.sleep();
    }
}