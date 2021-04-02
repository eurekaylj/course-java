package cn.edu.ncu.eureka.expriment.exp04;

import java.util.Scanner;

public class Exp02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[101];
        int x;

        System.out.println("输入1~100之间的整数,输入0表示结束：");
        do {
            x = scanner.nextInt();
            array[x]++;
        }
        while (x != 0);

        for (int i = 1; i < 101; i++){
            if (array[i] != 0)
                System.out.printf("%d出现%d次\n",i,array[i]);
        }
    }
}

