package com.dealer.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
  private static WebDriver driver;

    // the goal is to make sure that there is a SINGLE driver instance running
    //SINGLETON pattern  - this means creating a class that ensures that ONLY ONE instance of
    // the object can exist at a time
    private DriverFactory() {    // this constructor is private and therefore only this
        // class can access it , This creates a SINGLETON Pattern for this class

    }

    public static WebDriver getDriver() {//will only to
        if (driver == null) {
            switch (ConfigurationReader.getProperty("browser").toLowerCase()) {
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;

                default:
                   driver = ChromeWebDriver.loadChromeDriver(Boolean.parseBoolean(ConfigurationReader.getProperty("headless")));
            }
        }
        return driver;
    }

    public static void closeDriver() {
        try {
            driver.close();
            driver.quit();
            driver = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
