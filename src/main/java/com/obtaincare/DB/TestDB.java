package com.obtaincare.DB;

import com.obtaincare.DB.beans.EmployeeBean;
import com.obtaincare.DB.dbUtils.DBConnection;
import com.obtaincare.UI.dataProviders.ConfigReader;

import java.sql.SQLException;
import java.util.Objects;

public class TestDB {

    public static void main(String[] args) throws SQLException {


        DBConnection.open(ConfigReader.getProperty("dbname"));

        String [] properties = {"employeeNumber","lastName","firstName","extension","email","officeCode","reportsTo","jobTitle"};
        DBConnection.insertBean("INSERT INTO employees VALUES (?, ?, ?, ?, ?, ?, ?, ?);", new EmployeeBean(100012,"Musakunov12","Nursultan12","x0011","nuta12@gmail.com",1,1002,"VP Sales"),properties);

        System.out.println(Objects.requireNonNull(EmployeeBean.getBy("firstName", "Nursultan12")));
    }
}
