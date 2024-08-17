package patterns.pyramid;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        Pyramid pyramid = new Pyramid();
        pyramid.NumberIncreasePyramid(rows);
        pyramid.NumberDecreasePyramid(rows);
        pyramid.PrintZeroOne(rows);
        HalfPyramid.HalfPyramidPattern(rows);
    }
}
