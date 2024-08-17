package peackelement;
public class PeakElement {
    public int PeakElements(int[] arr){
        for(int i=1; i<arr.length-1; i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
}
