
public class q10_student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    q10_student(int r, String n, double c) {
        rollNumber = r; name = n; cgpa = c;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double c) {
        cgpa = c;
    }

    public void show() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name + ", CGPA: " + cgpa);
    }

    public static void main(String[] args) {
        q10_student s = new q10_student(101, "sam68", 9.0);
        s.show();
        s.setCgpa(9.5);
        s.show();
    }
}

class PostgraduateStudent extends q10_student {
    PostgraduateStudent(int r, String n, double c) {
        super(r, n, c);
    }
    void showProtected() {
        System.out.println("Protected name: " + name);
    }
}
