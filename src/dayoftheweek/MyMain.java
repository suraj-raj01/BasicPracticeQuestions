package dayoftheweek;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day : ");
        int day = scanner.nextInt();
        System.out.print("Enter the month : ");
        int month = scanner.nextInt();
        System.out.print("Enter the year : ");
        int year = scanner.nextInt();
        System.out.println(DayOfTheWeek.dayOfTheWeek(day, month, year));
    }
}

/*
Enter the day : 9
Enter the month : 9
Enter the year : 2024
Monday
*/