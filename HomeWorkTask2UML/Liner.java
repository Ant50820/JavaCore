package HomeWorkTask2UML;

public class Liner extends WaterVehicle{

    private int floors;

    public Liner(int passengers) {
        super(passengers);
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    protected void isSailing() {
        super.isSailing();
    }
}
