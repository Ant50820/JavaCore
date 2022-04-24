package HomeWorkTask3Lesson9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {

    /*
    Write class Student that provides information
    about the name of the student and his course.
    Class Student should consist of
     */
    private String name;
    private int course;

    /*
    properties for access to these fields
    constructor with parameters
     */

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    /*
    method printStudents (List students,
    Integer course), which receives a list
    of students and the course number and
    prints to the console the names of the
    students from the list, which are taught
     in this course (use an iterator)
     */
    public void printStudents(List<String> students, Integer course) {
        List<String> student = new ArrayList<>();
        Iterator<String> it = student.iterator();
        for (String s : student) {
            System.out.println(s);
        }
    }
}
