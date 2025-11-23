package tests;

import Base.BaseTest;
import pages.InventoryPage;
import pages.LoginPage;
import org.testng.annotations.Test;

public class InventoryTest extends BaseTest {
    @Test
    public void addProductToCartTest() {
        driver.get("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.addProductToCart("Sauce Labs Backpack");
        inventoryPage.goToCart();
    }
}
