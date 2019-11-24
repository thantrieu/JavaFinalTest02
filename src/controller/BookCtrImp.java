package controller;

import model.Book;
import model.Document;

import java.util.Scanner;

public class BookCtrImp extends DocumentCtrImp {
    private boolean isIdValid(String id) {
        var regex = "^DCMT_\\d{6}$";
        return id.matches(regex);
    }

    @Override
    public void show(Document document) {

    }

    @Override
    public Document addFromKeyBoard() {
        var doc = super.addFromKeyBoard();
        var bId = "";
        var scanner = new Scanner(System.in);
        while(!isIdValid(bId)) {
            System.out.println("Nhập mã sách dạng DCMT_xxxxxx, vd: DCMT_123456");
            bId = scanner.nextLine();
        }
        var choice = 0;
        String kinds[] = {"Khoa học", "Nghệ thuật", "Kinh tế", "Ẩm thực", "CNTT"};
        do{
            System.out.println("Nhập loại sách: ");
            System.out.println("1. Khoa học");
            System.out.println("2. Nghệ thuật");
            System.out.println("3. Kinh tế");
            System.out.println("4. Ẩm thực");
            System.out.println("5. Công nghệ TT");
            choice = scanner.nextInt();
            if(choice > 0 && choice < 6) {
                break;
            }
        } while(true);

        var typeOfBook = kinds[choice];
        Book book = new Book(doc.getId(), doc.getTitle(), doc.getPublishedYear(),
                doc.getAuthor(), doc.getQuantity(), bId, typeOfBook);
        //String id, String title, int publishedYear,
        //                String author, int quantity, String id1, String type
        return book;
    }
}
