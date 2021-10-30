package task5;

public abstract class Fruit {
	public int weight;
	public String producer;
	public Fruit(int weight, String producer ) {
		this.weight=weight;
		this.producer=producer;
	}	
	public int getWeight() {
		return weight;
	}
	public String getProducer() {
		return producer;
	}	
	abstract double cost();
	public void printProducer() {
		System.out.println("Виробник: "+producer);
	}	
}
