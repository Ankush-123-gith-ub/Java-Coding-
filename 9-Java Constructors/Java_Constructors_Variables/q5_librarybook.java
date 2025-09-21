
public class q5_librarybook {
    String title, author;
    double price;
    boolean available;

    q5_librarybook(String t, String a, double p) {
        title = t; author = a; price = p; available = true;
    }

    boolean borrow() {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }

    void show() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
    }

    public static void main(String[] args) {
        q5_librarybook b = new q5_librarybook("bob84", "max69", 265);
        b.show();
        System.out.println("Borrow success: " + b.borrow());
        System.out.println("Borrow again: " + b.borrow());
    }
}
