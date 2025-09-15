
import java.util.Scanner;

public class Q9_Calendar {

    public static boolean isLeapYear(int year) {
        return (year%4==0 && year%100!=0) || (year%400==0);
    }

    public static int daysInMonth(int month,int year) {
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        if (month==2 && isLeapYear(year)) return 29;
        return days[month-1];
    }

    public static int firstDay(int d,int m,int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31*m0)/12) % 7;
        return d0;
    }

    public static void displayCalendar(int month,int year) {
        String[] months={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        int days=daysInMonth(month,year);
        int start=firstDay(1,month,year);
        System.out.println("  "+months[month-1]+" "+year);
        System.out.println("Su Mo Tu We Th Fr Sa");
        for (int i=0;i<start;i++) System.out.print("   ");
        for (int d=1;d<=days;d++) {
            System.out.printf("%2d ",d);
            if ((d+start)%7==0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m=sc.nextInt();
        System.out.print("Enter year: ");
        int y=sc.nextInt();
        displayCalendar(m,y);
        sc.close();
    }
}
