
import java.util.*;
public class StreamingWatchHistory {
    static class Movie {
        String id; int val; Movie(String id){this.id=id;}
        public String toString(){return id;}
    }
    public static void main(String[] args){
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("r1")); list.add(new Movie("r2")); list.add(new Movie("r1"));
        Set<String> set = new HashSet<>();
        for(Movie x: list) set.add(x.id);
        Queue<Movie> q = new LinkedList<>(list);
        Stack<Movie> st = new Stack<>();
        System.out.println("all: "+list);
        System.out.println("unique ids: "+set);
        while(!q.isEmpty()) st.push(q.remove());
        System.out.println("failed stack size: "+st.size());
    }
}
