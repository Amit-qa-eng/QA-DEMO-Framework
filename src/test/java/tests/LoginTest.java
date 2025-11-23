package tests;

import Base.BaseTest;
import pages.LoginPage;
import org.testng.annotations.Test;
import utils.WaitUtils;
public class LoginTest extends BaseTest {
    @Test
    public void loginTestDemo() {
        driver.get("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(driver);

        // Username field visible hone ka wait
        WaitUtils.waitForVisible(driver, loginPage.username, 3);
        loginPage.login("standard_user", "secret_sauce");
    }
}
