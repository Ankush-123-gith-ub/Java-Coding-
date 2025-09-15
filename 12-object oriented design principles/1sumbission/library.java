
import java.util.ArrayList;
class Book {
    String title;
    String author;
    Book(String t, String a) { title = t; author = a; }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();
    void addBook(Book b) { books.add(b); }
    void showBooks() {
        System.out.println("Books in library:");
        for (Book b : books) {
            System.out.println(b.title + " by " + b.author);
        }
    }
}

public class libraryMain {
    public static void main(String[] args) {
        Book b1 = new Book("emma66", "AuthorA");
        Book b2 = new Book("mike58", "AuthorB");
        Library lib1 = new Library();
        Library lib2 = new Library();
        lib1.addBook(b1);
        lib1.addBook(b2);
        lib2.addBook(b2);
        lib1.showBooks();
        lib2.showBooks();
    }
}
