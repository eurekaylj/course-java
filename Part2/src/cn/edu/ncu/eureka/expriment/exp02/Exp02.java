package cn.edu.ncu.eureka.expriment.exp02;
import java.util.Scanner;

public class Exp02 {
    public static double det(double m1, double m2, double n1, double n2){
        return m1*n2 - m2*n1;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a,b,c,d,e,f,x,y,D;

        System.out.print("请输入第一个方程ax+by=e中的a、b、e\n");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        e = scanner.nextDouble();
        System.out.print("请输入第二个方程cx+dy=f中的c、d、f\n");
        c = scanner.nextDouble();
        d = scanner.nextDouble();
        f = scanner.nextDouble();

        D = det(a,b,c,d);
        x = det(e,b,f,d)/D;
        y = det(a,e,c,f)/D;

        System.out.printf("x = %.2f , y =  %.2f\n",x,y);
    }
}
