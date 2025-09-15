
public class q12_bankaccount {
    public long accountNumber;
    protected String accountHolder;
    private double balance;

    q12_bankaccount(long accNo, String holder, double bal) {
        accountNumber = accNo; accountHolder = holder; balance = bal;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double bal) {
        balance = bal;
    }

    public void show() {
        System.out.println("AccountNo: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        q12_bankaccount acc = new q12_bankaccount(123456, "kate4", 2000);
        acc.show();
        acc.setBalance(2500);
        acc.show();
    }
}

class SavingsAccount extends q12_bankaccount {
    SavingsAccount(long accNo, String holder, double bal) {
        super(accNo, holder, bal);
    }
    void showProtected() {
        System.out.println("Holder: " + accountHolder);
        System.out.println("AccountNo: " + accountNumber);
    }
}
