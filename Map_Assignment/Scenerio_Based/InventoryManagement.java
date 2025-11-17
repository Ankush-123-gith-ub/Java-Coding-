
import java.util.*;
public class InventoryManagement {
    public static void main(String[] args) {
        Map<String,Integer> stock=new HashMap<>();
        stock.put("Laptop",10);
        stock.put("Mouse",30);
        stock.put("Keyboard",15);

        stock.put("Laptop", stock.get("Laptop") - 2);
        if(stock.get("Laptop")<=0) stock.put("Laptop",0);

        stock.put("Mouse", stock.get("Mouse")+20);

        if(stock.containsKey("Keyboard")) System.out.println(stock.get("Keyboard"));
        else System.out.println("not stocked");

        System.out.println("Out of stock:");
        for(String p: stock.keySet()){
            if(stock.get(p)==0) System.out.println(p);
        }
    }
}
