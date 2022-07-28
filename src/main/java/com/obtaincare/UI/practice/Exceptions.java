package com.obtaincare.UI.practice;

import com.obtaincare.UI.dataProviders.ConfigReader;
import com.obtaincare.UI.helperMethods.DropDownHelper;
import com.obtaincare.UI.pageObject.HomePage;
import com.obtaincare.UI.pageObject.LoginPage;
import com.obtaincare.UI.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.WebDriver;

import java.util.NoSuchElementException;

public class Exceptions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        DropDownHelper dropDownHelper = new DropDownHelper();
        driver.get(ConfigReader.getProperty("environment"));

        loginPage.loginToSystem("aidar3107","Aidar548889");
        homePage.clickTalentHomeButton();

        try {
            driver.findElement(By.xpath("//a[@href=\"https://aidar.talentlms.com/user/info/id:1\"]")).click();
            Thread.sleep(2000);
        }catch (ElementNotInteractableException e){
            e.printStackTrace();
        }

        homePage.addUserButton.click();
        try {
            dropDownHelper.selectUsingIndex(driver.findElement(By.xpath("(//span[@class=\"select2-chosen\"])[1]")),3 );
        }catch (ElementNotSelectableException e){
            e.printStackTrace();
        }

        try {
            driver.findElement(By.xpath("//select[@name=\"acl_user_type_i\"]")).click();
        }catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
}
