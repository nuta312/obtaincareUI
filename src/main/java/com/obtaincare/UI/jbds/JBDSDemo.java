package com.obtaincare.UI.jbds;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JBDSDemo {
    public static void main(String[] args) {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/realparsmodel";
            String username = "root";
            String password = "2122";

            Class.forName(driver);

            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();

            String query = "select * from employees";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                System.out.println(resultSet.getString(2) + " " + resultSet.getString(3));
            }
            connection.close();
        } catch (Exception e) {

        }
    }
}
