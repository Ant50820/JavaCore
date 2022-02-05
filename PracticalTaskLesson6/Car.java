package PracticalTaskLesson6;

public abstract class Car {

    public String models;
    public int maxSpeed;
    public int yearOfManufacture;

    public abstract void run();
    public abstract void stop();

}

class Truck extends Car {

    public Truck(String models, int maxSpeed, int yearOfManufacture) {
        super();
        this.models = models;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void run() {};
    public void stop(){};
}
class Sedan extends Car {

    public Sedan(String models, int maxSpeed, int yearOfManufacture) {
        super();
        this.models = models;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }
    public void run() {};
    public void stop(){};
}
