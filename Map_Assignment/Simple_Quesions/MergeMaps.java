
import java.util.*;
public class MergeMaps {
    public static void main(String[] args) {
        Map<String,Integer> m1=new HashMap<>();
        Map<String,Integer> m2=new HashMap<>();
        m1.put("A",1); m1.put("B",2);
        m2.put("B",3); m2.put("C",4);
        Map<String,Integer> merged=new HashMap<>(m1);
        for(String k:m2.keySet()){
            merged.put(k, merged.getOrDefault(k,0)+m2.get(k));
        }
        System.out.println(merged);
    }
}
