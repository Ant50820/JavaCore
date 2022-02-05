package com.PracticalLesso6;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        int a = rectangle.someNum(12 * 12 + 32);
        rectangle.width = 42;
        rectangle.height = 74;
        int per = rectangle.getPerimeter();
        int area = rectangle.getArea();
        System.out.println(per);
        System.out.println(area);

        Parallelogram parallelogram = new Parallelogram();
        parallelogram.width = 42;
        parallelogram.height = 74;
        parallelogram.setAngle(35);

        double p = parallelogram.getPerimeter();
        System.out.println("Perim of parall aquals " + p );

        System.out.println("-----------------------------------------");
        Circles circles = new Circles(new Point(74, 38), 26);

        Circless circless = new Circless(74, 38, 26);
    }
}
