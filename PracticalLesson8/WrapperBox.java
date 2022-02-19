package PracticalLesson8;

public class WrapperBox {

    private Box box = new Box();
    public void set(String text) {
        this.box.set(text);
    }
    public Object get() {
        return box.get();
    }

    public static void main(String[] args) {
        String text = "Hello World";
        WrapperBox box = new WrapperBox();
        box.set(text);





        //System.out.println(box.set(text));



//        Integer i = (Integer) box.get();
//        System.out.println(i);
    }
}
