import java.util.Scanner;

public class dateWeek {
    private static final Scanner scan = new Scanner(System.in);
    private static  String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday","Friday", "Saturday" };

    public static void main(String[] args) {
        int year = getYear();
        int finalDate = 0;
        int month = getMonth();
        int date = getDate();

        int totalYdays = getPreviousYearDaysSum(year);
        int totalMdaysinGivenYear = monthDays(month, year);

        if (date > 29 && month == 2)
            System.out.println("Invalid Date");
        else if (month == 2 && date == 29 && isItLeapYear(year)) {
            finalDate = date;
            getFinalResult(totalMdaysinGivenYear, finalDate,totalYdays);
        }
        else if (date < 32 && date > 0 && month != 2) {
            finalDate = date;
            getFinalResult(totalMdaysinGivenYear, finalDate,totalYdays);
        }
        else if (date < 29 && date > 0 && month == 2 && !isItLeapYear(year)) {
            finalDate = date;
            getFinalResult(totalMdaysinGivenYear, finalDate,totalYdays);
        }
    }


    public static void getFinalResult(int totalMdaysinGivenYear, int fDate, int totalYdays){
        int day = ((totalMdaysinGivenYear+totalYdays+ fDate -3) % 7) ;//'-3' since the Year '1971' starts on Friday intead of Monday
        System.out.println(weekDays[day]);

    }




    public static int monthDays(int month, int year) {
        int monthTotalDays = 0;
        for (int i = 1; i < month; i++) {
            if (i == 4 || i == 6 || i == 9 || i == 11)
                monthTotalDays += 30;
            else if ((i == 2) && (isItLeapYear(year)))
                monthTotalDays += 29;
            else if((i == 2) && (!isItLeapYear(year)))
                monthTotalDays += 28;
            else
                monthTotalDays += 31;

        }
        return monthTotalDays;
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

    public static int getYear() {
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

    public static int getPreviousYearDaysSum(int year) {
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
