import java.util.*;

class Sort {
    String name;
    double price, rating, discount;

    Sort(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }
}
class custom_sort {
    public static void main(String[] args) {
        List<Sort> list = new ArrayList<>();
        list.add(new Sort("Shoes", 1200, 4.3, 10));
        list.add(new Sort("Watch", 2500, 4.7, 20));
        list.add(new Sort("Bag", 800, 4.0, 30));


        Collections.sort(list, (a, b) -> Double.compare(a.price, b.price));
        System.out.println("Sorted by Price:");
        for (Sort p : list)
            System.out.println(p.name + " - ₹" + p.price);


        Collections.sort(list, (a, b) -> Double.compare(b.rating, a.rating));
        System.out.println("\nSorted by Rating:");
        for (Sort p : list)
            System.out.println(p.name + " - " + p.rating);

        Collections.sort(list, (a, b) -> Double.compare(b.discount, a.discount));
        System.out.println("\nSorted by Discount:");
        for (Sort p : list)
            System.out.println(p.name + " - " + p.discount + "% off");
    }
}
