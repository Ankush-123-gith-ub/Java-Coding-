
public class q1_book {
    String title;
    String author;
    double price;

    q1_book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    q1_book(String t, String a, double p) {
        title = t; author = a; price = p;
    }

    void show() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    public static void main(String[] args) {
        q1_book b1 = new q1_book();
        b1.show();
        q1_book b2 = new q1_book("emma56", "mike48", 337);
        b2.show();
    }
}
