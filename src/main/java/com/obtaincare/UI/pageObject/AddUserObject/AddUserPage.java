package com.obtaincare.UI.pageObject.AddUserObject;

import com.github.javafaker.Faker;
import com.obtaincare.UI.pageObject.BasePage;
import com.obtaincare.UI.utils.Driver;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddUserPage extends BasePage implements PageObjects {


    public AddUserPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class=\"tl-title tl-ellipsis\"]")
    public WebElement addUserTexElement;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement firstNameElement;

    @FindBy(xpath = "//input[@name='surname']")
    public WebElement lastNameElement;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailElement;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement userNameElement;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordElement;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement bioElement;

    @FindBy(xpath = "//select[@name='acl_user_type_id']")
    public WebElement userTypeSelectElement;

    @FindBy(xpath = "//select[@name='timezone']")
    public WebElement timeZoneSelectElement;

    @FindBy(xpath = "//select[@name='language']")
    public WebElement languageSelectElement;

    @FindBy(xpath = "//input[@name='submit_personal_details']")
    public WebElement addUserButtonElement;


    public String getAddUserTexElement() {
        return helper.getText(addUserTexElement);
    }

    public AddUserPage inputFirstName(String userFirstName) {
        helper.sendKeys(firstNameElement, userFirstName);
        return this;
    }

    public AddUserPage inputLastName(String userLastName) {
        helper.sendKeys(lastNameElement, userLastName);
        return this;
    }

    public AddUserPage inputEmail(String userEmail) {
        helper.sendKeys(emailElement, userEmail);
        return this;
    }

    public AddUserPage inputUserName(String userName) {
        helper.delSendKeys(userNameElement, userName);
        return this;
    }

    public AddUserPage inputPassword(String userPassword) {
        helper.sendKeys(passwordElement, userPassword);
        return this;
    }

    public AddUserPage inputBio(String userBio) {
        helper.sendKeys(bioElement, userBio);
        return this;
    }

    public AddUserPage selectUserType(String userType) {
        dropDownHelper.selectUsingVisibleText(userTypeSelectElement, userType);
        return this;
    }

    public AddUserPage selectTimeZone(String timeZone) {
        dropDownHelper.selectUsingVisibleText(timeZoneSelectElement, timeZone);
        return this;
    }

    public AddUserPage selectLanguage(String language) {
        dropDownHelper.selectUsingVisibleText(languageSelectElement, language);
        return this;
    }

    public AddUserPage clickAddUserButton() {
        helper.click(addUserButtonElement);
        return this;
    }

//    private String generateRandomValue(String value){
//        Faker faker = new Faker();
//        faker.internet().emailAddress();
//        return value;
//    }


    public void addingUserProcess(int indexOfObject, DataTable dataTable) {

        List<String> userList = dataTable.row(indexOfObject);
        inputFirstName(userList.get(addUserMap().get(USERINFO.FIRSTNAME)))
                .inputLastName(userList.get(addUserMap().get(USERINFO.LASTNAME)))
                .inputEmail(userList.get(addUserMap().get(USERINFO.EMAIL)))
                .inputUserName(userList.get(addUserMap().get(USERINFO.USERNAME)))
                .inputPassword(userList.get(addUserMap().get(USERINFO.PASSWORD)))
                .inputBio(userList.get(addUserMap().get(USERINFO.BIO)))
                .selectUserType(userList.get(addUserMap().get(USERINFO.USERTYPE)))
                .selectTimeZone(userList.get(addUserMap().get(USERINFO.TIMEZONE)))
                .selectLanguage(userList.get(addUserMap().get(USERINFO.LANGUAGE)))
                .clickAddUserButton();
//        inputFirstName(mapOfUsers.get(USERINFO.FIRSTNAME))
//                .inputLastName(mapOfUsers.get(USERINFO.LASTNAME))
//                .inputEmail(mapOfUsers.get(USERINFO.EMAIL))
//                .inputUserName(mapOfUsers.get(USERINFO.USERNAME))
//                .inputPassword(mapOfUsers.get(USERINFO.PASSWORD))
//                .inputBio(mapOfUsers.get(USERINFO.BIO))
//                .selectUserType(mapOfUsers.get(USERINFO.USERTYPE))
//                .selectTimeZone(mapOfUsers.get(USERINFO.TIMEZONE))
//                .selectLanguage(mapOfUsers.get(USERINFO.LANGUAGE))
//                .clickAddUserButton();
//        inputFirstName(userList.get(0).getFirstName())
//                .inputLastName(userList.get(0).getLastName())
//                .inputEmail(userList.get(0).getEmail())
//                .inputUserName(userList.get(0).getUserName())
//                .inputPassword(userList.get(0).getPassword())
//                .inputBio(userList.get(0).getBio())
//                .selectUserType(userList.get(0).getUserType())
//                .selectTimeZone(userList.get(0).getTimeZone())
//                .selectLanguage(userList.get(0).getLanguage())
//                .clickAddUserButton();
    }
}
