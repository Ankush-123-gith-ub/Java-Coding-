
public class q4_lev1 {
    String code, name; double price;

    q4_lev1(String c, String n, double p) {
        code = c; name = n; price = p;
    }

    void show() {
        System.out.println("Code: " + code + " Name: " + name + " Price: " + price);
    }

    double total(int qty) {
        return price * qty;
    }

    public static void main(String[] args) {
        q4_lev1 i = new q4_lev1("C303", "alice3", 94);
        i.show();
        System.out.println("Total for 5 units: " + i.total(5));
    }
}
