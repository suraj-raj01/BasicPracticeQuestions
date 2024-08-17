package check_palindrome;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String string = scanner.nextLine();
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(string));
    }
}
