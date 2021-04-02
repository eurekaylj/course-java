package cn.edu.ncu.eureka.course01;

import java.util.Scanner;
import java.util.Random;

public class Test04 {
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] str = {"剪刀","石头","布"};
        int num1,num2;

        System.out.print("请出拳：剪刀（0）、石头（1）、布（2）\n");
        num1 = scanner.nextInt();
        num2 = random.nextInt(3);

        System.out.printf("本局中\n你出的是：%s\n电脑出的是：%s\n",str[num1],str[num2]);
        switch (num1-num2){
            case -1,2->System.out.print("你失败了！");
            case -2,1->System.out.print("你胜利了！");
            case 0->System.out.print("平局！");
        }
    }
}
