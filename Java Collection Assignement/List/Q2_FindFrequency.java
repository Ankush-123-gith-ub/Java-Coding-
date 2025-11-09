
import java.util.*;
public class Q2_FindFrequency {
    public static Map<String,Integer> freqBasic(List<String> list){
        Map<String,Integer> m=new HashMap<>();
        for(String s: list) m.put(s,m.getOrDefault(s,0)+1);
        return m;
    }
    public static Map<String,Integer> freqAdvanced(List<String> list){
        Map<String,Integer> m=new LinkedHashMap<>();
        for(String s: list) m.put(s,m.getOrDefault(s,0)+1);
        return m;
    }
    public static void main(String[] args){
        List<String> l = Arrays.asList("apple","banana","apple","orange");
        System.out.println("basic: "+freqBasic(l));
        System.out.println("advanced: "+freqAdvanced(l));
    }
}
