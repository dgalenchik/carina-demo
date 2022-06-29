package com.solvd.laba.carina.demo.mytests.web.onliner;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.solvd.laba.carina.demo.gui.web.pages.*;
import com.solvd.laba.carina.demo.gui.web.services.Search;
import org.testng.annotations.Test;

import java.util.List;

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
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        homePage.clickAutoSellLink();
        homePage.open();
        homePage.clickHosesLink();
        homePage.open();
        homePage.clickBaraholkaLink();
        homePage.open();
        homePage.clickServicesLink();
        homePage.open();
        ForumPage forumPage = homePage.clickForumLink();
        assert forumPage.isPageOpened();
    }

    @Test
    public void testFooter() {
        FooterPage footerPage = new FooterPage(getDriver());
        footerPage.open();
        List<ExtendedWebElement> footerLinks = footerPage.getFooterLinks();
        footerLinks.forEach(f -> {
            assert f.isElementPresent();
            f.click();
            footerPage.open();
        });
    }
}




