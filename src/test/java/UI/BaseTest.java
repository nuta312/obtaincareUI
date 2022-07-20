package UI;

import com.obtaincare.UI.pageObject.AddUserPage;
import com.obtaincare.UI.pageObject.HomePage;
import com.obtaincare.UI.pageObject.LoginPage;

public class BaseTest {
    public LoginPage loginPage = new LoginPage();
    public HomePage homePage = new HomePage();
    public AddUserPage addUserPage= new AddUserPage();
}
