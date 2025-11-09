
import java.util.*;
public class Q4_StackUsingQueues {
    Queue<Integer> q1=new LinkedList<>(), q2=new LinkedList<>();
    public void push(int x){ q1.add(x); }
    public int pop(){
        while(q1.size()>1) q2.add(q1.remove());
        int r=q1.remove();
        Queue<Integer> t=q1; q1=q2; q2=t;
        return r;
    }
    public static void main(String[] args){
        Q4_StackUsingQueues s=new Q4_StackUsingQueues();
        s.push(1); s.push(2); s.push(3);
        System.out.println("basic pop: "+s.pop());
        Q4_StackUsingQueues s2=new Q4_StackUsingQueues();
        s2.push(1); s2.push(2); s2.push(3);
        System.out.println("advanced top then pop: "+s2.pop());
    }
}
