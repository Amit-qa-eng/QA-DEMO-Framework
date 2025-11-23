package Base;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.DriverFactory;

public abstract class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        // Browser ko start karo, har test se pehle
        driver = DriverFactory.getDriver();
    }

    @AfterMethod
    public void tearDown() {
        // Browser close karo, har test ke baad
        if (driver != null) {
            driver.quit();
        }
    }
}
