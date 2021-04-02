package cn.edu.ncu.eureka.expriment.exp03;

import java.util.Scanner;

public class Exp01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.print("请输入一个年份：\n");
        year = scanner.nextInt();
        var zodiac = switch (year%12){
            case 0->"猴";
            case 1->"鸡";
            case 2->"狗";
            case 3->"猪";
            case 4->"鼠";
            case 5->"牛";
            case 6->"虎";
            case 7->"兔";
            case 8->"龙";
            case 9->"蛇";
            case 10->"马";
            case 11->"羊";
            default -> throw new IllegalStateException("Unexpected value: " + year % 12);
        };
        System.out.printf("%d年对应的生肖为：%s\n",year,zodiac);
    }
}
