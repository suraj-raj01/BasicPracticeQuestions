package fibonacci.fibonacciseries;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers of terms : ");
        int n = scanner.nextInt();
        int a = 0,b = 1;
        System.out.print(a+" "+b+" ");
        FibonacciSeries.fibonacciSeries(a,b,n-2);
    }
}
