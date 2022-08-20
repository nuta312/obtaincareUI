package UI.stepDefs;

import com.obtaincare.UI.utils.Driver;
import io.cucumber.core.backend.TestCaseState;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;

public class Hooks {
    @Before
    public void setUp() {
        System.out.println("This is before");


    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "screenshot");

            } catch (WebDriverException e) {
                throw new RuntimeException(e);
            }
        }
        Driver.closeDriver();
    }
}


