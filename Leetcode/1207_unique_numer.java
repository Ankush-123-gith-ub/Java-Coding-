import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
class unique_numer {
     public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int n : arr){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }
            else{
                map.put(n,1);
            }
        }
        for(int n : map.values()){
            set.add(n);
        }
        return set.size() == map.values().size();
    }
}
