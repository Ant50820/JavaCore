package PracticalTaskLesson6;

public class MainPoint {

    /*
    In main() method create array of Line and add some Line and ColorLine to it.
    Call method print() for all of it.
     */
    public static void main(String[] args) {

        Point point = new Point(20,30);
        Line line = new Line(13, 25);
        ColorLine colorLine = new ColorLine(10,20, "Rad");



        point.print();
        line.print();
        colorLine.print();



    }
}
