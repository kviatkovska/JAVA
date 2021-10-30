package task5;

public class Main {
	public static void main (String [] args) {
		double sum=0;
		Fruit[] fruit = new Fruit[3];
		fruit[0] = new Apple(60, "Італія");
		fruit[1] = new Apricot(40, "Іспанія");
		fruit[2] = new Pear(50, "Болгарія");
		for (int i=0; i < 3; i++) {
			fruit[i].printProducer();
			System.out.println("Вартість фрукта: "+fruit[i].getClass()+fruit[i].cost());
			sum += fruit[i].cost();
		}
	
		System.out.println("Загальна вартість проданих фруктів: " + sum);
	}
}
