package com.obtaincare.UI.pageObject;

import com.obtaincare.UI.helperMethods.Helper;
import com.obtaincare.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='tl-title tl-ellipsis']")
    public WebElement homeText;

    @FindBy(xpath = "(//a[@href='https://yrysbek.talentlms.com/user/create'])[2]")
    public WebElement addUserButton;


    public String getHomeText(){
        return helper.getText(homeText);
    }

    public HomePage clickAddUserButton(){
        helper.click(addUserButton);
        return this;
    }
}
