package com.obtaincare.UI.asserts;

import com.obtaincare.UI.helperMethods.BaseHelper;

import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.WebElement;

public class AssertsClass extends BaseHelper {
    Thread thread = new Thread();

    public void assertText(String expected, WebElement actual, String message) {
        helper.waitElementToBeDisplayed(actual);
        assertEquals(expected, actual.getText(), " Comparing: " + message);
    }

    public void assertAttribute(String expected, String attributeValue, WebElement actual, String message) {
        helper.waitElementToBeDisplayed(actual);
        assertEquals(expected, helper.getAttribute(attributeValue, actual), " Comparing: " + message);
    }
}
