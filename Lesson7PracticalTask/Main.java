package Lesson7PracticalTask;

public class Main {

    public static void main(String[] args) {

        Shape shapes[] = {
                new Cube(7.2, "MyCube"),
                new Ball(6.3, "MyBall")
        };

        for (Shape shape : shapes) {
            double area = shape.getArea();
            System.out.println(area);

            if (shape instanceof Volumetric) {
                double volume = ((Volumetric) shape).getVolume();
                System.out.println(volume);
            }
        }
    }
}
