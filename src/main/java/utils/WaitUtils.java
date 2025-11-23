package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
	public static void waitForVisible(WebDriver driver, WebElement element, int timeout) {
	    new WebDriverWait(driver, Duration.ofSeconds(timeout))
	        .until(ExpectedConditions.visibilityOf(element));
	}
}