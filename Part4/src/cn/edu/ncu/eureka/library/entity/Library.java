package cn.edu.ncu.eureka.library.entity;

import cn.edu.ncu.eureka.library.books.Book;
import cn.edu.ncu.eureka.library.books.Cartoon;
import cn.edu.ncu.eureka.library.books.Fairytale;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Library {
    private Book[] books;
    private StringBuffer info = new StringBuffer();

    public Library() {
        this.books = new Book[200];
        initData();
    }


    /**
     * 初始化图书馆信息
     */
    public void initData() {
        Arrays.fill(books, null);
        for (int i = 0; i < 5; i++) {
            books[i] = new Fairytale(String.format("格林童话_%d", (i + 1)), String.format("NO_%d", (i + 1)),
                    "人民出版社", "雅可布·格林，威廉·格林兄弟", 24);
        }

        for (int i = 5; i < 10; i++) {
            books[i] = new Fairytale(String.format("大闹天宫_%d", (i + 1)), String.format("NO_%d", (i + 1)),
                    "云南美术出版社", "李克弱，万籁鸣", 24);
        }
    }


    public void setBooks() {
        String getBook = inputInfo("请输入所存书的基本信息(以‘，’分隔)：");
        var temp = getBook.split(",");

        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                if (isCartoon()) {
                    books[i] = new Cartoon(temp[0], temp[1], temp[2], temp[3], Double.parseDouble(temp[4]));
                    break;
                } else
                    books[i] = new Fairytale(temp[0], temp[1], temp[2], temp[3], Double.parseDouble(temp[4]));
                break;
            } else if (books[i].getName().equals(temp[0])) {
                books[i].setAccessibility(true);
                info.append(inputInfo("请输入您的姓名")).append("已还书").append("\n");
                System.out.println("还书成功！");
                break;
            }
        }
    }

    private boolean isCartoon() {
        String getBook = inputInfo("请输入所存书的种类（童话或漫画）：");
        return getBook.equals("漫画");
    }


    private boolean isConsumed(Book book) {

        return book.currentPrice() <= 0;
    }

    public void display() {
        for (Book book : books) {
            if (book != null) {
                if (isConsumed(book))
                    book = null;
                else
                    System.out.println(book.toString());
            }
        }
    }

    public void borrowBooks() {
        boolean sign = true;
        var borrow = inputInfo("请输入需要借的书名");
//        book.getName().equals(borrow)
        for (Book book : books) {
            if (book != null) {
                if (borrow.equals(book.getName()) && book.isAccessibility()) {
                    String name = inputInfo("请输入您的姓名：");
                    info.append(name).append("  ").append(borrow).append("  ").append("借书 ").append(LocalDate.now()).append("\n");
                    System.out.println("借书成功");
                    book.setAccessibility(false);
                    sign = true;
                    System.out.println(info.toString());
                    break;
                } else if (!book.getName().equals(borrow)) {
                    sign = false;
                } else {
                    System.out.printf("%s已经被借走%n", borrow);
                    break;
                }
            }
        }

        if (!sign)
            System.out.println("查无此书");

    }


    public void ShowInfo() {
        System.out.println("借书记录：\n" + "借书人信息 ：" + info + '\n');
    }

    private String inputInfo(String text) {
        System.out.println(text);
        var input = new Scanner(System.in);
        return input.nextLine();
    }
}
