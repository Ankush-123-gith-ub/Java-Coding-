
public class ItemInventory {
    String itemCode,itemName; double price;
    ItemInventory(String code, String name, double p){ itemCode=code; itemName=name; price=p; }
    void display(){
        System.out.println("Code: " + itemCode + " Name: " + itemName + " Price: " + price);
    }
    double totalCost(int qty){ return price*qty; }
    public static void main(String[] args){
        ItemInventory i=new ItemInventory("I101","Pen",10);
        i.display();
        System.out.println("Total cost for 5: " + i.totalCost(5));
    }
}
