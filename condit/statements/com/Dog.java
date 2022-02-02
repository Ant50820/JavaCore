package condit.statements.com;

public class Dog {

    /*
    Сreate class Dog with fields name, breed, age.
        Declare enum for field breed.
        Create 3 instances of type Dog.
        Check if there is no two dogs with the same name.
        Display the name and the kind of the oldest dog.
     */
    public enum BreedDog {

        MASTIFF, LABRADOR_RETRIEVER, GREAT_DANE, GOLDEN_RETRIEVER, BERNESE_MOUNTAIN_DOG


    }

    private String name;
    private String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Dog otherName(Dog... dogs){

        Dog dogItem = null;
        for (Dog ds : dogs) {
            if (dogItem == null) {
                dogItem = ds;
            } else if (dogItem.getName() == ds.getName()){
                dogItem = ds;
            }
        }
        return dogItem;

    }

    public static void main(String[] args) {

        Dog dog1 = new Dog("Mig", "Mastiff", 3);
        Dog dog2 = new Dog("Kit", "Labrador", 5);
        Dog dog3 = new Dog("Kit", "Dane", 1);


        Dog dogsItem = Dog.otherName(dog1, dog2, dog3);
        System.out.println(dogsItem.getName());
    }


}