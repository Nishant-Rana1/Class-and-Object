import java.util.Scanner;
class Employee {
    String name;
    int id;
    double salary;
    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
public class Q1_EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();
        e.name = sc.nextLine();
        e.id = sc.nextInt();
        e.salary = sc.nextDouble();
        e.display();
    }
}