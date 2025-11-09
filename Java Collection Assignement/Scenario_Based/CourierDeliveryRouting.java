
import java.util.*;
public class CourierDeliveryRouting {
    static class Parcel {
        String id; int val; Parcel(String id){this.id=id;}
        public String toString(){return id;}
    }
    public static void main(String[] args){
        List<Parcel> list = new ArrayList<>();
        list.add(new Parcel("r1")); list.add(new Parcel("r2")); list.add(new Parcel("r1"));
        Set<String> set = new HashSet<>();
        for(Parcel x: list) set.add(x.id);
        Queue<Parcel> q = new LinkedList<>(list);
        Stack<Parcel> st = new Stack<>();
        System.out.println("all: "+list);
        System.out.println("unique ids: "+set);
        while(!q.isEmpty()) st.push(q.remove());
        System.out.println("failed stack size: "+st.size());
    }
}
