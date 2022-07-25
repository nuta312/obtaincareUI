package UI.stepDefs;

import UI.BaseUITest;
import com.obtaincare.UI.pojo.User;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;


public class TestPOJO_steps extends BaseUITest {

    /*
    TODO Using a custom data table type will allow you to convert a table declaring values for fields in an object to a List of that object.
     */
    @DataTableType
    public User userEntryTransformer(Map<String,String> row){
        return new User(
                row.get("firstName"),
                row.get("lastName"),
                row.get("emailAddress"),
                row.get("userName"),
                row.get("password")
        );
    }

    @Given("create new user with following dataa")
    public void create_new_user_with_following_dataa(List<User> usersData) {
      addUserPage.inputFirstName(usersData.get(0).getFirstName());
      addUserPage.inputLastName(usersData.get(0).getLastName());
      addUserPage.inputEmail(usersData.get(0).getEmailAddress());
      addUserPage.inputUserName(usersData.get(0).getUserName());
      addUserPage.inputPassword(usersData.get(0).getPassword());
    }
    @Then("User successfully created with the following dataaa")
    public void user_successfully_created_with_the_following_dataaa(List<User> expectedUserDetails) {
        addUserPage.clickInfoTab();
        helper.pause(5000);
       assertEquals(expectedUserDetails.get(0).getFirstName(),helper.getAttributeByValue(addUserPage.firstNameInput));
    }
}
