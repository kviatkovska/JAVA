package task4;

public class Main {
	public static void main (String [] args) {
		Shape[] shape = new Shape[3];
		shape[0] = new Rectangle("��������");
		shape[1] = new Square("�������");
		shape[2] = new Circle("����");
		 for (int i=0; i < 3; i++) {
			 shape[i].draw();
			 System.out.println(shape[i].getColor());
		 }

	     System.out.println("����� ����: "+((Circle) shape[2]).area()+"\n�������� ����: "+((Circle) shape[2]).perimetr());
	}
}