
import java.util.*;
public class Q1_ReverseList {
    public static List<Integer> reverseBasic(List<Integer> list){
        List<Integer> res = new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--) res.add(list.get(i));
        return res;
    }
    public static <T> List<T> reverseAdvanced(List<T> list){
        int i=0,j=list.size()-1;
        while(i<j){
            T tmp=list.get(i); list.set(i,list.get(j)); list.set(j,tmp);
            i++; j--;
        }
        return list;
    }
    public static void main(String[] args){
        List<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("basic: "+reverseBasic(a));
        List<Integer> b = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("advanced: "+reverseAdvanced(b));
    }
}
