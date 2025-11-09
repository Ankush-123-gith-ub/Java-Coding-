
import java.util.*;
public class CollegeAdmissionSystem {
    static class Applicant {
        String id; int val; Applicant(String id){this.id=id;}
        public String toString(){return id;}
    }
    public static void main(String[] args){
        List<Applicant> list = new ArrayList<>();
        list.add(new Applicant("r1")); list.add(new Applicant("r2")); list.add(new Applicant("r1"));
        Set<String> set = new HashSet<>();
        for(Applicant x: list) set.add(x.id);
        Queue<Applicant> q = new LinkedList<>(list);
        Stack<Applicant> st = new Stack<>();
        System.out.println("all: "+list);
        System.out.println("unique ids: "+set);
        while(!q.isEmpty()) st.push(q.remove());
        System.out.println("failed stack size: "+st.size());
    }
}
