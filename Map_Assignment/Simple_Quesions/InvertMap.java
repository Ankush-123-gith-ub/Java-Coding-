
import java.util.*;
public class InvertMap {
    public static void main(String[] args) {
        Map<String,Integer> original = new HashMap<>();
        original.put("A",1);
        original.put("B",2);
        original.put("C",1);
        Map<Integer,List<String>> inverted = new HashMap<>();
        for (String key : original.keySet()) {
            int val = original.get(key);
            inverted.putIfAbsent(val,new ArrayList<>());
            inverted.get(val).add(key);
        }
        System.out.println(inverted);
    }
}
