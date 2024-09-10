package missing_number;

public class MissingNumber {
    public static void missingNumber(int[] arr){
        int size = arr.length-1;
        int sum = (size*(size+1))/2;
        int s=0;
        for (int j : arr) {
            s += j;
        }
        System.out.println("Missing Number : "+(sum-s));
    }
}
