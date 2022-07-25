package com.obtaincare.UI.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class User {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private String userName;
    private String password;
    private String bio;



}
