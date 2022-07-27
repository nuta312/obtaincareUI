package com.obtaincare.UI.helperMethods;

import com.obtaincare.UI.utils.Driver;

public class NavigateHelper {
    public void navigateBack() {
        Driver.getDriver().navigate().back();
    }
}
