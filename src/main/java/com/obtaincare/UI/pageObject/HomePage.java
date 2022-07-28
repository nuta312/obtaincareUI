package com.obtaincare.UI.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "(//a [@href='https://esen237.talentlms.com/user/create'])[2]")
    public WebElement addUserButton;

    public HomePage clickAddUserButton(){
        helper.click(addUserButton);
        return this;
    }




}
