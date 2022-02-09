package Lesson7PracticalTask;

public class BmwX6mod extends BmwX6 {
    public BmwX6mod() {
        super();
    }

    @Override
    public void workedEngine() {
        System.out.println("6 Class BmwX6mod=== "+"BmwX6mod: Engine Running on Diesel. ");
        System.out.println("7 Class BmwX6mod===  BmwX6mod: Max Speed: " + getMaxSpeed() + 100);
        //super.workedEngine();
    }


    @Override
    public void lightsShine() {
        System.out.println("8 Class BmwX6mod===   BmwX6mod: Xenon Headlights. ");
        super.lightsShine();
        System.out.println("********************************");
    }

}
