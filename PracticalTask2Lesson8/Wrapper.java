package PracticalTask2Lesson8;

public class Wrapper  implements Shape{

    /*
    Create Wrapper class which should wrap any
    objects which implements Shape interface
     */

    private Shape shape;

    public Wrapper(Shape shape) {
        this.shape = shape;
    }


    @Override
    public String getLine() {
        return shape.getLine() + " Wrapper Shape";
    }




}
