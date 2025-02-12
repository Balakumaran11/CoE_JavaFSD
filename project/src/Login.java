import java.sql.*;

public class Login {
    public static boolean authenticateAdmin(String username, String password) throws SQLException {
        Connection con = Jdbc.getConnection();
        String query = "SELECT * FROM admin WHERE username = ? AND password = ?";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, username);
        pst.setString(2, password);
        ResultSet rs = pst.executeQuery();

        return rs.next();
    }

    public static boolean authenticateAccountant(String email, String password) throws SQLException {
        Connection con = Jdbc.getConnection();
        String query = "SELECT * FROM accountant WHERE email = ? AND password = ?";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, email);
        pst.setString(2, password);
        ResultSet rs = pst.executeQuery();

        return rs.next();
    }
}
