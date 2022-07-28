package com.obtaincare.UI.pageObject;

import com.obtaincare.UI.helperMethods.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BasePage {

    public Helper helper = new Helper();
    public DropDownHelper dropDownHelper = new DropDownHelper();
    public TableHelper tableHelper = new TableHelper();
    public JsExecutorHelper jsExecutorHelper = new JsExecutorHelper();
    public ActionsHelper actionsHelper = new ActionsHelper();

}
