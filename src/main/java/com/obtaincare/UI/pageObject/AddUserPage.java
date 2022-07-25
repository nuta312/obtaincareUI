package com.obtaincare.UI.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPage extends BasePage {

    @FindBy(xpath = "//input[@name='name']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@name='surname']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailAddressInput;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement bioInput;

    @FindBy(xpath = "//input[@name='submit_personal_details']")
    public WebElement addUserButton;

    @FindBy(xpath = "//a[text()='Info']")
    public WebElement infoTab;

    public AddUserPage inputFirstName(String userFirstName) {
        helper.sendKeys(firstNameInput, userFirstName);
        return this;
    }

    public AddUserPage inputLastName(String userLastName) {
        helper.sendKeys(lastNameInput, userLastName);
        return this;
    }

    public AddUserPage inputEmail(String userEmail) {
        helper.sendKeys(emailAddressInput, userEmail);
        return this;
    }

    public AddUserPage inputUserName(String userName) {
        helper.sendKeysWithClear(usernameInput, userName);
        return this;
    }

    public AddUserPage inputPassword(String userPassword) {
        helper.sendKeys(passwordInput, userPassword);
        return this;
    }

    public AddUserPage inputBio(String userBio) {
        helper.sendKeys(bioInput, userBio);
        return this;
    }

    public AddUserPage clickAddUserButton(){
        helper.click(addUserButton);
        return this;
    }

}
