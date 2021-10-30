package task1;

public class Vehicle {
    private int vehicleId;
    private Engine engine;
    private Wheel wheel;

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public int hashCode() {
        int vehicleHash = 14 *(this.getEngine().hashCode() + this.getWheel().hashCode());
        return vehicleHash;
    }

    @Override
    public boolean equals(Object obj) {
        Vehicle carToCompare = (Vehicle) obj;
        boolean areEqual = this.getEngine().equals(carToCompare.getEngine()) &&
                this.getWheel().equals(carToCompare.getWheel());
        return areEqual;
    }

    public void go() {
        if(this.getEngine() == null && this.getWheel() == null){
            System.out.println("\nGoing is impossible. You need to complete the car.");
            return;
        }
        else if (this.getEngine() == null) {
            System.out.println("\nPlease, refuel the car!");
        }
        else if (this.getWheel() == null) {
            System.out.println("\nPlease, change the wheels!");
        }
        else System.out.println("\nYou can go!");
    }

}
