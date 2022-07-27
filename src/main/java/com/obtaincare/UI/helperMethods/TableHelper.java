package com.obtaincare.UI.helperMethods;

import com.obtaincare.UI.utils.Driver;
import javafx.scene.control.Tab;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TableHelper extends BaseHelper {
    public TableHelper allElementButtonsClick(By locator) {
        List<WebElement> iElements = Driver.getDriver().findElements(locator);
        for (WebElement iElement : iElements) {
            jsExecutorHelper.click(iElement);
        }
        return this;
    }

}
