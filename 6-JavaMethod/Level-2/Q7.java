import java.util.Scanner;
public class Q7 {
    public static boolean canStudentVote(int age){ return age>=18; }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        for(int i=0;i<10;i++) ages[i] = sc.nextInt();
        for(int a:ages) System.out.println(canStudentVote(a));
    }
}