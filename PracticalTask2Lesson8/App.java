package PracticalTask2Lesson8;

import com.sun.jdi.ShortType;

public class App {

    public static void main(String[] args) {


        Shape shape = new Square();
        System.out.println(shape.getLine());
        System.out.println("---------------");

        Wrapper shapeWrapper = new Wrapper(new Square());


    }
}
