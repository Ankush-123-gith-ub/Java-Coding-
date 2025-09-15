
public class q2_circle {
    double radius;

    q2_circle() {
        this(1.0);
    }

    q2_circle(double r) {
        radius = r;
    }

    double area() {
        return 3.1415 * radius * radius;
    }

    double circum() {
        return 2 * 3.1415 * radius;
    }

    void show() {
        System.out.println("Area: " + area() + ", Circumference: " + circum());
    }

    public static void main(String[] args) {
        q2_circle c1 = new q2_circle();
        c1.show();
        q2_circle c2 = new q2_circle(11);
        c2.show();
    }
}
