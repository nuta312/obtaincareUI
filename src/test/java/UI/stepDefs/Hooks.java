package UI.stepDefs;

import com.obtaincare.UI.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import java.lang.management.ManagementFactory;
import java.util.List;

public class Hooks {
    @Before
    public void setUp(){
        long threadId = Thread.currentThread().getId();
        String processName = ManagementFactory.getRuntimeMXBean().getName();
        System.out.println("Started in thread: " + threadId + ", in JVM: " + processName);

        System.out.println("This is before");
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            try{
                byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot,"image/png","screenshot");
            } catch (WebDriverException e){
                e.printStackTrace();
            }
        }
        Driver.closeDriver();
    }
}
