package task4;
public abstract class Shape {
	public String color;
	public Shape(String color) {
		this.color=color;
	}	
	public String getColor() {
		return color;
	}
	abstract void draw() ;
}