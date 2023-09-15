package tuan1;

public class SinhVien {
    private String name;
    private String id;
    private String group;
    private int age;

    public SinhVien() {
    }
    public SinhVien(String name, String id, String group, int age) {
        this.name = name;
        this.id = id;
        this.group = group;
        this.age = age;
    }

    // getter
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public String getGroup() {
        return group;
    }
    public int getAge() {
        return age;
    }

    // setter

    public String setName(String name){
        this.name = name;
        return name;
    }
    public String setId(String id){
        this.id = id;
        return id;
    }
    public String setGroup(String group){
        this.group = group;
        return group;
    }
    public int setAge(int age){
        this.age = age;
        return age;
    }


    @Override
    public String toString() {
        return String.format("Name: %s\nId: %s\nGroup: %s\nAge: %d\n", getName(), getId(), getGroup(), getAge());
    }

}
