
class Course {
    String courseName;
    int duration;
    Course(String n, int d) { courseName = n; duration = d; }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
    OnlineCourse(String n, int d, String p, boolean r) { super(n, d); platform = p; isRecorded = r; }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee, discount;
    PaidOnlineCourse(String n, int d, String p, boolean r, double f, double dis) {
        super(n, d, p, r);
        fee = f;
        discount = dis;
    }
}

public class courseMain {
    public static void main(String[] args) {
        PaidOnlineCourse c = new PaidOnlineCourse("john60", 5, "Udemy", true, 200, 20);
        System.out.println("Course: " + c.courseName + ", Platform: " + c.platform + ", Fee: " + c.fee);
    }
}
