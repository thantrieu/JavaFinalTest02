package controller;

import model.Document;

import java.util.Scanner;

public class DocumentCtrImp implements Ctr<Document> {
    private boolean checkID(String id) {
        var regex = "^DOC_\\d{6}$";
        if(id.matches(regex)) {
            return true;
        }
        return false;
    }

    @Override
    public void show(Document document) {
        System.out.println(document);
    }

    @Override
    public Document addFromKeyBoard() {
        var id = "";
        //DOC_012345
        var scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập mã tài liệu: (DOC_xxxxxx; ví dụ: DOC_012345)");
            id = scanner.nextLine();
        } while(!checkID(id));
        System.out.println("Tiêu đề: ");
        var title = scanner.nextLine();
        System.out.println("Tác giả: ");
        var author = scanner.nextLine();
        var isOk = false;
        var pYear = 0;
        var quantity = 0;
        do{
            try{
                System.out.println("Năm xuất bản: ");
                pYear = Integer.parseInt(scanner.nextLine());
                System.out.println("Số lượng: ");
                quantity = Integer.parseInt(scanner.nextLine());
                isOk = true;
            } catch (Exception e) {
                System.out.println("Nhập sai số lượng hoặc năm xuất bản");
//                e.printStackTrace();
            }
        } while(!isOk);
        Document d = new Document(id, title, pYear, author, quantity);
        return d;
    }
}
