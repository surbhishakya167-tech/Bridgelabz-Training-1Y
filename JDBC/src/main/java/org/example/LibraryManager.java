package org.example;

import java.sql.*;

public class LibraryManager {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/company_db";
        String user = "root";
        String password = "7533915733";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            // 1. INSERT BOOK
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO books VALUES (?, ?, ?, ?)");

            ps.setInt(1, 1);
            ps.setString(2, "Java Basics");
            ps.setString(3, "James Gosling");
            ps.setString(4, "Available");
            ps.executeUpdate();

            System.out.println("Book Added");

            // 2. READ (Available books)
            ResultSet rs = con.createStatement().executeQuery(
                    "SELECT * FROM books WHERE status='Available'");

            System.out.println("\nAvailable Books:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("title") + " " +
                                rs.getString("author") + " " +
                                rs.getString("status"));
            }

            // 3. UPDATE (mark as Issued)
            con.createStatement().executeUpdate(
                    "UPDATE books SET status='Issued' WHERE id=1");
            System.out.println("\nBook Issued");

            // 4. DELETE (remove damaged book)
            con.createStatement().executeUpdate(
                    "DELETE FROM books WHERE id=1");
            System.out.println("Book Deleted");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}