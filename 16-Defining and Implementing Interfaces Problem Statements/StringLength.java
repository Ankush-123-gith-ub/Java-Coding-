import java.util.function.Function;
import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your message: ");
        String msg = sc.nextLine();

        Function<String, Integer> getLength = str -> str.length();

        int length = getLength.apply(msg);

        if (length > 50) {
            System.out.println("Message too long! (" + length + " characters)");
        } else {
            System.out.println("Message is within limit. (" + length + " characters)");
        }

        sc.close();
    }
}
