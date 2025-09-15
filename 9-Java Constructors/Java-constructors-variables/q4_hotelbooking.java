
public class q4_hotelbooking {
    String guestName;
    String roomType;
    int nights;

    q4_hotelbooking() {
        guestName = "Unknown"; roomType = "Standard"; nights = 1;
    }

    q4_hotelbooking(String g, String r, int n) {
        guestName = g; roomType = r; nights = n;
    }

    q4_hotelbooking(q4_hotelbooking other) {
        guestName = other.guestName;
        roomType = other.roomType;
        nights = other.nights;
    }

    void show() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }

    public static void main(String[] args) {
        q4_hotelbooking h1 = new q4_hotelbooking();
        h1.show();

        q4_hotelbooking h2 = new q4_hotelbooking("sam90", "Deluxe", 2);
        h2.show();

        q4_hotelbooking h3 = new q4_hotelbooking(h2);
        h3.show();
    }
}
