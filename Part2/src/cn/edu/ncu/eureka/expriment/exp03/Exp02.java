package cn.edu.ncu.eureka.expriment.exp03;

import java.util.Scanner;

public class Exp02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double r1,r2;
        Point p1 = new Point();
        Point p2 = new Point();

        System.out.print("请输入第一个圆的中心坐标和半径值（X、Y、R）\n");
        p1.x = scanner.nextDouble();
        p1.y = scanner.nextDouble();
        r1 = scanner.nextDouble();
        System.out.print("请输入第一个圆的中心坐标和半径值（X、Y、R）\n");
        p2.x = scanner.nextDouble();
        p2.y = scanner.nextDouble();
        r2 = scanner.nextDouble();

        double l = p1.getDistance(p2);
        double dr = Math.abs(r1-r2);
        double ar = Math.abs(r1+r2);

        if (l>=0 && l<=dr)
            System.out.print("第二个圆在第一个圆内\n");
        else if (l<=ar)
            System.out.print("第二个圆和第一个圆重叠\n");
        else
            System.out.print("第二个圆在第一个圆外\n");
    }
}

class Point{
    double x;
    double y;
    public double getDistance(Point p){
        return Math.sqrt((p.x-x)*(p.x-x)+(p.y-y)*(p.y-y));
    }
}

