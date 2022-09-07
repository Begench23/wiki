package com.cydeo.step_definitions;

import com.cydeo.pages.ElementsPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assumptions;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;
import org.openqa.selenium.*;
//import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class GoogleStepDefinitions {

    @When("user is on Google search page")
    public void user_is_on_google_search_page() {

//        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

//        Wait<WebDriver> wt = new FluentWait<>(Driver.getDriver());
//        wt
//
//        Wait<WebDriver> wait=new FluentWait<WebDriver >(Driver.getDriver()).
//                withTimeout(5,timeUnit.seconds).
//                pollingEvery(100,time. milliseconds).ignoring(NoSuchElementException.class);

        Driver.getDriver().get("https://www.google.com");

    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();



//        if (actualTitle.equalsIgnoreCase("expectedTitle")){
//            Driver.closeInstanceDriver();
//        }

    }

    @When("user types {string} and clicks enter")
    public void user_types_and_clicks_enter(String string) {
        ElementsPage els= new ElementsPage();
        els.searchBox.sendKeys(string + Keys.ENTER);

        ElementsPage elementsPage = new ElementsPage();
        WebElement searchBox = elementsPage.searchBox;
        Driver.getDriver().findElements(By.tagName("a"));

       // searchBox.
        Assert.assertTrue(Driver.getDriver().getTitle().contains("exp"));

//        SoftAssertions soft = new SoftAssertions();
//
//        soft.assertThat("A").isEqualTo("b");
//        soft.assertAll();
    }


    @Then("user sees {string} in the google title")
    public void user_sees_in_the_google_title(String exp) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("exp"));



       // Assumptions.assumeThat()







}


    @Test
    public  void testtt(){}


    @When("I hover over the {string} | {string} | {string} | {string} | {string}  menu")
    public void i_hover_over_the_menu(String string, String string2, String string3, String string4, String string5) {
        // Write code here that turns the phrase above into concrete actions
    }



}


