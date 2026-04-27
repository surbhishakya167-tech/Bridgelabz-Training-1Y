package org.example;

import java.sql.*;

public class SalesManager {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/company_db";
        String user = "root";
        String password = "7533915733";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            // 1. INSERT SALE
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO sales VALUES (?, ?, ?, ?)");

            ps.setInt(1, 1);
            ps.setString(2, "Java Book");
            ps.setInt(3, 2);
            ps.setDouble(4, 500);
            ps.executeUpdate();

            System.out.println("Sale Added");

            // 2. READ (quantity > 1)
            ResultSet rs = con.createStatement().executeQuery(
                    "SELECT * FROM sales WHERE quantity > 1");

            System.out.println("\nSales with quantity > 1:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("bookName") + " " +
                                rs.getInt("quantity") + " " +
                                rs.getDouble("price"));
            }

            // 3. UPDATE (modify quantity)
            PreparedStatement update = con.prepareStatement(
                    "UPDATE sales SET quantity=? WHERE id=?");
            update.setInt(1, 3);
            update.setInt(2, 1);
            update.executeUpdate();

            System.out.println("\nQuantity Updated");

            // 4. DELETE (incorrect entry)
            PreparedStatement delete = con.prepareStatement(
                    "DELETE FROM sales WHERE id=?");
            delete.setInt(1, 1);
            delete.executeUpdate();

            System.out.println("Sale Deleted");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}