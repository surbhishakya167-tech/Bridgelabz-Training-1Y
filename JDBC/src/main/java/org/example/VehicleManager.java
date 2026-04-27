package org.example;

import java.sql.*;

public class VehicleManager {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/company_db";
        String user = "root";
        String password = "7533915733";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            // 1. INSERT VEHICLE
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO vehicles VALUES (?, ?, ?)");

            ps.setString(1, "UP80AB1234");
            ps.setString(2, "Surbhi");
            ps.setString(3, "Pending");
            ps.executeUpdate();

            System.out.println("Vehicle Added");

            // 2. READ (status = Pending)
            ResultSet rs = con.createStatement().executeQuery(
                    "SELECT * FROM vehicles WHERE status='Pending'");

            System.out.println("\nPending Vehicles:");
            while (rs.next()) {
                System.out.println(
                        rs.getString("regNo") + " " +
                                rs.getString("owner") + " " +
                                rs.getString("status"));
            }

            // 3. UPDATE (mark as Completed)
            con.createStatement().executeUpdate(
                    "UPDATE vehicles SET status='Completed' WHERE regNo='UP80AB1234'");
            System.out.println("\nService Completed");

            // 4. DELETE (remove vehicle)
            con.createStatement().executeUpdate(
                    "DELETE FROM vehicles WHERE regNo='UP80AB1234'");
            System.out.println("Vehicle Removed");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}