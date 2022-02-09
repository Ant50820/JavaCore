package PracticalTask1Lesson7;

import java.util.Arrays;

public class MainAnimal {

    public static void main(String[] args) {
        /*
        Create array of Animal and add some Cats and Dogs to it.
        Call voice() and feed() method for all of it

         */

        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Nola");
        animals[1] = new Cat("Kola");
        animals[2] = new Dog("Duster");
        animals[3] = new Dog("Gogo");

//        for (int i = 0; i < animals.length; i++) {
//            Animal animal = animals[i];
//            animal.voice();
//            animal.feed();
//        }

        for (Animal animal : animals) {
            String an1 = animal.feed() + animal.voice();
            System.out.println(an1);

        }

    }
}
