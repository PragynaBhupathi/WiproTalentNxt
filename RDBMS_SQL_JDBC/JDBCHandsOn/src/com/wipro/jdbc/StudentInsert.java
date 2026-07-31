package com.wipro.jdbc;

import java.sql.*;

public class StudentInsert {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@//localhost:1521/freepdb1";
        String username = "hr";
        String password = "hr";

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            String query = "INSERT INTO STUDENT VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, 103);
            ps.setString(2, "RAHUL");
            ps.setString(3, "V");
            ps.setDate(4, java.sql.Date.valueOf("2002-05-10"));
            ps.setDouble(5, 5000);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Record Inserted Successfully");
            else
                System.out.println("Insertion Failed");

            ps.close();
            con.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }
}