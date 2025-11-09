
import java.util.*;
public class OnlineExaminationSystem {
    static class Student {
        String id; int val; Student(String id){this.id=id;}
        public String toString(){return id;}
    }
    public static void main(String[] args){
        List<Student> list = new ArrayList<>();
        list.add(new Student("r1")); list.add(new Student("r2")); list.add(new Student("r1"));
        Set<String> set = new HashSet<>();
        for(Student x: list) set.add(x.id);
        Queue<Student> q = new LinkedList<>(list);
        Stack<Student> st = new Stack<>();
        System.out.println("all: "+list);
        System.out.println("unique ids: "+set);
        while(!q.isEmpty()) st.push(q.remove());
        System.out.println("failed stack size: "+st.size());
    }
}
