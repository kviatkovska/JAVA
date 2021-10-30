package task5;

public class Apple extends Fruit {
	public int cost1 = 30;

	public Apple(int weight, String producer) {
		super(weight, producer);
		// TODO Auto-generated constructor stub
	}

	@Override
	double cost() {
		return cost1*weight;
	}

}
