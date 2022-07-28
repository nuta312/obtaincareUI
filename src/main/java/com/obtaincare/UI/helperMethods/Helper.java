package com.obtaincare.UI.helperMethods;

import com.obtaincare.UI.utils.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Helper {

    private static Logger logger = LogManager.getLogger(Helper.class);


    public Helper waitElementToBeClickAble(WebElement element) {
        logger.info("Waiting to Element to be clickable " + element);
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public Helper waitElementToBeDisplayed(WebElement element) {
        logger.info("Waiting to Element to be displayed " + element);
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public Helper click(WebElement element){
        logger.info("Clicking the element " + element);
        waitElementToBeDisplayed(element).waitElementToBeClickAble(element);
        element.click();
        return this;
    }

    public Helper pause(Integer milliseconds){
        try {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public Helper sendKeys(WebElement element, String str){
        logger.info("Writing the " + str + " to " + element);
        waitElementToBeDisplayed(element);
        element.sendKeys(str);
        return this;
    }

    public Helper sendKeysWithClear(WebElement element,String str){
        waitElementToBeDisplayed(element);
        element.clear();
        element.sendKeys(str);
        return this;
    }

    public String getAttributeByValue(WebElement element){
        waitElementToBeDisplayed(element);
       return   element.getAttribute("value");
    }

}
