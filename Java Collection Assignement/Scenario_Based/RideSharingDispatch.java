
import java.util.*;
public class RideSharingDispatch {
    static class RideRequest {
        String id; int val; RideRequest(String id){this.id=id;}
        public String toString(){return id;}
    }
    public static void main(String[] args){
        List<RideRequest> list = new ArrayList<>();
        list.add(new RideRequest("r1")); list.add(new RideRequest("r2")); list.add(new RideRequest("r1"));
        Set<String> set = new HashSet<>();
        for(RideRequest x: list) set.add(x.id);
        Queue<RideRequest> q = new LinkedList<>(list);
        Stack<RideRequest> st = new Stack<>();
        System.out.println("all: "+list);
        System.out.println("unique ids: "+set);
        while(!q.isEmpty()) st.push(q.remove());
        System.out.println("failed stack size: "+st.size());
    }
}
