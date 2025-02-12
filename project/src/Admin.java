import java.sql.*;

public class Admin {
    private int id;
    private String username;
    private String password;

    public Admin(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    // Method to add a new accountant
    public static boolean addAccountant(Accountant accountant) throws SQLException {
        Connection con = Jdbc.getConnection();
        String query = "INSERT INTO accountant (name, email, phone, password) VALUES (?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, accountant.getName());
        pst.setString(2, accountant.getEmail());
        pst.setString(3, accountant.getPhone());
        pst.setString(4, accountant.getPassword());
        int rowsAffected = pst.executeUpdate();
        return rowsAffected > 0;
    }

    // Method to view all accountants
    public static void viewAllAccountants() throws SQLException {
        Connection con = Jdbc.getConnection();
        String query = "SELECT * FROM accountant";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
        }
    }

    // More methods for editing and deleting accountants
}
