package HomeWorkLesson6Task1;

public class Eagle extends FlyingBird {
    public Eagle(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Eagle: " + feathers + " - " + layEggs);
    }
}