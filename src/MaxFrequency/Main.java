package MaxFrequency;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String string = scanner.nextLine();
        MaxFreq maxFreq = new MaxFreq();
        maxFreq.MaxFrequency(string);
    }
}
