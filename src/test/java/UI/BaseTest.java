package UI;

import com.github.javafaker.Faker;
import com.obtaincare.UI.helperMethods.Helper;
import com.obtaincare.UI.pageObject.AddUserObject.AddUserPage;
import com.obtaincare.UI.pageObject.CoursesPage;
import com.obtaincare.UI.pageObject.HomePage;
import com.obtaincare.UI.pageObject.LoginPage;
import com.obtaincare.UI.pageObject.UsersPageObject.UsersPage;

public class BaseTest {
    public LoginPage loginPage = new LoginPage();
    public HomePage homePage = new HomePage();
    public AddUserPage addUserPage= new AddUserPage();
    public CoursesPage coursesPage = new CoursesPage();
    public Helper helper = new Helper();
    public UsersPage usersPage = new UsersPage();
    public Faker faker = new Faker();
}
