
import java.util.*;
public class Q2_BinaryNumbers {
    public static List<String> basic(int n){
        List<String> res=new ArrayList<>();
        Queue<String> q=new LinkedList<>();
        q.add("1");
        while(res.size()<n){
            String s=q.remove(); res.add(s);
            q.add(s+"0"); q.add(s+"1");
        }
        return res;
    }
    public static List<String> advanced(int n){
        List<String> res=new ArrayList<>();
        Deque<String> q=new ArrayDeque<>();
        q.add("1");
        while(res.size()<n){
            String s=q.poll(); res.add(s);
            q.offer(s+"0"); q.offer(s+"1");
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println("basic: "+basic(5));
        System.out.println("advanced: "+advanced(10));
    }
}
