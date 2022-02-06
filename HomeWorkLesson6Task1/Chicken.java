package HomeWorkLesson6Task1;

public class Chicken extends NonFlyingBird {
    public Chicken(String feathers, String layEgges) {
        super(feathers, layEgges);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Chicken: " + feathers + " - " + layEggs);
    }
}
