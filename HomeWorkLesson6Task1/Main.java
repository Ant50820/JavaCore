package HomeWorkLesson6Task1;

public class Main {

    /*
    Create array Bird and add different birds to it.
     */
    public static void main(String[] args) {

        Bird[] birds = new Bird[6];
        birds[0] = new Penguin("Featherless", "Lay Eggs");
        birds[1] = new Swallow("Featherless", "Lay Eggs");
        birds[2] = new Eagle("Feether", "Eggless");
        birds[3] = new Chicken("Feerther", "Lay Eggs");
        birds[4] = new FlyingBird("Feather", "Lay Eggs");
        birds[5] = new NonFlyingBird("Featherless", "Eggless");



        /*
        Call fly() method for all of it. Output the
        information about each type of created bird.

         */
        for (int i = 0; i < birds.length; i++) {
            Bird bird = birds[i];
            bird.fly();
        }
//
//        birds[0].fly();
//        birds[1].fly();
//        birds[2].fly();
//        birds[3].fly();
//        birds[4].fly();
//        birds[5].fly();
    }
}
