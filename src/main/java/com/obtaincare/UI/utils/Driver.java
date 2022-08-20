package com.obtaincare.UI.utils;

import com.obtaincare.UI.dataProviders.ConfigReader;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class Driver {
    private Driver(){
        // Singleton Pattern

    }

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            switch (ConfigReader.getProperty("browser").toLowerCase()){
                default:driver = ChromeWebDriver.loadChromeDriver();
                break;
                case "edge": driver =EdgeWebDriver.loadEdgeDriver();
            }
        }
        return driver;
    }
    public static void closeDriver(){
        try {
            if(driver!=null){
                driver.close();
                driver.quit();
                driver= null;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
