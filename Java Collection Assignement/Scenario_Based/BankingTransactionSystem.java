
import java.util.*;
public class BankingTransactionSystem {
    static class Transaction {
        String id; int val; Transaction(String id){this.id=id;}
        public String toString(){return id;}
    }
    public static void main(String[] args){
        List<Transaction> list = new ArrayList<>();
        list.add(new Transaction("r1")); list.add(new Transaction("r2")); list.add(new Transaction("r1"));
        Set<String> set = new HashSet<>();
        for(Transaction x: list) set.add(x.id);
        Queue<Transaction> q = new LinkedList<>(list);
        Stack<Transaction> st = new Stack<>();
        System.out.println("all: "+list);
        System.out.println("unique ids: "+set);
        while(!q.isEmpty()) st.push(q.remove());
        System.out.println("failed stack size: "+st.size());
    }
}
