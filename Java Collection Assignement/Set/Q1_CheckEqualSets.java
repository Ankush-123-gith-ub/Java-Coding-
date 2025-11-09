
import java.util.*;
public class Q1_CheckEqualSets {
    public static <T> boolean basic(Set<T> a,Set<T> b){ return a.equals(b); }
    public static <T> boolean advanced(Set<T> a,Set<T> b){ return a.containsAll(b) && b.containsAll(a); }
    public static void main(String[] args){
        Set<Integer> s1=new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2=new HashSet<>(Arrays.asList(3,2,1));
        System.out.println("basic: "+basic(s1,s2));
        System.out.println("advanced: "+advanced(s1,s2));
    }
}
