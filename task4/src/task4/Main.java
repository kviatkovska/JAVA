package task4;

public class Main {
	public static void main (String [] args) {
		Shape[] shape = new Shape[3];
		shape[0] = new Rectangle("Червоний");
		shape[1] = new Square("Зелений");
		shape[2] = new Circle("Синій");
		 for (int i=0; i < 3; i++) {
			 shape[i].draw();
			 System.out.println(shape[i].getColor());
		 }

	     System.out.println("Площа коло: "+((Circle) shape[2]).area()+"\nПериметр коло: "+((Circle) shape[2]).perimetr());
	}
}