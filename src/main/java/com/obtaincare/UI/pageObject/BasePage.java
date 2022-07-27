package com.obtaincare.UI.pageObject;

import com.obtaincare.UI.helperMethods.DropDownHelper;
import com.obtaincare.UI.helperMethods.Helper;
import com.obtaincare.UI.helperMethods.TableHelper;
import com.obtaincare.UI.pageObject.AddUserObject.AddUserPage;
import com.obtaincare.UI.pageObject.AddUserObject.PageObjects;
import com.obtaincare.UI.utils.Driver;
import io.cucumber.java.BeforeAll;

import java.net.MalformedURLException;

public class BasePage {

    public Helper helper = new Helper();
    public DropDownHelper dropDownHelper = new DropDownHelper();
    public TableHelper tableHelper = new TableHelper();

}
