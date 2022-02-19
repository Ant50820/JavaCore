package HomeWorkTask2Lesson8;

public class Wrapper <T> {
    /*
    Create Wrapper<T>  class with
    private field of T type which is called value.

     */
    private T value;

    /*
    In Wrapper class create
    public constructor and setValue and getValue methods for value field.
     */
    public Wrapper(T value) {
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue(){
        return value;
    }

}
