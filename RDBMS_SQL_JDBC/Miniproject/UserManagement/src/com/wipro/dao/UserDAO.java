package com.wipro.dao;

import java.sql.*;
import java.util.ArrayList;

import com.wipro.bean.UserBean;
import com.wipro.util.DBUtil;

public class UserDAO {

    // Scenario 1
    public String getUserType(String userID) {

        String userType = null;

        try {
            Connection con = DBUtil.getConnection();

            PreparedStatement ps = con.prepareStatement(
                    "SELECT USERTYPE FROM USER_DETAILS WHERE USERID=?");

            ps.setString(1, userID);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                userType = rs.getString("USERTYPE");
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return userType;
    }

    // Scenario 2
    public String getIncorrectAttempts(String userID) {

        String result = "";

        try {

            Connection con = DBUtil.getConnection();

            PreparedStatement ps = con.prepareStatement(
                    "SELECT INCORRECTATTEMPTS FROM USER_DETAILS WHERE USERID=?");

            ps.setString(1, userID);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                int attempts = rs.getInt(1);

                if (attempts == 0)
                    result = "No Incorrect Attempt";
                else if (attempts == 1)
                    result = "One Time";
                else
                    result = "Incorrect Attempt Exceeded";
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    // Scenario 3
    public String changeUserType(String userID) {

        String status = "Update Failed";

        try {

            Connection con = DBUtil.getConnection();

            PreparedStatement ps = con.prepareStatement(
                    "UPDATE USER_DETAILS SET USERTYPE='Admin' WHERE USERID=?");

            ps.setString(1, userID);

            int x = ps.executeUpdate();

            if (x > 0)
                status = "Update Success";

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    // Scenario 4
    public int getLockStatus() {

        int count = 0;

        try {

            Connection con = DBUtil.getConnection();

            PreparedStatement ps = con.prepareStatement(
                    "SELECT COUNT(*) FROM USER_DETAILS WHERE LOCKSTATUS=0");

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                count = rs.getInt(1);
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return count;
    }

    // Scenario 5
    public String changeName(String id, String name) {

        String status = "Failed";

        try {

            Connection con = DBUtil.getConnection();

            PreparedStatement ps = con.prepareStatement(
                    "UPDATE USER_DETAILS SET NAME=? WHERE USERID=?");

            ps.setString(1, name);
            ps.setString(2, id);

            int x = ps.executeUpdate();

            if (x > 0)
                status = "Success";

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    // Scenario 6
    public String changePassword(String password) {

        String status = "0";

        try {

            Connection con = DBUtil.getConnection();

            PreparedStatement ps = con.prepareStatement(
                    "UPDATE USER_DETAILS SET PASSWORD=?");

            ps.setString(1, password);

            int x = ps.executeUpdate();

            if (x > 0)
                status = "Changed";

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    // Scenario 7
    public String addUser_1(UserBean bean) {

        String status = "Fail";

        try {

            Connection con = DBUtil.getConnection();

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO USER_DETAILS VALUES(?,?,?,?,?,?)");

            ps.setString(1, bean.getUserId());
            ps.setString(2, bean.getPassword());
            ps.setString(3, bean.getName());
            ps.setInt(4, bean.getIncorrectAttempts());
            ps.setInt(5, bean.getLockStatus());
            ps.setString(6, bean.getUserType());

            int x = ps.executeUpdate();

            if (x > 0)
                status = "Success";

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    // Scenario 8
    public String addUser_2(UserBean bean) {

        if (bean.getLockStatus() != 0)
            return "Fail";

        return addUser_1(bean);
    }

    // Scenario 9
    public ArrayList<UserBean> getUsers(String userType) {

        ArrayList<UserBean> list = new ArrayList<>();

        try {

            Connection con = DBUtil.getConnection();

            PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM USER_DETAILS WHERE USERTYPE=?");

            ps.setString(1, userType);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                UserBean bean = new UserBean();

                bean.setUserId(rs.getString("USERID"));
                bean.setPassword(rs.getString("PASSWORD"));
                bean.setName(rs.getString("NAME"));
                bean.setIncorrectAttempts(rs.getInt("INCORRECTATTEMPTS"));
                bean.setLockStatus(rs.getInt("LOCKSTATUS"));
                bean.setUserType(rs.getString("USERTYPE"));

                list.add(bean);

            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // Scenario 10
    public ArrayList<UserBean> storeAllRecords() {

        ArrayList<UserBean> list = new ArrayList<>();

        try {

            Connection con = DBUtil.getConnection();

            PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM USER_DETAILS");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                UserBean bean = new UserBean();

                bean.setUserId(rs.getString("USERID"));
                bean.setPassword(rs.getString("PASSWORD"));
                bean.setName(rs.getString("NAME"));
                bean.setIncorrectAttempts(rs.getInt("INCORRECTATTEMPTS"));
                bean.setLockStatus(rs.getInt("LOCKSTATUS"));
                bean.setUserType(rs.getString("USERTYPE"));

                list.add(bean);
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // Scenario 11
    public String[] getNames() {

        ArrayList<String> names = new ArrayList<>();

        try {

            Connection con = DBUtil.getConnection();

            PreparedStatement ps = con.prepareStatement(
                    "SELECT NAME FROM USER_DETAILS");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                names.add(rs.getString(1));
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return names.toArray(new String[0]);
    }
}