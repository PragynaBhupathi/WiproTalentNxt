package com.wipro.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;

public class CallableStatementDemo {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@//localhost:1521/freepdb1";
        String username = "hr";
        String password = "hr";

        try {

            Connection con =
                    DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(
                    "SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME FROM EMPLOYEES");

            System.out.printf("%-10s %-25s %-15s%n",
                    "EMP ID", "NAME", "NET SALARY");

            while (rs.next()) {

                int empId = rs.getInt("EMPLOYEE_ID");

                String name = rs.getString("FIRST_NAME") + " "
                        + rs.getString("LAST_NAME");

                CallableStatement cs =
                        con.prepareCall("{call CAL_NETSAL(?,?)}");

                cs.setInt(1, empId);

                cs.registerOutParameter(2, Types.NUMERIC);

                cs.execute();

                double netSalary = cs.getDouble(2);

                System.out.printf("%-10d %-25s %.2f%n",
                        empId,
                        name,
                        netSalary);

                cs.close();
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}