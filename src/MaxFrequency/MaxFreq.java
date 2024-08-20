package MaxFrequency;
public class MaxFreq {
    public void MaxFrequency(String string){
        int t = 0;
        char p = 0;
        char[] ch = string.toCharArray();
        for (char value : ch) {
            int c = 0;
            for (char item : ch) {
                if (value == item) {
                    c++;
                }
            }
            if (t < c) {
                t = c;
                p = value;
            }
        }
        System.out.println("Maximum Frequency is of : "+p);
        System.out.println("It comes "+t+" times");
    }
}
