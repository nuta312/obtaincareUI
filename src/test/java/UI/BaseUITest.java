package UI;

import com.github.javafaker.Faker;
import com.obtaincare.UI.dataProviders.MockDataGenerator;
import com.obtaincare.UI.helperMethods.Helper;
import com.obtaincare.UI.pageObject.AddUserPage;
import com.obtaincare.UI.pageObject.HomePage;
import com.obtaincare.UI.pageObject.LoginPage;

public abstract class BaseUITest {
    protected static AddUserPage addUserPage = new AddUserPage();
    protected static HomePage homePage = new HomePage();
    protected static LoginPage loginPage = new LoginPage();
    protected static Helper helper = new Helper();

    protected static Faker faker = new Faker();

    protected static MockDataGenerator mockDataGenerator = new MockDataGenerator();


}
