
public class q1_lev1 {
    String name; int id; double salary;

    q1_lev1(String n, int i, double s) {
        name = n; id = i; salary = s;
    }

    void show() {
        System.out.println("Name: " + name + " ID: " + id + " Salary: " + salary);
    }

    public static void main(String[] args) {
        q1_lev1 e = new q1_lev1("emma56", 19, 54700);
        e.show();
    }
}
