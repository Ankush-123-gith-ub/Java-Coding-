
import java.util.*;
public class Q5_NthFromEnd {
    public static <T> T nthBasic(LinkedList<T> list,int n){
        Queue<T> q=new LinkedList<>();
        for(T x: list){ q.add(x); if(q.size()>n) q.poll(); }
        return q.peek();
    }
    public static <T> T nthAdvanced(LinkedList<T> list,int n){
        Iterator<T> fast=list.iterator();
        Iterator<T> slow=list.iterator();
        int i=0;
        while(i<n && fast.hasNext()){ fast.next(); i++; }
        if(i<n) return null;
        while(fast.hasNext()){ fast.next(); slow.next(); }
        T res=null;
        try{ res = slow.next(); }catch(NoSuchElementException e){}
        return res;
    }
    public static void main(String[] args){
        LinkedList<String> l = new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        System.out.println("basic: "+nthBasic(l,2));
        System.out.println("advanced: "+nthAdvanced(l,2));
    }
}
