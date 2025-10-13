import java.util.*;
import java.util.stream.*;
public class Invoice_Creation {
    String transactionId;

    Invoice_Creation(String transactionId) {
        this.transactionId = transactionId;
    }

    public String toString() {
        return "Invoice: " + transactionId;
    }
}

class invoice {
    public static void main(String[] args) {
        List<String> transactionIDs = Arrays.asList("T1001", "T1002", "T1003");

        List<Invoice_Creation> invoices = transactionIDs.stream().map(Invoice_Creation::new).toList();
        invoices.forEach(System.out::println);
    }
}
