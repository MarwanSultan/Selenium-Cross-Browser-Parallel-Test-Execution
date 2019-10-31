package com.amazon.marwan.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("ALL")
public class ViewCart_Page {

    WebDriver driver;

    @FindBy(id = "sc-active-cart")
    private
    WebElement shoppingCartHeader;

    @FindBy(linkText = "Delete")
    private
    WebElement Delete;

    /*    //////////////////////////PAGEFACTORY CONSTRUCTOR///////////////*/
    public ViewCart_Page(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
        /*    //////////////////////////PAGEFACTORY CONSTRUCTOR///////////////*/

    }




    private void clickFirstDeleteLink() {
        Delete.click();
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    public void deleteItem() {
        clickFirstDeleteLink();


    }


 
    public WebDriver getDriver() {
        return driver;
    }

    public void click() {

    }

    public void submit() {

    }

    public void sendKeys() {

    }

    public void clear() {

    }

    public String getTagName() {
        return null;
    }

    public String getAttribute() {
        return null;
    }

    public boolean isSelected() {
        return false;
    }

    public boolean isEnabled() {
        return false;
    }

    public String getText() {
        return null;
    }

    public List<WebElement> findElements() {
        return null;
    }

    public WebElement findElement() {
        return null;
    }

    public boolean isDisplayed() {
        return false;
    }

    public Point getLocation() {
        return null;
    }

    public Dimension getSize() {
        return null;
    }

    public Rectangle getRect() {
        return null;
    }

    public String getCssValue() {
        return null;
    }

    public <X> X getScreenshotAs() throws WebDriverException {
        return null;
    }
}
