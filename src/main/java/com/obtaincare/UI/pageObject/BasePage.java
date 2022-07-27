package com.obtaincare.UI.pageObject;

import com.obtaincare.UI.helperMethods.DropDownHelper;
import com.obtaincare.UI.helperMethods.Helper;
import com.obtaincare.UI.helperMethods.JsExecutorHelper;
import com.obtaincare.UI.helperMethods.TableHelper;

public class BasePage {

    public Helper helper = new Helper();
    public DropDownHelper dropDownHelper = new DropDownHelper();
    public TableHelper tableHelper = new TableHelper();
    public JsExecutorHelper jsExecutorHelper = new JsExecutorHelper();

}
