package com.PracticalLesso6;

public class CastingObjects {
    public static void main(String[] args) {

        int num = 1;
        double data = 1.0;

        data = num;
        System.out.println(data);

        System.out.println();
        Aclass a = new Aclass();
        Bclass b = new Bclass();


        a = b;
        //Object BClasss
        System.out.println(a);
        System.out.println("________________________________");



        Child child = new Child();
        System.out.println(child.userF());
        System.out.println();

        Parent parent = new Parent();
        System.out.println(parent.userF());
    }
}
class Parent{
    int f() {
        System.out.println("Class Parent");
        return 1;
    }
    public int userF(){
        return f();
    }
}
class  Child extends Parent {
    int f() {
        System.out.println("Class Child");
        return 2;
    }
}

class Circle1{
    private double radius1;
    public Circle1(){
        this.radius1 = 1.0;
    }
    public Circle1(double radius1) {
        this.radius1 = radius1;
    }

    public double getArea() {
        return  radius1 * radius1 * Math.PI;
    }
}
class Cylinder extends Circle1 {
    private double hieght;

    // Constructors
    public Cylinder(){
        super(); // invoke superclass' constructor Circle()
        this.hieght = 1.0;
    }
    public Cylinder(double hieght) {
        super(); // invoke superclass' constructor Circle()
        this.hieght = hieght;
    }
    public Cylinder(double hieght, double radius1) {
        super(radius1); // invoke superclass' constructor Circle(radius)
        this.hieght = hieght;
    }
    // Getter and Setter
    // Return the volume of this Cylinder
    public double getVolume() {
        // Use Circle's getArea()
        return getArea() * hieght;
    }
    public String toString() {
        return "This is a Cylender";
    }
}




class Aclass {
    int field1 = 10;
}

class  Bclass extends Aclass {
    int field2 = 20;
}


