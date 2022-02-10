package HomeWorkTask2UML;

public class Plane extends FlyingVehicle {

    private int maxDistance;

    public Plane(int passengers) {
        super(passengers);
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    protected void fly() {
        super.fly();
    }

    @Override
    protected void land() {
        super.land();
    }
}
