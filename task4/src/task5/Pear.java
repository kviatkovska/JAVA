package task5;

public class Pear extends Fruit{
	public int cost3 = 35;

	public Pear(int weight, String producer) {
		super(weight, producer);
		// TODO Auto-generated constructor stub
	}


	@Override
	double cost() {
		return cost3*weight;}

}
