package PracticalTask1Lesson7;

import java.util.Arrays;

public class MainAnimal {

    public static void main(String[] args) {

        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Nola");
        animals[1] = new Cat("Kola");
        animals[2] = new Dog("Duster");
        animals[3] = new Dog("Gogo");

        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
            animal.voice();
            animal.feed();
        }




    }
}
