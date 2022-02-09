package Lesson7PracticalTask;

import java.util.logging.SocketHandler;

public class BmwX6 extends ACar {

    public BmwX6() {

    }

    @Override
    void carRides() {
        setMaxSpeed(200);
        System.out.println("1 Class BmwX6==== " +"Car Rides");
        workedEngine();
        workedGearBox();
        lightsShine();
    }

    public void workedEngine() {
        System.out.println(" 2 Class BmwX6=== " + "BmwX6: Engine Running on Petrol. ");
        System.out.println("3 Class BmwX6=== " + "BmwX6: Max Speed: " + getMaxSpeed());
    }

    private void workedGearBox() {
        System.out.println("4 Class BmwX6=== " +"BmwX6: Worked GearBox ");
    }

    public void lightsShine() {
        System.out.println("5 Class BmwX6=== "+ "BmwX6: Halogen Headlingts. ");
        System.out.println("-------------------------------");
    }
}
