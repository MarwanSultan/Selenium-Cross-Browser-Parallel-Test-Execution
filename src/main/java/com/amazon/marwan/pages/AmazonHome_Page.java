package com.amazon.marwan.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class AmazonHome_Page {


    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
    WebElement enterProduct;

    @FindBy(css = "img.s-image[data-image-index='0']")
    WebElement productIndexZero;

    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[1]")
    WebElement signInLink;

    @FindBy(linkText = "Sign in")
    WebElement signInButton;

    @FindBy(id = "nav-cart")
    WebElement myCart;

    @FindBy(linkText = "AmazonBasics")
    WebElement amazonBasicsLink;

    @FindBy(linkText = "OFFICE PRODUCTS")
    WebElement officeProductsLink;


    /////////////////////////////////////////////////////
    public AmazonHome_Page(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }
    /////////////////////////////////////////////////////

    public void abOfficeProducts() {
        officeProductsLink.click();

    }

    public void amazonBasics() {
        amazonBasicsLink.click();
    }

    public void navigateToAmazonBasicsOfficeProducts() {
        amazonBasics();
        abOfficeProducts();

    }


    public void clickFirstItem() {
        productIndexZero.click();

    }

    private void myCartLink() {
        myCart.click();

    }

    public void showVariance() {
        myCart.getText();

    }


    public void clearAll() {

        enterProduct.isDisplayed();
        enterProduct.clear();


    }


    public void testSearch(String item) throws InterruptedException {
        enterProduct.sendKeys(item);
        enterProduct.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        productIndexZero.click();
        clearAll();
    }



    public void viewCart() throws InterruptedException {

        myCartLink();
        sleep(5000);

    }


    public void amazonSearch(String item) throws InterruptedException {
        testSearch(item);
    }

    public void login() {
        signInLink.click();
    }

    public void amazonLogin() throws Exception {
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        login();
        try {
            signInButton.click();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    public void clickSignInLink() throws InterruptedException {
        sleep(1000);
        signInLink.isDisplayed();
        signInLink.click();
        sleep(1000);
        try {
            signInButton.click();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getEnterProduct() {
        return enterProduct;
    }

    public void setEnterProduct(WebElement enterProduct) {
        this.enterProduct = enterProduct;
    }


    public WebElement getSinginLink() {
        return signInLink;
    }

    public void setSinginLink(WebElement singinLink) {
        this.signInLink = singinLink;
    }

    public WebElement getMyCart() {
        return myCart;
    }

    public void setMyCart(WebElement myCart) {
        this.myCart = myCart;
    }


    public WebElement getSelectFifthItem() {
        return productIndexZero;
    }

    public void setSelectFifthItem(WebElement selectFifthItem) {
        this.productIndexZero = selectFifthItem;
    }

    public void addItemToCart() {
        productIndexZero.click();


    }

    public SignIn_Page goToSignInPage() {


        return new SignIn_Page(driver);


    }


    public ProductDetails_Page goToDetailsPage() {
        return new ProductDetails_Page(driver);


    }


}

