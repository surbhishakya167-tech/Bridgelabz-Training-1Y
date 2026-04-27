import java.sql.*;

public class EmployeeManager {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/company_db";
        String user = "root";
        String password = "your_password";

        try {
            // Load Driver (important)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            Connection con = DriverManager.getConnection(url, user, password);

            // 1. INSERT
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO employee VALUES (?, ?, ?)");
            ps.setInt(1, 1);
            ps.setString(2, "Surbhi");
            ps.setDouble(3, 35000);
            ps.executeUpdate();
            System.out.println("Employee Added");

            // 2. READ
            ResultSet rs = con.createStatement().executeQuery(
                    "SELECT * FROM employee WHERE salary > 30000");

            System.out.println("Employees with salary > 30000:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getDouble("salary"));
            }

            // 3. UPDATE
            con.createStatement().executeUpdate(
                    "UPDATE employee SET salary = salary + salary*0.10 WHERE id = 1");
            System.out.println("Salary Updated");

            // 4. DELETE
            con.createStatement().executeUpdate(
                    "DELETE FROM employee WHERE salary < 15000");
            System.out.println("Low salary employees deleted");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}