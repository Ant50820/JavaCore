package HomeWorkLesson6Task1;

public class Penguin extends NonFlyingBird {
    public Penguin(String feathers, String layEgges) {
        super(feathers, layEgges);

    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Penguin: " + feathers + " - " + layEggs);
    }
}
