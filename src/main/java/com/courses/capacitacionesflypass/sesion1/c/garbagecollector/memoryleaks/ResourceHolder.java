package com.courses.capacitacionesflypass.sesion1.c.garbagecollector.memoryleaks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ResourceHolder {
    private static Connection connection;

    public static void initializeConnection() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
    }

    /*public static void closeConnection() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }*/
}
