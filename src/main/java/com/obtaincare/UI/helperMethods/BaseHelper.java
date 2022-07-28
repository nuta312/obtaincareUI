package com.obtaincare.UI.helperMethods;

import com.obtaincare.UI.pageObject.BasePage;
import com.obtaincare.UI.utils.Driver;
import org.openqa.selenium.interactions.Actions;

public class BaseHelper {
    public JsExecutorHelper jsExecutorHelper = new JsExecutorHelper();
    public Actions actions = new Actions(Driver.getDriver());
    public Helper helper = new Helper();
}
