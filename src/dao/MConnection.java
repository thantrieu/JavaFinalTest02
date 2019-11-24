package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MConnection {
    private final String DBNAM = "FinalTest";   // replace with your db name
    private final String USER = "sa";           // replace width your user name
    private final String PASS = "123";          // replace width your password
    private final String MURL = "jdbc:sqlserver://localhost:1433;"; // keep origin

    private static MConnection instance = new MConnection(); // singleton parttern

    private MConnection(){} // must be private

    public static MConnection getInstance() { // singleton parttern
        return instance;
    }

    public Connection getConnection() {
        Connection conn = null;
        var url = MURL + "databasename=" + DBNAM + ";user=" + USER
                + ";password=" + PASS + ";";
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
