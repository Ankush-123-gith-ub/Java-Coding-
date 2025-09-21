
public class q8_course {
    String courseName;
    int duration; 
    double fee;
    static String instituteName = "sam37 Institute";

    q8_course(String n, int d, double f) {
        courseName = n; duration = d; fee = f;
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + ", Fee: " + fee + ", Institute: " + instituteName);
    }

    static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        q8_course c1 = new q8_course("Math", 6, 2000);
        q8_course c2 = new q8_course("Science", 8, 2500);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        q8_course.updateInstituteName("New " + instituteName);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
