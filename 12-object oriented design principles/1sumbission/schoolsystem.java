
import java.util.ArrayList;
class School {
    ArrayList<Student> students = new ArrayList<>();
    void addStudent(Student s) { students.add(s); }
    void showStudents() {
        System.out.println("Students in school:");
        for (Student s : students) System.out.println(s.name);
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();
    Student(String n) { name = n; }
    void enrollCourse(Course c) { courses.add(c); }
    void showCourses() {
        System.out.println(name + " enrolled in:");
        for (Course c : courses) System.out.println(c.courseName);
    }
}

class Course {
    String courseName;
    ArrayList<Student> students = new ArrayList<>();
    Course(String n) { courseName = n; }
    void addStudent(Student s) { students.add(s); }
    void showStudents() {
        System.out.println("Students in " + courseName + ":");
        for (Student s : students) System.out.println(s.name);
    }
}

public class schoolsystemMain {
    public static void main(String[] args) {
        School sch = new School();
        Student st1 = new Student("kate30");
        Student st2 = new Student("alice23");
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");
        sch.addStudent(st1);
        sch.addStudent(st2);
        st1.enrollCourse(c1);
        st1.enrollCourse(c2);
        st2.enrollCourse(c2);
        c1.addStudent(st1);
        c2.addStudent(st1);
        c2.addStudent(st2);
        sch.showStudents();
        st1.showCourses();
        c2.showStudents();
    }
}
