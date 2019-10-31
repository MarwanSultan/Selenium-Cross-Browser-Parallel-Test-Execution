package com.amazon.marwan.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAmazonPrime_Page {

    WebDriver driver;

    @FindBy(id = "twotabsearchtextbox")
    @CacheLookup
    private
    WebElement enterProduct;

    @FindBy(css = "#nav-link-accountList > span.nav-line-1")
    WebElement signInLinkk;

    @FindBy(css = "#nav-logo > a.nav-logo-link > span.nav-sprite.nav-logo-base")
    private
    WebElement amazonHeader;




    /////////////////////////////////////////////////////
    public UserAmazonPrime_Page(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }
    /////////////////////////////////////////////////////



    
    public void validateHeader(){
        amazonHeader.isDisplayed();

    }

    private void searchProduct(String strProduct) {

        enterProduct.sendKeys(strProduct);

    }

    public void amazonProductSearch(String strProduct){

        this.searchProduct(strProduct);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);

    }
    
    public void gotoAmazonHome() {
        new AmazonHome_Page(driver);
    }

}
