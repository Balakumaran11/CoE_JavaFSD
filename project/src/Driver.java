import java.sql.*;

public class Driver {
    public static void main(String[] args) throws SQLException {
        // Sample Usage
        Admin.viewAllAccountants();

        // Sample login authentication
        boolean adminAuthenticated = Login.authenticateAdmin("admin", "admin123");
        if (adminAuthenticated) {
            System.out.println("Admin authenticated successfully");
        }

        // Sample accountant adding student
        Accountant accountant = new Accountant(1, "John Doe", "john@example.com", "1234567890", "password");
        Student student = new Student(1, "Alice", "alice@example.com", "Math", 500, 0, 500, "Address", "9876543210");
        Accountant.addStudent(student);
    }
}
