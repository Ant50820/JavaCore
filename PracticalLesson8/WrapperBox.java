package PracticalLesson8;

public class WrapperBox {

    private Box box = new Box();
    public void set(String text) {
        this.box.set(text);
    }
    public Object get() {
        return box.get();
    }
}
