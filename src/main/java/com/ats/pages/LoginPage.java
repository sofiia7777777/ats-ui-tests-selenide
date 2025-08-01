package com.ats.pages;
import com.ats.utils.ElementHighlighter;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class LoginPage {

    public void login(String username, String password){
        SelenideElement usernameField = $("#loginFrm_loginname");
        SelenideElement passwordField = $("#loginFrm_password");
        SelenideElement loginButton = $(By.xpath("//button[normalize-space()='Login']"));

        ElementHighlighter.highlight(usernameField);
        usernameField.setValue(username);

        ElementHighlighter.highlight(passwordField);
        passwordField.setValue(password);

        ElementHighlighter.highlight(loginButton);
        loginButton.click();
    }

    public void verifyUserIsLoggedIn(String username) {
        SelenideElement welcomeMessage = $("#customernav div");
        ElementHighlighter.highlight(welcomeMessage);
        welcomeMessage.shouldHave(text("Welcome back " + username));
    }
}
