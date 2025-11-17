
import java.util.*;
public class VisitTracker {
    public static void main(String[] args){
        Map<String,Integer> vis=new HashMap<>();
        String[] seq={"home","about","products","home","products","contact","home"};
        for(String p:seq){
            vis.put(p, vis.getOrDefault(p,0)+1);
        }

        List<Map.Entry<String,Integer>> list=new ArrayList<>(vis.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());
        for(var e:list) System.out.println(e.getKey()+" => "+e.getValue());

        System.out.println("Most: "+list.get(0).getKey());
    }
}
