package com.wipro.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

    public static Connection getConnection() throws Exception {

        Class.forName("oracle.jdbc.OracleDriver");

        return DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521/FREEPDB1",
                "hr",
                "hr");   // Replace with your HR password if it's different
    }
}