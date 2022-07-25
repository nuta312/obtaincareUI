package com.obtaincare.UI.pageObject;

import com.obtaincare.UI.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursesPage extends BasePage {
    public CoursesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement toastElement;

    @FindBy(xpath = "//i[@title='Enroll']")
    public By addCourseButtonElement;

    @FindBy(xpath = "//a[@title='Users']")
    public WebElement usersButtonElement;
    By addCourseButtonLocator = By.xpath("//i[@title='Enroll']");

    public String getTextToastElement() {
        return helper.getText(toastElement);
    }

    public void clickUsersButton() {
        helper.click(usersButtonElement);
    }

    public void clickAllAddCourseButtons() {
        tableHelper.allElementButtonsClick(addCourseButtonLocator);
    }
}
