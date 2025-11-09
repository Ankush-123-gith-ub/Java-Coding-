
import java.util.*;
public class Q4_RemoveDuplicates {
    public static <T> List<T> removeBasic(List<T> list){
        Set<T> seen=new HashSet<>();
        List<T> res=new ArrayList<>();
        for(T x: list) if(seen.add(x)) res.add(x);
        return res;
    }
    public static <T> List<T> removeAdvanced(List<T> list){
        return new ArrayList<>(new LinkedHashSet<>(list));
    }
    public static void main(String[] args){
        List<Integer> l = Arrays.asList(3,1,2,2,3,4);
        System.out.println("basic: "+removeBasic(l));
        System.out.println("advanced: "+removeAdvanced(l));
    }
}
