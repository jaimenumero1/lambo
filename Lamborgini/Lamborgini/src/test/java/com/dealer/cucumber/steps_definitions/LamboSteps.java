package com.dealer.cucumber.steps_definitions;

import com.dealer.utilities.ConfigurationReader;
import com.dealer.utilities.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LamboSteps {
   public static WebDriver driver;

    public static void main(String[] args) {

    }

    @Given("^you are on website$")
    public void you_are_on_website(){

        driver = DriverFactory.getDriver();
        driver.navigate().to(ConfigurationReader.getProperty("baseUrl"));



    }

    @When("^you select \"model (\\d+)$")
    public void you_select_model(int model) throws Throwable {
        driver = DriverFactory.getDriver();
        driver.navigate().to(ConfigurationReader.getProperty("baseUrl"));
        WebElement car718 = driver.findElement(By.xpath("//img[@alt=\"Porsche - 718\"]"));
        car718.click();
        WebElement priceOfCar = driver.findElement(By.xpath("//div[.='From $ 71,900*']"));
        System.out.println(priceOfCar.getText());
    }

    @When("^click on (\\d+) model S and save the price$")
    public void click_on_model_S_and_save_the_price(int arg1) throws Throwable {

    }

    @Then("^then price should be base price plus Delivery plus Processing and Handling$")
    public void then_price_should_be_base_price_plus_Delivery_plus_Processing_and_Handling() throws Throwable {

    }

}
