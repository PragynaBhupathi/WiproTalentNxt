package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExecuteQueryCondition {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@//localhost:1521/freepdb1";
        String username = "hr";
        String password = "hr";

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();

            String query = "SELECT LAST_NAME, JOB_ID, SALARY, COMMISSION_PCT "
                    + "FROM EMPLOYEES "
                    + "WHERE SALARY BETWEEN 2100 AND 5000";
            ResultSet rs = stmt.executeQuery(query);

            boolean recordsFound = false;

            System.out.println("-----------------------------------------------");
            System.out.printf("%-20s %-15s %-10s %-15s%n",
                    "LAST_NAME", "JOB_ID", "SALARY", "COMMISSION");
            System.out.println("-----------------------------------------------");

            while (rs.next()) {

                recordsFound = true;

                System.out.printf("%-20s %-15s %-10.2f %-15s%n",
                        rs.getString("LAST_NAME"),
                        rs.getString("JOB_ID"),
                        rs.getDouble("SALARY"),
                        rs.getString("COMMISSION_PCT"));

            }

            if (!recordsFound) {
                System.out.println("No rows selected.");
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {

            System.out.println("Connection could not be established.");
            e.printStackTrace();

        }

    }
}