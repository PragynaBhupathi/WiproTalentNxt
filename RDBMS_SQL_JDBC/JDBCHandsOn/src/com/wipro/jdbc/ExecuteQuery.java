package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExecuteQuery {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@//localhost:1521/freepdb1";
        String username = "hr";
        String password = "hr";

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEES");

            boolean recordsFound = false;

            while (rs.next()) {

                recordsFound = true;

                System.out.println(
                        rs.getInt(1) + "\t" +
                        rs.getString("LAST_NAME"));

            }

            if (!recordsFound) {
                System.out.println("No rows selected.");
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {

            System.out.println("Error : " + e.getMessage());

        }
    }
}