package cn.edu.ncu.eureka.test;

import java.math.BigInteger;

public class BigNumber {
    public static void main(String[] args){
        //非递归
        System.out.println(calculate0(100));
        //递归
        System.out.println(calculate1(100));
    }

    public static BigInteger calculate0(int value){
        //出口，2^1+1
        if (value == 1)
            return (new BigInteger("3"));

        //递归，2^value+1
        BigInteger num = new BigInteger("2");
        num = num.pow(value);
        num = num.add(new BigInteger("1"));
        return num.multiply(calculate0(value-1));
    }

    public static BigInteger calculate1 (int value){
        BigInteger num = new BigInteger("1");
        for (int i = 1; i <= value; i++)
        {
            BigInteger temp = new BigInteger("2");
            temp = temp.pow(i);
            temp = temp.add(new BigInteger("1"));
            num = num.multiply(temp);
        }
        return num;
    }

}
