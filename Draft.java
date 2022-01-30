import java.util.Scanner;

class Exm {
   private String name;
   private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void hell(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("*********************");
        String name = scanner.nextLine();
        System.out.println(name);

    }

    @Override
    public String toString() {
        return "Exm{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void changeName(){

    }

    public void distance(String city, int miles){

        System.out.println("name city " + city + " miles " + miles);

    }
}

public class Draft {

    public static void main(String[] args) {



//        Exm exm = new Exm();
//        exm.setName("Anton Artiushenko");
//        exm.setAge(37);
//
//        Exm exm1 = new Exm();
//        exm1.setName("Stive");
//        exm1.setAge(45);
//
//        System.out.println(exm.getName());
//        System.out.println(exm.getAge());
//
//        String name = exm.getName();
//        int age = exm.getAge();
//
//        System.out.println(name);
//        System.out.println(age);
//
//
//        exm.hell();
//        exm.distance("Kiev", 123);
//
//        System.out.println(exm);

    }
}
