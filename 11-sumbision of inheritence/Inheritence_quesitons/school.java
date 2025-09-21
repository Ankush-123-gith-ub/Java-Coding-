
class Person {
    String name;
    int age;
    Person(String n, int a) { name = n; age = a; }
    void displayRole() { System.out.println("Generic person"); }
}

class Teacher extends Person {
    String subject;
    Teacher(String n, int a, String s) { super(n, a); subject = s; }
    @Override
    void displayRole() { System.out.println("Teacher teaching " + subject); }
}

class Student extends Person {
    int grade;
    Student(String n, int a, int g) { super(n, a); grade = g; }
    @Override
    void displayRole() { System.out.println("Student with grade " + grade); }
}

class Staff extends Person {
    String role;
    Staff(String n, int a, String r) { super(n, a); role = r; }
    @Override
    void displayRole() { System.out.println("Staff role " + role); }
}

public class schoolMain {
    public static void main(String[] args) {
        Person t = new Teacher("sam10", 35, "Math");
        Person s = new Student("alice87", 20, 12);
        Person st = new Staff("emma64", 40, "Janitor");
        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}
