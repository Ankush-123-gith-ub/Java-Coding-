
public class q2_lev2 {
    String holder; long accNo; double bal;

    q2_lev2(String h, long a, double b) {
        holder = h; accNo = a; bal = b;
    }

    void deposit(double amt) {
        bal += amt;
    }

    boolean withdraw(double amt) {
        if (bal >= amt) {
            bal -= amt;
            return true;
        }
        return false;
    }

    void show() {
        System.out.println("Holder: " + holder + " AccNo: " + accNo + " Balance: " + bal);
    }

    public static void main(String[] args) {
        q2_lev2 acc = new q2_lev2("bob38", 6980795551, 1072);
        acc.deposit(500);
        boolean w = acc.withdraw(300);
        acc.show();
        System.out.println("Withdraw success: " + w);
    }
}
