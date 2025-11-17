
import java.util.*;
public class StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>();
        grades.put("Rohan", 85.0);
        grades.put("Simran", 92.0);
        grades.put("Amit", 76.5);

        grades.put("Rohan", 88.0);
        grades.remove("Amit");

        List<String> names = new ArrayList<>(grades.keySet());
        Collections.sort(names);
        for(String n: names){
            System.out.println(n + " => " + grades.get(n));
        }
    }
}
