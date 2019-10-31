package com.amazon.marwan.resources;

import com.amazon.marwan.core.BaseTest;

public class DataProvider extends BaseTest {


    @org.testng.annotations.DataProvider(name = "data")
    public static Object[][] dataProviderMethod() {
        return new Object[][]{
                {"Monitor"},
                {"Alexa"},
                {"HP Widescreen Monitors"},
                {"MAC book"},
                {" "},
                {"?"},
                {"%%^%^&%^&"}};

    }
}

