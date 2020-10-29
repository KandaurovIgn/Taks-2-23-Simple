package task223;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int month;
        int day;

        month = getMonth();
        day = getDay();
        showDayStatus(month, day);
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

    public static void showDayStatus(int month, int day) {
        boolean dayWeekend;

        dayWeekend = isDayWeekend(month, day);
        System.out.print("Month " + month);
        System.out.print(" Day " + day);
        if (dayWeekend == true) {
            System.out.print(" Weekend");
        } else
            System.out.print(" Work day");
    }

    public static boolean isDayWeekend(int month, int day) {
        if (month == 1 && (day == 1 || day == 2 || day == 3 || day == 4 || day == 5 || day == 6 || day == 7 || day == 8 || day == 11 || day == 12 || day == 18 || day == 19 || day == 25 || day == 26)) {
            return true;
        }
        if (month == 2 && (day == 1 || day == 2 || day == 8 || day == 9 || day == 15 || day == 16 || day == 22 || day == 23 || day == 24 || day == 29)) {
            return true;
        }
        if (month == 3 && (day == 1 || day == 7 || day == 8 || day == 9 || day == 14 || day == 15 || day == 21 || day == 22 || day == 28 || day == 29)) {
            return true;
        }
        if (month == 4 && (day == 4 || day == 5 || day == 11 || day == 12 || day == 18 || day == 19 || day == 25 || day == 26)) {
            return true;
        }
        if (month == 5 && (day == 1 || day == 2 || day == 3 || day == 4 || day == 5 || day == 9 || day == 10 || day == 11 || day == 16 || day == 17 || day == 23 || day == 24 || day == 30 || day == 31)) {
            return true;
        }
        if (month == 6 && (day == 6 || day == 7 || day == 12 || day == 13 || day == 14 || day == 20 || day == 21 || day == 27 || day == 28)) {
            return true;
        }
        if (month == 7 && (day == 4 || day == 5 || day == 11 || day == 12 || day == 18 || day == 19 || day == 25 || day == 26)) {
            return true;
        }
        if (month == 8 && (day == 1 || day == 2 || day == 8 || day == 9 || day == 15 || day == 16 || day == 22 || day == 23 || day == 29 || day == 30)) {
            return true;
        }
        if (month == 9 && (day == 5 || day == 6 || day == 12 || day == 13 || day == 19 || day == 20 || day == 26 || day == 27)) {
            return true;
        }
        if (month == 10 && (day == 3 || day == 4 || day == 10 || day == 11 || day == 17 || day == 18 || day == 24 || day == 25 || day == 31)) {
            return true;
        }
        if (month == 11 && (day == 1 || day == 4 || day == 7 || day == 8 || day == 14 || day == 15 || day == 21 || day == 22 || day == 28 || day == 29)) {
            return true;
        }
        if (month == 12 && (day == 5 || day == 6 || day == 12 || day == 13 || day == 19 || day == 20 || day == 26 || day == 27)) {
            return true;
        } else
            return false;
    }
}
