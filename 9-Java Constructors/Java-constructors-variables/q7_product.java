
public class q7_product {
    String productName;
    double price;
    static int totalProducts = 0;

    q7_product(String n, double p) {
        productName = n; price = p;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total products: " + totalProducts);
    }

    public static void main(String[] args) {
        q7_product p1 = new q7_product("sam51", 10);
        q7_product p2 = new q7_product("alice77", 88);
        p1.displayProductDetails();
        p2.displayProductDetails();
        q7_product.displayTotalProducts();
    }
}
