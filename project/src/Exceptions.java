import java.sql.*;

public class Exceptions {
    public static void handleSQLException(SQLException e) {
        System.out.println("SQL Exception: " + e.getMessage());
    }

    public static void handleInputValidationError(String message) {
        System.out.println("Input Validation Error: " + message);
    }
}
