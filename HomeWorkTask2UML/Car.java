package HomeWorkTask2UML;

public class Car extends GroundVehicle {

    private String model;

    public Car(int passengers) {
        super(passengers);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    protected void drive() {
        super.drive();
    }
}
