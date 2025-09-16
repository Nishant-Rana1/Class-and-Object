import java.util.Scanner;
class CartItem {
    String itemName;
    double price;
    int quantity;
    void addItem(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
    }
    void removeItem() {
        itemName = "";
        price = 0;
        quantity = 0;
    }
    void displayTotal() {
        System.out.println("Total Cost: " + (price * quantity));
    }
}
public class Q5_ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CartItem c = new CartItem();
        String name = sc.nextLine();
        double price = sc.nextDouble();
        int qty = sc.nextInt();
        c.addItem(name, price, qty);
        c.displayTotal();
        c.removeItem();
    }
}