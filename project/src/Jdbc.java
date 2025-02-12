import java.sql.*;

public class Jdbc {
    private static final String URL = "jdbc:mysql://localhost:3306/fee_report";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Optional: Close connection
    public static void closeConnection(Connection con) {
        try {
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
