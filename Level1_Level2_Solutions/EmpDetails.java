
public class EmpDetails {
    String name; int id; double salary;
    EmpDetails(String name, int id, double salary) {
        this.name=name; this.id=id; this.salary=salary;
    }
    void display() {
        System.out.println("Name: " + name + " Id: " + id + " Salary: " + salary);
    }
    public static void main(String[] args){
        EmpDetails emp=new EmpDetails("Alice",1,50000);
        emp.display();
    }
}
