package org.example;

import java.sql.*;

public class MenuManager {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/company_db";
        String user = "root";
        String password = "7533915733";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            // 1. INSERT MENU ITEM
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO menu VALUES (?, ?, ?)");

            ps.setInt(1, 1);
            ps.setString(2, "Burger");
            ps.setDouble(3, 150);
            ps.executeUpdate();

            System.out.println("Item Added");

            // 2. READ (price < 200)
            ResultSet rs = con.createStatement().executeQuery(
                    "SELECT * FROM menu WHERE price < 200");

            System.out.println("\nItems below 200:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("itemName") + " " +
                                rs.getDouble("price"));
            }

            // 3. UPDATE (change price)
            PreparedStatement update = con.prepareStatement(
                    "UPDATE menu SET price=? WHERE id=?");
            update.setDouble(1, 180);
            update.setInt(2, 1);
            update.executeUpdate();

            System.out.println("\nPrice Updated");

            // 4. DELETE (remove item)
            PreparedStatement delete = con.prepareStatement(
                    "DELETE FROM menu WHERE id=?");
            delete.setInt(1, 1);
            delete.executeUpdate();

            System.out.println("Item Deleted");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}