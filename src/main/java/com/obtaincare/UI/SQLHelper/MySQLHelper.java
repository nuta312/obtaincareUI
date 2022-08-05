package com.obtaincare.UI.SQLHelper;

import com.obtaincare.UI.dataProviders.ConfigReader;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLHelper extends MySQLConnector implements MySQLLoader {

    @Override
    public void loadSQL() {
        try {
            Class.forName(ConfigReader.getProperty("mySQLDriver"));
            connection(ConfigReader.getProperty("mySQLUrl"),
                    ConfigReader.getProperty("mySQLUsername"),
                    ConfigReader.getProperty("mySQLPassword"));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void queryColumnIndex(String query, int columnFirstIndex, int columnSecondIndex) {
        loadSQL();
        try {
            ResultSet resultSet = statement().executeQuery(query);
            while (resultSet.next()) {
                System.out.println(resultSet.getString(columnFirstIndex) + " " + resultSet.getString(columnSecondIndex));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
