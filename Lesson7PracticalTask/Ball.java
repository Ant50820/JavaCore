package Lesson7PracticalTask;

public class Ball extends Shape implements Volumetric {

    private double radius;
    public Ball (double radius, String name) {
        super(name); this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return  4.0 / 3 * Volumetric.PI * Math.pow(radius, 3);
    }

    @Override
    public void info() {

    }
}
