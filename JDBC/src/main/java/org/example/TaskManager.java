package org.example;

import java.sql.*;

public class TaskManager {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/company_db";
        String user = "root";
        String password = "7533915733";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            // 1. INSERT TASK
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO tasks VALUES (?, ?, ?)");

            ps.setInt(1, 1);
            ps.setString(2, "Complete Assignment");
            ps.setString(3, "Pending");
            ps.executeUpdate();

            System.out.println("Task Added");

            // 2. READ (Pending tasks)
            ResultSet rs = con.createStatement().executeQuery(
                    "SELECT * FROM tasks WHERE status='Pending'");

            System.out.println("\nPending Tasks:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("title") + " " +
                                rs.getString("status"));
            }

            // 3. UPDATE (mark as Completed)
            con.createStatement().executeUpdate(
                    "UPDATE tasks SET status='Completed' WHERE id=1");
            System.out.println("\nTask Completed");

            // 4. DELETE (remove completed tasks)
            con.createStatement().executeUpdate(
                    "DELETE FROM tasks WHERE status='Completed'");
            System.out.println("Completed Tasks Deleted");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
