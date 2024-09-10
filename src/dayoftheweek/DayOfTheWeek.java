package dayoftheweek;

public class DayOfTheWeek {
    public static String dayOfTheWeek(int day, int month, int year){
        String nameOfDay = "";
        int[] arr = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if(month<3)
            year-=1;
        int result = (year+year/4-year/100+year/400+arr[month-1]+day)%7;
        switch (result){
            case 1:
                nameOfDay = "Monday";
                break;
            case 2:
                nameOfDay = "Tuesday";
                break;
            case 3:
                nameOfDay = "Wednesday";
                break;
            case 4:
                nameOfDay = "Thursday";
                break;
            case 5:
                nameOfDay = "Friday";
                break;
            case 6:
                nameOfDay = "Saturday";
                break;
            case 0:
                nameOfDay = "Sunday";
                break;
            default:
        }
        return nameOfDay;
    }
}
