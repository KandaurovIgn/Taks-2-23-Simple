package caledarKandaurov;

import java.util.Scanner;
import static caledarKandaurov.Calendar.initialCalendar;
import static caledarKandaurov.Calendar.showCalendar;

public class applyCalendar {

    public static void main(String[] args) {
        int month;
        int day;
        int[][] calendar;

        calendar = new int[12][31];
        initialCalendar(calendar);
        month = getMonth();
        day = getDay();
        showCalendar(calendar,month,day);
    }

    public static int getMonth()
    {
        int month;
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.print("Введите месяц:");
            month = in.nextInt();
            if(month > 0 && month < 32)
                return month;
            else
            {
                System.out.println("Ошибка Ввода!");
            }
        }
    }

    public static int getDay()
    {
        int day;
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.print("Введите день:");
            day = in.nextInt();
            if(day > 0 && day < 32)
            return day;
            else
            {
                System.out.println("Ошибка Ввода!");
            }
        }
    }
}