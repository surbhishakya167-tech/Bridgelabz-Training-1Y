package org.example;

import java.sql.*;

public class MovieManager {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/company_db";
        String user = "root";
        String password = "7533915733";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            // 1. INSERT MOVIES
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO movies VALUES (?, ?, ?)");

            ps.setInt(1, 1);
            ps.setString(2, "Avengers");
            ps.setInt(3, 50);
            ps.executeUpdate();

            ps.setInt(1, 2);
            ps.setString(2, "Batman");
            ps.setInt(3, 0);
            ps.executeUpdate();

            System.out.println("Movies Added");

            // 2. READ (seats > 0)
            ResultSet rs = con.createStatement().executeQuery(
                    "SELECT * FROM movies WHERE seats > 0");

            System.out.println("\nAvailable Movies:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getInt("seats"));
            }

            // 3. UPDATE (book ticket → reduce seats)
            con.createStatement().executeUpdate(
                    "UPDATE movies SET seats = seats - 1 WHERE id = 1");
            System.out.println("\nSeat Booked");

            // 4. DELETE (movie no longer running)
            con.createStatement().executeUpdate(
                    "DELETE FROM movies WHERE id = 2");
            System.out.println("Movie Deleted");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}