interface Sensitive {}

class BankDetails implements Sensitive {
    String acc = "1234XXXX";
}

public class SecureDemo {
    public static void main(String[] args) {
        BankDetails b = new BankDetails();
        if (b instanceof Sensitive)
            System.out.println("Encrypt before save");
    }
}