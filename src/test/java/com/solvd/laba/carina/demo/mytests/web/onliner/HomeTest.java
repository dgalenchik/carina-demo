package com.solvd.laba.carina.demo.mytests.web.onliner;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.solvd.laba.carina.demo.gui.web.pages.*;
import com.solvd.laba.carina.demo.gui.web.pages.auto.BentleyPage;
import com.solvd.laba.carina.demo.gui.web.pages.auto.Cars;
import com.solvd.laba.carina.demo.gui.web.pages.auto.HondaPage;
import com.solvd.laba.carina.demo.gui.web.pages.auto.IRating;
import com.solvd.laba.carina.demo.gui.web.pages.footer.*;
import com.solvd.laba.carina.demo.gui.web.services.Search;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Arrays;

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
        softAssert.assertTrue(autoSellPage.isPageOpened());
        HousesPage housesPage = homePage.clickHosesLink();
        softAssert.assertTrue(housesPage.isPageOpened());
        BaraholkaPage baraholkaPage = homePage.clickBaraholkaLink();
        softAssert.assertTrue(baraholkaPage.isPageOpened());
        ServicesPage servicesPage = homePage.clickServicesLink();
        softAssert.assertTrue(servicesPage.isPageOpened());
        ForumPage forumPage = homePage.clickForumLink();
        softAssert.assertTrue(forumPage.isPageOpened());
    }

    @Test
    public void testFooter() {
        SoftAssert softAssert = new SoftAssert();
        FooterPage footerPage = new FooterPage(getDriver());
        footerPage.open();
        AboutCompanyPage aboutCompanyPage = footerPage.clickAboutCompanyLink();
        AdvertisePage advertisePage = footerPage.clickAdvertiseLink();
        footerPage.open();
        ConfidentialPolicyPage confidentialPolicyPage = footerPage.clickConfidentialPolicyLink();
        ManifestPage manifestPage = footerPage.clickManifestLink();
        PublicContractPage publicContractPage = footerPage.clickPublicContractLink();
        RedactionContactsPage redactionContactsPage = footerPage.clickRedactionContactLink();
        RulesOfReturnPage rulesOfReturnPage = footerPage.clickRulesOfReturnLink();
        TariffsPage tariffsPage = footerPage.clickTariffsLink();
        footerPage.open();
        UserAgreementPage userAgreementPage = footerPage.clickUserAgreementLink();
        UserSupportPage userSupportPage = footerPage.clickUserSupportLink();
        VacanciesPage vacanciesPage = footerPage.clickVacanciesLink();
        softAssert.assertTrue(aboutCompanyPage.isPageOpened());
        softAssert.assertTrue(advertisePage.isPageOpened());
        softAssert.assertTrue(confidentialPolicyPage.isPageOpened());
        softAssert.assertTrue(manifestPage.isPageOpened());
        softAssert.assertTrue(publicContractPage.isPageOpened());
        softAssert.assertTrue(redactionContactsPage.isPageOpened());
        softAssert.assertTrue(rulesOfReturnPage.isPageOpened());
        softAssert.assertTrue(tariffsPage.isPageOpened());
        softAssert.assertTrue(userAgreementPage.isPageOpened());
        softAssert.assertTrue(userSupportPage.isPageOpened());
        softAssert.assertTrue(vacanciesPage.isPageOpened());
    }

    @Test
    public void autoBaraholkaTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        AutoSellPage autoSellPage = homePage.clickAutoSellLink();
        Cars[] values = Cars.values();
        for (Cars car:values) {
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(car.getPage(car,autoSellPage).getRating()>=3,"Rating is too low");
            softAssert.assertAll();
        }
    }

    @Test
    public void testLogin() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        LoginPage loginPage = homePage.clickLoginBtn();
        assert loginPage.isPageOpened();
    }

    @Test
    public void testBentleySearch() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        AutoSellPage autoSellPage = homePage.clickAutoSellLink();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(Cars.BENTLEY.getPage(Cars.BENTLEY,autoSellPage).getRating()>=3,"Rating is too low");
        softAssert.assertAll();
    }

    @Test
    public void testHondaSearch() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        AutoSellPage autoSellPage = homePage.clickAutoSellLink();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(Cars.HONDA.getPage(Cars.HONDA,autoSellPage).getRating()>3,"Rating is too low");
        softAssert.assertAll();
    }
}




