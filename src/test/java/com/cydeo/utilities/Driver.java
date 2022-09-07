package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {


    private  Driver() throws MalformedURLException { }

    private static WebDriver driver= null;


    //private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();


    String gridAddress = "54.235.53.73";


    URL url = new URL("http://" + gridAddress + ":4444/wd/hub");


     DesiredCapabilities  dd = new DesiredCapabilities();






















    public static WebDriver getDriver(){

        if (driver == null){

            String browserType= ConfigurationReader.getKey("browser");



            switch (browserType){
                case "remote":


                    WebDriverManager.chromedriver().setup();


                    try {
                        // assign your grid server address
                        String gridAddress = "54.235.53.73";


                        URL url = new URL("http://" + gridAddress + ":4444/wd/hub");




                        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();



                        desiredCapabilities.setBrowserName("chrome");



                        // driver = new RemoteWebDriver(url,desiredCapabilities);



                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;




                case "chrome":
               // ChromeOptions options= new ChromeOptions();
              //  options.addArguments("--headless", "--window-size=1920,1200");


                    WebDriverManager.chromedriver().setup();

                driver= new ChromeDriver();







                // driver.manage().window().maximize();
                  //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver= new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }
        }

        return driver;
    }

    public static void closeInstanceDriver(){

        if (driver != null){
            driver.quit();
            driver= null;
        }

    }


}
