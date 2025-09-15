
public class BookDetails {
    String title; String author; double price;
    BookDetails(String t, String a, double p){ title=t; author=a; price=p; }
    void display() {
        System.out.println("Title: " + title + " Author: " + author + " Price: " + price);
    }
    public static void main(String[] args){
        BookDetails b=new BookDetails("Hamlet","Shakespeare",500);
        b.display();
    }
}
