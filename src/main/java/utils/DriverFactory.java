package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager; // ye import revise ho jayega

public class DriverFactory {
    public static WebDriver getDriver() {
        WebDriverManager.chromedriver().setup(); // yahan bas yeh call karna hoga
        return new ChromeDriver();
    }
}

