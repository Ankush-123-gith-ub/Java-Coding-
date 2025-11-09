
import java.util.*;
public class Q2_UnionIntersection {
    public static <T> Set<T> unionBasic(Set<T> a,Set<T> b){ Set<T> r=new HashSet<>(a); r.addAll(b); return r; }
    public static <T> Set<T> intersectionBasic(Set<T> a,Set<T> b){ Set<T> r=new HashSet<>(a); r.retainAll(b); return r; }
    public static <T> Map<String,Set<T>> advanced(Set<T> a,Set<T> b){
        Set<T> union = new LinkedHashSet<>(a); union.addAll(b);
        Set<T> inter = new LinkedHashSet<>(a); inter.retainAll(b);
        Map<String,Set<T>> m=new LinkedHashMap<>(); m.put("union",union); m.put("intersection",inter); return m;
    }
    public static void main(String[] args){
        Set<Integer> s1=new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2=new HashSet<>(Arrays.asList(3,4,5));
        System.out.println("basic union: "+unionBasic(s1,s2));
        System.out.println("basic intersection: "+intersectionBasic(s1,s2));
        System.out.println("advanced: "+advanced(s1,s2));
    }
}
