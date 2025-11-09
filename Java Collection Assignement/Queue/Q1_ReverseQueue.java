
import java.util.*;
public class Q1_ReverseQueue {
    public static <T> Queue<T> basic(Queue<T> q){
        Stack<T> s=new Stack<>();
        while(!q.isEmpty()) s.push(q.remove());
        while(!s.isEmpty()) q.add(s.pop());
        return q;
    }
    public static <T> void advanced(Queue<T> q){
        if(q.isEmpty()) return;
        T x = q.remove();
        advanced(q);
        q.add(x);
    }
    public static void main(String[] args){
        Queue<Integer> q1=new LinkedList<>(Arrays.asList(10,20,30));
        System.out.println("basic: "+basic(new LinkedList<>(q1)));
        Queue<Integer> q2=new LinkedList<>(Arrays.asList(1,2,3,4));
        advanced(q2);
        System.out.println("advanced: "+q2);
    }
}
