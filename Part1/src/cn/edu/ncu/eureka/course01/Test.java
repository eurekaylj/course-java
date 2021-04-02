package cn.edu.ncu.eureka.course01;

import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        String string = "\u3000Hello\u3000";
        System.out.println(string.strip()); // "Hello"
        System.out.println(string.stripLeading()); // "Hello "
        System.out.println(string.stripTrailing()); // " Hello"
    }
}