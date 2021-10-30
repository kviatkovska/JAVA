package collections;

public class Marks {
	private int Mark1;
	private int Mark2;
	private int Mark3;
	public Marks(int mark1, int mark2, int mark3) {
		super();
		Mark1 = mark1;
		Mark2 = mark2;
		Mark3 = mark3;
	}
	public int getMark1() {
		return Mark1;
	}
	public void setMark1(int mark1) {
		Mark1 = mark1;
	}
	public int getMark2() {
		return Mark2;
	}
	public void setMark2(int mark2) {
		Mark2 = mark2;
	}
	public int getMark3() {
		return Mark3;
	}
	public void setMark3(int mark3) {
		Mark3 = mark3;
	}
	
	@Override
	public String toString() {
		return "Marks [Mark1=" + Mark1 + ", Mark2=" + Mark2 + ", Mark3=" + Mark3 + "]";
	}
}