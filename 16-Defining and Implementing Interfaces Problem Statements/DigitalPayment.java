public interface DigitalPayment {
    void pay();
}

class UPI implements DigitalPayment{
    public void pay(){
        System.out.println("Pay by UPI");
    }
}
class CreditCard implements DigitalPayment{
    public void pay(){
        System.out.println("Pay by CreditCard");
    }
}
class Wallet implements DigitalPayment{
    public void pay(){
        System.out.println("Pay by Wallet");
    }
}

class payments{
    public static void main(String[] args) {
        DigitalPayment upi = new UPI();
        DigitalPayment cc = new CreditCard();
        DigitalPayment wallet = new Wallet();
    
        upi.pay();
        cc.pay();
        wallet.pay();
    }
}