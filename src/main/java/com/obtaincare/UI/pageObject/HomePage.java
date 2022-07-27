package com.obtaincare.UI.pageObject;

import com.obtaincare.UI.helperMethods.Helper;
import com.obtaincare.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

public class HomePage extends BasePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@href = 'https://aidar.talentlms.com/user/index/gridPref:reset'])[2]")
    public WebElement userButton;
    @FindBy(xpath = "//div[@class='tl-title tl-ellipsis']")
    public WebElement homeText;

    @FindBy(xpath = "(//a[@href='https://aidar.talentlms.com/user/create'])[2]")
    public WebElement addUserButton;
    @FindBy(xpath = "//a[@href='https://aidar.talentlms.com/dashboard']")
    public WebElement talentlmsHomeButton;

    public String getHomeText() {
        return helper.getText(homeText);
    }

    public HomePage clickTalentHomeButton() {
        helper.click(talentlmsHomeButton);
        return this;
    }

    public HomePage clickAddUserButton() {
        helper.click(addUserButton);
        return this;
    }
    public HomePage clickUserButton() {
        helper.click(userButton);
        return this;
    }
}
