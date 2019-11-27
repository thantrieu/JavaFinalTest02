package view;

import controller.BookCtrImp;
import dao.BookDAOImp;
import dao.DBConnection;
import dao.DocumentDAOImp;
import dao.MConnection;
import model.Book;
import model.Document;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void addBook() {
        var bookCtr = new BookCtrImp();
        var book = bookCtr.addFromKeyBoard();
        var bookDAOImp = new BookDAOImp();
        bookDAOImp.add(book);
    }

    public static void editBook() {
        var scanner = new Scanner(System.in);
        System.out.println("Nhập mã sách cần sửa: ");
        var id = scanner.nextLine();
        System.out.println("Nhập tên mới: ");
        var newTitle = scanner.nextLine();
        var bookDAOImp = new BookDAOImp();
        var book = new Book(id, "");
        book.setTitle(newTitle);
        var result = bookDAOImp.edit(book);
        if (result) {
            showMessage("Cập nhật thành công!");
        } else {
            showMessage("Cập nhật thất bại! Kiểm tra lại mã tài liệu!");
        }
    }

    public static void showMessage(String smg) {
        System.out.println(smg);
    }

    public static void removeBook() {
        //TODO: put your code here
        var scanner = new Scanner(System.in);
        System.out.println("Nhập mã tài liệu cần xóa: ");
        var id = scanner.nextLine();
        var bookDAOImp = new BookDAOImp();
        var result = bookDAOImp.remove(id);
        var documentDAOImp = new DocumentDAOImp();
        var result2 = documentDAOImp.remove(id);
        if (result && result2) {
            System.out.println("Xoá sách thành công!");
        } else {
            System.out.println("Sách không tồn tại hoặc sai mã sách!");
        }
    }

    public static void searchBook() {
        var scanner = new Scanner(System.in);
        System.out.println("Nhập tên sách cần tìm: ");
        var title = scanner.nextLine();
        var bookDAOImp = new BookDAOImp();
        var result = bookDAOImp.findByName(title);
        showResult(result);
    }

    public static void manageBook() {
        var choice = 0;
        var scanner = new Scanner(System.in);
        do {
            System.out.println("=========== CHỨC NĂNG QUẢN LÝ SÁCH ===========");
            System.out.println("1. Thêm mới một sách vào CSDL.");
            System.out.println("2. Sửa một sách theo mã sách.");
            System.out.println("3. Xóa một sách theo mã sách.");
            System.out.println("4. Tìm kiếm sách trong CSDL.");
            System.out.println("0. Thoát.");
            System.out.println("Xin mời chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // read out the line
            switch (choice) {
                case 0:
                    break;
                case 1:
                    addBook();
                    break;
                case 2:
                    editBook();
                    break;
                case 3:
                    removeBook();
                    break;
                case 4:
                    searchBook();
                    break;
                default:
                    System.out.println("Sai chức năng. Hãy chọn lại!");
                    break;
            }
        } while (choice != 0);
    }

    public static void manageReader() {

    }

    public static void manageBorrowing() {

    }

    public static void manageBill() {

    }

    public static void main(String[] args) {
        var choice = 0;
        var scanner = new Scanner(System.in);
        do {
            System.out.println("============== MENU ==============");
            System.out.println("1. Quản lý sách.");
            System.out.println("2. Quản lý bạn đọc.");
            System.out.println("3. Quản lý mượn.");
            System.out.println("4. Quản lý phiếu mượn.");
            System.out.println("0. Thoát.");
            System.out.println("Bạn chọn? ");
            choice = scanner.nextInt();
            scanner.nextLine(); // read out this line
            switch (choice) {
                case 0:
                    System.out.println("================ Xin cảm ơn! ================");
                    break;
                case 1:
                    manageBook();
                    break;
                case 2:
                    manageReader();
                    break;
                case 3:
                    manageBorrowing();
                    break;
                default:
                    System.out.println("Nhập lại chức năng!");
                    break;
            }
        } while (choice != 0);
    }

    private static void showResult(List<Document> books) {
        if (books.size() > 0) {
            for (var b : books) {
                System.out.println(b);
            }
        } else {
            System.out.println("Không có kết quả!");
        }
    }
}
