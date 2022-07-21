package com.obtaincare.UI.pageObject;

import com.obtaincare.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersListPage extends BasePage{

    public UsersListPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//table[@id='tl-users-grid']")
    public WebElement usersTable;


    public String getTextFromTable(){
        return helper.getText(usersTable);
    }
}
