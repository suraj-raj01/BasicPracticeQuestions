package patterns.hollowrectangle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter the number of column: ");
        int column = scanner.nextInt();
        HollowRectangle.Hollow_Rectangle(row,column);
    }
}

/*
Enter the number of rows: 5
Enter the number of column: 5
* * * * *
*       *
*       *
*       *
* * * * *
*/