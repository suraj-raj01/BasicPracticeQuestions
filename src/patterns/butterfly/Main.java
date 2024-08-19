package patterns.butterfly;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\"Enter the number of rows:\" ");
        int row = scanner.nextInt();
        ButterflyShape butterflyShape = new ButterflyShape();
        butterflyShape.ButterFly(row);
    }
}

/*
Enter the number of rows: 5
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *
*/