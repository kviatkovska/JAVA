package task6;
public class Car {
    private int carId;
    private Engine engine; 
    private Wheels wheels; 

	public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    @Override
    public int hashCode() {
        int carHash = 14 *(this.getEngine().hashCode() + this.getWheels().hashCode());
        return carHash;
    }

    @Override
    public boolean equals(Object obj) {
        Car carToCompare = (Car) obj;
        boolean areEqual = this.getEngine().equals(carToCompare.getEngine()) &&
                this.getWheels().equals(carToCompare.getWheels());
        return areEqual;
    }
    
    public void go() {
        if(this.getEngine() == null && this.getWheels() == null){
            System.out.println("\nGoing is impossible. You need to complete the car.");
        return;
        }
        else if (this.getEngine() == null) { 
        	  	System.out.println("\nPlease, refuel the car!");
        }
        else if (this.getWheels() == null) {
        	System.out.println("\nPlease, change the wheels!");
        }
        else System.out.println("\nYou can go!");
    }
}
