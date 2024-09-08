package Matrices.search;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of row : ");
        int row = scanner.nextInt();
        System.out.print("Enter the number of column : ");
        int col = scanner.nextInt();
        int[][] matrices = new int[row][col];
        System.out.println("Enter the "+row*col+" elements : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrices[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Enter the search element : ");
        int search = scanner.nextInt();
        Search.searchElement(matrices,row,col,search);
    }
}
