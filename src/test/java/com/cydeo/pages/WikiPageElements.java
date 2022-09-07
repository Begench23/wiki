package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiPageElements {

    public WikiPageElements() {

        PageFactory.initElements(Driver.getDriver(),this);

    }



    @FindBy(xpath = "//input[@id='searchInput']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@class='pure-button pure-button-primary-progressive']")
    public WebElement searchButton;

    @FindBy(xpath = "//h1[@id='firstHeading']")
    public WebElement mainHeader;

}
