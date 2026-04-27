package org.example;

import java.sql.*;

public class CustomerManager {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/company_db";
        String user = "root";
        String password = "7533915733";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            // 1. INSERT CUSTOMER
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO customers VALUES (?, ?, ?)");

            ps.setInt(1, 1);
            ps.setString(2, "Surbhi");
            ps.setString(3, "9876543210");
            ps.executeUpdate();

            System.out.println("Customer Added");

            // 2. READ (Search by name)
            PreparedStatement search = con.prepareStatement(
                    "SELECT * FROM customers WHERE name LIKE ?");
            search.setString(1, "%Sur%");
            ResultSet rs = search.executeQuery();

            System.out.println("\nSearch Result:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getString("phone"));
            }

            // 3. UPDATE (change phone)
            PreparedStatement update = con.prepareStatement(
                    "UPDATE customers SET phone=? WHERE id=?");
            update.setString(1, "9999999999");
            update.setInt(2, 1);
            update.executeUpdate();

            System.out.println("\nPhone Updated");

            // 4. DELETE (remove customer)
            PreparedStatement delete = con.prepareStatement(
                    "DELETE FROM customers WHERE id=?");
            delete.setInt(1, 1);
            delete.executeUpdate();

            System.out.println("Customer Deleted");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}