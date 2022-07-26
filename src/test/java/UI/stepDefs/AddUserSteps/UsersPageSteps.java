package UI.stepDefs.AddUserSteps;

import UI.BaseTest;
import io.cucumber.java.en.Then;

public class UsersPageSteps extends BaseTest {
    @Then("admin should see information of new user")
    public void admin_should_see_information_of_new_user() {
        usersPage.getObjects();
    }
}
