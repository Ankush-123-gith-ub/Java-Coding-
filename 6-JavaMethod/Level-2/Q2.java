import java.util.Scanner;
public class Q2 {
    static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }
    static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rec = recursiveSum(n);
        int form = formulaSum(n);
        System.out.println(rec);
        System.out.println(form);
    }
}