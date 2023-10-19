package CDv0;

public class HocSinh {
	public int mssv;
	public String name;
	public int age;
	
	public HocSinh() {}
	
	public HocSinh(int mssv, String name, int age) {
		super();
		this.mssv = mssv;
		this.name = name;
		this.age = age;
	}

	public int getMssv() {
		return mssv;
	}

	public void setMssv(int mssv) {
		this.mssv = mssv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "mssv=" + mssv + ", name=" + name + ", age=" + age + "\n";
	}
	
	
	
	
}
