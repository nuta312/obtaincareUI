package com.obtaincare.UI.pageObject;

import com.obtaincare.UI.pojo.User;
import com.obtaincare.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserCoursesPage extends BasePage{

    public UserCoursesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//div[@class=\"toast-message\"]")
    public WebElement toastMessage;

    @FindBy (xpath = "//tbody/tr[1]/td[6]//i")
    public WebElement addFirstCourse;

    @FindBy (xpath = "//tbody/tr[2]/td[6]//i")
    public WebElement addSecondCourse;

    @FindBy (xpath = "//tbody/tr[3]/td[6]//i")
    public WebElement addThirdCourse;

    @FindBy (xpath = "//tbody/tr[4]/td[6]//i")
    public WebElement addFourthCourse;

    @FindBy (xpath = "//tbody/tr[5]/td[6]//i")
    public WebElement addFifthCourse;

    @FindBy (xpath = "//tbody/tr[6]/td[6]//i")
    public WebElement addSixthCourse;

    @FindBy (xpath = "(//a[@href=\"https://yrysbek.talentlms.com/user/index/gridPref:reset\"])[2]")
    public WebElement usersButton;

    public String getToastMessage(){
        return helper.getText(toastMessage);
    }

    public UserCoursesPage clickAllCourses(){
        helper.click(addFirstCourse)
                .click(addSecondCourse)
                .click(addThirdCourse)
                .click(addFourthCourse)
                .click(addFifthCourse)
                .click(addSixthCourse);
        return this;
    }

    public UserCoursesPage clickUsersButton(){
        helper.click(usersButton);
        return this;
    }
}
