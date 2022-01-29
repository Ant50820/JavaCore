public class MainStudent {

    public static void main(String[] args) {

        Student stud1 = new Student("Petia", 33);

        Student stud2 = new Student();
        stud2.setName("Vita");
        stud1.setRating(22);

        Student stud3 = new Student("Petro", 25);


        Student.setAvgRating(stud1, stud2, stud3);
        System.out.println(Student.avgRating);

        System.out.println(stud1.betterStudent(stud3));
        System.out.println(stud1.betterStudent(stud2));

        System.out.println(stud2);
    }


}
