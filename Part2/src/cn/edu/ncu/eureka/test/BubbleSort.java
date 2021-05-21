package cn.edu.ncu.eureka.test;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    private static String[] array = new String[10];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入十个字符串");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.next();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i - 1; j++) {
                if (Greater(j,j+1)) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static boolean Greater(int j, int i) {
        return array[j].compareTo(array[i]) > 0;
    }
}
