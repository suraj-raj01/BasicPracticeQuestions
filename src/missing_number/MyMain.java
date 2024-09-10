package missing_number;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i:arr){
            arr[i] = scanner.nextInt();
        }
        MissingNumber.missingNumber(arr);
     }
}

/*
Enter the size of an array: 5
1 2 3 5 6
Missing Number : 4Enter the size of an array:
5
1 2 3 5 6
Missing Number : 4
*/