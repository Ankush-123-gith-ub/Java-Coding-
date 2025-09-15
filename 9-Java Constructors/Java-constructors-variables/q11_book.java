
public class q11_book {
    public String ISBN;
    protected String title;
    private String author;

    q11_book(String isbn, String t, String a) {
        ISBN = isbn; title = t; author = a;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public void show() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
    }

    public static void main(String[] args) {
        q11_book b = new q11_book("12345", "emma64", "kate63");
        b.show();
        b.setAuthor("New Author");
        System.out.println("Author after set: " + b.getAuthor());
    }
}

class EBook extends q11_book {
    EBook(String isbn, String t, String a) {
        super(isbn, t, a);
    }
    void showProtected() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title);
    }
}
