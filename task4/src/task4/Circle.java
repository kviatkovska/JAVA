package task4;
public class Circle extends Shape{
	public Circle(String color) {
		super(color);
		}
	@Override
	void draw() {
		System.out.println("Намалювати коло ");
	}

	int radius = 10;
	final double Pi = 3.1415926536;
	
	double area() {
		return 2*Pi*10*10;
	}
	double perimetr() {
		return 2*Pi*10;
	}
}