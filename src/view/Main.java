package view;

import controller.BookCtrImp;
import dao.BookDAOImp;
import dao.DBConnection;
import dao.MConnection;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
       var bookCtr = new BookCtrImp();
       var book = bookCtr.addFromKeyBoard();
        System.out.println(book);
    }

    private static void showResult(ResultSet resultSet) {
        try {
            while (resultSet.next()) {
                var id = resultSet.getString("ID");
                var title = resultSet.getString("Title");
                var pYear = resultSet.getInt("PublishedYear");
                var quan = resultSet.getInt("Quantity");
                var author = resultSet.getString("Author");
                System.out.println(id + " " + title + " " + pYear + " " + quan + " " + author);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
