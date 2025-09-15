
public class MovieTicket {
    String movieName; int seatNumber; double price;
    MovieTicket(String mn){ movieName=mn; seatNumber=0; price=0; }
    void book(int seat, double p){ seatNumber=seat; price=p; }
    void display() {
        System.out.println("Movie: " + movieName + " Seat: " + seatNumber + " Price: " + price);
    }
    public static void main(String[] args){
        MovieTicket t=new MovieTicket("Avengers");
        t.book(50, 300);
        t.display();
    }
}
