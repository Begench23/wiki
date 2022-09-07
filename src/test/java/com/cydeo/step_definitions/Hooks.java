package com.cydeo.step_definitions;

    // pre/post -condition for each scenario and each step

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import java.util.Arrays;

public class Hooks {

   @Before
    public void setUpScenario(){
        System.out.println("started");
    }

   @After
    public void teardownScenario(Scenario scr){
        System.out.println("finish");

 if (scr.isFailed()) {

     TakesScreenshot shot= (TakesScreenshot) Driver.getDriver();

     byte[] st = shot.getScreenshotAs(OutputType.BYTES);


     scr.attach(st,"image/jpg", scr.getName());


 }

        // Driver.getDriver().findElement(By.tagName("a")).get





        Driver.closeInstanceDriver();


    }

    @BeforeStep
    public void stepSetUp(){
        System.out.println("step go");
    }
    @AfterStep
    public void teardownStep(){
        System.out.println("step done");

    }

}
