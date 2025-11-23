package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;

public class CartPage {
    WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isProductInCart(String productName) {
        try {
            driver.findElement(By.xpath("//div[@class='inventory_item_name' and text()='" + productName + "']"));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
