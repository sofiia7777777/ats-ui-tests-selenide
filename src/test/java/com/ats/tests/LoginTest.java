package com.ats.tests;
import com.ats.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void testSuccessfulLogin() {
        homePage.clickLoginOrRegister();
        LoginPage loginPage = new LoginPage();
        loginPage.login("James", "123456");
        loginPage.verifyUserIsLoggedIn("James");
    }
}
