package com.obtaincare.API.domains;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    private String id;
    private String login;
    private String first_name;
    private String last_name;
    private String email;
    private String restrict_email;
    private String user_type;
    private String timezone;
    private String language;
    private String status;
    private String deactivation_date;
    private String level;
    private String points;
    private String created_on;
    private String last_updated;
    private String last_updated_timestamp;
    private String avatar;
    private String bio;
    private String login_key;

}
