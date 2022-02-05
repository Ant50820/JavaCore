package PracticalTaskLesson6;

public abstract class Car {

    public String models;
    public int yearOfManufacture;

    public abstract void run();
    public abstract void stop();

}

class Truck extends Car {
    public void run() {};
    public void stop(){};
}
class Sedan extends Car {
    public void run() {};
    public void stop(){};
}
