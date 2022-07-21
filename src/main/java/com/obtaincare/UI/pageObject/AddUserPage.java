package com.obtaincare.UI.pageObject;

import com.obtaincare.UI.helperMethods.DropDownHelper;
import com.obtaincare.UI.helperMethods.Helper;
import com.obtaincare.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage extends BasePage{

    public AddUserPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//div[@class=\"tl-title tl-ellipsis\"]")
    public WebElement addUserText;

    @FindBy (xpath = "//input[@name='name']")
    public WebElement firstName;

    @FindBy (xpath = "//input[@name='surname']")
    public WebElement lastName;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy (xpath = "//input[@name='login']")
    public WebElement userName;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy (xpath = "//textarea[@name='description']")
    public WebElement bio;

    @FindBy (xpath = "//select[@name='acl_user_type_id']")
    public WebElement userTypeSelect;

    @FindBy (xpath = "//select[@name='timezone']")
    public  WebElement timeZoneSelect;

    @FindBy (xpath = "//select[@name='language']")
    public WebElement languageSelect;

    @FindBy (xpath = "//input[@name='submit_personal_details']")
    public WebElement addUserButton;


    public String getAddUserText(){
        return helper.getText(addUserText);
    }

    public AddUserPage inputFirstName(String userFirstName){
        helper.sendKeys(firstName,userFirstName);
        return this;
    }

    public AddUserPage inputLastName(String userLastName){
        helper.sendKeys(lastName,userLastName);
        return this;
    }

    public AddUserPage inputEmail(String userEmail){
        helper.sendKeys(email,userEmail);
        return  this;
    }

    public AddUserPage inputUserName(String userName){
        helper.sendKeys(this.userName,userName);
        return this;
    }

    public AddUserPage inputPassword(String userPassword){
        helper.sendKeys(password,userPassword);
        return this;
    }

    public AddUserPage inputBio(String userBio){
        helper.sendKeys(bio, userBio);
        return this;
    }

    public AddUserPage selectUserType(String userType){
        dropDownHelper.selectUsingVisibleText(userTypeSelect,userType);
        return this;
    }

    public AddUserPage selectTimeZone(String timeZone){
        dropDownHelper.selectUsingVisibleText(timeZoneSelect,timeZone);
        return this;
    }

    public AddUserPage selectLanguage(String language){
        dropDownHelper.selectUsingVisibleText(languageSelect,language);
        return this;
    }

    public AddUserPage clickAddUserButton(){
        helper.click(addUserButton);
        return this;
    }


}
