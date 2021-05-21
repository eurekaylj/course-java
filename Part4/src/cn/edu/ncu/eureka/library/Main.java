package cn.edu.ncu.eureka.library;

import cn.edu.ncu.eureka.library.system.Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        int step;
        do {
            menu();
            var input = new Scanner(System.in);
            step = input.nextInt();
            Separate();
            switch (step) {
                case 1 -> {
                    library.borrowBooks();
                    back();
                }
                case 2 -> {
                    library.setBooks();
                    back();
                }
                case 3 -> {
                    library.display();
                    back();
                }
                case 4 -> {
                    library.ShowInfo();
                    back();
                }
                case 5 -> {
                    System.out.println("再见！");
                }
                default -> {
                    System.out.println("输入有误，请重试！");
                    back();
                }
            }
        } while (step != 5);

    }

    public static void menu() {
        System.out.println("【图书管理系统】（V1.0  By Eureka）");
        System.out.println("请选择您的业务：");
        System.out.println("1.借书");
        System.out.println("2.还书");
        System.out.println("3.显示图书馆书籍信息");
        System.out.println("4.显示借书信息");
        System.out.println("5.退出系统");
    }

    public static void back() {
        System.out.println("-->输入'#'返回主菜单");
        String judge;
        do {
            var input = new Scanner(System.in);
            judge = input.nextLine();
        } while (!judge.equals("#"));
        Separate();
    }

    public static void Separate() {
        System.out.println("--------------------------");
    }
}
