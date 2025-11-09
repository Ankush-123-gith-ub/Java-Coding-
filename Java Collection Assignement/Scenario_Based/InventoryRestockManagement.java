
import java.util.*;
public class InventoryRestockManagement {
    static class Product {
        String id; int val; Product(String id){this.id=id;}
        public String toString(){return id;}
    }
    public static void main(String[] args){
        List<Product> list = new ArrayList<>();
        list.add(new Product("r1")); list.add(new Product("r2")); list.add(new Product("r1"));
        Set<String> set = new HashSet<>();
        for(Product x: list) set.add(x.id);
        Queue<Product> q = new LinkedList<>(list);
        Stack<Product> st = new Stack<>();
        System.out.println("all: "+list);
        System.out.println("unique ids: "+set);
        while(!q.isEmpty()) st.push(q.remove());
        System.out.println("failed stack size: "+st.size());
    }
}
