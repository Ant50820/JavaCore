package HomeWorkTask2Lesson8;

public class Main {

    public static void main(String[] args) {

        /*
    Create three objects of the Wrapper type: first object should be wrapper
    for int type, second – for String, third - for boolean.
     */

        Wrapper<Integer> integerWrapper = new Wrapper<Integer>(32);
        Wrapper<String> stringWrapper = new Wrapper<String>("Hello");
        Wrapper<Boolean> booleanWrapper = new Wrapper<Boolean>(true);


          /*
    Print all three values in the console
    using method getValue from Wrapper class.
     */
        System.out.println("This is int type = " + integerWrapper.getValue());
        System.out.println("This is String type = " + stringWrapper.getValue());
        System.out.println("This is boolean type = " + booleanWrapper.getValue());



    }





}
