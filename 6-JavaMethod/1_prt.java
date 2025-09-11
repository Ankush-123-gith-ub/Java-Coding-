import java.util.*;
class prt{
    public static double si(int p ,int  r ,int t) {
        double si = (p*r*t)/100.0;
        return si;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal : ");
        int p = sc.nextInt();
        System.out.print("Enter rate : ");
        int r = sc.nextInt();
        System.out.print("Enter time : ");
        int t = sc.nextInt();
        System.out.printf("%.2f",si(p, r, t));
        sc.close();
    }
}
//##