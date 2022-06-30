package com.solvd.laba.carina.demo.gui.web.services;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.solvd.laba.carina.demo.gui.web.pages.FooterPage;
import com.solvd.laba.carina.demo.gui.web.pages.footer.*;
import org.testng.asserts.SoftAssert;

public class FooterOpener extends AbstractTest {

    public void testFooterPages() {
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
}
