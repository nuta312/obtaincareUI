package UI.stepDefs;

import UI.BaseTest;
import com.obtaincare.UI.pojo.LoginPagePojo;
import com.obtaincare.UI.pojo.User;
import com.obtaincare.UI.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.DataTable;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class AddUserSteps extends BaseTest {


    @Given("login with following credentials as admin:")
    public void login_with_following_credentials_as_admin(io.cucumber.datatable.DataTable dataTable) {
        Driver.getDriver().get("https://yrysbek.talentlms.com/");
        List<String> userNameAndPassword = dataTable.row(0);
        loginPage.loginToSystem(userNameAndPassword.get(0),userNameAndPassword.get(1));
    }

    @When("admin clicks on Add user button")
    public void admin_clicks_on_add_user_button() {
        homePage.clickAddUserButton();
    }
    @Then("admin should see Add user page")
    public void admin_should_see_add_user_page() {
        String expectedText = "Home / Users / Add user";
        Assertions.assertEquals(expectedText,addUserPage.getAddUserText());
    }

    @When("admin fills input fields with following new user info:")
    public void admin_fills_input_fields_with_following_new_user_info(io.cucumber.datatable.DataTable dataTable) {
        List<String> userInfo = dataTable.row(0);
        addUserPage.inputFirstName(userInfo.get(0))
                .inputLastName(userInfo.get(1))
                .inputEmail(userInfo.get(2))
                .inputUserName(userInfo.get(3))
                .inputPassword(userInfo.get(4))
                .inputBio(userInfo.get(5))
                .selectUserType(userInfo.get(6))
                .selectTimeZone(userInfo.get(7))
                .selectLanguage(userInfo.get(8))
                .clickAddUserButton();

    }
    @Then("user should see confirmation alert with text {string}")
    public void user_should_see_confirmation_alert_with_text(String expectedText) {
     //   Assertions.assertEquals(expectedText,userCoursesPage.getToastMessage());
    }
    @When("admin chooses all courses")
    public void admin_chooses_all_courses() {
    //    userCoursesPage.clickAllCourses();
    }
    @When("admin clicks Users button on header")
    public void admin_clicks_users_button_on_header() {
      //  userCoursesPage.clickUsersButton();
    }

    @Then("admin should see information of new user \\(with email {string})")
    public void admin_should_see_information_of_new_user_with_email(String expectedEmail) {
     //   Assertions.assertTrue(usersListPage.getTextFromTable().contains(expectedEmail));
    }
}
