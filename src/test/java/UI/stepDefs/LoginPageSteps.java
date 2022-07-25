package UI.stepDefs;

import UI.BaseTest;
import com.obtaincare.UI.dataProviders.ConfigReader;
import com.obtaincare.UI.pageObject.HomePage;
import com.obtaincare.UI.pageObject.LoginPage;
import com.obtaincare.UI.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

public class LoginPageSteps extends BaseTest {

    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("environment"));
    }

    @When("user types {string} in username field")
    public void user_types_in_username_field(String userName) {
        loginPage.inputUserName(userName);
    }

    @When("user types {string} in password field")
    public void user_types_in_password_field(String password) {
        loginPage.inputPassword(password);
    }

    @When("user clicks on Login button")
    public void user_clicks_on_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("user should successfully land to Home page")
    public void user_should_successfully_land_to_home_page() {
        Assertions.assertEquals("Home", homePage.getHomeText());
    }
}
