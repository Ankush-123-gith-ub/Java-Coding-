
import java.util.*;
public class ECommerceOrderProcessing {
    static class Order {
        String id; int val; Order(String id){this.id=id;}
        public String toString(){return id;}
    }
    public static void main(String[] args){
        List<Order> list = new ArrayList<>();
        list.add(new Order("r1")); list.add(new Order("r2")); list.add(new Order("r1"));
        Set<String> set = new HashSet<>();
        for(Order x: list) set.add(x.id);
        Queue<Order> q = new LinkedList<>(list);
        Stack<Order> st = new Stack<>();
        System.out.println("all: "+list);
        System.out.println("unique ids: "+set);
        while(!q.isEmpty()) st.push(q.remove());
        System.out.println("failed stack size: "+st.size());
    }
}
