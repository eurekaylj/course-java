package cn.edu.ncu.eureka.expriment.exp02;
import java.util.Scanner;

public class Exp04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double s,area;

        System.out.print("Enter the length of the side:\n");
        s = scanner.nextDouble();

        area = 3.0/2.0*Math.pow(3,0.5)*s*s;

        System.out.printf("The area of the hexagon is %.4f\n",area);
    }
}

