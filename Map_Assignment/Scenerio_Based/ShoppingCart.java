
import java.util.*;
public class ShoppingCart {
    public static void main(String[] args){
        Map<String,Double> cart=new LinkedHashMap<>();
        cart.put("Laptop",40000.0);
        cart.put("Mouse",500.0);
        cart.put("Keyboard",700.0);

        double total=0;
        for(double p:cart.values()) total+=p;
        if(total>5000) total*=0.90;

        System.out.println("Total: "+total);

        cart.remove("Mouse");
        System.out.println(cart);
    }
}
