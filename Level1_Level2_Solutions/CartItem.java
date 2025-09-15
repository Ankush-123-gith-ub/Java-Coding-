
import java.util.ArrayList;
public class CartItem {
    static ArrayList<Item> cart = new ArrayList<>();
    static class Item {
        String itemName; double price; int quantity;
        Item(String n, double p, int q){ itemName=n; price=p; quantity=q; }
    }
    static void addItem(String n, double p, int q) {
        cart.add(new Item(n,p,q));
    }
    static void removeItem(String n) {
        for(int i=0; i<cart.size(); i++) {
            if(cart.get(i).itemName.equals(n)) {
                cart.remove(i);
                break;
            }
        }
    }
    static double totalCost() {
        double total=0;
        for(Item i:cart) total+=i.price*i.quantity;
        return total;
    }
    public static void main(String[] args) {
        addItem("Pen", 10, 2);
        addItem("Book", 200, 1);
        System.out.println("Total cost: " + totalCost());
        removeItem("Pen");
        System.out.println("Total after removal: " + totalCost());
    }
}
