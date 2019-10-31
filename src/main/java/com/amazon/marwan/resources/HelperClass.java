package com.amazon.marwan.resources;


import com.amazon.marwan.pages.AmazonHome_Page;
import com.amazon.marwan.pages.SignIn_Page;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperClass {

    public HelperClass(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    WebDriverWait wait;


    public void copy_amazonLogin() throws Exception {
        AmazonHome_Page amazon = new AmazonHome_Page(driver);
        amazon.amazonLogin();
        driver.manage().window().setPosition(new Point(88,111));

        SignIn_Page sp = new SignIn_Page(driver);
        sp.logIntoAmazon("Marwan.Sultan@gmail.com", "Blue4444#");

    }

    public void moveBrowserRight() {

        Dimension d = new Dimension(32, 70);
        //Resize the current window to the given dimension
        driver.manage().window().setSize(d);


    }

    public void moveBrowserLeft() {

        Dimension e = new Dimension(1000, 800);
        //Resize the current window to the given dimension
        driver.manage().window().setSize(e);
    }




    public void setWait(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-logo")));
    }


    public void footerWait() {
        wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"navFooter\"]/div[3]/span[1]/div/a/div")));

    }

    
}
