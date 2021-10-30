package task4;
public class Square extends Shape{
	public Square(String color) {
		super(color);
		}
	@Override
	void draw() {
		System.out.println("Намалювати квадрат ");
	}
}