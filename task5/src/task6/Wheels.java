package task6;

public class Wheels {
	private int wheelsId;
	private String wheelsName;
	private static int idCount = 10;

    public Wheels() {
        this.wheelsId = idCount++;
    }

    public int getWheelsId() {
        return wheelsId;
    }

    public void setWheelsId(int wheelsId) {
        this.wheelsId = wheelsId;
    }

    public String getWheelsName() {
        return wheelsName;
    }

    public void setBeakName(String beakName) {
        this.wheelsName = beakName;
    }
    @Override
    public int hashCode() {
        return 16 * this.wheelsId;
    }

    @Override
    public boolean equals(Object obj) {
        Wheels wheelsToCompare = (Wheels) obj;
        return this.getWheelsId() == wheelsToCompare.getWheelsId();
    }
    
    public void changeWheels() {
    	System.out.println();    	
    }

}