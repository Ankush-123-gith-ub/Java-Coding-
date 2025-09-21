import java.util.Scanner;

public class q8_TemperatureConverter {
    public static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }
    public static double fToC(double f) {
        return (f - 32) * 5 / 9;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Is this in Celsius (C) or Fahrenheit (F)? ");
        char unit = sc.next().charAt(0);
        if (unit == 'C' || unit == 'c') System.out.println("Fahrenheit: " + cToF(temp));
        else System.out.println("Celsius: " + fToC(temp));
    }
}
