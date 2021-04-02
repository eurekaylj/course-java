package cn.edu.ncu.eureka.expriment.exp03;

import java.util.Random;

public class Exp03 {
    public static void main(String[] args){
        Random random = new Random();
        int t = random.nextInt(52);
        String[] figure = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] pattern = {"♡","♢","♤","♧"};
        System.out.printf("此次抽出的牌的花色是：%s，点数是%s",pattern[t/13],figure[t%13]);
    }
}
