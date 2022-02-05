package PracticalTaskLesson6;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {

        Car[] carTrucks = new Car[4];
        carTrucks[0] = new Truck("Ford", 180, 1980);
        carTrucks[1] = new Truck("Toyota", 150, 1960);
        carTrucks[2] = new Truck("Fiat", 190, 1980);
        carTrucks[3] = new Truck("BMV", 200, 1969);

        Truck truck = new Truck("Honda", 200, 1980);


        for (int i = 0; i < carTrucks.length; i++) {
            Car carTruck = carTrucks[i];
            System.out.println(carTruck.models + " - " + carTruck.maxSpeed + " - " + carTruck.yearOfManufacture);

        }

        System.out.println("*********************************");
        Car[] carSedan = new Car[4];
        carSedan[0] = new Sedan("Chrysler", 200, 1990);
        carSedan[1] = new Sedan("Opel", 190, 1999);
        carSedan[2] = new Sedan("Cadillac", 220,1980);
        carSedan[3] = new Sedan("Mercedes", 260, 1980);

        for (int i = 0; i < carSedan.length; i++) {
            Car car = carSedan[i];
            System.out.println(car.models + " - " + car.maxSpeed + " - " + car.yearOfManufacture);


        }

//
//        for (int i = 0; i < carSedan.length; i++) {
//            System.out.println(carSedan[i].models);
//
//        }













    }
}
