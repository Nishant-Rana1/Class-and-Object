import java.util.Scanner;
class Student {
    String name;
    int rollNumber;
    int marks;
    String grade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "D";
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade());
    }
}
public class Q1_StudentReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        s.name = sc.nextLine();
        s.rollNumber = sc.nextInt();
        s.marks = sc.nextInt();
        s.display();
    }
}