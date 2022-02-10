package HomeWorkTask2UML;

public class FlyingVehicle extends Passengers implements Vehicle {

    public FlyingVehicle(int passengers) {
        super(passengers);
    }

    protected void fly() {};
    protected void land() {};
}
