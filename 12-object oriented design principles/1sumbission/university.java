
import java.util.ArrayList;
class Faculty {
    String name;
    Faculty(String n) { name = n; }
}

class Department {
    String name;
    Department(String n) { name = n; }
}

class University {
    ArrayList<Department> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();
    void addDepartment(Department d) { departments.add(d); }
    void addFaculty(Faculty f) { faculties.add(f); }
    void deleteUniversity() {
        departments.clear();
        System.out.println("University deleted and departments removed");
    }
    void showFaculties() {
        System.out.println("Faculty members:");
        for (Faculty f : faculties) System.out.println(f.name);
    }
}

public class universityMain {
    public static void main(String[] args) {
        University u = new University();
        Department d1 = new Department("CS");
        Department d2 = new Department("Math");
        Faculty f1 = new Faculty("kate17");
        Faculty f2 = new Faculty("john60");
        u.addDepartment(d1);
        u.addDepartment(d2);
        u.addFaculty(f1);
        u.addFaculty(f2);
        u.showFaculties();
        u.deleteUniversity();
    }
}
