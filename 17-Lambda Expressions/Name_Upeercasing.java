import java.util.*;
import java.util.stream.*;
class Hr {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ankush", "Ravi", "Neha");

        List<String> upperNames = names.stream().map(String::toUpperCase).toList();

        System.out.println(upperNames);
    }
}
