import java.util.Scanner;
class Book {
    String title;
    String author;
    double price;
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
public class Q3_BookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book();
        b.title = sc.nextLine();
        b.author = sc.nextLine();
        b.price = sc.nextDouble();
        b.display();
    }
}