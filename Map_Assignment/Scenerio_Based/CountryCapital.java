
import java.util.*;
public class CountryCapital {
    public static void main(String[] args){
        Map<String,String> cc=new HashMap<>();
        cc.put("India","New Delhi");
        cc.put("USA","Washington");
        cc.put("Japan","Tokyo");
        cc.put("China","Beijing");
        cc.put("Nepal","Kathmandu");
        cc.put("France","Paris");
        cc.put("Italy","Rome");
        cc.put("UK","London");

        String q="India";
        if(cc.containsKey(q)) System.out.println(cc.get(q));
        else System.out.println("Unknown country");

        List<String> list=new ArrayList<>(cc.keySet());
        Collections.sort(list);
        for(String c:list) System.out.println(c+" => "+cc.get(c));
    }
}
