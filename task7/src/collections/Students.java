package collections;

public class Students {
	private String name;
	private boolean sex;
	
	
	
	public Students(String name, boolean sex) {
		super();
		this.name = name;
		this.sex = sex;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + "]";
	}
	
	
	
	
}