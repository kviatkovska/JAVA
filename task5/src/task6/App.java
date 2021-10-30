package task6;

public class App {
	public static void main (String [] args) {
		Car Hyundai = new Car();
		Engine engine1 = new Engine();
		//Wheels wheels1 = new Wheels();
		//Hyundai.setWheels(wheels1);
		Hyundai.setEngine(engine1);
		Hyundai.go();
		
		Car Audi = new Car();
		Wheels wheels2 = new Wheels();
		//Engine engine2 = new Engine();
		//Audi.setEngine(engine2);
		Audi.setWheels(wheels2);
		Audi.go();
		//System.out.println(Audi.hashCode()+","+Audi.equals(Audi));
		
		Car Honda = new Car();
		Engine engine3 = new Engine();
		Wheels wheels3 = new Wheels();
		Honda.setEngine(engine3);
		Honda.setWheels(wheels3);
		Honda.go();
		System.out.println(Honda.hashCode()+","+Honda.equals(Honda));
		
		Car Volkswagen = new Car();
		//Engine engine4 = new Engine();
		//Wheels wheels4 = new Wheels();
		Volkswagen.setEngine(engine3);
		Volkswagen.setWheels(wheels3);
		Volkswagen.go();
		System.out.println(Volkswagen.hashCode()+","+Volkswagen.equals(Honda));
		
		
	}

}
