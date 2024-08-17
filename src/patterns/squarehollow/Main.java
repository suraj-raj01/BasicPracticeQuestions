package patterns.squarehollow;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter the number of column: ");
        int column = scanner.nextInt();
        SquareHollow squareHollow = new SquareHollow();
        squareHollow.pattern(row,column);
    }
}

/*
Enter the number of rows: 7
Enter the number of columns: 7
*******
*     *
*     *
*     *
*     *
*     *
*******
*/