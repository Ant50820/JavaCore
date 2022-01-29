class Exm {
    private String name;
   int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Draft {

    public static void main(String[] args) {


        Exm exm = new Exm();
        exm.setName("Anton Artiushenko");
        exm.age = 37;

        Exm exm1 = new Exm();
        exm1.setName("Stive");
        exm1.age = 45;

        System.out.println(exm.getName());
        System.out.println(exm.age);

        System.out.println(exm1.age);
    }
}
