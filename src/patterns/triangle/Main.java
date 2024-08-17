package patterns.triangle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = scanner.nextInt();
        Triangle triangle = new Triangle();
        triangle.TrianglePattern(row);
        System.out.println();
        PalindromeTriangle palindromeTriangle = new PalindromeTriangle();
        palindromeTriangle.Palindrome(row);
    }
}
