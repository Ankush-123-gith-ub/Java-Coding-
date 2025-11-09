
import java.util.*;
public class LibraryManagementSystem {
    static class Book {
        String id; int val; Book(String id){this.id=id;}
        public String toString(){return id;}
    }
    public static void main(String[] args){
        List<Book> list = new ArrayList<>();
        list.add(new Book("r1")); list.add(new Book("r2")); list.add(new Book("r1"));
        Set<String> set = new HashSet<>();
        for(Book x: list) set.add(x.id);
        Queue<Book> q = new LinkedList<>(list);
        Stack<Book> st = new Stack<>();
        System.out.println("all: "+list);
        System.out.println("unique ids: "+set);
        while(!q.isEmpty()) st.push(q.remove());
        System.out.println("failed stack size: "+st.size());
    }
}
