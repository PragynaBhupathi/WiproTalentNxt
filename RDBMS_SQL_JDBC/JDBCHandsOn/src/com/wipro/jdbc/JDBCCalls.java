package com.wipro.jdbc;

public class JDBCCalls {

    public static void main(String[] args) {

        DAOClass dao = new DAOClass();

        // Insert
        dao.insert(101, "Ajit", "IV", "2001-11-20", 4000);

        // Display One
        dao.display(101);

        // Modify
        dao.modify(101, 5500);

        // Display Again
        dao.display(101);

        // Display All
        dao.displayAll();

        // Delete
        dao.delete(101);

        // Display All Again
        dao.displayAll();

    }

}