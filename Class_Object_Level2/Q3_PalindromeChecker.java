import java.util.Scanner;
class PalindromeChecker {
    String text;
    boolean isPalindrome() {
        int i = 0, j = text.length() - 1;
        while (i < j) {
            if (text.charAt(i) != text.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    void display() {
        if (isPalindrome()) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
public class Q3_PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeChecker p = new PalindromeChecker();
        p.text = sc.nextLine();
        p.display();
    }
}