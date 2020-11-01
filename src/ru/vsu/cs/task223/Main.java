package task223;

import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        int year;
        int month;
        int day;
        Calendar c1;

        year = getYear();
        month = getMonth();
        day = getDay();
        c1 = new GregorianCalendar(year, --month, day);//Так как месяцы идут с 0
        showDayStatus(c1);
    }

    public static int getDay() {
        int day;
        Scanner s1 = new Scanner(System.in);

        while (true) {
            System.out.print("Input day:");
            day = s1.nextInt();
            if (day < 1 || day > 31) {
                System.out.println("Input error! 0 < day < 32");
                continue;
            } else
                break;
        }
        return day;
    }

    public static int getMonth() {
        int month;
        Scanner s1 = new Scanner(System.in);

        while (true) {
            System.out.print("Input month:");
            month = s1.nextInt();
            if (month < 1 || month > 12) {
                System.out.println("Input error! 0 < month < 13");
                continue;
            } else
                break;
        }
        return month;
    }

    public static int getYear() {
        int year;
        Scanner s1 = new Scanner(System.in);

        while (true) {
            System.out.print("Input year:");
            year = s1.nextInt();
            if (year < 2001 || year > 3000) {
                System.out.println("Input error! 2000 < year < 3001");
                continue;
            } else
                break;
        }
        return year;
    }

    public static void showDayStatus(Calendar cal) {
        boolean dayWeekend;
        boolean dayHoliday;

        System.out.print(cal.get(Calendar.YEAR));
        System.out.print('/');
        System.out.print(cal.get(Calendar.MONTH) + 1);
        System.out.print('/');
        System.out.print(+cal.get(Calendar.DAY_OF_MONTH));
        System.out.print(' ');
        System.out.print('-');
        dayWeekend = isDayWeekend(cal);
        dayHoliday = isDayHoliday(cal);
        if (dayWeekend == true) {
            System.out.print(" Weekend");
            return;
        }
        if (dayHoliday == true) {
            System.out.print(" Holiday");
            return;
        } else
            System.out.print(" Work day");
    }

    public static boolean isDayWeekend(Calendar cal) {
        if (cal.get(Calendar.DAY_OF_WEEK) == 1 || cal.get(Calendar.DAY_OF_WEEK) == 7)
            return true;
        else
            return false;
    }

    public static boolean isDayHoliday(Calendar cal) {
        int month;
        int day;

        month = cal.get(Calendar.MONTH);
        day = cal.get(Calendar.DAY_OF_MONTH);
        if ((month == 0) && (day == 1 || day == 2 || day == 3 || day == 6 || day == 7 || day == 8))
            return true;
        if ((month == 1) && (day == 24))
            return true;
        if ((month == 2) && (day == 9))
            return true;
        if ((month == 4) && (day == 1 || day == 4 || day == 5 || day == 11))
            return true;
        if ((month == 5) && (day == 12))
            return true;
        if ((month == 10) && (day == 4))
            return true;
        else
            return false;
    }
}
