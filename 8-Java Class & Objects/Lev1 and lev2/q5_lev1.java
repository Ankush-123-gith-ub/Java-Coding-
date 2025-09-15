
public class q5_lev1 {
    String brand, model; double price;

    q5_lev1(String b, String m, double p) {
        brand = b; model = m; price = p;
    }

    void show() {
        System.out.println("Brand: " + brand + " Model: " + model + " Price: " + price);
    }

    public static void main(String[] args) {
        q5_lev1 phone = new q5_lev1("Nokia", "max41", 31168);
        phone.show();
    }
}
