
public class q13_employee {
    public int employeeID;
    protected String department;
    private double salary;

    q13_employee(int id, String dept, double sal) {
        employeeID = id; department = dept; salary = sal;
    }

    public void setSalary(double sal) {
        salary = sal;
    }

    public void show() {
        System.out.println("ID: " + employeeID + ", Department: " + department + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        q13_employee emp = new q13_employee(9897, "lisa55", 83412);
        emp.show();
        emp.setSalary(emp.salary + 5000);
        emp.show();
    }
}

class Manager extends q13_employee {
    Manager(int id, String dept, double sal) {
        super(id, dept, sal);
    }
    void showProtected() {
        System.out.println("ID: " + employeeID + ", Dept: " + department);
    }
}
