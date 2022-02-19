package PracticalTask2Lesson8;

public class Circle extends Wrapper {



    public Circle(Shape shape) {
        super(shape);
    }

    @Override
    public String getLine() {
        return super.getLine() + "Circle";
    }

}
