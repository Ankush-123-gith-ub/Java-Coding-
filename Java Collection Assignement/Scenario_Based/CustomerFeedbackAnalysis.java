
import java.util.*;
public class CustomerFeedbackAnalysis {
    static class Feedback {
        String id; int val; Feedback(String id){this.id=id;}
        public String toString(){return id;}
    }
    public static void main(String[] args){
        List<Feedback> list = new ArrayList<>();
        list.add(new Feedback("r1")); list.add(new Feedback("r2")); list.add(new Feedback("r1"));
        Set<String> set = new HashSet<>();
        for(Feedback x: list) set.add(x.id);
        Queue<Feedback> q = new LinkedList<>(list);
        Stack<Feedback> st = new Stack<>();
        System.out.println("all: "+list);
        System.out.println("unique ids: "+set);
        while(!q.isEmpty()) st.push(q.remove());
        System.out.println("failed stack size: "+st.size());
    }
}
