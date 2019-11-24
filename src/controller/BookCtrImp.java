package controller;

import model.Book;
import model.Document;

import java.util.Scanner;

public class BookCtrImp extends DocumentCtrImp {
    @Override
    public void show(Document document) {

    }

    @Override
    public Document addFromKeyBoard() {
        Book b = null;
        var scanner = new Scanner(System.in);
        System.out.println("Mã tài liệu: ");
        var dId = scanner.nextLine();
        System.out.println("Mã sách: ");
        var id = scanner.nextLine();
        System.out.println("Loại sách: ");
        var type = scanner.nextLine();
        System.out.println("Tiêu đề: ");
        var title = scanner.nextLine();
        System.out.println("Tác giả: ");
        var author = scanner.nextLine();
        System.out.println("Năm xuất bản: ");
        var plYear = Integer.parseInt(scanner.nextLine());
        System.out.println("Số lượng: ");
        var quantity = Integer.parseInt(scanner.nextLine());
        System.out.println();
        b = new Book(dId, title, plYear, author, quantity, id, type);
        return b;
    }
}
