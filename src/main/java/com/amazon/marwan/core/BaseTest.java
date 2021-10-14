package com.amazon.marwan.core;


import com.amazon.marwan.interfaces.ElementLocator;
import com.amazon.marwan.resources.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.List;

public class BaseTest implements ElementLocator {


    protected WebDriver driver;

    WebDriverWait wait;

    
    
    @BeforeMethod
    public void log() {
        System.out.println("METHOD INITIALIZATION");
    }


    @BeforeTest
    @Parameters( {"browser"} )
    public void setup(String browser) throws InterruptedException {
        
        if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
    
        }


        driver.get("https://www.amazon.com");
        //driver.manage().window().maximize();

        WebElement logo = driver.findElement(By.id("nav-logo"));

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-link-accountList")));

        Assert.assertTrue(logo.isDisplayed());
        HelperClass h = new HelperClass(driver);
        driver.manage().window().setPosition(new Point(100,400));//

    }


    @AfterTest
    public void tearDown() { 
      
        //driver.manage().window().setPosition(new Point(100,400));
        driver.manage().window().setPosition(new Point(1025, 900));
        driver.quit();
    }


    protected WebDriver getDriver() {
        return driver;

    }
    


    public WebElement findElement() {
        return null;
    }

    public List<WebElement> findElements() {
        return null;
    }
}



