package com.obtaincare.UI.pageObject.AddUserObject;

import com.obtaincare.UI.pageObject.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InfoAssertPage extends AddUserPage {

    @FindBy(xpath = "//a[text()='Info']")
    public WebElement infoButton;
    @FindBy(xpath = "//a[text()='Courses']")
    public WebElement coursesButton;


    public void clickCoursesButton() {
        helper.click(coursesButton);
    }

    public void clickInfoButton() {
        helper.click(infoButton);
    }

    public String getTextFirstnameInfo() {
        return helper.getAttribute("value", firstNameElement);
    }

    public String getTextLastNameInfo() {
        return helper.getAttribute("value", lastNameElement);
    }

    public String getTextEmailInfo() {
        return helper.getAttribute("value", emailElement);
    }

    public String getTextUsernameInfo() {
        return helper.getAttribute("value", userNameElement);
    }
}
