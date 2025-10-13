import java.util.*;
import java.util.function.Predicate;

class Notifications_Filtering {
    public static void main(String[] args) {
        List<String> alerts = Arrays.asList("Low Heart Rate","High Blood Pressure","Appointment Reminder","Emergency: Code Blue","Payment Due");

        Predicate<String> filter = alert ->
                alert.toLowerCase().contains("heart") ||
                alert.toLowerCase().contains("blood") ||
                alert.toLowerCase().contains("emergency")||
                alert.toLowerCase().contains("Reminder");

        alerts.stream().filter(filter).forEach(System.out::println);
    }
}
