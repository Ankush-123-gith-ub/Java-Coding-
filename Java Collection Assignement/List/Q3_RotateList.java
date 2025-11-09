
import java.util.*;
public class Q3_RotateList {
    public static <T> List<T> rotateBasic(List<T> list,int k){
        int n=list.size();
        k = ((k%n)+n)%n;
        List<T> res = new ArrayList<>(list.subList(k,n));
        res.addAll(list.subList(0,k));
        return res;
    }
    public static <T> void rotateAdvanced(List<T> list,int k){
        int n=list.size();
        k = ((k%n)+n)%n;
        reverseSegment(list,0,k-1);
        reverseSegment(list,k,n-1);
        reverseSegment(list,0,n-1);
    }
    private static <T> void reverseSegment(List<T> list,int i,int j){
        while(i<j){ T tmp=list.get(i); list.set(i,list.get(j)); list.set(j,tmp); i++; j--; }
    }
    public static void main(String[] args){
        List<Integer> l = Arrays.asList(10,20,30,40,50);
        System.out.println("basic: "+rotateBasic(l,2));
        List<Integer> m = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        rotateAdvanced(m,2);
        System.out.println("advanced: "+m);
    }
}
