package com.wipro.jdbc;

import java.sql.*;

public class DAOClass {

    String url = "jdbc:oracle:thin:@//localhost:1521/freepdb1";
    String username = "hr";
    String password = "hr";

    // Insert Record
    public void insert(int rollNo, String name, String standard,
                       String dob, double fees) {

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            String query = "INSERT INTO STUDENT VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, rollNo);
            ps.setString(2, name);
            ps.setString(3, standard);
            ps.setDate(4, java.sql.Date.valueOf(dob));
            ps.setDouble(5, fees);

            int rows = ps.executeUpdate();

            if(rows>0)
                System.out.println("Record Inserted Successfully");
            else
                System.out.println("Insertion Failed");

            ps.close();
            con.close();

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }

    // Delete Record
    public void delete(int rollNo) {

        try {

            Connection con = DriverManager.getConnection(url, username, password);

            String query="DELETE FROM STUDENT WHERE ROLLNO=?";

            PreparedStatement ps=con.prepareStatement(query);

            ps.setInt(1, rollNo);

            int rows=ps.executeUpdate();

            if(rows>0)
                System.out.println("Record Deleted Successfully");
            else
                System.out.println("Record Not Found");

            ps.close();
            con.close();

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }

    // Modify Fees
    public void modify(int rollNo,double fees) {

        try {

            Connection con=DriverManager.getConnection(url,username,password);

            String query="UPDATE STUDENT SET FEES=? WHERE ROLLNO=?";

            PreparedStatement ps=con.prepareStatement(query);

            ps.setDouble(1, fees);
            ps.setInt(2, rollNo);

            int rows=ps.executeUpdate();

            if(rows>0)
                System.out.println("Record Updated Successfully");
            else
                System.out.println("Record Not Found");

            ps.close();
            con.close();

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }

    // Display One Record
    public void display(int rollNo) {

        try {

            Connection con=DriverManager.getConnection(url,username,password);

            String query="SELECT * FROM STUDENT WHERE ROLLNO=?";

            PreparedStatement ps=con.prepareStatement(query);

            ps.setInt(1, rollNo);

            ResultSet rs=ps.executeQuery();

            if(rs.next()) {

                System.out.println("-----------------------------");
                System.out.println("Roll No : "+rs.getInt("ROLLNO"));
                System.out.println("Name    : "+rs.getString("STUDENTNAME"));
                System.out.println("Class   : "+rs.getString("STANDARD"));
                System.out.println("DOB     : "+rs.getDate("DATE_OF_BIRTH"));
                System.out.println("Fees    : "+rs.getDouble("FEES"));
                System.out.println("-----------------------------");

            } else {

                System.out.println("Record Not Found");

            }

            rs.close();
            ps.close();
            con.close();

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }

    // Display All Records
    public void displayAll() {

        try {

            Connection con=DriverManager.getConnection(url,username,password);

            String query="SELECT * FROM STUDENT";

            PreparedStatement ps=con.prepareStatement(query);

            ResultSet rs=ps.executeQuery();

            boolean found=false;

            System.out.println("---------------------------------------------------------------");
            System.out.printf("%-8s %-20s %-10s %-15s %-10s%n",
                    "ROLLNO","NAME","CLASS","DOB","FEES");
            System.out.println("---------------------------------------------------------------");

            while(rs.next()) {

                found=true;

                System.out.printf("%-8d %-20s %-10s %-15s %-10.2f%n",
                        rs.getInt("ROLLNO"),
                        rs.getString("STUDENTNAME"),
                        rs.getString("STANDARD"),
                        rs.getDate("DATE_OF_BIRTH"),
                        rs.getDouble("FEES"));

            }

            if(!found)
                System.out.println("No Records Found");

            rs.close();
            ps.close();
            con.close();

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }

}