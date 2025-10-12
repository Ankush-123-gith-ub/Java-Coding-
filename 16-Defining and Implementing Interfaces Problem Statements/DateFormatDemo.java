import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateFormatter {
    static String formatDate(LocalDate d, String f) {
        return d.format(DateTimeFormatter.ofPattern(f));
    }
}

public class DateFormatDemo {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(DateFormatter.formatDate(d, "dd-MM-yyyy"));
        System.out.println(DateFormatter.formatDate(d, "MMMM dd, yyyy"));
    }
}