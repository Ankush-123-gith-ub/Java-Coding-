
import java.util.*;
public class Q4_ConvertSetToSortedList {
    public static List<Integer> basic(Set<Integer> s){
        List<Integer> l=new ArrayList<>(s);
        Collections.sort(l);
        return l;
    }
    public static List<Integer> advanced(Set<Integer> s){
        return new ArrayList<>(new TreeSet<>(s));
    }
    public static void main(String[] args){
        Set<Integer> s=new HashSet<>(Arrays.asList(5,3,9,1));
        System.out.println("basic: "+basic(s));
        System.out.println("advanced: "+advanced(s));
    }
}
