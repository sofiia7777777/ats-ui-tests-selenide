package com.ats.utils;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.JavascriptExecutor;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ElementHighlighter {

    public static void highlight(SelenideElement element) {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].style.border='3px solid red';", element);
    }
}
