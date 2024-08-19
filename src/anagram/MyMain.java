package anagram;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first String : ");
        String string1 = scanner.nextLine();
        System.out.println("Enter the second String : ");
        String string2 = scanner.nextLine();
        Anagram anagram = new Anagram();
        anagram.isAnagram(string1, string2);
    }
}
