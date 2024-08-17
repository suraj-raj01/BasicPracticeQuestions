package patterns.triangle;

public class PalindromeTriangle {
    public void Palindrome(int row){
        for (int i = 1; i <= row; i++) {
            for(int j=1; j<=2*(row-i); j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j+" ");
            }
            for(int j=2; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
