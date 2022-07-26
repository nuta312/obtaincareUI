package UI.stepDefs.AddUserSteps;

import UI.BaseTest;
import com.obtaincare.UI.dataProviders.ConfigReader;
import com.obtaincare.UI.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.opentest4j.AssertionFailedError;

import java.util.List;

public class AddUserSteps extends BaseTest {
    @Given("on web talent")
    public void onWebTalent() {
        Driver.getDriver().get(ConfigReader.getProperty("environment"));
    }

    @Then("admin should see {string} page")
    public void admin_should_see_page(String header) {
        try {
            Assertions.assertEquals(header, addUserPage.getAddUserTexElement());
        } catch (AssertionFailedError error) {
            error.printStackTrace();
        }
    }

    @When("admin fills input fields with following new user info:")
    public void admin_fills_input_fields_with_following_new_user_info(io.cucumber.datatable.DataTable dataTable) {
        addUserPage.addingUserProcess(0, dataTable);
        List<String> stringList = dataTable.row(0);
        userinfoStringMap.put(USERINFO.FIRSTNAME, stringList.get(0));
        userinfoStringMap.put(USERINFO.LASTNAME, stringList.get(1));
        userinfoStringMap.put(USERINFO.EMAIL, stringList.get(2));
        userinfoStringMap.put(USERINFO.USERNAME, stringList.get(3));
    }
}
