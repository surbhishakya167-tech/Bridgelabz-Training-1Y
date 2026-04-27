package org.example;

import java.sql.*;

public class EnrollmentManager {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/company_db";
        String user = "root";
        String password = "7533915733";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            // 1. INSERT ENROLLMENT
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO enrollments VALUES (?, ?, ?)");

            ps.setInt(1, 1);
            ps.setString(2, "Surbhi");
            ps.setString(3, "Java");
            ps.executeUpdate();

            System.out.println("Enrollment Added");

            // 2. READ (specific course)
            PreparedStatement read = con.prepareStatement(
                    "SELECT * FROM enrollments WHERE course=?");
            read.setString(1, "Java");
            ResultSet rs = read.executeQuery();

            System.out.println("\nStudents in Java Course:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("student") + " " +
                                rs.getString("course"));
            }

            // 3. UPDATE (change course)
            PreparedStatement update = con.prepareStatement(
                    "UPDATE enrollments SET course=? WHERE id=?");
            update.setString(1, "Python");
            update.setInt(2, 1);
            update.executeUpdate();

            System.out.println("\nCourse Updated");

            // 4. DELETE (cancel enrollment)
            PreparedStatement delete = con.prepareStatement(
                    "DELETE FROM enrollments WHERE id=?");
            delete.setInt(1, 1);
            delete.executeUpdate();

            System.out.println("Enrollment Deleted");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
