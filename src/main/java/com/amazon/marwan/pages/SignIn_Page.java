package com.amazon.marwan.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class SignIn_Page {

    WebDriver driver;

    @FindBy(id = "ap_email")
    private
    WebElement emailAddressField;

    @FindBy(id = "ap_password")
    private
    WebElement passwordField;

    @FindBy(id = "signInSubmit")
    private
    WebElement signInButton;



    ////////////////////////////////////
    public SignIn_Page(WebDriver driver){
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }
    ///////////////////////////////////
    private void enterEmailAddress(String uname){
        emailAddressField.clear();
        emailAddressField.sendKeys(uname);
        this.emailAddressField.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    private void enterPassword(String pass){
        passwordField.clear();
        passwordField.sendKeys(pass);
        this.passwordField.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

   

  
    
    
    
    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getEmailAddressField() {
        return emailAddressField;
    }

    public void setEmailAddressField(WebElement emailAddressField) {
        this.emailAddressField = emailAddressField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(WebElement passwordField) {
        this.passwordField = passwordField;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }

    public void setSignInButton(WebElement signInButton) {
        this.signInButton = signInButton;
    }

 


    //--------------------------------------------

    public void logIntoAmazon(String uname, String pass){
        enterEmailAddress(uname);
        enterPassword(pass);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        



    }

    public UserAmazonPrime_Page goToUserHomepage(){

        return new UserAmazonPrime_Page(driver);


    }

    public AmazonHome_Page gotoAmazonHome() {
        return new AmazonHome_Page(driver);
    }

}
