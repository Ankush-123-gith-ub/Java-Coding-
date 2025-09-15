
class Book {
    String title;
    int publicationYear;
    Book(String t, int py) { title = t; publicationYear = py; }
    void displayInfo() {
        System.out.println("Title:" + title + ", Year:" + publicationYear);
    }
}

class Author extends Book {
    String name, bio;
    Author(String t, int py, String n, String b) {
        super(t, py);
        name = n; bio = b;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author:" + name);
        System.out.println("Bio:" + bio);
    }
}

public class bookauthorMain {
    public static void main(String[] args) {
        Author a = new Author("max79", 2025, "kate30", "Writer and scholar");
        a.displayInfo();
    }
}
