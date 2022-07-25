package com.obtaincare.UI.helperMethods;

import com.obtaincare.UI.utils.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JsExecutorHelper {
    public JsExecutorHelper click(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", element);
        return this;
    }
}
