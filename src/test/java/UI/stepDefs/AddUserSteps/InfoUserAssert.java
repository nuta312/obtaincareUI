package UI.stepDefs.AddUserSteps;

import UI.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.opentest4j.AssertionFailedError;

public class InfoUserAssert extends BaseTest {

    @Then("admin should see created user's userInfo")
    public void adminShouldSeeCreatedUserSUserInfo() {
        try {
            Assertions.assertEquals(userinfoStringMap.get(USERINFO.FIRSTNAME), infoAssertPage.getTextFirstnameInfo());
            Assertions.assertEquals(userinfoStringMap.get(USERINFO.LASTNAME), infoAssertPage.getTextLastNameInfo());
            Assertions.assertEquals(userinfoStringMap.get(USERINFO.EMAIL), infoAssertPage.getTextEmailInfo());
            Assertions.assertEquals(userinfoStringMap.get(USERINFO.USERNAME), infoAssertPage.getTextUsernameInfo());
        }catch (AssertionFailedError error) {
            error.printStackTrace();
        }
    }

    @And("admin clicked courses button")
    public void adminClickedCoursesButton() {
        infoAssertPage.clickCoursesButton();
    }
}
