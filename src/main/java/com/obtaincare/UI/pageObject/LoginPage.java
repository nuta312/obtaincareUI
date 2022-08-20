package com.obtaincare.UI.pageObject;

import com.obtaincare.UI.helperMethods.Helper;
import com.obtaincare.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//input[@name ='login']")
    public WebElement userNameOrEmailField;

    @FindBy(xpath = "//input[@name ='password']")
    public WebElement passwordInputField;

    @FindBy(xpath = "//input[@name ='submit']")
    public WebElement submitButton;

    Helper helper = new Helper();
    public void loginToSystem(String userNameOrEmail,String password){
        inputUserName(userNameOrEmail).inputPassword(password).clickLoginButton();
    }
    public LoginPage inputUserName(String userName){
        helper.sendKeys(userNameOrEmailField,userName);
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
