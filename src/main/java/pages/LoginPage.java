package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    @FindBy(id = "user-name")
	public WebElement username;
    @FindBy(id = "password") WebElement password;
    @FindBy(id = "login-button") WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String uname, String pwd) {
        username.sendKeys(uname);
        password.sendKeys(pwd);
        loginBtn.click();
    }
}
