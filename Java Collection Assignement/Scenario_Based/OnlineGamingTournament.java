
import java.util.*;
public class OnlineGamingTournament {
    static class Player {
        String id; int val; Player(String id){this.id=id;}
        public String toString(){return id;}
    }
    public static void main(String[] args){
        List<Player> list = new ArrayList<>();
        list.add(new Player("r1")); list.add(new Player("r2")); list.add(new Player("r1"));
        Set<String> set = new HashSet<>();
        for(Player x: list) set.add(x.id);
        Queue<Player> q = new LinkedList<>(list);
        Stack<Player> st = new Stack<>();
        System.out.println("all: "+list);
        System.out.println("unique ids: "+set);
        while(!q.isEmpty()) st.push(q.remove());
        System.out.println("failed stack size: "+st.size());
    }
}
