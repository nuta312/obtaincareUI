package com.obtaincare.UI.practice;

import com.obtaincare.UI.helperMethods.Helper;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SauceLabsDemo {

    public static void main(String[] args) throws MalformedURLException {


        String url = "https://oauth-devnb312-9cb78:2461c151-a63e-4914-a4f9-fbddafd47714@ondemand.eu-central-1.saucelabs.com:443/wd/hub";


        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", Platform.MOJAVE);
        capabilities.setCapability("browserName", BrowserType.SAFARI);
        capabilities.setCapability("browserVersion","latest");

        WebDriver driver = new RemoteWebDriver(new URL(url),capabilities);

        driver.get("https://www.etsy.com/");

        WebElement searchInput = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
        searchInput.sendKeys("Dior");
        searchInput.sendKeys(Keys.ENTER);

        Helper helper = new Helper();
        helper.pause(5000);

        driver.close();
        driver.quit();
    }
}
