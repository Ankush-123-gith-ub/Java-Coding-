
import java.util.ArrayList;
class Product {
    String name;
    double price;
    Product(String n, double p) { name = n; price = p; }
}

class Order {
    ArrayList<Product> products = new ArrayList<>();
    void addProduct(Product p) { products.add(p); }
    void showProducts() {
        System.out.println("Order contains:");
        for(Product p : products) System.out.println(p.name + ": $" + p.price);
    }
}

class Customer {
    String name;
    ArrayList<Order> orders = new ArrayList<>();
    Customer(String n) { name = n; }
    void placeOrder(Order o) { orders.add(o); }
    void showOrders() {
        System.out.println(name + "'s orders:");
        for(Order o : orders) o.showProducts();
    }
}

public class ecommerceMain {
    public static void main(String[] args) {
        Product p1 = new Product("Phone", 600);
        Product p2 = new Product("Laptop", 1200);
        Order o = new Order();
        o.addProduct(p1);
        o.addProduct(p2);
        Customer c = new Customer("alice62");
        c.placeOrder(o);
        c.showOrders();
    }
}
