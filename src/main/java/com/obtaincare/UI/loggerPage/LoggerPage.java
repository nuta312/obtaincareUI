package com.obtaincare.UI.loggerPage;

import lombok.extern.java.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface LoggerPage {
    default Logger getLogger(){
        Logger logger;
        return logger = LogManager.getLogger(this.getClass());
    }
}
