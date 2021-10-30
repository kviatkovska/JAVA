package task5;

public class Apricot extends Fruit{
	public int cost2 = 40;

	public Apricot(int weight, String producer) {
		super(weight, producer);
		// TODO Auto-generated constructor stub
	}


	@Override
	double cost() {
		return cost2*weight;
	}

}
