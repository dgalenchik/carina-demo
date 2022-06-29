package com.solvd.laba.carina.demo.gui.web.services;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.laba.carina.demo.gui.web.pages.CatalogPage;
import com.solvd.laba.carina.demo.gui.web.pages.ComparedItemPage;
import com.solvd.laba.carina.demo.gui.web.pages.HomePage;
import com.solvd.laba.carina.demo.gui.web.pages.SearchPage;
import org.openqa.selenium.WebDriver;

import static com.zebrunner.agent.core.webdriver.RemoteWebDriverFactory.getDriver;

public class Search extends AbstractTest {

    public ComparedItemPage getSearchedItemPage(String string){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        CatalogPage catalogPage = homePage.clickCatalogLink();
        SearchPage searchPage = catalogPage.fillSearchField(string);
        ComparedItemPage comparedItemPage = searchPage.clickSearchResult();
        return comparedItemPage;
    }
}
