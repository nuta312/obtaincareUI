package com.obtaincare.UI.helperMethods;

import com.obtaincare.UI.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsHelper extends BaseHelper {

    public void moveAndClickElement(WebElement moveElement, WebElement clickElement) {
        actions.moveToElement(moveElement);
        jsExecutorHelper.click(clickElement);
    }
}
