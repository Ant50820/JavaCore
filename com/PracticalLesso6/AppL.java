package com.PracticalLesso6;

class ClassA {
    public int i = 1;

    public void m1() {
        System.out.println("ClassA, method m1, i = " + i);
    }
    public void m2() {
        System.out.println("ClassA, method m2, i = " + i);
    }
    public void m3() {
        System.out.println("ClassA, method m3, i = " + i);
    }
    public void m4() {
        System.out.println("ClassA, method m4, i = " + i);
    }
}
class ClassB extends ClassA {
    public double i = 1.1;

    public void m1() {
        System.out.println("ClassB, method m1, i = " + i);
    }
    public void m4() {
        System.out.println("ClassB, method m4, i = " + i);
    }
}
public class AppL{
    public static void main(String[] args) {

        System.out.println("The Start");
        ClassA a = new ClassA();
        System.out.println("Test ClassA");
        a.m1();
        a.m2();
        a.m3();
        a.m4();
        System.out.println("______________________________________");

        ClassB b = new ClassB();
        System.out.println("Test ClassB");
        b.m1();
        b.m2();
        b.m3();
        b.m4();
    }
}
