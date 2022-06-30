package com.solvd.laba.carina.demo.mytests.web.onliner;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.solvd.laba.carina.demo.gui.web.pages.*;
import com.solvd.laba.carina.demo.gui.web.pages.auto.AudiPage;
import com.solvd.laba.carina.demo.gui.web.services.FooterOpener;
import com.solvd.laba.carina.demo.gui.web.services.Search;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomeTest extends AbstractTest {

    @Test
    public void testOpen() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        assert homePage.isPageOpened();
    }

    @Test
    public void testOpenCatalog() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        CatalogPage catalogPage = homePage.clickCatalogLink();
        assert catalogPage.isPageOpened();
    }

    @Test
    public void testCompare() {
        Search search = new Search();
        SearchPage searchPage = new SearchPage(getDriver());
        ComparedItemPage iphone13 = search.getSearchedItemPage("Iphone 13 pro");
        iphone13.addToCompare();
        ComparedItemPage iphone12 = search.getSearchedItemPage("Iphone 12 pro");
        iphone12.addToCompare();
        searchPage.getSearchPopup();
        ComparePage comparePage = searchPage.clickCompareBtn();
        assert comparePage.isSimilarType();
    }

    @Test
    public void testOpenFanPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        NewsPage newsPage = homePage.clickNewsLink();
        FanPage fanPage = newsPage.clickFanCatalogLink();
        assert fanPage.isPageOpened();
    }

    @Test
    public void testOpenPages() {
        SoftAssert softAssert = new SoftAssert();
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        AutoSellPage autoSellPage = homePage.clickAutoSellLink();
        HousesPage housesPage = homePage.clickHosesLink();
        BaraholkaPage baraholkaPage = homePage.clickBaraholkaLink();
        ServicesPage servicesPage = homePage.clickServicesLink();
        ForumPage forumPage = homePage.clickForumLink();
        softAssert.assertTrue(autoSellPage.isPageOpened());
        softAssert.assertTrue(housesPage.isPageOpened());
        softAssert.assertTrue(baraholkaPage.isPageOpened());
        softAssert.assertTrue(servicesPage.isPageOpened());
        softAssert.assertTrue(forumPage.isPageOpened());
    }

    @Test
    public void testFooter() {
        FooterOpener footerOpener = new FooterOpener();
        footerOpener.testFooterPages();
    }
    @Test
    public void autoBaraholkaTest(){
    Search search = new Search();
    search.testCarRatings(500);
    }
    @Test
    public void testLogin(){
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        LoginPage loginPage = homePage.clickLoginBtn();
        assert loginPage.isPageOpened();
    }
}




