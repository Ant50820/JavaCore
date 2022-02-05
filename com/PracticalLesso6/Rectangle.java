package com.PracticalLesso6;

public class Rectangle {
    protected int width;
    protected int height;

    public int someNum(int num) {
        return num;
    }

    public int getPerimeter() {
        return  2 * (width + height);
    }

    public int getArea() {
        return width * height;
    }

//    public int getPerimeter() {
//        return 2 * (width + height);
//    }


}


class Parallelogram extends Rectangle{




    private int angle;

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public int getArea() {
        return (int) (width * height * Math.sin(angle * Math.PI / 180));
    }

}



