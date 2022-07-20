package com.obtaincare.UI.helperMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHelper {

    public DropDownHelper selectUsingVisibleText(WebElement element, String visibleText) {
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
