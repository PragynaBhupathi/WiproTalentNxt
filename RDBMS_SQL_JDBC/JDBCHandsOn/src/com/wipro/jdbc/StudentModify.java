package com.wipro.jdbc;

import java.sql.*;

public class StudentModify {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@//localhost:1521/freepdb1";
        String username = "hr";
        String password = "hr";

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            String query = "UPDATE STUDENT SET FEES=? WHERE ROLLNO=?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setDouble(1, 7000);
            ps.setInt(2, 103);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Record Updated Successfully");
            else
                System.out.println("Record Not Found");

            ps.close();
            con.close();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }
}