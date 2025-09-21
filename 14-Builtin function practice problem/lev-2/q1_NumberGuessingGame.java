import java.util.Random;
import java.util.Scanner;

public class q1_NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int low = 1, high = 100, guess;
        String feedback;
        do {
            guess = rand.nextInt(high - low + 1) + low;
            System.out.println("Computer guesses: " + guess);
            System.out.print("Enter feedback (high/low/correct): ");
            feedback = sc.nextLine();
            if (feedback.equalsIgnoreCase("high")) high = guess - 1;
            else if (feedback.equalsIgnoreCase("low")) low = guess + 1;
        } while (!feedback.equalsIgnoreCase("correct"));
        System.out.println("Computer guessed the correct number: " + guess);
    }
}
