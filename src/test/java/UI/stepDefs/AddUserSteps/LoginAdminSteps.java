package UI.stepDefs.AddUserSteps;

import UI.BaseTest;
import io.cucumber.java.en.Given;

import java.util.List;

public class LoginAdminSteps extends BaseTest {
    @Given("login with following credentials as admin:")
    public void login_with_following_credentials_as_admin(io.cucumber.datatable.DataTable dataTable) {
        List<String> stringList = dataTable.row(0);
        loginPage.loginToSystem(stringList.get(0), stringList.get(1));
    }
}
