package combine_array;

public class MyUtility {
    public void CombineArr(String[] arr1, String[] arr2){
        String[] arr3 = new String[arr2.length+arr1.length];
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        for (String s : arr1) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : arr2) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : arr3) {
            System.out.print(s + " ");
        }
    }
}
