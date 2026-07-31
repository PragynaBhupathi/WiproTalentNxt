package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class EstablishConnection {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@//localhost:1521/freepdb1";
        String username = "hr";
        String password = "hr";

        try {

            //Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Connection Established Successfully");

            con.close();

        } catch (Exception e) {

            System.out.println("Connection could not be established");
            e.printStackTrace();   // Better for debugging

        }
    }
}