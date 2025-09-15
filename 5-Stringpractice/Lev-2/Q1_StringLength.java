
import java.util.Scanner;

public class Q1_StringLength {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        int customLen = findLength(input);
        int builtinLen = input.length();
        System.out.println("Length without length(): " + customLen);
        System.out.println("Length with length(): " + builtinLen);
        sc.close();
    }
}
