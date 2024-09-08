package Matrices;

public class SpiralOrder {
    public static void spiralOrder(int[][] matrices,int row, int col){
        int rowStart = 0;
        int rowEnd = row-1;
        int colStart = 0;
        int colEnd = col-1;
        System.out.print("Spiral Order Matrices : ");
        while (rowStart <= rowEnd && colStart <= colEnd) {
                for (int i = colStart; i <= colEnd; i++) {
                    System.out.print(matrices[rowStart][i] + " ");
                }
                rowStart++;
                for (int i = rowStart; i <= rowEnd; i++) {
                    System.out.print(matrices[i][colEnd] + " ");
                }
                colEnd--;
                for (int i = colEnd; i >= colStart; i--) {
                    System.out.print(matrices[rowEnd][i] + " ");
                }
                rowEnd--;
                for (int i = rowEnd; i >= rowStart; i--) {
                    System.out.print(matrices[i][colStart] + " ");
                }
                colStart++;
        }
    }
}
