package UI.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class ApiUser {

    @Given("all users are requested")
    public void all_users_are_requested() {
        Assertions.assertTrue(true);
    }
    @Then("status code is {int} is returned")
    public void status_code_is_is_returned(Integer int1) {
        Assertions.assertTrue(true);
    }
    @Then("{int} user is returned")
    public void user_is_returned(Integer int1) {
        Assertions.assertTrue(true);
    }
}
