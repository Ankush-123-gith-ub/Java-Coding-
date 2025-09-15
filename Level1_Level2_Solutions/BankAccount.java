
public class BankAccount {
    String accountHolder; long accountNumber;
    double balance;
    BankAccount(String h, long no, double b){accountHolder=h;accountNumber=no;balance=b;}
    void deposit(double amt){balance+=amt;}
    boolean withdraw(double amt){
        if(balance>=amt){balance-=amt; return true;}
        else return false;
    }
    void display() {
        System.out.println("Holder: " + accountHolder + " Account No: " + accountNumber + " Balance: " + balance);
    }
    public static void main(String[] args){
        BankAccount b=new BankAccount("John",12345,1000);
        b.deposit(500);
        boolean success=b.withdraw(300);
        b.display();
        System.out.println("Withdraw success: " + success);
    }
}
