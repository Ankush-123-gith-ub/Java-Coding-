
import java.util.*;
public class Q9 {
    static String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(),y=sc.nextInt(); m--;
        int d=days[m]; if(m==1&&isLeap(y)) d=29;
        int fd=firstDay(m+1,y);
        System.out.println(months[m]+" "+y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for(int i=0;i<fd;i++) System.out.print("   ");
        for(int i=1;i<=d;i++){
            System.out.printf("%3d",i);
            if((i+fd)%7==0) System.out.println();
        }
    }
    static boolean isLeap(int y){ return y%4==0&&(y%100!=0||y%400==0); }
    static int firstDay(int m,int y){
        int d=1; int Y=y-1;
        int days=(Y*365)+(Y/4)-(Y/100)+(Y/400); for(int i=0;i<m-1;i++) days+=Q9.days[i];
        if(m>2 && isLeap(y))days++;
        return (days+d)%7;
    }
}
