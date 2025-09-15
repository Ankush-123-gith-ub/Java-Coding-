
public class StudentReport {
    String name; int rollNumber, marks;
    StudentReport(String n, int r, int m){name=n;rollNumber=r;marks=m;}
    char grade() {
        if(marks>=90) return 'A';
        else if(marks>=80) return 'B';
        else if(marks>=70) return 'C';
        else if(marks>=60) return 'D';
        else return 'F';
    }
    void display() {
        System.out.println("Name: " + name + " Roll: " + rollNumber + " Marks: " + marks + " Grade: " + grade());
    }
    public static void main(String[] args){
        StudentReport s=new StudentReport("Bob",101,85);
        s.display();
    }
}
