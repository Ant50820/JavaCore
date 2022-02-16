package PracticalLesson8;

public class Entity {

    private static int count = 0;

    public Entity() {
        new Counter().setCount();
    }

    public static int getCount() {
        return count;
    }

    private static class Counter {
        private void setCount() {
            count = count +1;
        }
    }

    public static void main(String[] args) {
        Entity e1 = new Entity();
        Entity e2 = new Entity();
        Entity e3 = new Entity();

        System.out.println("Count of Entity abjects = " + Entity.getCount());
    }
}
