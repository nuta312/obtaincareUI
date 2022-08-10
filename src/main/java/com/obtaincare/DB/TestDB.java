package com.obtaincare.DB;

import com.obtaincare.DB.beans.EmployeeBean;
import com.obtaincare.DB.dbUtils.DBConnection;
import com.obtaincare.UI.dataProviders.ConfigReader;
import com.obtaincare.UI.dataProviders.MockDataGenerator;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class TestDB {

    public static void main(String[] args) throws SQLException {
        DBConnection.open(ConfigReader.getProperty("dbname"));
        MockDataGenerator mockDataGenerator = new MockDataGenerator();
//dmurphy@realparssamplesql.com
        String[] properties = {"employeeNumber", "lastName", "firstName", "extension", "email", "officeCode", "reportsTo", "jobTitle"};
        String query = "INSERT INTO employees VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
        EmployeeBean employeeBean = new EmployeeBean(mockDataGenerator.generateEmployeeNumber()
                , mockDataGenerator.generateEmployeeLastName()
                , mockDataGenerator.generateEmployeeFirstName()
                , mockDataGenerator.generateEmployeeExtension()
                , mockDataGenerator.generateEmployeeEmail()
                , mockDataGenerator.generateOfficeCodes()
                , mockDataGenerator.generateReportsToCodes()
                , "Sales Rep");
        DBConnection.insertBean(query, employeeBean, properties);
    }
}
