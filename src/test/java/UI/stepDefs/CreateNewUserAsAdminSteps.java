package UI.stepDefs;

import UI.BaseUITest;
import com.obtaincare.UI.dataProviders.ConfigReader;
import com.obtaincare.UI.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.*;



public class CreateNewUserAsAdminSteps extends BaseUITest {

    String expectedFirstName = mockDataGenerator.generateMockFirstName();
    String expectedLastName = mockDataGenerator.generateMockLastName();
    String expectedEmail = mockDataGenerator.generateMockEmail();
    String expectedUserName = mockDataGenerator.generateMockUserName();

    @Given("user is on Home page")
    public void user_is_on_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("environment"));
        loginPage.inputUserName("Ezan23");
        loginPage.inputPassword("Ezan200054451013@");
        loginPage.clickLoginButton();
    }


    @Given("click on add new User button")
    public void click_on_add_new_user_button() {
        homePage.clickAddUserButton();
        helper.pause(5000);
    }

    @Given("create new user with following data")
    public void create_new_user_with_following_data(io.cucumber.datatable.DataTable dataTable) {
        addUserPage.inputFirstName(expectedFirstName)
                .inputLastName(expectedLastName)
                .inputEmail(expectedEmail)
                .inputUserName(expectedUserName)
                .inputPassword("Test123!@");
    }

    @Given("click Add new user button")
    public void click_add_new_user_button() {
        helper.click(addUserPage.addUserButton);
        helper.pause(5000);
    }

    @Then("User successfully created with the following data")
    public void user_successfully_created_with_the_following_data(io.cucumber.datatable.DataTable dataTable) {
        helper.click(addUserPage.infoTab);
        assertEquals(expectedFirstName,helper.getAttributeByValue(addUserPage.firstNameInput));
        assertEquals(expectedLastName,helper.getAttributeByValue(addUserPage.lastNameInput));
        assertEquals(expectedEmail,helper.getAttributeByValue(addUserPage.emailAddressInput));
    }


    @And("Delete new created user")
    public void deleteNewCreatedUser() {


    }
}
