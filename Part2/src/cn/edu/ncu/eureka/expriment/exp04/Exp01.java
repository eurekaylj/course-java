package cn.edu.ncu.eureka.expriment.exp04;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exp01 {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入十个数字：");

        for (int i = 0; i < 10; i++){
            set.add(scanner.nextInt());
        }
        Integer[] array = set.toArray(new Integer[0]);
        Arrays.sort(array);

        System.out.println("不相同的数的数目为："+set.size());
        System.out.println("这些数字分别为：");
        for (Integer integer : array) {
            System.out.print(integer + " ");
        }
    }
}


