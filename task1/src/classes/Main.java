package classes;
public class Main {
		 public static void main (String [] args) {
			 Flowers [] flower = new Flowers [3];
			 flower[0] = new Flowers (1, "Rose", "red", 40, "Florist");
			 flower[1] = new Flowers (2, "Tulip", "pink", 30, "Happy");
			 flower[2] = new Flowers (3, "Orchid", "blue", 50, "Arom Paris");
			
			 for (int i=0; i < 3; i++) {
				System.out.println(flower[i]); }
		 }
}

										 