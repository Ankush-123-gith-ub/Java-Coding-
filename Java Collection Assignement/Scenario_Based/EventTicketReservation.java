
import java.util.*;
public class EventTicketReservation {
    static class Booking {
        String id; int val; Booking(String id){this.id=id;}
        public String toString(){return id;}
    }
    public static void main(String[] args){
        List<Booking> list = new ArrayList<>();
        list.add(new Booking("r1")); list.add(new Booking("r2")); list.add(new Booking("r1"));
        Set<String> set = new HashSet<>();
        for(Booking x: list) set.add(x.id);
        Queue<Booking> q = new LinkedList<>(list);
        Stack<Booking> st = new Stack<>();
        System.out.println("all: "+list);
        System.out.println("unique ids: "+set);
        while(!q.isEmpty()) st.push(q.remove());
        System.out.println("failed stack size: "+st.size());
    }
}
