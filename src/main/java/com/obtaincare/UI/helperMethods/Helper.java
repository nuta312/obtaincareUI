package com.obtaincare.UI.helperMethods;

import com.obtaincare.UI.utils.Driver;
import com.sun.scenario.DelayedRunnable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Helper {


    public String getAttribute(String attribute, WebElement element) {
        return element.getAttribute(attribute);
    }

    public Helper waitElementToBeClickable(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public Helper waitElementToBeDisplayed(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public Helper click(WebElement element) {
        waitElementToBeDisplayed(element).waitElementToBeClickable(element);
        element.click();
        return this;
    }

    public Helper pause(Integer milliseconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    public Helper sendKeys(WebElement element, String str) {
        waitElementToBeDisplayed(element);
        element.sendKeys(str);
        return this;
    }

    public Helper delSendKeys(WebElement element, String str) {
        element.sendKeys(Keys.chord(Keys.COMMAND, "a"), str);
        return this;
    }

    public String getText(WebElement element) {
        return element.getText();
    }


}
