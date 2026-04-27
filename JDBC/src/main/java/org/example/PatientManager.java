package org.example;

import java.sql.*;

public class PatientManager {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/company_db";
        String user = "root";
        String password = "7533915733";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            // 1. INSERT PATIENT
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO patients VALUES (?, ?, ?)");

            ps.setInt(1, 1);
            ps.setString(2, "Rahul");
            ps.setString(3, "Fever");
            ps.executeUpdate();

            System.out.println("Patient Added");

            // 2. READ (patients with specific disease)
            PreparedStatement read = con.prepareStatement(
                    "SELECT * FROM patients WHERE disease = ?");
            read.setString(1, "Fever");
            ResultSet rs = read.executeQuery();

            System.out.println("\nPatients with Fever:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getString("disease"));
            }

            // 3. UPDATE (change disease)
            PreparedStatement update = con.prepareStatement(
                    "UPDATE patients SET disease=? WHERE id=?");
            update.setString(1, "Cold");
            update.setInt(2, 1);
            update.executeUpdate();

            System.out.println("\nDisease Updated");

            // 4. DELETE (remove patient)
            PreparedStatement delete = con.prepareStatement(
                    "DELETE FROM patients WHERE id=?");
            delete.setInt(1, 1);
            delete.executeUpdate();

            System.out.println("Patient Deleted");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}