import java.util.*;
class run_triangle{
    public static double round(int n1 ,int  n2 ,int n3) {
        int p = n1+n1+n3;
        double round = 5000/p;
        return round;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Ist side : ");
        int n1 = sc.nextInt();
        System.out.print("Enter IInd side : ");
        int n2 = sc.nextInt();
        System.out.print("Enter IIIrd side : ");
        int n3 = sc.nextInt();
        System.out.printf("%.2f",round(n1, n2, n3));
        sc.close();
    }
}