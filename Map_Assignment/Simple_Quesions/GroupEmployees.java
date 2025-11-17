
import java.util.*;
class Employee {
    String name;
    String dept;
    Employee(String n,String d){ name=n; dept=d; }
}
public class GroupEmployees {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee("Alice","HR"));
        list.add(new Employee("Bob","IT"));
        list.add(new Employee("Carol","HR"));
        Map<String,List<String>> grouped=new HashMap<>();
        for(Employee e:list){
            grouped.putIfAbsent(e.dept,new ArrayList<>());
            grouped.get(e.dept).add(e.name);
        }
        System.out.println(grouped);
    }
}
