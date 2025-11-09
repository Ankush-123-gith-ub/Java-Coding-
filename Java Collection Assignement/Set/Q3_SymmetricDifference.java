
import java.util.*;
public class Q3_SymmetricDifference {
    public static <T> Set<T> basic(Set<T> a,Set<T> b){
        Set<T> res=new HashSet<>(a);
        for(T x: b) if(!res.remove(x)) res.add(x);
        return res;
    }
    public static <T> Set<T> advanced(Set<T> a,Set<T> b){
        Set<T> res=new LinkedHashSet<>(a);
        for(T x: b){ if(res.contains(x)) res.remove(x); else res.add(x); }
        return res;
    }
    public static void main(String[] args){
        Set<Integer> s1=new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2=new HashSet<>(Arrays.asList(3,4,5));
        System.out.println("basic: "+basic(s1,s2));
        System.out.println("advanced: "+advanced(s1,s2));
    }
}
