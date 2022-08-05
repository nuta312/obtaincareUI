package com.obtaincare.DB;

import com.obtaincare.DB.beans.EmployeeBean;
import com.obtaincare.DB.dbUtils.DBConnection;
import com.obtaincare.UI.dataProviders.ConfigReader;

import java.sql.SQLException;
import java.util.Objects;

public class TestDB {

    public static void main(String[] args) throws SQLException {
        DBConnection.open(ConfigReader.getProperty("dbname"));
//dmurphy@realparssamplesql.com
        System.out.println(EmployeeBean.getBy("email", "dmurphy@realparssamplesql.com"));
    }
}
