package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public final static String URL = "jdbc:mysql://localhost:3306/test";
    public final static String USER = "root";
    public final static String PASSWORD = "Lthgfhjkm_2014";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver Registration Error!!! " + e.getMessage());
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            connection.setAutoCommit(false);
        } catch (SQLException exception) {
            System.out.println("Connection error!!! " + exception.getMessage());
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    System.out.println("Close connection error!!! " + throwables.getMessage());
                }
            }
        }
        return connection;
    }
}
