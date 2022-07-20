package UI.stepDefs;

import UI.BaseTest;
import com.obtaincare.UI.pageObject.AddUserPage;
import com.obtaincare.UI.pageObject.LoginPage;
import com.obtaincare.UI.pojo.LoginPagePojo;
import com.obtaincare.UI.pojo.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class AddUserSteps extends BaseTest {


    @Given("login with following credentials as admin:")
    public void login_with_following_credentials_as_admin(List<LoginPagePojo> userNameAndPassword) {

        loginPage.loginToSystem(userNameAndPassword.get(0).getUserName(),userNameAndPassword.get(0).getPassword());

    }
    @When("admin clicks on Add user button")
    public void admin_clicks_on_add_user_button() {
        homePage.clickAddUserButton();
    }
    @Then("admin should see Add user page")
    public void admin_should_see_add_user_page() {
        String expectedText = "Add user";
        Assertions.assertEquals(expectedText,addUserPage.getAddUserText());
    }
    @When("admin fills input fields with following new user info:")
    public void admin_fills_input_fields_with_following_new_user_info(List<User> userInfo) {
        addUserPage.inputFirstName(userInfo.get(0).getFirstName())
                .inputLastName(userInfo.get(0).getLastName())
                .inputEmail(userInfo.get(0).getEmail())
                .inputUserName(userInfo.get(0).getUserName())
                .inputPassword(userInfo.get(0).getPassword())
                .inputBio(userInfo.get(0).getBio())
                .selectUserType(userInfo.get(0).getUserType())
                .selectTimeZone(userInfo.get(0).getTimeZone())
                .selectLanguage(userInfo.get(0).getLanguage())
                .clickAddUserButton();
    }
    @Then("user should see confirmation alert with text {string}")
    public void user_should_see_confirmation_alert_with_text(String string) {

    }
    @When("admin chooses all courses")
    public void admin_chooses_all_courses() {

    }
    @When("admin clicks Users button on header")
    public void admin_clicks_users_button_on_header() {

    }
    @Then("admin should see information of new user")
    public void admin_should_see_information_of_new_user() {

    }
}
