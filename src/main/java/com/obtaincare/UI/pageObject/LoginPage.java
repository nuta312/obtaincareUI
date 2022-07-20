package com.obtaincare.UI.pageObject;

import com.obtaincare.UI.helperMethods.Helper;
import com.obtaincare.UI.utils.Driver;
import lombok.extern.java.Log;
import org.apache.logging.log4j.core.tools.picocli.CommandLine;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='login']")
    public WebElement userNameOrEmailInputField;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInputField;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitButton;


    public void loginToSystem(String userNameOrEmail, String password){
        inputUserName(userNameOrEmail).inputPassword(password).clickLoginButton();
    }

    public LoginPage inputUserName(String userName){
        helper.sendKeys(userNameOrEmailInputField,userName);
        return this;
    }

    public LoginPage inputPassword(String password){
        helper.sendKeys(passwordInputField,password);
        return this;
    }

    public LoginPage clickLoginButton(){
        helper.click(submitButton);
        return this;
    }
}
