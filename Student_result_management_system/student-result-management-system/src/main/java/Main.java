import java.util.Scanner;
import dao.StudentDAO;
import dao.ResultDAO;
import model.Student;
import model.Result;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO studentDAO = new StudentDAO();
        ResultDAO resultDAO = new ResultDAO();

        while (true) {

            System.out.println("\n===== Student Result Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student Name");
            System.out.println("4. Delete Student");
            System.out.println("5. Add Result");
            System.out.println("6. View Results");
            System.out.println("7. Update Result");
            System.out.println("8. Delete Result");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

                case 1:
                    System.out.print("Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Course: ");
                    String course = sc.nextLine();

                    studentDAO.addStudent(new Student(id, name, course));
                    break;

                case 2:
                    studentDAO.getAllStudents();
                    break;

                case 3:
                    System.out.print("Student ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("New Name: ");
                    String newName = sc.nextLine();

                    studentDAO.updateStudent(uid, newName);
                    break;

                case 4:
                    System.out.print("Student ID to delete: ");
                    int did = sc.nextInt();
                    studentDAO.deleteStudent(did);
                    break;

                case 5:
                    System.out.print("Result ID: ");
                    int rid = sc.nextInt();

                    System.out.print("Student ID: ");
                    int sid = sc.nextInt();

                    System.out.print("Marks: ");
                    int marks = sc.nextInt();

                    resultDAO.addResult(new Result(rid, sid, marks));
                    break;

                case 6:
                    resultDAO.viewResults();
                    break;

                case 7:
                    System.out.print("Result ID to update: ");
                    int urid = sc.nextInt();

                    System.out.print("New Marks: ");
                    int newMarks = sc.nextInt();

                    resultDAO.updateResult(urid, newMarks);
                    break;

                case 8:
                    System.out.print("Result ID to delete: ");
                    int drid = sc.nextInt();

                    resultDAO.deleteResult(drid);
                    break;

                case 9:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
