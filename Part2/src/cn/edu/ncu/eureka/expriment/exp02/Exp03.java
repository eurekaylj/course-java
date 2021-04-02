package cn.edu.ncu.eureka.expriment.exp02;
import java.util.Scanner;

public class Exp03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int minutes,days,years;

        System.out.print("请输入分钟数：\n");
        minutes = scanner.nextInt();

        days = minutes/1440 + (minutes%1440 != 0?1:0);//不足一天按一天计算
        years = days/365 + (days%365 != 0?1:0);//不足一年按一年计算

        System.out.printf("%d分钟代表%d天（不足一天按一天计算），%d年（不足一年按一年计算）\n",minutes,days,years);
    }
}
