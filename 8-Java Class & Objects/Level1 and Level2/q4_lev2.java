
public class q4_lev2 {
    String movie; int seat; double price;

    q4_lev2(String m) {
        movie = m; seat = 0; price = 0;
    }

    void book(int s, double p) {
        seat = s; price = p;
    }

    void show() {
        System.out.println("Movie: " + movie + " Seat: " + seat + " Price: " + price);
    }

    public static void main(String[] args) {
        q4_lev2 t = new q4_lev2("Jumanji");
        t.book(97, 538);
        t.show();
    }
}
