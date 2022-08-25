package com.obtaincare.DB;



import com.obtaincare.DB.beans.EmployeeBean;
import com.obtaincare.DB.dbUtils.DBConnection;
import com.obtaincare.UI.dataProviders.ConfigReader;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class TestDB {

    public static void main(String[] args) throws SQLException {

        DBConnection.open(ConfigReader.getProperty("dbname"));

//        ResultSet resultSet = DBConnection.query("select * from employees where firstName = ?;","Diane");
//        resultSet.next();
//        System.out.println(Objects.requireNonNull(EmployeeBean.getBy("firstName", "Julie")).getFirstName());
//        System.out.println(new EmployeeBean(resultSet).getFirstName());

//        EmployeeBean.getAll().forEach(System.out::println);

        String [] properties = {"employeeNumber","lastName","firstName","extension","email","officeCode","reportsTo","jobTitle"};
        DBConnection.insertBean("INSERT INTO employees VALUES (?, ?, ?, ?, ?, ?, ?, ?);",new EmployeeBean(1,"Patterson","Mary","x4611","mpatterso1@realparssamplesql.com",1,1002,"VP Sales"),properties);

        System.out.println(Objects.requireNonNull(EmployeeBean.getBy("firstName", "Mary")).getFirstName());
    }
}
