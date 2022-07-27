package UI.stepDefs.DellUsersSteps;

import UI.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps extends BaseTest {
    @Given("admin clicked Users button")
    public void admin_clicked_users_button() {
        homePage.clickUserButton();
    }
}
