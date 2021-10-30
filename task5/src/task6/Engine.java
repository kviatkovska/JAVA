package task6;

public class Engine {
	private int engineId;
    private int enginePower;
    private static int idCount=0;

    public Engine() {
        this.engineId = idCount++;
    }

    public int getEngineId() {
        return engineId;
    }

    public void setEngineId(int engineId) {
        this.engineId = engineId;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public int hashCode() {

        return 16 * this.getEngineId();
    }

    @Override
    public boolean equals(Object obj) {
        Engine engineToCompare = (Engine) obj;
        return this.getEngineId() == engineToCompare.getEngineId();
    }

    public void refuel() {
        System.out.println();
    }
}