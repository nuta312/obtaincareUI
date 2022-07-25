package UI.stepDefs;

import UI.BaseTest;
import com.obtaincare.UI.dataProviders.ConfigReader;
import com.obtaincare.UI.pageObject.UsersPageObject.UsersPageObject;
import com.obtaincare.UI.pojo.LoginPagePojo;
import com.obtaincare.UI.pojo.User;
import com.obtaincare.UI.utils.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class AddUserSteps extends BaseTest {
    @Given("login with following credentials as admin:")
    public void login_with_following_credentials_as_admin(io.cucumber.datatable.DataTable dataTable) {
        Driver.getDriver().get(ConfigReader.getProperty("environment"));
        List<String> list = dataTable.row(0);
        loginPage.loginToSystem(list.get(0), list.get(1));
    }

    @When("admin clicks on Add user button")
    public void admin_clicks_on_add_user_button() {
        homePage.clickAddUserButton();
    }

    @Then("admin should see Add user page")
    public void admin_should_see_add_user_page() {
        String expectedText = "Home / Users / Add user";
        Assertions.assertEquals(expectedText, addUserPage.getAddUserTexElement());
    }

    @When("admin fills input fields with following new user info:")
    public void admin_fills_input_fields_with_following_new_user_info(io.cucumber.datatable.DataTable dataTable) {
        addUserPage.addingUserProcess(0, dataTable);
    }

    @Then("user should see confirmation alert with text {string}")
    public void user_should_see_confirmation_alert_with_text(String string) throws InterruptedException {
        Assertions.assertEquals(string, coursesPage.getTextToastElement());
        helper.pause(2000);
    }

    @When("admin chooses all courses")
    public void admin_chooses_all_courses() throws InterruptedException {
        coursesPage.clickAllAddCourseButtons();
        helper.pause(2000);
    }

    @When("admin clicks Users button on header")
    public void admin_clicks_users_button_on_header() {
        coursesPage.clickUsersButton();
    }

    @Then("admin should see information of new user")
    public void admin_should_see_information_of_new_user() {
        usersPage.emailAndUserType();
    }
}
