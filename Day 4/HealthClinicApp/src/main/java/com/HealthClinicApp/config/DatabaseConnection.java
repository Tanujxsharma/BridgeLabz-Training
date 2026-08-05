package com.HealthClinicApp.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String url = "jdbc:mysql://localhost:3306/health_clinic_db?useSSL=false&serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "Tanuj@210600";
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
