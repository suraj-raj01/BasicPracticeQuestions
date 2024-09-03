package fibonacci;

public class FibonacciSeries {
    public static void fibonacciSeries(int a, int b, int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.print(c+" ");
        fibonacciSeries(b,c,n-1);
    }
}
