package com.cydeo.step_definitions;

import com.cydeo.pages.ElementsPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ALogin_StepDefinitions {



    @When("user enters librarian username")
    public void user_enters_librarian_username(Scenario s) {
        System.out.println("user enters librarian username");

        ElementsPage el = new ElementsPage();
        ElementsPage ql2= new ElementsPage();


        //Driver.getDriver().findElement()


        byte[] shot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        s.attach(shot, "image/png", s.getName());


    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("user enters librarian password");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("user should see the dashboard");

    }

    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("user enters student username");
    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
        System.out.println("user enters student password");
    }

    @When("user enters admin user name")
    public void user_enters_admin_user_name() {
        System.out.println("user en†ers admin user name");
    }

    @When("user enters admin password")
    public void user_enters_admin_password() {
        System.out.println("user enters admin password");

    }

    @Given("user is on the library login page")
    public void user_is_on_the_library_login_page() {
        System.out.println("aaaa");

    }

}
