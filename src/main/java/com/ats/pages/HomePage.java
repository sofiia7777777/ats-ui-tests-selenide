package com.ats.pages;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.byText;

public class HomePage {

    public void openHomePage() {
        open("https://automationteststore.com/");
    }

    public void clickLoginOrRegister() {
        $(byText("Login or register")).click();
    }
}
