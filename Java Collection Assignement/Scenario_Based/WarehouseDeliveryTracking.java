
import java.util.*;
public class WarehouseDeliveryTracking {
    static class Package {
        String id; int val; Package(String id){this.id=id;}
        public String toString(){return id;}
    }
    public static void main(String[] args){
        List<Package> list = new ArrayList<>();
        list.add(new Package("r1")); list.add(new Package("r2")); list.add(new Package("r1"));
        Set<String> set = new HashSet<>();
        for(Package x: list) set.add(x.id);
        Queue<Package> q = new LinkedList<>(list);
        Stack<Package> st = new Stack<>();
        System.out.println("all: "+list);
        System.out.println("unique ids: "+set);
        while(!q.isEmpty()) st.push(q.remove());
        System.out.println("failed stack size: "+st.size());
    }
}
