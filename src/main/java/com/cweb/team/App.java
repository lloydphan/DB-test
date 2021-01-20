package com.cweb.team;

import java.sql.Connection;
import java.sql.DriverManager;

public class App {
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://10.112.224.218:1433;databaseName=testDB;user=CWEB;password=Pass1234!";
        try {
            // Load SQL Server JDBC driver and establish connection.
            System.out.print("Connecting to SQL Server ... \n");
            try (Connection connection = DriverManager.getConnection(connectionUrl)) {
                System.out.println("Connected.");
            }
        } catch (Exception e) {
            System.out.println("Can not connect");
        }
    }
}
