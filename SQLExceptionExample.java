package ExceptionHandlings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class SQLExceptionExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompting the user for database connection details
            System.out.println("Enter the database URL (e.g., jdbc:mysql://localhost:3306/testdb):");
            String dbUrl = scanner.nextLine();

            System.out.println("Enter the database username:");
            String username = scanner.nextLine();

            System.out.println("Enter the database password:");
            String password = scanner.nextLine();

            // Attempting to connect to the database
            try (Connection connection = DriverManager.getConnection(dbUrl, username, password)) {
                System.out.println("Connection successful!");
            } catch (SQLException e) {
                // Handling SQLException when database connection fails
                System.out.println("SQLException: Unable to connect to the database.");
                System.out.println("Error Message: " + e.getMessage());
                System.out.println("SQL State: " + e.getSQLState());
                System.out.println("Error Code: " + e.getErrorCode());
            }
        }
    }
}
