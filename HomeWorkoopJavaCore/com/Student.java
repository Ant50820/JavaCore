package HomeWorkoopJavaCore.com;

public class Student {

    private String name;
    private int rating;

    public static int count;
    public static float avgRating;

    public Student(){}
    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
        count++;
    }

    public int getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }
    public static void setAvgRating(Student... students){
        float sum = 0;
        for (Student s: students) {
            sum += s.rating;
        }
        Student.avgRating = sum / count;
    }

    public static float getAvgRating() {
        return avgRating;
    }

    public boolean betterStudent(Student s1) {
        return  this.rating > s1.getRating();
    }

    @Override
    public String toString() {
        return "Student  [" + "name='" + name  + ", rating = " + rating + "]";
    }

}
