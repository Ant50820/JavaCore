package PracticalLesson8;

public class Box {
    private Object obj;
    public void set(Object obj) {
        this.obj = obj;
    }
    public Object get() {
        return obj;
    }
}

class Appl {
    public static void main(String[] args) {


        String text = "Hello World";
        WrapperBox box = new WrapperBox();
        box.set(text);
        Integer i = (Integer) box.get();

//        String text = "Hell World";
//        Box box = new Box();
//        box.set(text);
//        Integer i = (Integer) box.get();
    }
}