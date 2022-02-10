package HomeWorkTask2UML;

public class Motorcycle extends GroundVehicle {

    private int maxSpeed;

    public Motorcycle(int passengers) {
        super(passengers);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    protected void drive() {
        super.drive();
    }
}
