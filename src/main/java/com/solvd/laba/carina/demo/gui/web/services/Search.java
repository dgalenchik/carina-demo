package com.solvd.laba.carina.demo.gui.web.services;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.laba.carina.demo.gui.web.pages.*;
import com.solvd.laba.carina.demo.gui.web.pages.auto.AudiPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

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
public void testCarRatings(){
    HomePage homePage = new HomePage(getDriver());
    homePage.open();
    SoftAssert softAssert = new SoftAssert();
    AutoSellPage autoSellPage = homePage.clickAutoSellLink();
    AudiPage audiPage = autoSellPage.getAudiSearch();
    softAssert.assertEquals(audiPage.getRating(),4.4,"Rating is too low");
    AudiPage bmwSearch = autoSellPage.getBMWSearch();
    softAssert.assertEquals(bmwSearch.getRating(),bmwSearch.getRating()>3,"Rating is too low");
    AudiPage volkswagenSearch = autoSellPage.getVolkswagenSearch();
    softAssert.assertEquals(volkswagenSearch.getRating(),volkswagenSearch.getRating()>3,"Rating is too low");
    AudiPage nissanSearch = autoSellPage.getNissanSearch();
    softAssert.assertEquals(nissanSearch.getRating(),nissanSearch.getRating()>3,"Rating is too low");
    AudiPage volvoSearch = autoSellPage.getVolvoSearch();
    softAssert.assertEquals(volvoSearch.getRating(),volkswagenSearch.getRating()>3,"Rating is too low");
}

}
