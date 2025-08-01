package com.ats.tests;

import com.ats.pages.HomePage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected HomePage homePage;

    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        homePage = new HomePage();
        homePage.openHomePage();
    }

    @AfterMethod
    public void tearDown() {
        if (WebDriverRunner.hasWebDriverStarted()) {
            WebDriverRunner.closeWebDriver();
        }
    }
}
