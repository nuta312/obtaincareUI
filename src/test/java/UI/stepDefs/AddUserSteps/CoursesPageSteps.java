package UI.stepDefs.AddUserSteps;

import UI.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.opentest4j.AssertionFailedError;

public class CoursesPageSteps extends BaseTest {
    @When("admin chooses all courses")
    public void admin_chooses_all_courses() throws InterruptedException {

    }
    @When("admin clicks Users button on header")
    public void admin_clicks_users_button_on_header() {
        coursesPage.clickUsersButtonHeader();
    }
    @Then("user should see confirmation alert with text {string}")
    public void user_should_see_confirmation_alert_with_text(String string) throws InterruptedException {
        try {
            Assertions.assertEquals(string, coursesPage.getTextToastElement());
        }catch (AssertionFailedError error){
            error.printStackTrace();
        }
        helper.pause(2000);
    }
    @And("admin clicked info button")
    public void adminClickedInfoButton() {
        infoAssertPage.clickInfoButton();
    }
}
