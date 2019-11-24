package view;

import controller.BookCtrImp;
import dao.BookDAOImp;
import dao.DBConnection;
import dao.MConnection;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
       var connection = MConnection.getInstance().getConnection();
       var sql = "SELECT * FROM dbo.Document";
        try {
            var result = connection.prepareStatement(sql);
            var resultSet = result.executeQuery();
            while(resultSet.next()) {
                System.out.println(resultSet.getString("ID"));
                System.out.println(resultSet.getString("Title"));
                System.out.println(resultSet.getInt("PublishedYear"));
                System.out.println(resultSet.getInt("Quantity"));
                System.out.println(resultSet.getString("Author"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
