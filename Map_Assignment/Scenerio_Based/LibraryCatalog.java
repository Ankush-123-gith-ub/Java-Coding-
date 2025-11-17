
import java.util.*;
public class LibraryCatalog {
    public static void main(String[] args) {
        Map<String,String> books=new HashMap<>();
        books.put("978-111","Java Basics");
        books.put("978-222","Python Guide");
        books.put("978-333","Data Structures");

        String isbn="978-222";
        if(books.containsKey(isbn)) System.out.println(books.get(isbn));

        books.remove("978-333");

        List<String> all=new ArrayList<>(books.keySet());
        Collections.sort(all);
        for(String i:all) System.out.println(i+" => "+books.get(i));

        String title="Java Basics";
        for(String k:books.keySet()){
            if(books.get(k).equals(title)){
                System.out.println("Found: "+k);
            }
        }
    }
}
