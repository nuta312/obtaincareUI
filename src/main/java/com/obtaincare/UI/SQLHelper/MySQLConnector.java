package com.obtaincare.UI.SQLHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnector {
    Connection connection;
    Statement statement;

    public void connection(String mySQLUrl, String mySQLUserName, String mySQLPassword) {
        try {
            connection = DriverManager.getConnection(mySQLUrl, mySQLUserName, mySQLPassword);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Statement statement() {
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return statement;
    }
}
