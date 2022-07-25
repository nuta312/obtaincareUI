package com.obtaincare.UI.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {


    @FindBy(xpath = "//input[@name='login']")
    public WebElement userNameOrEmailInputField;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInputField;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitButton;


    public void loginToSystem(String userNameOrEmail, String password) {
        inputUserName(userNameOrEmail).inputPassword(password).clickLoginButton();
    }

    public LoginPage inputUserName(String userName) {
        helper.sendKeys(userNameOrEmailInputField, userName);
        return this;
    }

    public LoginPage inputPassword(String password) {
        helper.sendKeys(passwordInputField, password);
        return this;
    }

    public LoginPage clickLoginButton() {
        helper.click(submitButton);
        return this;
    }
}
