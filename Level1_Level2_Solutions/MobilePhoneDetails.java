
public class MobilePhoneDetails {
    String brand,model; double price;
    MobilePhoneDetails(String b, String m, double p){ brand=b; model=m; price=p; }
    void display(){
        System.out.println("Brand: " + brand + " Model: " + model + " Price: " + price);
    }
    public static void main(String[] args){
        MobilePhoneDetails mp=new MobilePhoneDetails("Apple","iPhone 13",90000);
        mp.display();
    }
}
