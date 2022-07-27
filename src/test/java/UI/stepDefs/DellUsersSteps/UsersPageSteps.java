package UI.stepDefs.DellUsersSteps;

import UI.BaseTest;
import io.cucumber.java.en.Then;

public class UsersPageSteps extends BaseTest {
    @Then("admin delete all user's userInfo")
    public void admin_delete_all_user_s_user_info() {
        usersPage.delUsers();
        helper.pause(5000);
    }

    @Then("admin should see only SuperAdmin user")
    public void admin_should_see_only_super_admin_user() {

    }
}
