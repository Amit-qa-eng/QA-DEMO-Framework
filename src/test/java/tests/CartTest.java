package tests;

import Base.BaseTest;
import pages.LoginPage;
import pages.InventoryPage;
import pages.CartPage;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {
    @Test
    public void verifyCartHasProductTest() {
        driver.get("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.addProductToCart("Sauce Labs Backpack");
        inventoryPage.goToCart();

        CartPage cartPage = new CartPage(driver);
        boolean productInCart = cartPage.isProductInCart("Sauce Labs Backpack");

        assert productInCart == true;
    }
}
