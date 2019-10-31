package com.amazon.marwan.interfaces;

import org.openqa.selenium.WebElement;

import java.util.List;

public interface ElementLocator {
    

        WebElement findElement();

        List<WebElement> findElements();
    }


