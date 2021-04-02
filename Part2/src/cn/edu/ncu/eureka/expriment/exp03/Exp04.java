package cn.edu.ncu.eureka.expriment.exp03;

import java.util.Scanner;

public class Exp04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int line;
        System.out.print("请输入行数：");
        line = scanner.nextInt();

        for (int i = 1; i <= line; i++)
        {
            //打印前面的空格
            for (int j = 1; j <= (line - i)*2; j++)
                System.out.print(" ");
            //打印数字
            for (int j = i; j >= 1; j--)
                System.out.printf("%d ",j);
            for (int j = 2; j <= i; j++)
                System.out.printf("%d ",j);
            //换行
            System.out.println();
        }
    }
}
