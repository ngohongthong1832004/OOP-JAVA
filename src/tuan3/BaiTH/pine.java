package tuan3.BaiTH;


interface Thong {
    public String getNam();
    public int getAge();
}


class testPine implements Thong{
    private String name;
    private int age;

    public String getNam(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }   

    public testPine(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override 
    public String toString(){
        return "Name: " + this.name + "\nAge: " + this.age;
    }
}





public class pine {
    public static void main (String args[]){
         testPine t1 = new testPine("Pine", 19);
         System.out.println(t1.getNam());
    }
}
