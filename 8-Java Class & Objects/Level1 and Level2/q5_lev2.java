
import java.util.ArrayList;

public class q5_lev2 {
    static ArrayList<Item> cart = new ArrayList<>();

    static class Item {
        String n; double p; int q;

        Item(String name, double price, int qty) {
            n = name; p = price; q = qty;
        }
    }

    static void add(String n, double p, int q) {
        cart.add(new Item(n, p, q));
    }

    static void remove(String n) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).n.equals(n)) {
                cart.remove(i);
                break;
            }
        }
    }

    static double total() {
        double tot = 0;
        for (Item i : cart) tot += i.p * i.q;
        return tot;
    }

    public static void main(String[] args) {
        add("john32", 50, 2);
        add("alice52", 36, 1);
        System.out.println("Total cost: " + total());
        remove("max73");
        System.out.println("After remove total: " + total());
    }
}
