package org.example;

import java.sql.*;

public class BankManager {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/company_db";
        String user = "root";
        String password = "7533915733";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);

            // 1. INSERT ACCOUNT
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO accounts VALUES (?, ?, ?)");
            ps.setInt(1, 1001);
            ps.setString(2, "Surbhi");
            ps.setDouble(3, 15000);
            ps.executeUpdate();

            System.out.println("Account Created");

            // 2. READ (balance > 10000)
            ResultSet rs = con.createStatement().executeQuery(
                    "SELECT * FROM accounts WHERE balance > 10000");

            System.out.println("\nAccounts with balance > 10000:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("accNo") + " " +
                                rs.getString("name") + " " +
                                rs.getDouble("balance"));
            }

            // 3. UPDATE (Deposit)
            con.createStatement().executeUpdate(
                    "UPDATE accounts SET balance = balance + 5000 WHERE accNo = 1001");
            System.out.println("\nAmount Deposited");

            // 4. UPDATE (Withdraw)
            con.createStatement().executeUpdate(
                    "UPDATE accounts SET balance = balance - 2000 WHERE accNo = 1001");
            System.out.println("Amount Withdrawn");

            // 5. DELETE (Close account)
            con.createStatement().executeUpdate(
                    "DELETE FROM accounts WHERE accNo = 1001");
            System.out.println("Account Deleted");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}