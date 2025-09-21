
import java.util.ArrayList;
class Bank {
    String name;
    ArrayList<Customer> customers = new ArrayList<>();
    Bank(String n) { name = n; }
    void openAccount(Customer c) {
        customers.add(c);
        c.banks.add(this);
    }
    void showCustomers() {
        System.out.println("Customers of " + name);
        for (Customer c : customers) { System.out.println(c.name); }
    }
}

class Customer {
    String name;
    ArrayList<Bank> banks = new ArrayList<>();
    Customer(String n) { name = n; }
    void viewBalances() {
        for (Bank b : banks) {
            System.out.println(name + " has account in " + b.name);
        }
    }
}

public class bankassociationMain {
    public static void main(String[] args) {
        Bank b1 = new Bank("anna98 Bank");
        Bank b2 = new Bank("kate18 Bank");
        Customer c1 = new Customer("alice48");
        Customer c2 = new Customer("sam22");
        b1.openAccount(c1);
        b2.openAccount(c1);
        b2.openAccount(c2);
        b1.showCustomers();
        b2.showCustomers();
        c1.viewBalances();
        c2.viewBalances();
    }
}
