package com.afjcjsbx.eshop.persistence;

import java.sql.*;


public class DataSource {

    private static final String JDBC_CONNECTION_URL =
            "jdbc:mysql://localhost/mydb";

    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection != null)
            return connection;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String user = "root";
            String password = "trulli15";
            connection = DriverManager.getConnection(JDBC_CONNECTION_URL, user, password);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++)
            getConnection();
    }

}
