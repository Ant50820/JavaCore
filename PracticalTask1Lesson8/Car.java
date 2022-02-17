package PracticalTask1Lesson8;

import java.sql.Time;
import java.time.*;

public class Car {

    private String model;
    private LocalDate dataOfProduction;
    private double engineCapacity;
    private String color;
    private int passengerCapacity;
    private boolean isAirConditioning;

    public Car() {

    }

    @Override
    public String toString() {
        return "Car {" +
                "Model = '" + model + '\'' +
                ", Data of production = " + dataOfProduction +
                ", Engine Capacity = " + engineCapacity +
                ", Color = '" + color + '\'' +
                ", Passenger Capacity = " + passengerCapacity +
                ", is Air Conditioning = " + isAirConditioning +
                '}';
    }

    public static CarBuilder getCar(){
        return new Car().new CarBuilder();
    }

    public class CarBuilder {

        public CarBuilder(){
            new Car();
        }

        public CarBuilder addModel (String model) {
            Car.this.model = model;
            return this;
        }

        public CarBuilder addColor(String color){
            Car.this.color = color;
            return this;
        }

        public CarBuilder addDataOfPdroduction(LocalDate local) {
            Car.this.dataOfProduction = local;
            return this;
        }

        public CarBuilder addEngineCapacity (double capacity) {
            Car.this.engineCapacity = capacity;
            return this;
        }

        public CarBuilder addPassengerCapacity (int cap) {
            Car.this.passengerCapacity = cap;
            return this;
        }

        public CarBuilder setIsConditioning(boolean air) {
            Car.this.isAirConditioning = air;
            return this;
        }

        public Car build() {
            return Car.this;
        }
    }

    public static void main(String[] args) {
        Car car1 = Car.getCar().addModel("BNW")
                .addEngineCapacity(100.2).addColor("Blue")
                .addPassengerCapacity(5).setIsConditioning(true).build();
        System.out.println(car1);
    }
}
