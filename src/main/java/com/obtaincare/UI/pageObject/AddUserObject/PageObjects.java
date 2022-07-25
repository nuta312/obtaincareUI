package com.obtaincare.UI.pageObject.AddUserObject;

import com.obtaincare.UI.pojo.User;

import java.util.*;

public interface PageObjects {
    Map<USERINFO, Integer> mapOfUsers = new LinkedHashMap<>();

    public default Map<USERINFO, Integer> addUserMap() {
        USERINFO[] userInfo = USERINFO.values();

        for (int i = 0; i < userInfo.length; i++) {
            mapOfUsers.put(userInfo[i],i );
        }
        return mapOfUsers;
//        USERINFO[] userinfo = USERINFO.values();
//        mapOfUsers.put(USERINFO.FIRSTNAME, listOfUser.get(indexOfObject));
//        mapOfUsers.put(USERINFO.LASTNAME, )
//        mapOfUsers.put(USERINFO.FIRSTNAME, userList.get(indexOfObject).getFirstName());
//        mapOfUsers.put(USERINFO.LASTNAME, userList.get(indexOfObject).getLastName());
//        mapOfUsers.put(USERINFO.EMAIL, userList.get(indexOfObject).getUserName());
//        mapOfUsers.put(USERINFO.USERNAME, userList.get(indexOfObject).getUserName());
//        mapOfUsers.put(USERINFO.PASSWORD, userList.get(indexOfObject).getPassword());
//        mapOfUsers.put(USERINFO.BIO, userList.get(indexOfObject).getUserType());
//        mapOfUsers.put(USERINFO.USERTYPE, userList.get(indexOfObject).getUserType());
//        mapOfUsers.put(USERINFO.TIMEZONE, userList.get(indexOfObject).getTimeZone());
//        mapOfUsers.put(USERINFO.LANGUAGE, userList.get(indexOfObject).getLanguage());
    }

    public enum USERINFO {
        FIRSTNAME,
        LASTNAME,
        EMAIL,
        USERNAME,
        PASSWORD,
        BIO,
        USERTYPE,
        TIMEZONE,
        LANGUAGE
    }
}
