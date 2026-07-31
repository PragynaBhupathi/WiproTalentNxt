package com.wipro.jdbc;

import java.sql.*;

public class StudentDelete {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@//localhost:1521/freepdb1";
        String username = "hr";
        String password = "hr";

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            String query = "DELETE FROM STUDENT WHERE ROLLNO=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, 103);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Record Deleted Successfully");
            else
                System.out.println("Record Not Found");

            ps.close();
            con.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }
}