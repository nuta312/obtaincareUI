package com.obtaincare.UI.asserts;
import static org.junit.jupiter.api.Assertions.*;
import com.obtaincare.UI.helperMethods.Helper;
import org.openqa.selenium.WebElement;

public class AssertClass extends Helper {
    public void assertText(String expected, WebElement actual, String message){
        waitElementToBeDisplayed(actual);
        assertEquals(  expected, actual.getText()+"Comparing " + message + ""+ ":" );


    }
}
