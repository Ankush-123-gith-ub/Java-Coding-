
public class q1_lev2 {
    String name; int roll; int marks;

    q1_lev2(String n, int r, int m) {
        name = n; roll = r; marks = m;
    }

    char grade() {
        if (marks >= 90) return 'A';
        else if (marks >= 80) return 'B';
        else if (marks >= 70) return 'C';
        else if (marks >= 60) return 'D';
        return 'F';
    }

    void show() {
        System.out.println("Name: " + name + " Roll: " + roll + " Marks: " + marks + " Grade: " + grade());
    }

    public static void main(String[] args) {
        q1_lev2 s = new q1_lev2("alice13", 44, 95);
        s.show();
    }
}
