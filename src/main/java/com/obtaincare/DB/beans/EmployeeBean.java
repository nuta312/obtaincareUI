package com.obtaincare.DB.beans;


import com.obtaincare.DB.dbUtils.DBConnection;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.dbutils.BeanProcessor;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@ToString
public class EmployeeBean {
    private int employeeNumber;
    private String lastName;
    private String firstName;
    private String extension;
    private String email;
    private int officeCode;
    private int reportsTo;
    private String jobTitle;


    public EmployeeBean() {
    }

    public EmployeeBean(int employeeNumber, String lastName, String firstName, String extension, String email, int officeCode, int reportsTo, String jobTitle) {
        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.extension = extension;
        this.email = email;
        this.officeCode = officeCode;
        this.reportsTo = reportsTo;
        this.jobTitle = jobTitle;
    }

    public EmployeeBean(ResultSet rs) throws SQLException {
        new BeanProcessor().populateBean(rs, this);
    }


    public static List<EmployeeBean> getAll() throws SQLException {
        String query = "SELECT * FROM employees";
        try (ResultSet resultSet = DBConnection.query(query)) {
            return new BeanProcessor().toBeanList(resultSet, EmployeeBean.class);
        }
    }

    public static EmployeeBean getBy(String column, String value) throws SQLException {
        String query = "SELECT * FROM employees WHERE " + column + " = ?;";
        ResultSet rs = DBConnection.query(query, value);
        if (!rs.next()) return null;
        return new BeanProcessor().toBean(rs, EmployeeBean.class);
    }

    public static List<Integer> getEmployeeNumbers() throws SQLException {

       return getColumnValues("SELECT employeeNumber from employees;","employeeNumber");
    }

    public static List<Integer> getOfficeCodes() throws SQLException {
//        ResultSet resultSet = DBConnection.query("select distinct officeCode from employees;");
//        List<Integer> officesCode = new ArrayList<>();
//        while (resultSet.next()) {
//            officesCode.add(new EmployeeBean(resultSet).getOfficeCode());
//        }
//        return officesCode;
        return getColumnValues("select distinct officeCode from employees;", "officeCode");
    }

    public static List<String> getJobTitles() throws SQLException {
//        ResultSet resultSet = DBConnection.query("select distinct jobTitle from employees;");
//        List<String> jobTitles = new ArrayList<>();
//        while (resultSet.next()) {
//            jobTitles.add(new EmployeeBean().getJobTitle());
//        }
//        return jobTitles;
        return getColumnValues("select distinct jobTitle from employees;","jobTitle");
    }
    public static List<Integer> getReportTos() throws SQLException {
        return getColumnValues("select distinct reportsTo from employees;", "reportsTo");
    }

    public static List getColumnValues(String query, String column) throws SQLException {
        ResultSet resultSet = DBConnection.query(query);
        List columnValues = new ArrayList<>();
        while (resultSet.next()) {
            switch (column) {
                case "employeeNumber":
                    columnValues.add(new EmployeeBean().getEmployeeNumber());
                    break;
                case "lastName":
                    columnValues.add(new EmployeeBean().getLastName());
                    break;
                case "firstName":
                    columnValues.add(new EmployeeBean().getFirstName());
                    break;
                case "extension":
                    columnValues.add(new EmployeeBean().getExtension());
                    break;
                case "email":
                    columnValues.add(new EmployeeBean().getEmail());
                    break;
                case "officeCode":
                    columnValues.add(new EmployeeBean().getOfficeCode());
                    break;
                case "reportsTo":
                    columnValues.add(new EmployeeBean().getReportsTo());
                    break;
                case "jobTitle":
                    columnValues.add(new EmployeeBean().getJobTitle());
                    break;
            }
        }
        return columnValues;
    }
}