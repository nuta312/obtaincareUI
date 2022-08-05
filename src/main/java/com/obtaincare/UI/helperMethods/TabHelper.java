package com.obtaincare.UI.helperMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TabHelper {
    public TabHelper openInNewTab(WebElement element) {
        element.sendKeys(Keys.chord(Keys.COMMAND, Keys.ENTER));
        return this;
    }
}
