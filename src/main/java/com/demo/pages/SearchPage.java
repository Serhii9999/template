package com.demo.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.element;

public class SearchPage {

    SelenideElement filterButton = element(By.id("searchDropdownBox"));
    SelenideElement searchForField = element(By.id("twotabsearchtextbox"));


    public void filter(String text) {
        filterButton.sendKeys(text);
    }

    public void searchFor(String text) {
        searchForField.sendKeys(text);
        searchForField.submit();
    }


}
