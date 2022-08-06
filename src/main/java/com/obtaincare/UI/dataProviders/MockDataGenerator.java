package com.obtaincare.UI.dataProviders;

import com.github.javafaker.Faker;
import com.obtaincare.DB.beans.EmployeeBean;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;

public class MockDataGenerator {

    Faker faker = new Faker();

    public String generateMockPassword() {
        return faker.internet().password();
    }

    public String generateEmployeeFirstName() {
        return faker.name().firstName();
    }

    public String generateEmployeeLastName() {
        return faker.name().lastName();
    }

    public String generateEmployeeEmail() {
        return faker.internet().emailAddress();
    }

    public String generateMockUserName() {
        return faker.name().username().toLowerCase();
    }

    public int generateEmployeeNumber() throws SQLException {
        int employeeNumber = faker.number().numberBetween(1000, 9999);
        List<Integer> employeeNumbers = EmployeeBean.getEmployeeNumbers();
        for (int i = 0; i < employeeNumbers.size(); i++) {
            if (employeeNumbers.get(i) == employeeNumber) {
                return faker.number().numberBetween(1000, 9999);
            }
        }
        return employeeNumber;
    }

    public String generateEmployeeExtension() {
        return "x" + String.valueOf(faker.number().numberBetween(100, 9999));
    }

    public int generateOfficeCodes() throws SQLException {
        List<Integer> officeCodes = EmployeeBean.getOfficeCodes();
        return faker.number().numberBetween(0, officeCodes.size());
    }
    public String generateJobTitles() throws SQLException {

        List<String> jobTitles = EmployeeBean.getJobTitles();
        Random rand = new Random();
        return jobTitles.get(rand.nextInt(jobTitles.size()));

    }
}
