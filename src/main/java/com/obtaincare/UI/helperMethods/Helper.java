package com.obtaincare.UI.helperMethods;

import com.obtaincare.UI.LoggerPage;

import com.obtaincare.UI.pageObject.BasePage;
import com.obtaincare.UI.utils.Driver;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Helper implements LoggerPage {

    public String getAttribute(String attribute, WebElement element) {
        getLogger().info("Getting attribute" + element);
        return element.getAttribute(attribute);
    }

    public Helper waitElementToBeClickable(WebElement element) {
        getLogger().info("Waiting to element to be clickable" + element);
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public Helper waitElementToBeDisplayed(WebElement element) {
        getLogger().info("Waiting to element to be Displayed" + element);
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public Helper click(WebElement element) {
        getLogger().info("Clicked element " + element);
        waitElementToBeDisplayed(element).waitElementToBeClickable(element);
        element.click();
        return this;
    }

    public Helper pause(Integer milliseconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
            getLogger().debug("Sleep code " + milliseconds + "milliseconds");
        } catch (Exception e) {
            e.printStackTrace();
            getLogger().error("Some exception " + e);
        }
        return this;
    }

    public Helper sendKeys(WebElement element, String str) {
        getLogger().info("Write " + str + " this text in " + element + " element");
        waitElementToBeDisplayed(element);
        element.sendKeys(str);
        return this;
    }

    public Helper delSendKeys(WebElement element, String str) {
        getLogger().info("Delete all text in " + element + " and write " + str + "this text");
        element.sendKeys(Keys.chord(Keys.COMMAND, "a"), str);
        return this;
    }

    public String getText(WebElement element) {
        getLogger().info("Get text from element " + element);
        return element.getText();
    }
    public void clickNewTab(WebElement element) {
        String clickNewTab = Keys.chord(Keys.COMMAND,Keys.ENTER);
        sendKeys(element,clickNewTab);
    }
}
