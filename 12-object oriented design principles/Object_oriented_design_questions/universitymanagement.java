
import java.util.ArrayList;
class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();
    Student(String n) { name = n; }
    void enrollCourse(Course c) { courses.add(c); }
    void showCourses() {
        System.out.println(name + "'s courses:");
        for(Course c : courses) System.out.println(c.name);
    }
}

class Professor {
    String name;
    ArrayList<Course> courses = new ArrayList<>();
    Professor(String n) { name = n; }
    void assignCourse(Course c) { courses.add(c); }
    void showCourses() {
        System.out.println(name + " teaches:");
        for(Course c : courses) System.out.println(c.name);
    }
}

class Course {
    String name;
    Course(String n) { name = n; }
}

public class universitymanagementMain {
    public static void main(String[] args) {
        Student s = new Student("sam78");
        Professor p = new Professor("emma74");
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");
        s.enrollCourse(c1);
        s.enrollCourse(c2);
        p.assignCourse(c1);
        p.assignCourse(c2);
        s.showCourses();
        p.showCourses();
    }
}
