
class BankAccount {
    String accountNumber;
    double balance;
    BankAccount(String an, double b) { accountNumber = an; balance = b; }
    void displayAccountType() { System.out.println("Generic Bank Account"); }
}

class SavingsAccount extends BankAccount {
    double interestRate;
    SavingsAccount(String an, double b, double ir) { super(an, b); interestRate = ir; }
    @Override
    void displayAccountType() { System.out.println("Savings Account with interest rate " + interestRate); }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    CheckingAccount(String an, double b, double wl) { super(an, b); withdrawalLimit = wl; }
    @Override
    void displayAccountType() { System.out.println("Checking Account with withdrawal limit " + withdrawalLimit); }
}

class FixedDepositAccount extends BankAccount {
    double interestRate;
    int tenure;
    FixedDepositAccount(String an, double b, double ir, int t) { super(an, b); interestRate = ir; tenure = t; }
    @Override
    void displayAccountType() { System.out.println("Fixed Deposit Account with tenure " + tenure); }
}

public class bankaccounttypesMain {
    public static void main(String[] args) {
        BankAccount b1 = new SavingsAccount("S123", 5000, 5.5);
        BankAccount b2 = new CheckingAccount("C456", 3000, 1000);
        BankAccount b3 = new FixedDepositAccount("F789", 10000, 6.5, 12);
        b1.displayAccountType();
        b2.displayAccountType();
        b3.displayAccountType();
    }
}
