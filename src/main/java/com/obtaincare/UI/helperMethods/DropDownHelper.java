package com.obtaincare.UI.helperMethods;

import com.obtaincare.UI.LoggerPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHelper implements LoggerPage {



    public DropDownHelper selectUsingVisibleText(WebElement element, String visibleText) {
        getLogger().trace("Using select class to select by " + visibleText + "visibleText");
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);
        return this;
    }

    public DropDownHelper selectUsingValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
        return this;
    }

    public DropDownHelper selectUsingIndex(WebElement element, int index){
        Select select = new Select(element);
        select.selectByIndex(index);
        return this;
    }
}
