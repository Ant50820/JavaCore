package com.PracticalLesso6;

public abstract class Figure {
    public abstract double getArea();
}

class Circle extends Figure {
    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (3.14 * (radius * 2));
    }
}

class Rectangle1 extends Figure {

    private double length, width;

    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

class Point {
    private int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Circles {
    private Point point;
    private int radius;

    public Circles (Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }
}
class Points {
    protected  int x, y;
    public Points(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Circless extends Points {

    private int radius;
    public Circless(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }
}