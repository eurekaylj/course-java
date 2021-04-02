package cn.edu.ncu.eureka.exercise.exe01;

public class Exe02 {
    public static void main(String[] args) {
        int codePoint = 0x1D307;
        char[] chars = Character.toChars(codePoint);
        String s = new String(chars);
        System.out.printf("%5s%s%s%6s%6s%5s%6s\n",s,s,s,s,s,s,s);
        System.out.printf("%7s%6s%3s%5s%4s%6s%2s\n",s,s,s,s,s,s,s);
        System.out.printf("%s%5s%5s%s%s%s%5s%3s%5s%s%s%s\n",s,s,s,s,s,s,s,s,s,s,s,s);
        System.out.printf("%4s%2s%5s%7s%5s%6s%6s\n",s,s,s,s,s,s,s);
    }
}
