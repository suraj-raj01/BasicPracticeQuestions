package check_palindrome;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String string = scanner.nextLine();
        Palindrome palindrome = new Palindrome();
        System.out.println("palindrome = " +palindrome.isPalindrome(string));

        System.out.print("Enter the Integer : ");
        int integer = scanner.nextInt();
        Palindrome palindrome1 = new Palindrome();
        System.out.println("palindrome = " + palindrome1.isPalindromInteger(integer));
    }
}

/*
Enter the String : oppo
palindrome = true
Enter the Integer : 78987
palindrome = true
*/