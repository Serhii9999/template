package com.demo.los.login;

import com.codeborne.selenide.WebDriverRunner;
import com.demo.core.base.BaseTest;
import com.demo.pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.demo.pages.Pages.searchPage;

public class TestSearch extends BaseTest {



    @Test
    public void search() {
        open("https://amazon.com");
        searchPage().filter("Books");
        searchPage().searchFor("Java");
        String expectedURL = "https://www.amazon.com/s/ref=nb_sb_noss?url=search-alias%3Dstripbooks-intl-ship&field-keywords=Java";
        String actualURL = WebDriverRunner.getWebDriver().getCurrentUrl();
        Assert.assertEquals(actualURL,expectedURL );

    }


}
