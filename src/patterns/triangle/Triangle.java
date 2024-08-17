package patterns.triangle;

public class Triangle {
    public void TrianglePattern(int row){
        for (int i = row; i >0; i--) {
            for(int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
