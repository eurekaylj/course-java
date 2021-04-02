package cn.edu.ncu.eureka.calendar;

import java.time.LocalDate;

public class Calendar {

    /**
     * 判断闰年
     * @param year 年
     * @return 是否闰年
     */
    public boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    /**
     * 获得某年某月的天数
     * @param year 年
     * @param month 月
     * @return 天数
     */
    public int getDays(int year, int month) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> (isLeapYear(year)) ? 29 : 28;
            default -> 30;
        };
    }

    /**
     * 获得某年某月第一天的星期数
     * @param year 年
     * @param month 月
     * @return 第一天星期数
     */
    public int getFirstWeek(int year, int month) {
        LocalDate date = LocalDate.of(year, month, 1);
        return date.getDayOfWeek().getValue();
    }

    /**
     * 打印某年年历
     * @param year 年
     */
    public void print(int year) {
        System.out.printf("%10s年\n", year);
        for (int month = 1; month < 13; month++) {
            System.out.printf("\n%10s月\n", month);
            System.out.println("\n日 一  二  三  四  五   六");
            int firstWeek = getFirstWeek(year, month);
            System.out.printf("%" + (firstWeek * 3) + "s", " ");
            for (int day = 1; day < getDays(year, month); day++) {
                if ((day + firstWeek - 1) % 7 == 0)
                    System.out.println();
                System.out.printf("%3d", day);
            }
        }
    }

    /**
     * 获得某年某月月历
     * @param year 年
     * @param month 月
     * @return 月历
     */
    public String getCalendarStr(int year, int month) {
        int firstDay = getFirstWeek(year, month);

    }
}