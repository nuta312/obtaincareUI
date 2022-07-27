package com.obtaincare.UI.pageObject.UsersPageObject;

import com.obtaincare.UI.pageObject.BasePage;
import com.obtaincare.UI.pojo.User;
import com.obtaincare.UI.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.*;

public class UsersPage extends BasePage {
    public UsersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    By trLocators = By.xpath("(//tbody)[2]/tr");
    By tdLocators = By.tagName("td");
    By divLocator = By.tagName("div");
    By iLocators = By.tagName("i");
    By delLocators = By.xpath("//i[@alt='Delete']");
    @FindBy(xpath = "(//i[@alt='Delete'])[1]")
    public WebElement delElement;
    @FindBy(xpath = "(//div[@class='tl-table-operations-trigger touchable'])[2]")
    public WebElement delete;
    @FindBy(xpath = "//a[@id='tl-confirm-submit']")
    public WebElement deleteElement;
    public void delUsers() {
        List<WebElement> delElements = Driver.getDriver().findElements(delLocators);
        for (WebElement delElement: delElements) {
            jsExecutorHelper.click(delElement);
            jsExecutorHelper.click(deleteElement);
        }
    }
//    public void clickDelElement() {
//        jsExecutorHelper.click(delElement);
//    }

    public List<UsersPageObject> valueOfRowTables() {
        List<UsersPageObject> usersPageList = new ArrayList<>();
        List<WebElement> trElements = Driver.getDriver().findElements(trLocators);
        for (WebElement tr : trElements) {
            List<WebElement> tdEmailsAndUserTypes = tr.findElements(tdLocators);
            UsersPageObject usersPage = new UsersPageObject(tdEmailsAndUserTypes.get(2).getText(), tdEmailsAndUserTypes.get(3).getText());
            usersPageList.add(usersPage);
        }
        return usersPageList;
    }

    public void getObjects() {
        for (int i = 0; i < valueOfRowTables().size(); i++) {
            System.out.println(valueOfRowTables().get(i).toString());
        }
    }

//    public void delUsers() {
//        List<WebElement> trElements = Driver.getDriver().findElements(trLocators);
//        for (WebElement tr : trElements) {
//            List<WebElement> tdElements = tr.findElements(tdLocators);
//            WebElement divElement = tdElements.get(6).findElement(divLocator);
//            WebElement divInElement = divElement.findElement(divLocator);
//            List<WebElement> iElements = divInElement.findElements(iLocators);
//            jsExecutorHelper.click(iElements.get(3));
//        }
//    }

//    @FindBy(xpath = "//table[@id='tl-users-grid']")
//    public WebElement tableOfUsers;
//
//    @FindBy(tagName = "tr")
//    public WebElement trElements;
//
//    public By trElementsLocator = By.xpath("(//tbody)[2]//tr");
//    public By tableLocator = By.xpath("//table[@id='tl-users-grid']");
//    public By tdElementsLocator = By.xpath("//td[@class=' tl-align-left hidden-phone']");
//    public By tdEmailLocator = By.xpath("(//td[@class=' tl-align-left hidden-phone'])[1]");
//    public By tdUserTypeLocator = By.xpath("(//td[@class=' tl-align-left hidden-phone'])[2]");
//
//    public By tdEmailAndUserTypeLocators = By.xpath("(//tbody)[2]//tr/td[@class=' tl-align-left hidden-phone']");
//    public By trLocators = By.xpath("//tbody/tr");
//
//    public List<UsersPageObject> emailAndUserType() {
//        List<UsersPageObject> usersPageObjectList = new LinkedList<>();
//        List<WebElement> TDEmailCollection = new ArrayList<>();
//        List<WebElement> TDUserTypeCollection = new ArrayList<>();
//        List<WebElement> TRCollection = Driver.getDriver().findElements(trElementsLocator);
//        for (WebElement tr : TRCollection) {
//            TDEmailCollection = tr.findElements(tdEmailLocator);
//        }
//        for (WebElement tr : TRCollection) {
//            TDUserTypeCollection = tr.findElements(tdUserTypeLocator);
//        }
//        for (WebElement tdEmail : TDEmailCollection) {
//            System.out.println(tdEmail.getText());
//        }
//        for (WebElement tdUserType : TDUserTypeCollection) {
//            System.out.println(tdUserType.getText());
//        }
//        for (int i = 0; i < TDEmailCollection.size(); i++) {
//            usersPageObjectList.add(new UsersPageObject(TDEmailCollection.get(i).getText(), TDUserTypeCollection.get(i).getText()));
//        }
//        return usersPageObjectList;
//    }
//
//    //    public void getText() {
////        for (int i = 0; i < email().size(); i++) {
////
////        }
////    }
//    public List<UsersPageObject> emailAndUsertypeText() {
//        List<UsersPageObject> usersPageObjectList = new ArrayList<>();
//        List<WebElement> TRCollection = Driver.getDriver().findElements(trLocators);
//        for (WebElement tr : TRCollection) {
//            String email = tr.findElement(tdEmailAndUserTypeLocators).getText();
//            String userType = tr.findElement(tdEmailAndUserTypeLocators).getText();
////            UsersPageObject usersPageObject = new UsersPageObject(email, userType);
////            usersPageObjectList.add(usersPageObject);
//        }
//        return usersPageObjectList;
////        List<WebElement> TDCollection = Driver.getDriver().findElements(tdEmailAndUserTypeLocators);
////        for(WebElement td: TDCollection){
////        }
//    }
//
//    public void getTextFromUsersPageObject() {
//        for (int i = 0; i < emailAndUsertypeText().size(); i++) {
//            System.out.println(emailAndUsertypeText().get(i).toString());
//        }
//    }
//
//    public List<UsersPageObject> rowObject() {
//        List<UsersPageObject> usersPageList = new ArrayList<>();
//        List<WebElement> TRCollection = Driver.getDriver().findElement(tableLocator).findElements(trElementsLocator);
//
//        for (int i = 0; i < TRCollection.size(); i++) {
//            WebElement element = TRCollection.get(i);
//            System.out.println(element.getText());
//            System.out.println(TRCollection.get(i).findElements(tdElementsLocator).get(0).getText() + " " + TRCollection.get(i).findElements(tdElementsLocator).get(1).getText());
////            UsersPageObject usersPageObject = new UsersPageObject(TRCollection.get(i).findElements(tdElementsLocator).get(0).getText(), TRCollection.get(i).findElements(tdElementsLocator).get(1).getText());
////            usersPageList.add(usersPageObject);
//        }
//        getTextFromObject(usersPageList);
//        return usersPageList;
//    }
//
//    public void getTextFromObject(List<UsersPageObject> objects) {
//        for (int i = 0; i < objects.size(); i++) {
//            System.out.println(objects.get(i).toString());
//        }
//    }
}

