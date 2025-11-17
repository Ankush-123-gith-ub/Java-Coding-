
import java.util.*;
public class EmployeeDepartment {
    public static void main(String[] args){
        Map<Integer,String> emp=new HashMap<>();
        emp.put(1,"IT");
        emp.put(2,"HR");
        emp.put(3,"IT");
        emp.put(4,"Sales");

        emp.put(3,"HR");

        String q="HR";
        for(int id:emp.keySet()){
            if(emp.get(id).equals(q)) System.out.println(id);
        }

        Map<String,Integer> count=new HashMap<>();
        for(String d:emp.values()){
            count.put(d, count.getOrDefault(d,0)+1);
        }
        System.out.println(count);
    }
}
