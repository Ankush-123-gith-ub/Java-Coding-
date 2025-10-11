import java.util.function.Predicate;
import java.util.Scanner;

public class TemperatureAlert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current temperature: ");
        double temp = sc.nextDouble();

        Predicate<Double> isHot = t -> t > 40;

        if (isHot.test(temp)) {
            System.out.println("Alert! Temperature is too high!");
        } else {
            System.out.println("Temperature is normal.");
        }

        sc.close();
    }
}