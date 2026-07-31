package com.wipro.jdbc;

import java.sql.*;

public class StudentDisplay {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@//localhost:1521/freepdb1";
        String username = "hr";
        String password = "hr";

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            String query = "SELECT * FROM STUDENT";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            boolean found = false;

            System.out.println("--------------------------------------------------------------");
            System.out.printf("%-8s %-20s %-10s %-15s %-10s%n",
                    "ROLLNO", "NAME", "CLASS", "DOB", "FEES");
            System.out.println("--------------------------------------------------------------");

            while (rs.next()) {

                found = true;

                System.out.printf("%-8d %-20s %-10s %-15s %-10.2f%n",
                        rs.getInt("ROLLNO"),
                        rs.getString("STUDENTNAME"),
                        rs.getString("STANDARD"),
                        rs.getDate("DATE_OF_BIRTH"),
                        rs.getDouble("FEES"));

            }

            if (!found)
                System.out.println("No Records Found");

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }
}