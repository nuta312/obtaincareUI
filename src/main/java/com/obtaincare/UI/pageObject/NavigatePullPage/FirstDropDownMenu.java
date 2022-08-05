package com.obtaincare.UI.pageObject.NavigatePullPage;

import com.obtaincare.UI.pageObject.BasePage;
import com.obtaincare.UI.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FirstDropDownMenu extends BasePage {

    public FirstDropDownMenu() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "((//ul)[1]/li)[2]")
    public WebElement dropDownMenu;

    public By liElements = By.xpath("(((//ul)[1]/li)[2])/ul/li");

    public void openInNewTabDropDownElements() {
        List<WebElement> LIElements = dropDownMenu.findElements(liElements);
        actionsHelper.moveToElement(dropDownMenu);
        for (int i = 0; i < 3; i++) {
            tabHelper.openInNewTab(LIElements.get(i));
        }
    }
}
