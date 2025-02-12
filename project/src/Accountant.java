import java.sql.*;

public class Accountant {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String password;

    // Constructor and getters/setters
    public Accountant(int id, String name, String email, String phone, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }


    // Method to manage student records
    public static boolean addStudent(Student student) throws SQLException {
        Connection con = Jdbc.getConnection();
        String query = "INSERT INTO student (name, email, course, fee, paid, due, address, phone) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, student.getName());
        pst.setString(2, student.getEmail());
        pst.setString(3, student.getCourse());
        pst.setDouble(4, student.getFee());
        pst.setDouble(5, student.getPaid());
        pst.setDouble(6, student.getDue());
        pst.setString(7, student.getAddress());
        pst.setString(8, student.getPhone());
        int rowsAffected = pst.executeUpdate();
        return rowsAffected > 0;
    }

    // Method to check due fees
    public static void viewDueFees() throws SQLException {
        Connection con = Jdbc.getConnection();
        String query = "SELECT * FROM student WHERE due > 0";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            System.out.println("Student: " + rs.getString("name") + ", Due Fee: " + rs.getDouble("due"));
        }
    }

    // More methods for viewing, editing, and deleting students
}
