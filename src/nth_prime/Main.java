package nth_prime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scanner.nextInt();
        Prime prime = new Prime();
        int count=0;
        // Print prime number
        System.out.print("Prime Numbers : ");
        for(int i=2; i<=n; i++){
            if(prime.primeCheck(i)){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Prime Numbers between [0 - "+n+"] = "+count);
    }
}
