package fibonacci.nthfibonacci;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms : ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci nth terms = " + Fibonacci.nthFibonacci(n));
    }
}
