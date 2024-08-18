package patterns.rhombus;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt();
        Rhombus.RhombusPattern(row);
        HollowRhombus hollowRhombus = new HollowRhombus();
        hollowRhombus.Hollow_Rhombus(row);
    }
}
