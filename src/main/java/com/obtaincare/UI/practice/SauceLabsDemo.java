package com.obtaincare.UI.practice;

import com.obtaincare.UI.helperMethods.Helper;
import com.obtaincare.UI.pageObject.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SauceLabsDemo {
    public static void main(String[] args) throws MalformedURLException {
        final String USERNAME = "oauth-aidar3107-e0ba9";
        final String ACCESS_KEY = "e1743c20-7036-4f8c-ac65-6b2a06f9e062";
        final String URL = "https://oauth-aidar3107-e0ba9:e1743c20-7036-4f8c-ac65-6b2a06f9e062@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", Platform.WIN10);
        capabilities.setCapability("browserName", BrowserType.CHROME);
        capabilities.setCapability("browserVersion","latest");

        WebDriver driver = new RemoteWebDriver(new URL(URL),capabilities);
        driver.get("https://www.etsy.com/?ref=lgo");

        WebElement searchElement = driver.findElement(By.xpath("//input[@data-id=\"search-query\"]"));
        searchElement.sendKeys("Dior");
        searchElement.sendKeys(Keys.ENTER);

        Helper helper1 = new Helper();
        helper1.pause(2000);
    }
}
