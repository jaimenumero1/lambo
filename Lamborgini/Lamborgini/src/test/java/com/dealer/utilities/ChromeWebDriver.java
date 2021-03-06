package com.dealer.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ChromeWebDriver {


//
    //    //one method to create a full chrome driver set up
    //
    //    public static WebDriver loadChromeDriver(boolean headless){
    //        WebDriverManager.chromedriver().setup();
    //
    //        ChromeOptions options = new ChromeOptions();
    //        options.addArguments("--disable-extensions");
    //        options.addArguments("--start-maximized");
    //        options.addArguments("--window-size=1920,1080");
    //
    //        if(headless){
    //            //options.setHeadless(headless);
    //            options.addArguments("--headless");
    //        }
    //
    //        WebDriver driver = new ChromeDriver(options);
    //
    //        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    //        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
    //
    //        return driver;
    //    }
    //

    public static WebDriver loadChromeDriver(boolean headless) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("--start-maximized");
        options.addArguments("--window-size=1920,1080");

        options.setHeadless(headless);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
        return driver;

    }
}
