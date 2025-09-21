
import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        int[] otps=new int[10];
        for(int i=0;i<10;i++){
            otps[i]=100000+(int)(Math.random()*900000);
        }
        System.out.println("OTPs: "+Arrays.toString(otps));
        System.out.println("Unique: "+isUnique(otps));
    }
    static boolean isUnique(int[] a){
        Set<Integer> s=new HashSet<>();
        for(int x:a) s.add(x);
        return s.size()==a.length;
    }
}
