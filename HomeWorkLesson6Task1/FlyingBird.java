package HomeWorkLesson6Task1;

public class FlyingBird extends Bird {

    public FlyingBird(String feathers, String layEggs) {
        super();
        this.feathers = feathers;
        this.layEggs = layEggs;

    }

    @Override
    public void fly() {

        System.out.println("Flying Bird: " + feathers + " - " + layEggs);
        System.out.println("---------------");
    }
}
