package HomeWorkLesson6Task1;

public class Swallow  extends FlyingBird {
    public Swallow(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Swallow: " + feathers + " - " + layEggs);
    }
}
