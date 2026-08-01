package com.wipro.main;

import java.util.ArrayList;

import com.wipro.bean.UserBean;
import com.wipro.dao.UserDAO;

public class Main {

    public static void main(String[] args) {

        UserDAO dao = new UserDAO();

        System.out.println("Scenario 1");
        System.out.println(dao.getUserType("AB1001"));

        System.out.println("\nScenario 2");
        System.out.println(dao.getIncorrectAttempts("AB1001"));

        System.out.println("\nScenario 3");
        System.out.println(dao.changeUserType("TA1002"));

        System.out.println("\nScenario 4");
        System.out.println(dao.getLockStatus());

        System.out.println("\nScenario 5");
        System.out.println(dao.changeName("RS1003","Ganesh Kumar"));

        System.out.println("\nScenario 6");
        System.out.println(dao.changePassword("welcome123"));

        UserBean bean = new UserBean();

        bean.setUserId("AA1004");
        bean.setPassword("AA1004");
        bean.setName("Ravi");
        bean.setIncorrectAttempts(0);
        bean.setLockStatus(0);
        bean.setUserType("Employee");

        System.out.println("\nScenario 7");
        System.out.println(dao.addUser_1(bean));

        UserBean bean2 = new UserBean();

        bean2.setUserId("BB1005");
        bean2.setPassword("BB1005");
        bean2.setName("Suresh");
        bean2.setIncorrectAttempts(0);
        bean2.setLockStatus(0);
        bean2.setUserType("Employee");

        System.out.println("\nScenario 8");
        System.out.println(dao.addUser_2(bean2));

        System.out.println("\nScenario 9");

        ArrayList<UserBean> list = dao.getUsers("Employee");

        for(UserBean u : list)
        {
            System.out.println(u.getUserId()+" "+u.getName()+" "+u.getUserType());
        }

        System.out.println("\nScenario 10");

        ArrayList<UserBean> all = dao.storeAllRecords();

        for(UserBean u : all)
        {
            System.out.println(u.getUserId()+" "+u.getName());
        }

        System.out.println("\nScenario 11");

        String names[] = dao.getNames();

        for(String s : names)
        {
            System.out.println(s);
        }

    }
}