
public class q3_lev1 {
    String title, author; double price;

    q3_lev1(String t, String a, double p) {
        title = t; author = a; price = p;
    }

    void show() {
        System.out.println("Title: " + title + " Author: " + author + " Price: " + price);
    }

    public static void main(String[] args) {
        q3_lev1 b = new q3_lev1("kate8", "alice38", 323);
        b.show();
    }
}
