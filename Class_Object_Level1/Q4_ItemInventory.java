import java.util.Scanner;
class Item {
    int itemCode;
    String itemName;
    double price;
    void display(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Total Cost: " + (price * quantity));
    }
}
public class Q4_ItemInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item i = new Item();
        i.itemCode = sc.nextInt();
        sc.nextLine();
        i.itemName = sc.nextLine();
        i.price = sc.nextDouble();
        int quantity = sc.nextInt();
        i.display(quantity);
    }
}