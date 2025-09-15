
class Employee {
    String name;
    int id;
    double salary;
    Employee(String n, int i, double s) { name=n; id=i; salary=s; }
    void displayDetails() {
        System.out.println("Name:"+name+" Id:"+id+" Salary:"+salary);
    }
}

class Manager extends Employee {
    int teamSize;
    Manager(String n,int i,double s,int t) { super(n,i,s); teamSize=t; }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size:"+teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;
    Developer(String n,int i,double s,String pl) { super(n,i,s); programmingLanguage=pl; }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Language:"+programmingLanguage);
    }
}

class Intern extends Employee {
    String school;
    Intern(String n,int i,double s,String sc) { super(n,i,s); school=sc; }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("School:"+school);
    }
}

public class employeeMain {
    public static void main(String[] args) {
        Manager m = new Manager("alice48", 1, 60000, 5);
        Developer d = new Developer("sam22", 2, 50000, "Java");
        Intern i = new Intern("bob94", 3, 20000, "High School");
        m.displayDetails();
        d.displayDetails();
        i.displayDetails();
    }
}
