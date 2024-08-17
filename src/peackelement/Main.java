package peackelement;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }
        PeakElement peakElement  = new PeakElement();
        int result = peakElement.PeakElements(arr);
        System.out.println("Peak Element is : "+result);
    }
}