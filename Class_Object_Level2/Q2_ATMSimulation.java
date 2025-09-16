import java.util.Scanner;
class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;
    void deposit(double amount) {
        balance += amount;
    }
    void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
        else System.out.println("Insufficient balance");
    }
    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
public class Q2_ATMSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();
        b.accountHolder = sc.nextLine();
        b.accountNumber = sc.nextInt();
        b.balance = sc.nextDouble();
        b.deposit(sc.nextDouble());
        b.withdraw(sc.nextDouble());
        b.display();
    }
}