package org.example;

import java.sql.*;

public class GymManager {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/company_db";
        String user = "root";
        String password = "7533915733";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            // 1. INSERT MEMBER
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO members VALUES (?, ?, ?, ?)");

            ps.setInt(1, 1);
            ps.setString(2, "Surbhi");
            ps.setString(3, "Premium");
            ps.setInt(4, 6);
            ps.executeUpdate();

            System.out.println("Member Added");

            // 2. READ (Premium members)
            ResultSet rs = con.createStatement().executeQuery(
                    "SELECT * FROM members WHERE type='Premium'");

            System.out.println("\nPremium Members:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getString("type") + " " +
                                rs.getInt("months"));
            }

            // 3. UPDATE (extend membership)
            con.createStatement().executeUpdate(
                    "UPDATE members SET months = months + 3 WHERE id = 1");
            System.out.println("\nMembership Extended");

            // 4. DELETE (remove expired/cancelled)
            con.createStatement().executeUpdate(
                    "DELETE FROM members WHERE id = 1");
            System.out.println("Member Deleted");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}