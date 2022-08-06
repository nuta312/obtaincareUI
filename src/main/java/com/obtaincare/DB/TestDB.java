package com.obtaincare.DB;

import com.obtaincare.DB.beans.EmployeeBean;
import com.obtaincare.DB.dbUtils.DBConnection;
import com.obtaincare.UI.dataProviders.ConfigReader;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class TestDB {

    public static void main(String[] args) throws SQLException {
        DBConnection.open(ConfigReader.getProperty("dbname"));
//dmurphy@realparssamplesql.com
        System.out.println(EmployeeBean.getBy("email", "dmurphy@realparssamplesql.com"));
        String [] properties = {"employeeNumber","lastName","firstName","extension","email","officeCode","reportsTo","jobTitle"};
        DBConnection.insertBean("INSERT INTO employees VALUES (?, ?, ?, ?, ?, ?, ?, ?);",new EmployeeBean(1,"Patterson","Mary","x4611","mpatterso1@realparssamplesql.com",1,1002,"VP Sales"),properties);

        ResultSet resultSet = DBConnection.query("SELECT employeeNumber from employees;");
        List<Integer> employeeNumbers = new ArrayList<>();
        while (resultSet.next()) {
            System.out.println(new EmployeeBean(resultSet).getEmployeeNumber());
            EmployeeBean employeeBean = new EmployeeBean(resultSet);
            int employeeNumber = employeeBean.getEmployeeNumber();
            employeeNumbers.add(employeeNumber);
        }
        employeeNumbers.forEach(System.out::println);
        EmployeeBean employeeBean = new EmployeeBean();
        DBConnection.insertBean();

//        List<Integer> employeeNumbers1 = EmployeeBean.getAll();
    }
}
