package com.obtaincare.UI.pageObject.UsersPageObject;

import lombok.Getter;
import org.openqa.selenium.devtools.v85.domstorage.model.DomStorageItemRemoved;
import org.picocontainer.lifecycle.LifecycleState;

import java.util.List;

@Getter
public class UsersPageObject {
    String email;
    String userType;
    @Override
    public String toString() {
        return "UsersPageObject{" +
                "email='" + email + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }
    public UsersPageObject(String email, String userType) {
        this.email = email;
        this.userType = userType;
    }
}