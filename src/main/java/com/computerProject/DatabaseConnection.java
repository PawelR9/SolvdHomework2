package com.computerProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/Device.sql";
    private static final String USER = "root";
    private static final String PASSWORD = "daniellosniak";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
            System.out.println("Connection to database successful!");

            statement = connection.createStatement();
            String sql = "SELECT * FROM Device";
            statement.executeQuery(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

