import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) factors[index++] = i;
        int sum = 0, sumSquare = 0, product = 1;
        for (int f : factors) {
            sum += f;
            sumSquare += f * f;
            product *= f;
            System.out.print(f + " ");
        }
        System.out.println();
        System.out.println(sum);
        System.out.println(sumSquare);
        System.out.println(product);
    }
}