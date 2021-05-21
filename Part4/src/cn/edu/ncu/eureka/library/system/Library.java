package cn.edu.ncu.eureka.library.system;

import cn.edu.ncu.eureka.library.books.Book;
import cn.edu.ncu.eureka.library.books.Cartoon;
import cn.edu.ncu.eureka.library.books.Fairytale;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Library {
    private StringBuilder information = new StringBuilder();
    private Book[] books;

    public Library() {
        this.books = new Book[200];
        initData();
    }

    public void initData() {
        Arrays.fill(books, null);
        for (int i = 0; i < 130; i++) {
            books[i] = new Fairytale("安徒生童话", String.format("NO_%d", (i + 1)),
                    "译林出版社", "安徒生", 28);
        }

        for (int i = 130; i < 160; i++) {
            books[i] = new Fairytale("一千零一夜", String.format("NO_%d", (i + 1)),
                    "人民文学出版社", "王瑞琴", 47);
        }

        for (int i = 160; i < 180; i++) {
            books[i] = new Cartoon("父与子", String.format("NO_%d", (i + 1)),
                    "浙江教育出版社", "卜劳恩", 39);
        }

        for (int i = 180; i < 200; i++) {
            books[i] = new Cartoon("小王子", String.format("NO_%d", (i + 1)),
                    "云南美术出版社", "圣埃克苏佩里", 36);
        }
    }

    public void setBooks() {
        String getBook = inputInfo("请输入所要归还的书名");
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
                information.append(inputInfo("请输入您的姓名")).append("  ").append(getBook).append("  借书 ").append(LocalDate.now()).append("\n");;
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
        System.out.printf("      【书名】     【ISBN】   【出版社】       【作者】" +
                "   【价格】      【购入日期】\n");
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
                    information.append(name).append("  ").append(borrow).append("  ").append("借书 ").append(LocalDate.now()).append("\n");
                    System.out.println("借书成功");
                    book.setAccessibility(false);
                    sign = true;
                    System.out.println(information.toString());
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
        System.out.println("【借书记录】\n" + information + '\n');
    }

    private String inputInfo(String text) {
        System.out.println(text);
        var input = new Scanner(System.in);
        return input.nextLine();
    }
}
