package Matrices;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of row : ");
        int row = scanner.nextInt();
        System.out.print("Enter the number of column : ");
        int col = scanner.nextInt();
        int[][] matrices = new int[row][col];
        // for input data
        if(row<=col) {
            System.out.println("Enter the " + row * col + " element : ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    matrices[i][j] = scanner.nextInt();
                }
            }
        SpiralOrder.spiralOrder(matrices,row,col);
        }else{
            System.out.println("row should be less than column");
        }
    }
}

/*
Enter the number of row : 3
Enter the number of column : 3
1 2 3
8 9 4
7 6 5
Spiral Order Matrices : 1 2 3 4 5 6 7 8 9
*/