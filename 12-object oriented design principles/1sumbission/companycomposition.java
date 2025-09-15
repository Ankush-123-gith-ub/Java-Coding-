
import java.util.ArrayList;
class Company {
    ArrayList<Department> departments = new ArrayList<>();
    void addDepartment(Department d) { departments.add(d); }
    void showDepartments() {
        System.out.println("Departments:");
        for (Department d : departments) d.showEmployees();
    }
}

class Department {
    String name;
    ArrayList<Employee> employees = new ArrayList<>();
    Department(String n) { name = n; }
    void addEmployee(Employee e) { employees.add(e); }
    void showEmployees() {
        System.out.println("Department: " + name);
        for (Employee e : employees) System.out.println(" - " + e.name);
    }
}

class Employee {
    String name;
    Employee(String n) { name = n; }
}

public class companycompositionMain {
    public static void main(String[] args) {
        Company comp = new Company();
        Department d1 = new Department("HR");
        Department d2 = new Department("Dev");
        Employee e1 = new Employee("bob94");
        Employee e2 = new Employee("max79");
        d1.addEmployee(e1);
        d2.addEmployee(e2);
        comp.addDepartment(d1);
        comp.addDepartment(d2);
        comp.showDepartments();
    }
}
