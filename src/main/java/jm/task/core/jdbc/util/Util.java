package jm.task.core.jdbc.util;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public final static String URL = "jdbc:mysql://localhost:3306/test";
    public final static String USER = "root";
    public final static String PASSWORD = "Lthgfhjkm_2014";

    public static Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new Driver());
        Connection connection;
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
        connection.setAutoCommit(false);
        return connection;
    }
}
