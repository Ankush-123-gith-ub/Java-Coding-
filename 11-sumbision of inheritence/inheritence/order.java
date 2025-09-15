
class Order {
    String orderId;
    String orderDate;
    Order(String id, String date) { orderId = id; orderDate = date; }
    String getOrderStatus() { return "Order placed"; }
}

class ShippedOrder extends Order {
    String trackingNumber;
    ShippedOrder(String id, String date, String tn) { super(id, date); trackingNumber = tn; }
    @Override
    String getOrderStatus() { return "Order shipped"; }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    DeliveredOrder(String id, String date, String tn, String dd) {
        super(id, date, tn);
        deliveryDate = dd;
    }
    @Override
    String getOrderStatus() { return "Order delivered"; }
}

public class orderMain {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder("kate17", "2025-09-15", "TN123", "2025-09-20");
        System.out.println(d.getOrderStatus());
    }
}
