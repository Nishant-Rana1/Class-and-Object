import java.util.Scanner;
class MobilePhone {
    String brand;
    String model;
    double price;
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}
public class Q5_MobilePhoneDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MobilePhone m = new MobilePhone();
        m.brand = sc.nextLine();
        m.model = sc.nextLine();
        m.price = sc.nextDouble();
        m.display();
    }
}