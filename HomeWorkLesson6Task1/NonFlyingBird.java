package HomeWorkLesson6Task1;

public class NonFlyingBird extends Bird{

    public NonFlyingBird(String feathers, String layEgges) {
        super();
        this.feathers = feathers;
        this.layEggs = layEgges;
    }

    @Override
    public void fly() {

        System.out.println("Non Flying Bird: " + feathers + " - " + layEggs);
        System.out.println("*****************");
    }
}
