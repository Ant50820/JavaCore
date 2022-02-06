package HoweWorkLesson5;

import PrcticalloopsArrays.Employee;

import java.util.Scanner;

public class Car {
    /*
    Create class Car with fields type,
    year of production and engine capacity.
    Create and initialize four instances of class Car.
     */
    private int yearOfProduction;
    private int engineCapacity;

    public Car(int yearOfProduction, int engineCapacity) {
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }


    /*
    Display cars
        * certain model year  (enter year in the console);
        * ordered by the field year.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int yearProd;

        Car[] cars = new Car[4];
        cars[0] = new Car(1980, 100);
        cars[1] = new Car(1990, 150);
        cars[2] = new Car(1960, 120);
        cars[3] = new Car(1970, 190);

        System.out.println(" Input year production ************");
        yearProd = Integer.parseInt(scanner.nextLine());

        for (Car car : cars) {
            if (car.getYearOfProduction() == yearProd) {
                System.out.println("Year of production: " + car.getYearOfProduction() +
                        " and engine capacity - " + car.getEngineCapacity());
            }
        }
        System.out.println("======================");
        System.out.println();

        Car tmp;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYearOfProduction() > cars[j].getYearOfProduction()) {
                    tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getYearOfProduction()
                    + " and engine capacity - " + cars[i].getEngineCapacity());
        }
    }
}
