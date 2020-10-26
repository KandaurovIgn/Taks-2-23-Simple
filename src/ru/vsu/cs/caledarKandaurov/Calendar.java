package caledarKandaurov;

public class Calendar {

   static public void initialCalendar(final int[][] calendar) {
        int monthCounter = 1;
        int dayCounter = 3;

        for (int y = 0; y < 12; y++) {
            for (int x = 0; x < 31; x++) {
                if (dayCounter == 6 || dayCounter == 7)
                    calendar[y][x] = 0;//Выходной
                else
                    calendar[y][x] = 1;//Рабочий день
                if((monthCounter == 2) && (x == 29)) {
                    calendar[y][29] = 3;
                    calendar[y][30] = 3;
                    break;
                }
                if ((monthCounter == 4 || monthCounter == 6 || monthCounter == 9 || monthCounter == 11) && (x == 30)) {
                    calendar[y][x] = 3;
                    break;
                }
                dayCounter++;
                if (dayCounter == 8) {
                    dayCounter = 1;
                }
            }
            monthCounter++;
        }

        for(int x = 0; x < 8; x++)
        {
            calendar[0][x] = 0;
        }
        calendar[1][23] = 0;
        calendar[2][8] = 0;
       calendar[4][3] = 0;
       calendar[4][4] = 0;
       calendar[4][10] = 0;
       calendar[5][11] = 0;
       calendar[5][3] = 0;
    }

    static public void showCalendar(final int[][] calendar, int month, int day)
    {
        System.out.print("Месяц "+month);
        System.out.print(" День "+day);
        System.out.print(" Статус:");
        System.out.println(calendar[--month][--day]);
    }
}
