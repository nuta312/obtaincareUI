package com.obtaincare.UI.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Data
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String password;
    private String bio;
    private String userType;
    private String timeZone;
    private String language;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getBio() {
        return bio;
    }

    public String getUserType() {
        return userType;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public String getLanguage() {
        return language;
    }
}
