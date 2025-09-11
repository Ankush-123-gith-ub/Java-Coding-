import java.util.*;
class largestOf3 {

    public static int largest(int n1,int n2, int n3) {
        if (n1>n2){
           if(n1>n3){
            return n1;
           }
        }
        else if(n2>n3){
            return n2;
        }
        return n3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter number n2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter number n3: ");
        int n3 = sc.nextInt();
        System.out.print(largest(n1, n2, n3)+" is largest number.");
        sc.close();
    }
}
