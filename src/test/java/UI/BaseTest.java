package UI;

import com.obtaincare.UI.helperMethods.Helper;
import com.obtaincare.UI.pageObject.AddUserObject.AddUserPage;
import com.obtaincare.UI.pageObject.AddUserObject.PageObjects;
import com.obtaincare.UI.pageObject.CoursesPage;
import com.obtaincare.UI.pageObject.HomePage;
import com.obtaincare.UI.pageObject.AddUserObject.InfoAssertPage;
import com.obtaincare.UI.pageObject.LoginPage;
import com.obtaincare.UI.pageObject.UsersPageObject.UsersPage;

import java.util.HashMap;
import java.util.Map;

public class BaseTest implements PageObjects {
    public Map<USERINFO, String> userinfoStringMap = new HashMap<>();
    public LoginPage loginPage = new LoginPage();
    public HomePage homePage = new HomePage();
    public AddUserPage addUserPage = new AddUserPage();
    public CoursesPage coursesPage = new CoursesPage();
    public Helper helper = new Helper();
    public UsersPage usersPage = new UsersPage();
    public InfoAssertPage infoAssertPage = new InfoAssertPage();

}
