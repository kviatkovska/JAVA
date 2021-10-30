package task1;

public class Wheel {
    private int wheelId;
    private String wheelName;
    private static int idCount = 10;

    public Wheel() {
        this.wheelId = idCount++;
    }

    public int getWheelId() {
        return wheelId;
    }

    public void setWheelId(int wheelId) {
        this.wheelId = wheelId;
    }

    public String getWheelName() {
        return wheelName;
    }

    public void setBeakName(String beakName) {
        this.wheelName = beakName;
    }
    @Override
    public int hashCode() {
        return 16 * this.wheelId;
    }

    @Override
    public boolean equals(Object obj) {
        Wheel wheelToCompare = (Wheel) obj;
        return this.getWheelId() == wheelToCompare.getWheelId();
    }

    public void changeWheel() {
        System.out.println();
    }
    @Override
    public String toString() {
        return "Wheel";
    }

}
