
public class q6_carrental {
    String customerName;
    String carModel;
    int rentalDays;
    double pricePerDay;

    q6_carrental(String c, String m, int d, double p) {
        customerName = c; carModel = m; rentalDays = d; pricePerDay = p;
    }

    double totalCost() {
        return rentalDays * pricePerDay;
    }

    void show() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total: " + totalCost());
    }

    public static void main(String[] args) {
        q6_carrental r = new q6_carrental("mike8", "alice43", 1, 2223);
        r.show();
    }
}
