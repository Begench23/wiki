package com.cydeo.step_definitions;

import com.cydeo.pages.WikiPageElements;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikiStepDefs {

    WikiPageElements elements = new WikiPageElements();

    @Given("User in Wikipedia home page")
    public void user_in_wikipedia_home_page() {

        Driver.getDriver().get("https:www.Wikipedia.org");

    }

    @When("user type {string} in the wiki search box")
    public void user_type_in_the_wiki_search_box(String string) {

        elements.searchBox.sendKeys(string);

    }

    @When("user click wiki search button")
    public void user_click_wiki_search_button() {

        elements.searchButton.click();
    }

    @Then("user sees {string} is in wiki title")
    public void user_sees_is_in_wiki_title(String string) {

        Assert.assertTrue("Fail", Driver.getDriver().getTitle().contains(string));

    }

    @Then("user sees {string} is in wiki header")
    public void user_sees_is_in_wiki_header(String string) {

        String text = elements.mainHeader.getText();
        System.out.println(text);

        Assert.assertEquals(elements.mainHeader.getText(),string);

    }


}