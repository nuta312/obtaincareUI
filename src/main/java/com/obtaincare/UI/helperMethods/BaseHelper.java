package com.obtaincare.UI.helperMethods;

import com.obtaincare.UI.utils.Driver;
import org.openqa.selenium.interactions.Actions;

public class BaseHelper {
    JsExecutorHelper jsExecutorHelper = new JsExecutorHelper();
    Actions actions = new Actions(Driver.getDriver());
    Helper helper = new Helper();
}
