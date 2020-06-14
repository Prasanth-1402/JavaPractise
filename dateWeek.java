import java.util.Scanner;

public class dateWeek {
    private static final Scanner scan = new Scanner(System.in);
    private static  String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday","Friday", "Saturday" };

    public static void main(String[] args) {
        int year = getyear();
        int finaldate = 0;
        int month = getMonth();
        int date = getDate();

        int totalYdays = previousyeardaysSum(year);
        int totalMdaysinGivenYear = monthdays(month, year);

        if (date > 29 && month == 2)
            System.out.println("Invalid Date");
        else if (month == 2 && date == 29 && isItLeapYear(year)) {
            finaldate = date;
            finalresult(totalMdaysinGivenYear,finaldate,totalYdays);
        }
        else if (date < 32 && date > 0 && month != 2) {
            finaldate = date;
            finalresult(totalMdaysinGivenYear,finaldate,totalYdays);
        }
    }


    public static void finalresult(int totalMdaysinGivenYear, int fdate, int totalYdays){
        int day = ((totalMdaysinGivenYear+totalYdays+fdate-3) % 7) ;//'-3' since the Year '1971' starts on Friday intead of Monday
        System.out.println(weekdays[day]);

    }




    public static int monthdays(int month, int year) {
        int monthtdays = 0;
        for (int i = 1; i < month; i++) {
            if (i == 4 || i == 6 || i == 9 || i == 11)
                monthtdays += 30;
            else if ((i == 2) && (isItLeapYear(year)))
                monthtdays += 29;
            else if((i == 2) && (!isItLeapYear(year)))
                monthtdays += 28;
            else
                monthtdays += 31;

        }

        return monthtdays;
    }


    public static int getDate() {
        int date = scan.nextInt();
        return date;
        }

    public static int getMonth() {
        int month = scan.nextInt();
        if (month < 13 && month > 0) return month;
        return Integer.parseInt(null);
    }

    public static int getyear() {
        int year = scan.nextInt();
        if (year > 1970 && year < 2101) return year;
        return Integer.parseInt(null);
    }

    public static boolean isItLeapYear(int year) {
        if (year % 4 == 0)
            if (year % 100 == 0)
                return true;
            else
                return year % 400 != 0;
        return false;
    }

    public static int previousyeardaysSum(int year) {
        int totaldays = 0;
        for (int start = 1971; start < year; start++) {
            if(!isItLeapYear(start)){
            totaldays += 365;
            }
            else if (isItLeapYear(start)) {
                totaldays += 366;
            }
        }
        return totaldays;

    }
}