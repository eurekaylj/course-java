package cn.edu.ncu.eureka.expriment.exp04;

import java.util.Random;

public class Exp03 {
    public static void main(String[] args){
        Random random = new Random();
        String[] points = {"A","1","2","3","4","5",
                "6","7", "8","9","10","J","Q","K"};
        String[] suits = {"♥","♦","♠","♣"};
        int[] cards = new int[4];//记录抽到的牌的花色和点数
        boolean[] state = new boolean[4];//记录四种花色是否被选择了
        int times = 0;//选取的次数
        int flag = 0;//循环终止信号
        while (flag<4){
            times++;
            int n = random.nextInt(52);
            if (state[n/13])
                continue;
            state[n/13] = true;
            cards[flag++] = n;
        }
        for (int i = 0; i < 4; i++){
            System.out.println(suits[cards[i]/13]+" "+points[cards[i]%13]);
        }
        System.out.println("选取的次数为："+times);
    }
}

