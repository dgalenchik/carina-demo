package com.solvd.laba.carina.demo.gui.web.services;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.laba.carina.demo.gui.web.pages.*;
import com.solvd.laba.carina.demo.gui.web.pages.auto.*;
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
public void testCarRatings(long delay){
    HomePage homePage = new HomePage(getDriver());
    homePage.open();
    SoftAssert softAssert = new SoftAssert();
    AutoSellPage autoSellPage = homePage.clickAutoSellLink();
    AudiPage audiPage = autoSellPage.getAudiSearch(delay);
    softAssert.assertEquals(audiPage.getRating(),4.4,"Rating is too low");
    BmwPage bmwSearch = autoSellPage.getBMWSearch(delay);
    softAssert.assertEquals(bmwSearch.getRating(),bmwSearch.getRating()>3,"Rating is too low");
    VolkswagenPage volkswagenSearch = autoSellPage.getVolkswagenSearch(delay);
    softAssert.assertEquals(volkswagenSearch.getRating(),volkswagenSearch.getRating()>3,"Rating is too low");
    NissanPage nissanSearch = autoSellPage.getNissanSearch(delay);
    softAssert.assertEquals(nissanSearch.getRating(),nissanSearch.getRating()>3,"Rating is too low");
    VolvoPage volvoSearch = autoSellPage.getVolvoSearch(delay);
    softAssert.assertEquals(volvoSearch.getRating(),volkswagenSearch.getRating()>3,"Rating is too low");
    AcuraPage acuraSearch = autoSellPage.getAcuraSearch(delay);
    softAssert.assertEquals(acuraSearch.getRating(),acuraSearch.getRating()>3,"Rating is too low");
    AlfaRomeoPage alfaRomeoSearch = autoSellPage.getAlfaRomeoSearch(delay);
    softAssert.assertEquals(alfaRomeoSearch.getRating(),alfaRomeoSearch.getRating()>3,"Rating is too low");
    BentleyPage bentleySearch = autoSellPage.getBentleySearch(delay);
    softAssert.assertTrue(bentleySearch.isPageOpened());
    BuickPage buickSearch = autoSellPage.getBuickSearch(delay);
    softAssert.assertEquals(buickSearch.getRating(),buickSearch.getRating()>3,"Rating is too low");
    CadillacPage cadillacSearch = autoSellPage.getCadillacSearch(delay);
    softAssert.assertEquals(cadillacSearch.getRating(),cadillacSearch.getRating()>3,"Rating is too low");
    CheryPage cherySearch = autoSellPage.getCherySearch(delay);
    softAssert.assertEquals(cherySearch.getRating(),cherySearch.getRating()>3,"Rating is too low");
    ChevroletPage chevroletSearch = autoSellPage.getChevroletSearch(delay);
    softAssert.assertEquals(chevroletSearch.getRating(),cherySearch.getRating()>3,"Rating is too low");
    ChryslerPage chryslerSearch = autoSellPage.getChryslerSearch(delay);
    softAssert.assertEquals(chryslerSearch.getRating(),chryslerSearch.getRating()>3,"Rating is too low");
    CitroenPage citroenSearch = autoSellPage.getCitroenSearch(delay);
    softAssert.assertEquals(citroenSearch.getRating(),citroenSearch.getRating()>3,"Rating is too low");
    DaciaPage daciaSearch = autoSellPage.getDaciaSearch(delay);
    softAssert.assertEquals(daciaSearch.getRating(),daciaSearch.getRating()>3,"Rating is too low");
    DaewooPage daewooSearch = autoSellPage.getDaewooSearch(delay);
    softAssert.assertEquals(daewooSearch.getRating(),daciaSearch.getRating()>3,"Rating is too low");
    DaihatsunPage daihatsunSearch = autoSellPage.getDaihatsunSearch(delay);
    softAssert.assertEquals(daihatsunSearch.getRating(),daihatsunSearch.getRating()>3,"Rating is too low");
    DodgePage dodgeSearch = autoSellPage.getDodgeSearch(delay);
    softAssert.assertEquals(dodgeSearch.getRating(),dodgeSearch.getRating()>3,"Rating is too low");
    FiatPage fiatSearch = autoSellPage.getFiatSearch(delay);
    softAssert.assertEquals(fiatSearch.getRating(),fiatSearch.getRating()>3,"Rating is too low");
    FordPage fordSearch = autoSellPage.getFordSearch(delay);
    softAssert.assertEquals(fordSearch.getRating(),fordSearch.getRating()>3,"Rating is too low");
    GeelyPage geelySearch = autoSellPage.getGeelySearch(delay);
    softAssert.assertEquals(geelySearch.getRating(),geelySearch.getRating()>3,"Rating is too low");
    GreatWallPage greatWallSearch = autoSellPage.getGreatWallSearch(delay);
    softAssert.assertEquals(greatWallSearch.getRating(),greatWallSearch.getRating()>3,"Rating is too low");
    HondaPage hondaSearch = autoSellPage.getHondaSearch(delay);
    softAssert.assertEquals(hondaSearch.getRating(),hondaSearch.getRating()>3,"Rating is too low");
    HyundaiPage hyundaiSearch = autoSellPage.getHyundaiSearch(delay);
    softAssert.assertEquals(hyundaiSearch.getRating(),hyundaiSearch.getRating()>3,"Rating is too low");
    InfinityPage infinitySearch = autoSellPage.getInfinitySearch(delay);
    softAssert.assertEquals(infinitySearch.getRating(),infinitySearch.getRating()>3,"Rating is too low");
}

}
