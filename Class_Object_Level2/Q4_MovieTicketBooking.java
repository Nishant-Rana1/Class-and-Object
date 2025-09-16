import java.util.Scanner;
class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    void book(String name, int seat, double p) {
        movieName = name;
        seatNumber = seat;
        price = p;
    }
    void display() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price);
    }
}
public class Q4_MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTicket m = new MovieTicket();
        String name = sc.nextLine();
        int seat = sc.nextInt();
        double price = sc.nextDouble();
        m.book(name, seat, price);
        m.display();
    }
}