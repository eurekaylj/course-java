package cn.edu.ncu.eureka.calendarByGUI;

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

    public String getCalendar(int year,int month){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n    日   一   二    三    四   五   六\n");
        int firstWeek = getFirstWeek(year, month);
        stringBuilder.append(" ".repeat(firstWeek*7));
        for (int day = 1; day <= getDays(year, month); day++) {
            if ((day + firstWeek - 1) % 7 == 0)
                stringBuilder.append("\n");
            if (day>9)
                stringBuilder.append("   %d".formatted(day));
            else
                stringBuilder.append("     %d".formatted(day));
        }
        return stringBuilder.toString();
    }
}