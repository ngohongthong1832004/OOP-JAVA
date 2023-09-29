// Chủ đề: Bài tập thực hành tuần 3
package tuan3.BaiTH;


class ParentCl {
    public int id;

    public void setParentId(int id){
        this.id = id;
    }

    public int getParentId(){
        return this.id;
    }

}


public class test extends ParentCl {
    private String name;
    private int age;

    public test(String name, int age){
        super();
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if (age > 0){
            this.age = age;
        }
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setParentId(int id){
        super.setParentId(id);
    }
    public int getParentId(){
        return super.getParentId();
    }

    @Override
    public String toString(){
        return "Name: " + this.name + "\nAge: " + this.age + "\nParentId: " + super.getParentId();
    }
}