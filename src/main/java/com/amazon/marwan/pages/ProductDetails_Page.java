package com.amazon.marwan.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetails_Page   {

    WebDriver driver;

    @FindBy(css = "#add-to-cart-button")
    WebElement addToCart;

    @FindBy(id = "attachSiNoCoverage-announce")
    WebElement noButton;

    @FindBy(css = "#attach-sidesheet-view-cart-button.>.span.>.input")
    WebElement cart;
    
    @FindBy(css = "#nav-logo")
     WebElement amazonPrimeLogo;
    
    @FindBy(tagName = "imh", css = "img[data-image-index='0']")
    WebElement firstItem;
    
    @FindBy(linkText = "VIZIO M-Series Quantum 55” Class (54.5” Diag.) 4K HDR Smart TV")
    WebElement vizioTV;
   
    @FindBy(id = "attach-close_sideSheet-link")
    WebElement closePopup;

    /*    ////////////PAGEFACTORY CONSTRUCTOR////////////////*/
    public ProductDetails_Page(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }
    /*    //////////////////////////////////////////////////*/


    
    public void clickVizio(){
        vizioTV.click();
        
    }
    
    public void vToCart(){
        clickVizio();
        addToCart.click();
        
        
        
    }
    
    
    
    public void moveToCart(){
        firstItem.click();
        addToCart.click();
        
        
        
        
    }
    
    private void clickClose(){
        closePopup.click();
        
        
    }
    
    private void getCartButton() {

        addToCart.click();

    }
    

    private void clickCartButton() {
        cart.click();


    }                                   

    private void getNoButton() {
        noButton.click();


    }

    public void refresh(){
        amazonPrimeLogo.click();
        
        
    }
   

    public ViewCart_Page goToViewCart_page() {
        return new ViewCart_Page(driver);

    }

}




    

