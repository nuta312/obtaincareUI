package UI.stepDefs.AddUserSteps;

import UI.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps extends BaseTest {
    @Then("admin clicked on TalentlmsHome button")
    public void adminClickedOnTalentlmsHomeButton() {
        homePage.clickTalentHomeButton();
    }
    @When("admin clicks on Add user button")
    public void admin_clicks_on_add_user_button() {
        homePage.clickAddUserButton();
    }
}
