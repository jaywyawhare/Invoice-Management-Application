package com.highradius.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnector {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String url = "jdbc:mysql://localhost:3306/sales";
        String username = "arrry";
        String password = "unsecured-AF";

        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();

            String sqlQuery = "SELECT * FROM h2h_oap";
            resultSet = statement.executeQuery(sqlQuery);

            while (resultSet.next()) {
                int CUSTOMER_ORDER_ID = resultSet.getInt("CUSTOMER_ORDER_ID");
                System.out.println(CUSTOMER_ORDER_ID);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
