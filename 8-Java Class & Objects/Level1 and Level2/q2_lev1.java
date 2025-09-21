
public class q2_lev1 {
    double r;

    q2_lev1(double rad) {
        r = rad;
    }

    double area() {
        return 3.1415 * r * r;
    }

    double perim() {
        return 2 * 3.1415 * r;
    }

    void show() {
        System.out.println("Area: " + area());
        System.out.println("Circumference: " + perim());
    }

    public static void main(String[] args) {
        q2_lev1 c = new q2_lev1(15);
        c.show();
    }
}
