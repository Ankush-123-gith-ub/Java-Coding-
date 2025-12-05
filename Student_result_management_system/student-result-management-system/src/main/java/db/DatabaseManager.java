package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseManager {

    private static final String URL  = "jdbc:mysql://localhost:3306/school";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            System.out.println("DB Connection Error: " + e.getMessage());
            return null;
        }
    }
}
