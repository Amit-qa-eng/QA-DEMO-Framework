package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;

public class InventoryPage {
    WebDriver driver;
    @FindBy(className = "shopping_cart_link") WebElement cartIcon;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addProductToCart(String productName) {
        WebElement addBtn = driver.findElement(
            By.xpath("//div[text()='" + productName + "']/ancestor::div[@class='inventory_item']//button")
        );
        addBtn.click();
    }

    public void goToCart() {
        cartIcon.click();
    }
}
