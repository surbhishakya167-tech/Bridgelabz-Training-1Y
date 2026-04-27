package org.example;
import java.sql.*;

public class ProductManager {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/company_db";
        String user = "root";
        String password = "7533915733";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO product VALUES (?, ?, ?)");

            ps.setInt(1, 101);
            ps.setString(2, "Pen");
            ps.setInt(3, 5);
            ps.executeUpdate();

            System.out.println("Inserted");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}