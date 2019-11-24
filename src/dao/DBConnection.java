package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    // db name, user, password, url
    private final String DBNAME = "FinalTest";
    private final String USER = "sa";
    private final String PASS = "123";
    private static DBConnection instance = new DBConnection();

    private DBConnection() {
    }

    public static DBConnection getInstance() {
        return instance;
    }

    public Connection getConnection() {
        var url = "jdbc:sqlserver://localhost:1433;databasename=" + DBNAME
                + ";user=" + USER + ";password=" + PASS + ";";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
