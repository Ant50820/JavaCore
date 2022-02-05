package PracticalTaskLesson6;

public class Point {
    /*
    Point with attributes x and y
     */

    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}


class Line {
    /*
    Line which contains two object of Point class
     */
    public Point point1;
    public Point point2;

    public Line(int x, int y) {
        super();

    }

    public void print() {
        System.out.println(toString());

    }

    @Override
    public String toString() {
        return "Line{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }
}

class ColorLine extends Line {
    /*
    ColorLine with attributes Color  which extends Line class.
    */
    public String color;

    public ColorLine(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

//    public ColorLine(int i, int i1, String rad) {
//        //super(new Point());
//    }


    public void print() {

        System.out.println(toString());

    }
    @Override
    public String toString() {
        return "ColorLine{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", color='" + color + '\'' +
                '}';
    }

}
