package patterns.diamond;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt();
        DiamondPattern diamondPattern = new DiamondPattern();
        diamondPattern.DiamondShape(row);
    }
}

/*
Enter the number of rows: 5
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
*/