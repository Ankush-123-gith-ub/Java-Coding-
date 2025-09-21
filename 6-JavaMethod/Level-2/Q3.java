import java.util.Scanner;
public class Q3 {
    static boolean isLeap(int year) {
        return (year >= 1582) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(isLeap(year) ? "Leap Year" : "Not Leap Year");
    }
}