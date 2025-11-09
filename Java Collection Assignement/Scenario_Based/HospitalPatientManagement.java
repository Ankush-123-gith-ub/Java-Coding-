
import java.util.*;
public class HospitalPatientManagement {
    static class PatientRec {
        String id; int val; PatientRec(String id){this.id=id;}
        public String toString(){return id;}
    }
    public static void main(String[] args){
        List<PatientRec> list = new ArrayList<>();
        list.add(new PatientRec("r1")); list.add(new PatientRec("r2")); list.add(new PatientRec("r1"));
        Set<String> set = new HashSet<>();
        for(PatientRec x: list) set.add(x.id);
        Queue<PatientRec> q = new LinkedList<>(list);
        Stack<PatientRec> st = new Stack<>();
        System.out.println("all: "+list);
        System.out.println("unique ids: "+set);
        while(!q.isEmpty()) st.push(q.remove());
        System.out.println("failed stack size: "+st.size());
    }
}
