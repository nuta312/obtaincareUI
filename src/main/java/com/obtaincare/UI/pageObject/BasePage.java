package com.obtaincare.UI.pageObject;

import com.obtaincare.UI.helperMethods.Helper;
import com.obtaincare.UI.utils.Driver;
import org.jsoup.Connection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public Helper helper = new Helper();

}
