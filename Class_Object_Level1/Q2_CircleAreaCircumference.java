import java.util.Scanner;
class Circle {
    double radius;
    double area() {
        return 3.14 * radius * radius;
    }
    double circumference() {
        return 2 * 3.14 * radius;
    }
    void display() {
        System.out.println("Area: " + area());
        System.out.println("Circumference: " + circumference());
    }
}
public class Q2_CircleAreaCircumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        c.radius = sc.nextDouble();
        c.display();
    }
}